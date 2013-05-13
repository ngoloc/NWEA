package com.nwea.portal.repository;

import com.zuora.zilla.util.ZApi;
import org.springframework.cache.Cache;

public class ZuoraRepository {

    public ProductRepository ProductR;

    public ProductRatePlanRepository ProductRatePlanR;

    public ProductRatePlanChargeRepository ProductRatePlanChargeR;

    public ProductRatePlanChargeTierRepository ProductRatePlanChargeTierR;

    public RatePlanRepository RatePlanR;

    public RatePlanChargeRepository RatePlanChargeR;

    public RatePlanChargeTierRepository RatePlanChargeTierR;

    public SubscriptionRepository SubscriptionR;

    public AccountRepository AccountR;

    public PaymentMethodRepository PaymentMethodR;

    public AmendmentRepository AmendmentR;

    public ContactRepository ContactR;

    public PaymentRepository PaymentR;

    public InvoiceRepository InvoiceR;

    public ZuoraRepository(Cache cache) throws Exception {
        this(cache, new ZApi());
    }

    public ZuoraRepository(Cache cache, ZApi zapi) throws Exception {
        ProductR = new ProductRepository(cache, zapi);
        ProductRatePlanR = new ProductRatePlanRepository(cache, zapi);
        ProductRatePlanChargeR = new ProductRatePlanChargeRepository(cache, zapi);
        ProductRatePlanChargeTierR = new ProductRatePlanChargeTierRepository(cache, zapi);
        SubscriptionR = new SubscriptionRepository(cache, zapi);
        AccountR = new AccountRepository(cache, zapi);
        RatePlanR = new RatePlanRepository(cache, zapi);
        RatePlanChargeR = new RatePlanChargeRepository(cache, zapi);
        RatePlanChargeTierR = new RatePlanChargeTierRepository(cache, zapi);
        PaymentMethodR = new PaymentMethodRepository(cache, zapi);
        AmendmentR = new AmendmentRepository(cache, zapi);
        ContactR = new ContactRepository(cache, zapi);
        PaymentR = new PaymentRepository(cache, zapi);
        InvoiceR = new InvoiceRepository(cache, zapi);
    }
}
