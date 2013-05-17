package com.zuora.zilla.dispatcher;

import com.zuora.zilla.controller.*;
import com.zuora.zilla.model.*;
import org.springframework.cache.Cache;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.servlet.annotation.WebServlet;
//import org.codehaus.jackson.JsonGenerationException;
//import org.codehaus.jackson.JsonGenerator;
//import org.codehaus.jackson.JsonProcessingException;
//import org.codehaus.jackson.map.JsonMappingException;
//import org.codehaus.jackson.map.JsonSerializer;
//import org.codehaus.jackson.map.ObjectMapper;
//import org.codehaus.jackson.map.SerializerProvider;
//import org.codehaus.jackson.map.ser.StdSerializerProvider;

public class App {
    private static final long serialVersionUID = 1L;

    private AccountManager accountManager;

    private PaymentManager paymentManager;

    private SubscriptionManager subscriptionManager;

    private Amender amender;

    boolean array;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public App(Cache cache) throws Exception {
        accountManager = new AccountManager(cache);
        paymentManager = new PaymentManager(cache);
        subscriptionManager = new SubscriptionManager(cache);
        amender = new Amender(cache);
    }

    /**
     * Read the Product Catalog Data from the locally saved JSON cache. If no
     * cache exists, this will refresh the catalog from Zuora first.
     *
     * @return A model containing all necessary information needed to display
     *         the products and rate plans in the product catalog.
     */
    public CatalogModel readCatalog() {
        CatalogModel data = null;
        try {
            // Retrieve the catalog from z-java and refresh the cache
            data = Catalog.readCatalog();
        } catch (Exception e) {
            data = new CatalogModel();
            data.setError(e.getMessage());
            data.setSuccess(true);
        }

        return data;
    }

    /**
     * Read the Product Catalog Data from Zuora and saves it to a JSON cache
     * stored on the server to reduce load times. This method must be called
     * each time the Product Catalog is changed in Zuora to ensure the catalog
     * cache is not out of date for the user.
     *
     * @return A model containing all necessary information needed to display
     *         the products and rate plans in the product catalog.
     */
    public CatalogModel refreshCatalog() {
        CatalogModel data = null;
        try {
            // Retrieve the catalog from z-java and refresh the cache
            data = Catalog.refreshCatalog();
        } catch (Exception e) {
            data = new CatalogModel();
            data.setError(e.getMessage());
            data.setSuccess(true);
        }

        return data;
    }

    /**
     * Create a new cart instance in the current HttpSession.
     */
    public Object emptyCart(HttpServletRequest request) {
        // Set a new cart in the session
        HttpSession session = request.getSession();
        session.setAttribute("cart", new CartHelper());
        return session.getAttribute("cart");
    }

    /**
     * Check if the user is logged in (session)
     */
    public ResponseAction isUserLoggedIn(HttpServletRequest request) {
        HttpSession session = request.getSession();
        ResponseAction resp = new ResponseAction();
        try {
            if (session.getAttribute("username") != null
                    && !session.getAttribute("username").equals("")) {
                resp.setSuccess(true);
            } else {
                resp.setSuccess(false);
            }
        } catch (Exception e) {
            resp.setSuccess(false);
            resp.setError(e.getMessage());
        }
        return resp;
    }

    /**
     * Update a contact information.
     */
    public Object updateContact(HttpServletRequest request) throws Exception {
        // TODO This belongs in AccountManager

        // Get the account name from the session
        // HttpSession session = request.getSession();
        HashMap<String, String[]> p = (HashMap<String, String[]>) request
                .getParameterMap();
        // Create a new summary contact based on the query
        SummaryContact update = new SummaryContact();

        String id = request.getParameter("id");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String address1 = request.getParameter("address1");
        String address2 = request.getParameter("address2");
        String city = request.getParameter("city");
        String postalCode = request.getParameter("postalCode");
        String state = request.getParameter("state");
        String country = request.getParameter("country");
        if (country == null || country.equals("")) {
            country = "US";
        }

        update.setId(id);
        update.setFirstName(firstName);
        update.setLastName(lastName);
        update.setAddress1(address1);
        update.setAddress2(address2);
        update.setCity(city);
        update.setPostalCode(postalCode);
        update.setState(state);
        update.setCountry(country);

        // Update the contact
        ResponseAction conResult = accountManager.updateContactWithId(update.getId(), update);

        id = request.getParameter("s_id");
        firstName = request.getParameter("s_firstName");
        lastName = request.getParameter("s_lastName");
        address1 = request.getParameter("s_address1");
        address2 = request.getParameter("s_address2");
        city = request.getParameter("s_city");
        postalCode = request.getParameter("s_postalCode");
        state = request.getParameter("s_state");
        country = request.getParameter("s_country");
        if (country == null || country.equals("")) {
            country = "US";
        }

        SummaryContact soldToUpdate = new SummaryContact();
        soldToUpdate.setId(id);
        soldToUpdate.setFirstName(firstName);
        soldToUpdate.setLastName(lastName);
        soldToUpdate.setAddress1(address1);
        soldToUpdate.setAddress2(address2);
        soldToUpdate.setCity(city);
        soldToUpdate.setPostalCode(postalCode);
        soldToUpdate.setState(state);
        soldToUpdate.setCountry(country);

        conResult = accountManager.updateContactWithId(
                soldToUpdate.getId(), soldToUpdate);

        if (conResult.isSuccess()) {
            Map<String, Object> mapOutput = new HashMap<String, Object>();
            mapOutput.put("Success", true);

            return mapOutput;
        }

        return null;
    }

