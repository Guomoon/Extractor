package com.company.project.pojo.tasks;

import com.company.project.pojo.reqs.HardwareReq;
import com.company.project.pojo.reqs.ProjectId;

public class Tasks {
    // 项目标识
    private ProjectId pId;
    // 系统概述
    private String systemIntro;
    // 文档概述
    private String documentIntro;
    // 术语解释
    private String termsExplanation;
    // 引用文件
    private String referenceFiles;
    // 硬件环境需求
    private HardwareReq hardwareReq;
    // 软件环境
    private SoftwareEnviroment softwareEnviroment;
    // 技术要求
    private TechDemand techDemand;
    // 设计约束
    private DesignRestrain designRestrain;
    // 质量空值要求
    private QualityControlDemand qualityControlDemand;
    // 验收与交付
    private Delivery delivery;

    public String getQualityEnsuranceDemand() {
        return qualityEnsuranceDemand;
    }

    public void setQualityEnsuranceDemand(String qualityEnsuranceDemand) {
        this.qualityEnsuranceDemand = qualityEnsuranceDemand;
    }

    public String getProjMilestone() {
        return projMilestone;
    }

    public void setProjMilestone(String projMilestone) {
        this.projMilestone = projMilestone;
    }

    // 软件质量保障要求
    private String qualityEnsuranceDemand;
    // 进度和里程碑
    private String projMilestone;


    public ProjectId getpId() {
        return pId;
    }

    public void setpId(ProjectId pId) {
        this.pId = pId;
    }

    public String getSystemIntro() {
        return systemIntro;
    }

    public void setSystemIntro(String systemIntro) {
        this.systemIntro = systemIntro;
    }

    public String getDocumentIntro() {
        return documentIntro;
    }

    public void setDocumentIntro(String documentIntro) {
        this.documentIntro = documentIntro;
    }

    public String getTermsExplanation() {
        return termsExplanation;
    }

    public void setTermsExplanation(String termsExplanation) {
        this.termsExplanation = termsExplanation;
    }

    public String getReferenceFiles() {
        return referenceFiles;
    }

    public void setReferenceFiles(String referenceFiles) {
        this.referenceFiles = referenceFiles;
    }

    public HardwareReq getHardwareReq() {
        return hardwareReq;
    }

    public void setHardwareReq(HardwareReq hardwareReq) {
        this.hardwareReq = hardwareReq;
    }

    public SoftwareEnviroment getSoftwareEnviroment() {
        return softwareEnviroment;
    }

    public void setSoftwareEnviroment(SoftwareEnviroment softwareEnviroment) {
        this.softwareEnviroment = softwareEnviroment;
    }

    public TechDemand getTechDemand() {
        return techDemand;
    }

    public void setTechDemand(TechDemand techDemand) {
        this.techDemand = techDemand;
    }

    public DesignRestrain getDesignRestrain() {
        return designRestrain;
    }

    public void setDesignRestrain(DesignRestrain designRestrain) {
        this.designRestrain = designRestrain;
    }

    public QualityControlDemand getQualityControlDemand() {
        return qualityControlDemand;
    }

    public void setQualityControlDemand(QualityControlDemand qualityControlDemand) {
        this.qualityControlDemand = qualityControlDemand;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
}
