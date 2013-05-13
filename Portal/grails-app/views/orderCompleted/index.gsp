<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <meta name="layout" content="main"/>
    <title>Order Completed</title>
    <link rel="stylesheet"
          href="${resource(dir: 'css', file: 'ordercompleted.css')}"
          type="text/css">
</head>

<body>
<div class="body">
    <div class="ThankYou">
        <h4>Thank You for your Order!</h4>
    </div>

    <div class="Message">Your order details are below. If there are
    any questions regarding your order or any of the wonderful NWEA
    products, please contact your account manager [ACCOUNT REP] AT
    [ACCOUNT REP EMAIL]</div>

    <div class="SummaryContainer">
        <div class="SectionTitle">Order Summary</div>

        <div class="Section">
            <table style="width:100%;">
                <thead>
                <tr>
                    <th>Product</th>
                    <th>QTY</th>
                    <th>Price</th>
                    <th>Total</th>
                </tr>
                </thead>
                <tbody>
                <g:each in="${orders}">
                    <tr>
                        <td>
                            ${it.name}
                        </td>
                        <td>
                            ${it.quantity}
                        </td>
                        <td>
                            &#36;${it.price}
                        </td>
                        <td>
                            &#36;${it.total}
                        </td>
                    </tr>
                </g:each>
                </tbody>
            </table>
        </div>
    </div>

    <div style="text-align:center;padding:5px">
        <a href="<g:createLink action="index" controller="MyAccount" class="button"/>">My Account</a>
    </div>
</div>
</body>
</html>