    /**
     * Return the latest subscription for the user logged in.
     */
    public List<AmenderSubscription> getLatestSubscription(
            HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        String accountid = (String) session.getAttribute("accountid");
        List<AmenderSubscription> subscriptions = subscriptionManager.getAllSubscription(accountid);

        if (subscriptions == null) {
            // TODO This should have a response code that tells you why it
            // failed
            return null;
        }

        return subscriptions;
    }

    /**
     * Return complete summary for the given user's email
     */
    public SummaryAccount getCompleteSummary(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        String accountid = (String) session.getAttribute("accountid");
        SummaryAccount summary = accountManager.getCompleteDetail(accountid);
        return summary;
    }

    /**
     * Return payment method summary for the user with the given account name
     */
    public SummaryAccount getPaymentMethodSummary(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        String accountid = (String) session.getAttribute("accountid");
        SummaryAccount summary = accountManager.getPaymentMethodDetail(accountid);
        return summary;
    }

    /**
     * Add a Rate Plan to the user's subscription
     */
    public AmenderResult addRatePlan(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        AmenderResult amRes = null;
        String accountid = (String) session.getAttribute("accountid");
        String ratePlanId = (String) request.getAttribute("itemId");
        String qty = (String) request.getAttribute("itemQty");
        BigDecimal bdQty = null;
        if (!qty.equals("null")) {
            try {
                bdQty = new BigDecimal(qty);
            } catch (Exception e) {
                amRes = new AmenderResult();
                amRes.setSuccess(false);
                amRes.setError("INVALID_QTY");
                return amRes;
            }
        }
        amRes = amender.addRatePlan(accountid, ratePlanId, bdQty, false);
        return amRes;
    }

    /**
     * Return complete summary for the given user's email
     */
    public AmenderResult previewAddRatePlan(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        AmenderResult amRes = null;
        String accountid = (String) session.getAttribute("accountid");
        String ratePlanId = (String) request.getAttribute("itemId");
        String qty = (String) request.getAttribute("itemQty");
        BigDecimal bdQty = null;
        if (!qty.equals("null")) {
            try {
                bdQty = new BigDecimal(qty);
            } catch (Exception e) {
                amRes = new AmenderResult();
                amRes.setSuccess(false);
                amRes.setError("INVALID_QTY");
                return amRes;
            }
        }
        return amender.addRatePlan(accountid, ratePlanId, bdQty, true);
    }

    /**
     * Return complete summary for the given user's email
     */
    public AmenderResult removeRatePlan(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        String accountid = (String) session.getAttribute("accountid");
        String ratePlanId = (String) request.getAttribute("itemId");
        return amender.removeRatePlan(accountid, ratePlanId, false);
    }

    /**
     * Return complete summary for the given user's email
     */
    public AmenderResult previewRemoveRatePlan(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        String accountid = (String) session.getAttribute("accountid");
        String ratePlanId = (String) request.getAttribute("itemId");
        return amender.removeRatePlan(accountid, ratePlanId, true);
    }

    /**
     * Return the current cart instance from the HttpSession.
     */
    public Object getInitialCart(HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (session.getAttribute("cart") == null) {
            emptyCart(request);
        }
        return session.getAttribute("cart");
    }

    /**
     * Remove an item from the current cart in session.
     */
    public Object removeItemFromCart(HttpServletRequest request) {

        HttpSession session = request.getSession();
        int itemId = 0;

        if ((String) request.getAttribute("itemId") != null) {
            itemId = Integer.parseInt((String) request.getAttribute("itemId"));
        } else {
            // TODO errors.add("Item Id not specified.");
            return null;
        }

        if (session.getAttribute("cart") != null) {
            boolean removed = ((CartHelper) session.getAttribute("cart"))
                    .removeCartItem(itemId);
            if (!removed) {
                // TODO errors.add("Item no longer exists.");
            }
        } else {
            // TODO errors.add("Cart has not been set up.");
            return null;
        }
        return session.getAttribute("cart");
    }

