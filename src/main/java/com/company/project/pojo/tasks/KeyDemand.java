package com.company.project.pojo.tasks;

public class KeyDemand {
    // 可靠性
    private String reliability;
    // 安全性
    private String security;
    // 保密性
    private  String confidentiality;

    public String getReliability() {
        return reliability;
    }

    public void setReliability(String reliability) {
        this.reliability = reliability;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getConfidentiality() {
        return confidentiality;
    }

    public void setConfidentiality(String confidentiality) {
        this.confidentiality = confidentiality;
    }
}
