package com.hiya.nio.netty.heartBeat;

import java.io.Serializable;
import java.util.Map;

public class RequestInfo implements Serializable
{
    private static final long serialVersionUID = 133455L;
    private String ip;
    private Map<String, Object> cpuPercMap;
    private Map<String, Object> memoryMap;
    public String getIp()
    {
        return ip;
    }

    public void setIp(String ip)
    {
        this.ip = ip;
    }

    public Map<String, Object> getCpuPercMap()
    {
        return cpuPercMap;
    }

    public void setCpuPercMap(Map<String, Object> cpuPercMap) 
    {
             this.cpuPercMap = cpuPercMap;
    }

    public Map<String, Object> getMemoryMap()
    {
        return memoryMap;
    }

    public void setMemoryMap(Map<String, Object> memoryMap)
    {
        this.memoryMap = memoryMap;
    }
}
