package com.zuora.zilla.dispatcher;

import com.zuora.zilla.controller.InvoiceManager;
import com.zuora.zilla.util.ZuoraUtility;
import org.springframework.cache.Cache;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Backend {

    private static final long serialVersionUID = 1L;

    private InvoiceManager invoiceManager;

    private App app;

    public Backend(Cache cache) throws Exception {
        invoiceManager = new InvoiceManager(cache);
        app = new App(cache);
    }

    public Object HandleRequest(String type, HttpServletRequest request,
                                HttpServletResponse response) throws Exception {

        Object output = null;
        if (type.equalsIgnoreCase("AddItemToCart")) {
            output = app.addItemToCart(request);
        } else if (type.equalsIgnoreCase("CheckEmailAvailability")) {
            output = app.checkEmailAvailability(request);
        } else if (type.equalsIgnoreCase("EmptyCart")) {
            output = app.emptyCart(request);
        } else if (type.equalsIgnoreCase("GetExistingIframeSrc")) {
            output = app.getExistingIframeSrc(request);
        } else if (type.equalsIgnoreCase("GetInitialCart")) {
            output = app.getInitialCart(request);
        } else if (type.equalsIgnoreCase("GetLatestSubscription")) {
            output = app.getLatestSubscription(request);
        } else if (type.equalsIgnoreCase("GetNewIframeSrc")) {
            output = app.getNewIframeSrc();
        } else if (type.equalsIgnoreCase("IsUserLoggedIn")) {
            output = app.isUserLoggedIn(request);
        } else if (type.equalsIgnoreCase("PreviewCurrentCart")) {
            output = app.previewCurrentCart(request);
        } else if (type.equalsIgnoreCase("PreviewAddRatePlan")) {
            output = app.previewAddRatePlan(request);
        } else if (type.equalsIgnoreCase("AddRatePlan")) {
            output = app.addRatePlan(request);
        } else if (type.equalsIgnoreCase("PreviewRemoveRatePlan")) {
            output = app.previewRemoveRatePlan(request);
        } else if (type.equalsIgnoreCase("RemoveRatePlan")) {
            output = app.removeRatePlan(request);
        } else if (type.equalsIgnoreCase("ReadCatalog")) {
            output = app.readCatalog();
        } else if (type.equalsIgnoreCase("RefreshCatalog")) {
            output = app.refreshCatalog();
        } else if (type.equalsIgnoreCase("RemoveItemFromCart")) {
            output = app.removeItemFromCart(request);
        } else if (type.equalsIgnoreCase("RemovePaymentMethod")) {
            output = app.removePaymentMethod(request);
        } else if (type.equalsIgnoreCase("SubscribeWithCurrentCart")) {
            output = app.subscribeWithCurrentCart(request);
        } else if (type.equalsIgnoreCase("UpdateContact")) {
            output = app.updateContact(request);
        } else if (type.equalsIgnoreCase("ChangeDefaultPaymentMethod")) {
            output = app.changeDefaultPaymentMethod(request);
        } else if (type.equalsIgnoreCase("GetCompleteSummary")) {
            output = app.getCompleteSummary(request);
        } else if (type.equalsIgnoreCase("GetPaymentMethodSummary")) {
            output = app.getPaymentMethodSummary(request);
        } else if (type.equalsIgnoreCase("TestSubscriptionUpdate")) {
            try {
                output = app.testSubscriptionUpdate(request);
            } catch (Exception e) {
                output = "" + e;
            }

        } else if (type.equalsIgnoreCase("GetLastPdf")) {
            HttpSession session = request.getSession();
            String accountId = (String) session.getAttribute("accountid");
            String body = invoiceManager.getLastInvoicePdf(accountId);
            ServletOutputStream pdfOutput = response.getOutputStream();
            if (body == null) {
                response.setContentType("text/html");
                pdfOutput.write("No invoices found.".getBytes());
            } else {
                response.setContentType("application/pdf");
                response.setHeader("Content-disposition",
                        "attachment; filename=latest.pdf");
                pdfOutput.write(ZuoraUtility.decodeBase64(body));
            }
            pdfOutput.flush();

        } else if (type.equalsIgnoreCase("GetPdf")) {
            String invoiceId = request.getParameter("invoiceId");
            try {
                String body = invoiceManager.getInvoicePdf(invoiceId);
                response.setContentType("application/pdf");
                response.setHeader("Content-disposition",
                        "attachment; filename=invoice.pdf");
                ServletOutputStream pdfOutput;
                pdfOutput = response.getOutputStream();
                pdfOutput.write(ZuoraUtility.decodeBase64(body));
                pdfOutput.flush();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return output;
    }
}
