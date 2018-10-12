package cn.com.unary.initcopy.entity;

public class QueryEntity {
    public QueryEntity() {
    }

    public QueryEntity(String ip, int serverGrpcPort, String taskId) {
        this.ip = ip;
        this.serverGrpcPort = serverGrpcPort;
        this.taskId = taskId;
    }

    String ip;
    int serverGrpcPort;
    String taskId;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getServerGrpcPort() {
        return serverGrpcPort;
    }

    public void setServerGrpcPort(int serverGrpcPort) {
        this.serverGrpcPort = serverGrpcPort;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
}
