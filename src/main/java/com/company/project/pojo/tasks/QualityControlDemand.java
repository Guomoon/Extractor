package com.company.project.pojo.tasks;

import java.util.Map;

public class QualityControlDemand {
    // 软件关键等级
    private String softwareKeyLevel;
    // 标准
    private  String standard;
    // 文档 <代号，文档名称>
    private Map<String,String> docs;
    // 配置管理
    private String configurationManagement;
    // 测试要求
    private  String testDemand;

}
