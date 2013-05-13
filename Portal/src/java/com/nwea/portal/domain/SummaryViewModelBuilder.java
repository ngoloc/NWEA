package com.nwea.portal.domain;

import com.nwea.portal.repository.ZuoraRepository;
import com.nwea.portal.viewmodels.LicenseViewModel;
import com.nwea.portal.viewmodels.RelatedProductViewModel;
import com.nwea.portal.viewmodels.SummaryViewModel;
import com.zuora.api.QueryResult;
import com.zuora.api.object.Product;
import com.zuora.api.object.ProductRatePlan;
import com.zuora.api.object.ProductRatePlanCharge;
import com.zuora.api.object.ProductRatePlanChargeTier;
import com.zuora.zilla.controller.SubscriptionManager;
import com.zuora.zilla.model.AmenderCharge;
import com.zuora.zilla.model.AmenderPlan;
import com.zuora.zilla.model.AmenderSubscription;
import org.springframework.cache.Cache;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class SummaryViewModelBuilder {

    private SubscriptionManager subManager;
    private ZuoraRepository zrepo;
    private SummaryViewModel model;

    public SummaryViewModelBuilder(Cache cache) throws Exception {
        this.subManager = new SubscriptionManager(cache);
        this.zrepo = new ZuoraRepository(cache);
        model = new SummaryViewModel();
    }

    public SummaryViewModel GetModel(String accountName) throws Exception {
        this.getLicenseModels(accountName);
        this.getProducts();
        return model;
    }

    private void getProducts() throws Exception {
        ArrayList<RelatedProductViewModel> rvml = new ArrayList<RelatedProductViewModel>();
        QueryResult productResult = null;
        Product[] products = zrepo.ProductR.GetProducts();
        for (Product product : products) {
            ProductRatePlan[] productRatePlans = zrepo.ProductRatePlanR
                    .GetDisplayed(product.getId().getID());
            for (ProductRatePlan prp : productRatePlans) {
                ProductRatePlanCharge[] productRatePlanCharges = zrepo.ProductRatePlanChargeR
                        .GetByRatePlanId(prp.getId().getID());
                for (ProductRatePlanCharge prpc : productRatePlanCharges) {
                    if (prpc.getChargeModel().equals("Per Unit Pricing")) {
                        ProductRatePlanChargeTier[] productRatePlanChargeTiers = zrepo.ProductRatePlanChargeTierR
                                .GetByRatePlanChargeId(prpc.getId().getID());
                        ProductRatePlanChargeTier prpct = productRatePlanChargeTiers[0];
                        RelatedProductViewModel rvm = new RelatedProductViewModel();
                        rvm.setName(product.getName());
                        rvm.setPrice(prpct.getPrice().toString());
                        rvm.setChargeModel(prpc.getChargeModel());
                        rvm.setProductId(product.getId().getID());
                        if (prpct.getPrice().intValue() > 0) {
                            rvml.add(rvm);
                        }
                    }
                }
            }
        }
        model.setRelated(rvml.toArray(new RelatedProductViewModel[rvml.size()]));
    }

    private void getLicenseModels(String accountName) throws Exception {
        List<AmenderSubscription> subs = this.subManager
                .getAllSubscription(accountName);

        ArrayList<AmenderPlan> plans = new ArrayList<AmenderPlan>();

        // collect all the active rate plans
        for (AmenderSubscription sub : subs) {
            if (sub.getActivePlans() != null && sub.getActivePlans().size() > 0) {
                List<AmenderPlan> activePlans = sub.getActivePlans();
                for (AmenderPlan p : activePlans) {
                    p.setEnddate(sub.getEndOfTermDate());
                    p.setSubscriptionId(sub.getSubscriptionId());
                }
                plans.addAll(activePlans);
            }
        }

        ArrayList<LicenseViewModel> lvms = new ArrayList<LicenseViewModel>();

        for (AmenderPlan plan : plans) {
            LicenseViewModel vm = null;
            for (LicenseViewModel vmi : lvms) {
                if (vmi.getName().equals(plan.getProductName())) {
                    vm = vmi;
                }
            }
            if (vm == null) {
                vm = new LicenseViewModel();
                vm.setName(plan.getProductName());
                vm.setSuggestedQuantity(plan.getSuggestedQuantity());
                BigDecimal pricePerUnit = BigDecimal.ZERO;
                for (AmenderCharge charge : plan.getAmenderCharges()) {
                    pricePerUnit = pricePerUnit.add(charge.getPrice());
                }
                vm.setCharge(pricePerUnit);
                vm.setProductId(plan.getProductId());

                vm.setPricePerUnit(getPrice(plan.getProductId()));
                vm.setSubscriptionId(plan.getSubscriptionId());
                Calendar renewalCalendar = plan.getEnddate();
                renewalCalendar.add(Calendar.YEAR, 1);
                Date renewalDate = renewalCalendar.getTime();
                DateFormat formatter = new SimpleDateFormat("dd/MM/yy");

                vm.setRenewalEndDate(formatter.format(renewalDate));
                if (pricePerUnit.intValue() > 0) {
                    lvms.add(vm);
                }
            }

            vm.setQuantity(vm.getQuantity()
                    + Integer.parseInt(plan.getQuantity()));
        }
        model.setLicenses(lvms.toArray(new LicenseViewModel[lvms.size()]));
    }

    private BigDecimal getPrice(String productId) throws Exception {
        ProductRatePlan[] productRatePlans = zrepo.ProductRatePlanR
                .GetDisplayed(productId);
        for (ProductRatePlan prp : productRatePlans) {
            ProductRatePlanCharge[] productRatePlanCharges = zrepo.ProductRatePlanChargeR
                    .GetByRatePlanId(prp.getId().getID());
            for (ProductRatePlanCharge prpc : productRatePlanCharges) {
                if (prpc.getChargeModel().equals("Per Unit Pricing")) {
                    ProductRatePlanChargeTier[] productRatePlanChargeTiers = zrepo.ProductRatePlanChargeTierR
                            .GetByRatePlanChargeId(prpc.getId().getID());
                    ProductRatePlanChargeTier prpct = productRatePlanChargeTiers[0];
                    return prpct.getPrice();
                }
            }
        }
        return BigDecimal.ZERO;
    }
}
