using System;
using System.IO;

namespace NWEABridgeImporter
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            var pw = "hHAfXhn6t1O3";
            var token = "vH4tFXiEObwH1WotZxK2xEX3z";
            var username = "saasei.user@nwea.org.test";
            var sfs = new SforceService();
            sfs.Timeout = 60000;
            Console.WriteLine("Logging in...");
            var lr = sfs.login(username, pw + token);
            sfs.SessionHeaderValue = new SessionHeader();
            sfs.SessionHeaderValue.sessionId = lr.sessionId;
            string authEndPoint = sfs.Url;
            sfs.Url = lr.serverUrl;

            string content =
                File.ReadAllText(
                    @"C:\Users\Dana\Documents\GitHub\NWEA_Bridge_Importer\NWEABridgeImporter\productmapping.csv");

            var lines = content.Split(new char[] {'\r'});
            var bridgeFactory = new BridgeFactory(sfs);
            bool isFirst = true;
            foreach (var line in lines)
            {
                if (isFirst)
                {
                    isFirst = false;
                    continue;
                }
                if (string.IsNullOrWhiteSpace(line))
                {
                    continue;
                }
                
                string pId = string.Empty;
                string prpcId = string.Empty;
                var l = line.Trim();
                l = l.TrimEnd(new char[] {','});

                var parts = l.Split(',');
                if (parts.Length != 2)
                {
                    Console.WriteLine("invalid bridge: " + line);
                    continue;
                }
                pId = parts[0];
                prpcId = parts[1];
                
                if (string.IsNullOrWhiteSpace(pId) || string.IsNullOrWhiteSpace(prpcId))
                {
                    Console.WriteLine("invalid line: " + line);
                    continue;
                }
                Console.WriteLine("bridging {0} to {1} ...", pId, prpcId);
                bridgeFactory.Bridge(pId, prpcId);
            }
            Console.ReadKey();
        }
    }
}