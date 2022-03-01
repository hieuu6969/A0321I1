package model;

public class MailSetting {
    private String lang;
    private int pageSize;
    private boolean spamsFilter;
    private String signature;

    public MailSetting(String lang, int pageSize, boolean spamsFilter, String signature) {
        this.lang = lang;
        this.pageSize = pageSize;
        this.spamsFilter = spamsFilter;
        this.signature = signature;
    }

    public MailSetting() {
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpamsFilter() {
        return spamsFilter;
    }

    public void setSpamsFilter(boolean spamsFilter) {
        this.spamsFilter = spamsFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