    /**
     * Add an item in the current cart.
     */
    public Object addItemToCart(HttpServletRequest request) {

        HttpSession session = request.getSession();

        if (session.getAttribute("cart") == null) {
            emptyCart(request);
        }

        // Check if the Rate Plan Id exists in the request
        if ((String) request.getAttribute("ratePlanId") == null) {
            // TODO
            // errors.add("Incorrect or missing Rate Plan ID in the request.");
            return null;
        }
        String ratePlanId = (String) request.getAttribute("ratePlanId");

        // Set up the quantity (default = 1)
        String quantity = "null	";
        if ((String) request.getAttribute("quantity") != null
                && !((String) request.getAttribute("quantity")).isEmpty()) {
            quantity = (String) request.getAttribute("quantity");
        }

        if (session.getAttribute("cart") != null) {
            ((CartHelper) session.getAttribute("cart")).addCartItem(ratePlanId,
                    quantity);

        } else {
            // TODO errors.add("Cart has not been set up.");
            return null;
        }

        return session.getAttribute("cart");
    }

    /**
     * Preview current cart in session.
     */
    public SubscribePreview previewCurrentCart(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();

        if (session.getAttribute("cart") != null) {
            CartHelper cartHelper = (CartHelper) session.getAttribute("cart");
            this.array = false;
            SubscribePreview preview = subscriptionManager.previewCurrentCart(cartHelper);
            return preview;
        }
        return null;
    }

    /**
     * Return a new iframe URL containing the hosted page (for card information)
     * URL.
     */
    public ResponseAction getNewIframeSrc() {
        return paymentManager.getNewAccountUrl();
    }

    /**
     * Return a new iframe URL containing the hosted page (for card information)
     * URL.
     */
    public ResponseAction getExistingIframeSrc(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String accountid = (String) session.getAttribute("accountid");
        ResponseAction iframeResp = null;
        try {
            iframeResp = paymentManager.getExistingIframeSrc(accountid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.array = false;

        return iframeResp;
    }

    /**
     * Remove Payment Method.
     */
    public ResponseAction removePaymentMethod(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String accountid = (String) session.getAttribute("accountid");
        String pmId = (String) (String) request.getParameter("pmId");
        return paymentManager.removePaymentMethod(accountid, pmId);
    }

    /**
     * Change Default Payment Method.
     */
    public ResponseAction changeDefaultPaymentMethod(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        String accountName = (String) session.getAttribute("username");
        String pmId = (String) (String) request.getParameter("pmId");
        return paymentManager.changePaymentMethod(accountName, pmId);
    }

    /**
     * Check if the email address is available in Zuora tenant.
     */
    public boolean checkEmailAvailability(HttpServletRequest request) throws Exception {
        String uEmail = (String) request.getAttribute("uEmail");
        boolean available = false;
        this.array = false;
        return accountManager.checkEmailAvailability(uEmail);
    }

    public String testSubscriptionUpdate(HttpServletRequest request)
            throws Exception {
        return null;
    }

    /**
     * This function allows the user to subscribe with the current cart,
     * checking out using an iFrame informations from Zuora (Hosted Payment).
     */
    public ResponseSubscribe subscribeWithCurrentCart(HttpServletRequest request) throws Exception {
        // Get information from the POST request
        String accountid = (String) request.getAttribute("accountid");
        String pmId = (String) request.getAttribute("pmId");
        HttpSession session = request.getSession();
        CartHelper cartHelper = (CartHelper) session.getAttribute("cart");

        ResponseSubscribe data = subscriptionManager.subscribeWithCurrentCart(
                accountid,
                pmId,
                cartHelper);

        if (!data.isSuccess()) {
            String msgError = (String) data.getError();

            if (msgError.equalsIgnoreCase("DUPLICATE_EMAIL")) {
                data.setError("This email address is already in use. Please choose another and re-submit");
                data.setSuccess(false);
                return data;
            } else if (msgError.equalsIgnoreCase("INVALID_PMID")) {
                data.setError("The payment ID submitted is invalid. Please try again.");
                data.setSuccess(false);
                return data;
            } else {
                data.setError(msgError);
                data.setSuccess(false);
                return data;
            }
        }

        data.setSuccess(true);
        return data;
    }
}
