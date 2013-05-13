package com.nwea.portal.domain;

import com.nwea.portal.repository.ZuoraRepository;
import com.nwea.portal.viewmodels.RelatedProductViewModel;
import com.zuora.api.object.*;
import org.springframework.cache.Cache;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: Dana
 * Date: 4/30/13
 * Time: 10:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class RelatedProductsViewModelBuilder {


    private ZuoraRepository zr;
    private String accountId;

    public RelatedProductsViewModelBuilder(Cache c, String accountName) throws Exception {
        this.zr = new ZuoraRepository(c);
        this.accountId = zr.AccountR.GetIdByName(accountName);
    }

    public RelatedProductViewModel[] Build() throws Exception {
        ArrayList<RelatedProductViewModel> relatedProducts = new ArrayList<RelatedProductViewModel>();

        Subscription[] subs = zr.SubscriptionR.GetSubscriptions(this.accountId);
        HashSet<String> relatedProductIds = new HashSet<String>();
        for (Subscription sub : subs) {

            // Get active rate plan
            RatePlan[] ratePlans = zr.RatePlanR.GetRatePlans(sub.getId().getID());

            for (RatePlan rp : ratePlans) {
                ProductRatePlan prp = zr.ProductRatePlanR.GetById(rp.getProductRatePlanId().getID());
                relatedProductIds.add(prp.getProductId().getID());
            }
        }

        for (String productId : relatedProductIds) {
            Product p = zr.ProductR.GetById(productId);
            relatedProducts.add(getModel(p));
        }

        return relatedProducts.toArray(new RelatedProductViewModel[relatedProducts.size()]);
    }

    private RelatedProductViewModel getModel(Product p) throws Exception {
        RelatedProductViewModel model = new RelatedProductViewModel();
        model.setName(p.getName());
        model.setProductId(p.getId().getID());
        model.setPrice(getPrice(p.getId().getID()).toString());
        return model;
    }

    private BigDecimal getPrice(String productId) throws Exception {
        ProductRatePlan[] productRatePlans = zr.ProductRatePlanR
                .GetDisplayed(productId);
        for (ProductRatePlan prp : productRatePlans) {
            ProductRatePlanCharge[] productRatePlanCharges = zr.ProductRatePlanChargeR
                    .GetByRatePlanId(prp.getId().getID());
            for (ProductRatePlanCharge prpc : productRatePlanCharges) {
                if (prpc.getChargeModel().equals("Per Unit Pricing")) {
                    ProductRatePlanChargeTier[] productRatePlanChargeTiers = zr.ProductRatePlanChargeTierR
                            .GetByRatePlanChargeId(prpc.getId().getID());
                    ProductRatePlanChargeTier prpct = productRatePlanChargeTiers[0];
                    return prpct.getPrice();
                }
            }
        }
        return BigDecimal.ZERO;
    }


}
