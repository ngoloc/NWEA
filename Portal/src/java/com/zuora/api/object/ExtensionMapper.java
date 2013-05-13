/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.zuora.api.object;

/**
 * ExtensionMapper class
 */
@SuppressWarnings({"unchecked", "unused"})
public class ExtensionMapper {

    public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                 java.lang.String typeName, javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "GatewayOption".equals(typeName)) {

            return com.zuora.api.object.GatewayOption.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "ProductRatePlanChargeTier".equals(typeName)) {

            return com.zuora.api.object.ProductRatePlanChargeTier.Factory
                    .parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "ID".equals(typeName)) {

            return com.zuora.api.ID.Factory.parse(reader);

        }

        if ("http://fault.api.zuora.com/".equals(namespaceURI)
                && "LoginFault".equals(typeName)) {

            return com.zuora.api.fault.LoginFault.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "InvoicePayment".equals(typeName)) {

            return com.zuora.api.object.InvoicePayment.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "AccountingPeriod".equals(typeName)) {

            return com.zuora.api.object.AccountingPeriod.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "InvoiceItemAdjustment".equals(typeName)) {

            return com.zuora.api.object.InvoiceItemAdjustment.Factory
                    .parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "InvoiceItem".equals(typeName)) {

            return com.zuora.api.object.InvoiceItem.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "Payment".equals(typeName)) {

            return com.zuora.api.object.Payment.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "InvoiceData".equals(typeName)) {

            return com.zuora.api.InvoiceData.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "ProductRatePlanCharge".equals(typeName)) {

            return com.zuora.api.object.ProductRatePlanCharge.Factory
                    .parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "RefundInvoicePayment".equals(typeName)) {

            return com.zuora.api.object.RefundInvoicePayment.Factory
                    .parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "LoginResult".equals(typeName)) {

            return com.zuora.api.LoginResult.Factory.parse(reader);

        }

        if ("http://fault.api.zuora.com/".equals(namespaceURI)
                && "ApiFault".equals(typeName)) {

            return com.zuora.api.fault.ApiFault.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "Subscription".equals(typeName)) {

            return com.zuora.api.object.Subscription.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "ErrorCode".equals(typeName)) {

            return com.zuora.api.ErrorCode.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "SubscribeInvoiceProcessingOptions".equals(typeName)) {

            return com.zuora.api.SubscribeInvoiceProcessingOptions.Factory
                    .parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "RatePlanData".equals(typeName)) {

            return com.zuora.api.RatePlanData.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "InvoiceResult".equals(typeName)) {

            return com.zuora.api.InvoiceResult.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "InvoiceProcessingOptions".equals(typeName)) {

            return com.zuora.api.InvoiceProcessingOptions.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "Product".equals(typeName)) {

            return com.zuora.api.object.Product.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "Invoice".equals(typeName)) {

            return com.zuora.api.object.Invoice.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "PaymentMethod".equals(typeName)) {

            return com.zuora.api.object.PaymentMethod.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "Export".equals(typeName)) {

            return com.zuora.api.object.Export.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "ExternalPaymentOptions".equals(typeName)) {

            return com.zuora.api.ExternalPaymentOptions.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "Amendment".equals(typeName)) {

            return com.zuora.api.object.Amendment.Factory.parse(reader);

        }

        if ("http://fault.api.zuora.com/".equals(namespaceURI)
                && "InvalidValueFault".equals(typeName)) {

            return com.zuora.api.fault.InvalidValueFault.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "CommunicationProfile".equals(typeName)) {

            return com.zuora.api.object.CommunicationProfile.Factory
                    .parse(reader);

        }

        if ("http://fault.api.zuora.com/".equals(namespaceURI)
                && "MalformedQueryFault".equals(typeName)) {

            return com.zuora.api.fault.MalformedQueryFault.Factory
                    .parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "SubscribeRequest".equals(typeName)) {

            return com.zuora.api.SubscribeRequest.Factory.parse(reader);

        }

        if ("http://fault.api.zuora.com/".equals(namespaceURI)
                && "UnexpectedErrorFault".equals(typeName)) {

            return com.zuora.api.fault.UnexpectedErrorFault.Factory
                    .parse(reader);

        }

        if ("http://fault.api.zuora.com/".equals(namespaceURI)
                && "InvalidQueryLocatorFault".equals(typeName)) {

            return com.zuora.api.fault.InvalidQueryLocatorFault.Factory
                    .parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "ProductRatePlan".equals(typeName)) {

            return com.zuora.api.object.ProductRatePlan.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "GatewayOptionData".equals(typeName)) {

            return com.zuora.api.GatewayOptionData.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "AmendOptions".equals(typeName)) {

            return com.zuora.api.AmendOptions.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "Import".equals(typeName)) {

            return com.zuora.api.object.Import.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "QueryResult".equals(typeName)) {

            return com.zuora.api.QueryResult.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "TaxationItem".equals(typeName)) {

            return com.zuora.api.object.TaxationItem.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "InvoiceAdjustment".equals(typeName)) {

            return com.zuora.api.object.InvoiceAdjustment.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "Account".equals(typeName)) {

            return com.zuora.api.object.Account.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "PreviewOptions".equals(typeName)) {

            return com.zuora.api.PreviewOptions.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "Usage".equals(typeName)) {

            return com.zuora.api.object.Usage.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "ExecuteResult".equals(typeName)) {

            return com.zuora.api.ExecuteResult.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "RatePlanChargeTier".equals(typeName)) {

            return com.zuora.api.object.RatePlanChargeTier.Factory
                    .parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "Refund".equals(typeName)) {

            return com.zuora.api.object.Refund.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "SubscriptionData".equals(typeName)) {

            return com.zuora.api.SubscriptionData.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "ProductRatePlanChargeTierData".equals(typeName)) {

            return com.zuora.api.ProductRatePlanChargeTierData.Factory
                    .parse(reader);

        }

        if ("http://fault.api.zuora.com/".equals(namespaceURI)
                && "InvalidTypeFault".equals(typeName)) {

            return com.zuora.api.fault.InvalidTypeFault.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "zObject".equals(typeName)) {

            return com.zuora.api.object.ZObject.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "RatePlan".equals(typeName)) {

            return com.zuora.api.object.RatePlan.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "RatePlanCharge".equals(typeName)) {

            return com.zuora.api.object.RatePlanCharge.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "DeleteResult".equals(typeName)) {

            return com.zuora.api.DeleteResult.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "SubscribeResult".equals(typeName)) {

            return com.zuora.api.SubscribeResult.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "SaveResult".equals(typeName)) {

            return com.zuora.api.SaveResult.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "CreditBalanceAdjustment".equals(typeName)) {

            return com.zuora.api.object.CreditBalanceAdjustment.Factory
                    .parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "RatePlanChargeData".equals(typeName)) {

            return com.zuora.api.RatePlanChargeData.Factory.parse(reader);

        }

        if ("http://object.api.zuora.com/".equals(namespaceURI)
                && "Contact".equals(typeName)) {

            return com.zuora.api.object.Contact.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "AmendResult".equals(typeName)) {

            return com.zuora.api.AmendResult.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "QueryLocator".equals(typeName)) {

            return com.zuora.api.QueryLocator.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "Error".equals(typeName)) {

            return com.zuora.api.Error.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "SubscribeOptions".equals(typeName)) {

            return com.zuora.api.SubscribeOptions.Factory.parse(reader);

        }

        if ("http://api.zuora.com/".equals(namespaceURI)
                && "AmendRequest".equals(typeName)) {

            return com.zuora.api.AmendRequest.Factory.parse(reader);

        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type "
                + namespaceURI + " " + typeName);
    }

}
