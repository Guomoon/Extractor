package com.company.project.pojo.reqs;

public class HardwareReq {
    // cpu需求
    private String cpuReq;
    // 内存需求
    private String cacheReq;
    // 硬盘需求
    private String diskReq;
    // 显示器需求
    private String monitorReq;
    // 网卡需求
    private String netCardReq;

    public String getCpuReq() {
        return cpuReq;
    }

    public void setCpuReq(String cpuReq) {
        this.cpuReq = cpuReq;
    }

    public String getCacheReq() {
        return cacheReq;
    }

    public void setCacheReq(String cacheReq) {
        this.cacheReq = cacheReq;
    }

    public String getDiskReq() {
        return diskReq;
    }

    public void setDiskReq(String diskReq) {
        this.diskReq = diskReq;
    }

    public String getMonitorReq() {
        return monitorReq;
    }

    public void setMonitorReq(String monitorReq) {
        this.monitorReq = monitorReq;
    }

    public String getNetCardReq() {
        return netCardReq;
    }

    public void setNetCardReq(String netCardReq) {
        this.netCardReq = netCardReq;
    }
}
