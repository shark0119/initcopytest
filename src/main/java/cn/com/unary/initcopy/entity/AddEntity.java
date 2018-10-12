package cn.com.unary.initcopy.entity;

import java.util.List;


public class AddEntity {
    public AddEntity() {
    }

    public AddEntity(String ip, int tcGrpcPort, int transferPort, int serverGrpcPort, List<String> srcDirs, List<String> targetDirs) {
        this.ip = ip;
        this.tcGrpcPort = tcGrpcPort;
        this.transferPort = transferPort;
        this.serverGrpcPort = serverGrpcPort;
        this.srcDirs = srcDirs;
        this.targetDirs = targetDirs;
    }

    String ip;
    int tcGrpcPort;
    int transferPort;
    int serverGrpcPort;
    List<String> srcDirs;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getTcGrpcPort() {
        return tcGrpcPort;
    }

    public void setTcGrpcPort(int tcGrpcPort) {
        this.tcGrpcPort = tcGrpcPort;
    }

    public int getTransferPort() {
        return transferPort;
    }

    public void setTransferPort(int transferPort) {
        this.transferPort = transferPort;
    }

    public int getServerGrpcPort() {
        return serverGrpcPort;
    }

    public void setServerGrpcPort(int serverGrpcPort) {
        this.serverGrpcPort = serverGrpcPort;
    }

    public List<String> getSrcDirs() {
        return srcDirs;
    }

    public void setSrcDirs(List<String> srcDirs) {
        this.srcDirs = srcDirs;
    }

    public List<String> getTargetDirs() {
        return targetDirs;
    }

    public void setTargetDirs(List<String> targetDirs) {
        this.targetDirs = targetDirs;
    }

    List<String> targetDirs;
}
