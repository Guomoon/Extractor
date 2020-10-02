package com.company.project.pojo.reqs;

import java.util.Map;

public class Requirements {

    private Integer id;
    // 项目密级
    private Integer secretLevel;
    // 项目标识
    private ProjectId pId;
    //系统概述
    private String systemIntro;
    //文档概述
    private String documentIntro;
    // 引用文件
    private String referenceFiles;
    // 需求
    private Requirement requirement;

    public String getQualifiedStipulate() {
        return qualifiedStipulate;
    }

    public void setQualifiedStipulate(String qualifiedStipulate) {
        this.qualifiedStipulate = qualifiedStipulate;
    }

    public Map<String, String> getTraceabilityOfReqs() {
        return traceabilityOfReqs;
    }

    public void setTraceabilityOfReqs(Map<String, String> traceabilityOfReqs) {
        this.traceabilityOfReqs = traceabilityOfReqs;
    }

    // 合格性规定
    private String qualifiedStipulate;

    // 需求可追踪性 (读表格，用map数据结构建立需求规格说明书和任务书之间的映射关系)
    private Map<String,String> traceabilityOfReqs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSecretLevel() {
        return secretLevel;
    }

    public void setSecretLevel(Integer secretLevel) {
        this.secretLevel = secretLevel;
    }

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

    public String getReferenceFiles() {
        return referenceFiles;
    }

    public void setReferenceFiles(String referenceFiles) {
        this.referenceFiles = referenceFiles;
    }

    public Requirement getRequirement() {
        return requirement;
    }

    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }
}
