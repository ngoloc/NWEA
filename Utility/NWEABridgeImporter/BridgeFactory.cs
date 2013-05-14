using System;

namespace NWEABridgeImporter
{
    public class BridgeFactory
    {
        private readonly SforceService _svc;

        public BridgeFactory(SforceService svc)
        {
            _svc = svc;
        }

        public void Bridge(string productId, string productRatePlanChargeId)
        {
            QueryResult product = _svc.query("SELECT Id FROM Product2 WHERE Id = '" + productId + "'");
            if (product.size == 0)
            {
                Console.WriteLine("No product found: " + productId);
                return;
            }

            QueryResult prp =
                _svc.query(string.Format("SELECT Id FROM zqu__ProductRatePlanCharge__c WHERE zqu__ZuoraId__c = '{0}'",
                                         productRatePlanChargeId));
            if (prp.size == 0)
            {
                Console.WriteLine("prpc not found: " + productRatePlanChargeId);
                return;
            }
            string prpcId = prp.records[0].Id;

            QueryResult bridge =
                _svc.query(
                    string.Format(
                        "SELECT Id FROM ZuoraBridge__c WHERE Product__c = '{0}' AND Product_Rate_Plan_Charge__c = '{1}'",
                        productId, prpcId));

            if (bridge.size > 0)
            {
                Console.WriteLine("Bridge already exists.");
                return;
            }

            var b = new ZuoraBridge__c();
            b.Product__c = productId;
            b.Product_Rate_Plan_Charge__c = prpcId;
            _svc.create(new[] {b});
            Console.WriteLine(string.Format("Bridged {0} to {1}", productId, prpcId));
        }
    }
}