package com.company.project.pojo.reqs;

/**
 * 项目标识
 */
public class ProjectId {
    //标识号
    private Integer id;
    //名称
    private String name;
    //缩略名
    private String abbreviation;
    //版本号
    private String versionNum;
    //发布号
    private String releasedNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum;
    }

    public String getReleasedNum() {
        return releasedNum;
    }

    public void setReleasedNum(String releasedNum) {
        this.releasedNum = releasedNum;
    }
}
