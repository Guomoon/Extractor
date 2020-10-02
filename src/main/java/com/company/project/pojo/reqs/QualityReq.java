package com.company.project.pojo.reqs;

public class QualityReq {
    // 可靠性需求
    private String reliabilityReq;
    // 可维护性需求
    private String maintainabilityReq;

    public String getReliabilityReq() {
        return reliabilityReq;
    }

    public void setReliabilityReq(String reliabilityReq) {
        this.reliabilityReq = reliabilityReq;
    }

    public String getMaintainabilityReq() {
        return maintainabilityReq;
    }

    public void setMaintainabilityReq(String maintainabilityReq) {
        this.maintainabilityReq = maintainabilityReq;
    }
}
