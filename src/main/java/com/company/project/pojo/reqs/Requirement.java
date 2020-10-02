package com.company.project.pojo.reqs;

public class Requirement {
    // 要求的状态和方式
    private String statesAndManners;
    // 功能需求
    private String functionalReq;
    // 外部接口需求
    private String externalApiReq;
    // 内部接口需求
    private String internalApiReq;
    //　内部数据需求
    private String internalDataReq;
    // 适应性需求
    private String adaptiveReq;
    // 安全性需求
    private String securityReq;
    // 保密性需求
    private String confidentialReq;
    // 环境需求
    private String environmentalReq;
    // 硬件环境需求
    private HardwareReq hardwareReq;
    // 软件环境要求
    private String softwareReq;
    // 质量需求
    private QualityReq qualityReq;
    // 设计实现和约束
    private String restrainReq;
    // 人员需求
    private String peopleReq;
    // 培训需求
    private String trainReq;
    // 软件保障需求
    private String softwareEnsuranceReq;
    // 其他需求
    private String otherReq;
    // 验收、交付和包装需求
    private String deliveryReq;

    public String getSoftwareReq() {
        return softwareReq;
    }

    public void setSoftwareReq(String softwareReq) {
        this.softwareReq = softwareReq;
    }

    public QualityReq getQualityReq() {
        return qualityReq;
    }

    public void setQualityReq(QualityReq qualityReq) {
        this.qualityReq = qualityReq;
    }

    public String getRestrainReq() {
        return restrainReq;
    }

    public void setRestrainReq(String restrainReq) {
        this.restrainReq = restrainReq;
    }

    public String getPeopleReq() {
        return peopleReq;
    }

    public void setPeopleReq(String peopleReq) {
        this.peopleReq = peopleReq;
    }

    public String getTrainReq() {
        return trainReq;
    }

    public void setTrainReq(String trainReq) {
        this.trainReq = trainReq;
    }

    public String getSoftwareEnsuranceReq() {
        return softwareEnsuranceReq;
    }

    public void setSoftwareEnsuranceReq(String softwareEnsuranceReq) {
        this.softwareEnsuranceReq = softwareEnsuranceReq;
    }

    public String getOtherReq() {
        return otherReq;
    }

    public void setOtherReq(String otherReq) {
        this.otherReq = otherReq;
    }

    public String getDeliveryReq() {
        return deliveryReq;
    }

    public void setDeliveryReq(String deliveryReq) {
        this.deliveryReq = deliveryReq;
    }

    public String getPriorityOfReqs() {
        return priorityOfReqs;
    }

    public void setPriorityOfReqs(String priorityOfReqs) {
        this.priorityOfReqs = priorityOfReqs;
    }

    // 需方的优先顺序和关键程度
    private String priorityOfReqs;



    public String getStatesAndManners() {
        return statesAndManners;
    }

    public void setStatesAndManners(String statesAndManners) {
        this.statesAndManners = statesAndManners;
    }

    public String getFunctionalReq() {
        return functionalReq;
    }

    public void setFunctionalReq(String functionalReq) {
        this.functionalReq = functionalReq;
    }

    public String getExternalApiReq() {
        return externalApiReq;
    }

    public void setExternalApiReq(String externalApiReq) {
        this.externalApiReq = externalApiReq;
    }

    public String getInternalApiReq() {
        return internalApiReq;
    }

    public void setInternalApiReq(String internalApiReq) {
        this.internalApiReq = internalApiReq;
    }

    public String getInternalDataReq() {
        return internalDataReq;
    }

    public void setInternalDataReq(String internalDataReq) {
        this.internalDataReq = internalDataReq;
    }

    public String getAdaptiveReq() {
        return adaptiveReq;
    }

    public void setAdaptiveReq(String adaptiveReq) {
        this.adaptiveReq = adaptiveReq;
    }

    public String getSecurityReq() {
        return securityReq;
    }

    public void setSecurityReq(String securityReq) {
        this.securityReq = securityReq;
    }

    public String getConfidentialReq() {
        return confidentialReq;
    }

    public void setConfidentialReq(String confidentialReq) {
        this.confidentialReq = confidentialReq;
    }

    public String getEnvironmentalReq() {
        return environmentalReq;
    }

    public void setEnvironmentalReq(String environmentalReq) {
        this.environmentalReq = environmentalReq;
    }

    public HardwareReq getHardwareReq() {
        return hardwareReq;
    }

    public void setHardwareReq(HardwareReq hardwareReq) {
        this.hardwareReq = hardwareReq;
    }
}
