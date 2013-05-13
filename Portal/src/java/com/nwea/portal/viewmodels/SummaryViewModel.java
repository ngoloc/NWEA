package com.nwea.portal.viewmodels;

public class SummaryViewModel {

    private LicenseViewModel[] licenses;

    private RelatedProductViewModel[] related;

    private String pmurl;

    public String getPmurl() {
        return pmurl;
    }

    public void setPmurl(String pmuurl) {
        this.pmurl = pmuurl;
    }

    public LicenseViewModel[] getLicenses() {
        return licenses;
    }

    public void setLicenses(LicenseViewModel[] licenses) {
        this.licenses = licenses;
    }

    public RelatedProductViewModel[] getRelated() {
        return related;
    }

    public void setRelated(RelatedProductViewModel[] related) {
        this.related = related;
    }

}
