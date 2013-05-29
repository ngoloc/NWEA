package com.nwea.portal.repository;

import com.zuora.api.*;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.util.ZApi;
import org.apache.commons.lang.time.StopWatch;
import org.springframework.cache.Cache;

public abstract class RepositoryBase {

    private ZApi zapi;

    private Cache cache;

    public RepositoryBase(Cache c, ZApi api) throws Exception {
        this.zapi = api;
        this.cache = c;
    }

    protected void Update(ZObject obj) throws Exception {
        ZObject[] objs = new ZObject[]{obj};
        SaveResult[] srs = zapi.zUpdate(objs);
        for (SaveResult sr : srs) {
            if (!sr.getSuccess()) {
                throw new Exception(sr.getErrors()[0].getMessage());
            }
        }
    }

    protected String Create(ZObject obj) throws Exception {
        ZObject[] objs = new ZObject[]{obj};
        SaveResult[] srs = zapi.zCreate(objs);
        for (SaveResult sr : srs) {
            if (!sr.getSuccess()) {
                throw new Exception(sr.getErrors()[0].getMessage());
            } else {
                return sr.getId().getID();
            }
        }
        return null;
    }

    protected AmendResult[] ApplyAmend(Amend amd) throws Exception {
        return zapi.zAmend(amd);
    }

    protected SubscribeResult[] DoSubscribe(Subscribe subscribe) throws Exception {
        return zapi.zSubscribe(subscribe);
    }

    protected ZObject[] Query(String query) throws Exception {
        return Query(query, false);
    }

    protected ZObject[] Query(String query, boolean isCached) throws Exception {
        ZObject[] results = null;
        if (isCached) {
            Cache.ValueWrapper cachedObj = this.cache.get(query);
            if (cachedObj != null) {
                results = (ZObject[]) cachedObj.get();
            }
        }
        if (results == null) {
            StopWatch sw = new StopWatch();
            sw.start();
            QueryResult qr = zapi.zQuery(query);
            sw.stop();
            System.out.println("QUERY ELAPSED: " + sw.getTime());
            results = qr.getRecords();
            if (results.length == 1 && results[0] == null) {
                results = new ZObject[0];
            }
            if (isCached) {
                if (results == null) {
                    System.out.println("cached null result :(");
                }
                this.cache.put(query, results);
            }

        } else {
            System.out.println("FROM CACHE: " + query);
        }

        return results;
    }
}
