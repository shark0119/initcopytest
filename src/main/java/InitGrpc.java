import cn.com.unary.initcopy.common.utils.CommonUtils;
import cn.com.unary.initcopy.entity.AddEntity;
import cn.com.unary.initcopy.entity.QueryEntity;
import cn.com.unary.initcopy.grpc.constant.SyncType;
import cn.com.unary.initcopy.grpc.entity.ExecResult;
import cn.com.unary.initcopy.grpc.entity.QueryTask;
import cn.com.unary.initcopy.grpc.entity.SyncTarget;
import cn.com.unary.initcopy.grpc.entity.SyncTask;
import cn.com.unary.initcopy.grpc.entity.TaskState;
import cn.com.unary.initcopy.mock.InitCopyGrpcClient;
import com.alibaba.fastjson.JSONObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * ss
 *
 * @author Shark.Yin
 * @since 1.0
 */
public class InitGrpc {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            printHelp();
        } else {
            FileInputStream fis = new FileInputStream(args[0]);
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(fis));
            String str;
            StringBuilder sb = new StringBuilder();
            while (true) {
                str = reader.readLine();
                if (str == null) {
                    break;
                }
                sb.append(str);
            }
            try {
                AddEntity addEntity = JSONObject.parseObject(sb.toString(), AddEntity.class);
                System.out.println(addEntity);
                ExecResult result = add(addEntity);
                System.out.println(CommonUtils.formatGrpcEntity(result));
            } catch (Exception e) {
                try {
                    QueryEntity queryEntity = JSONObject.parseObject(sb.toString(), QueryEntity.class);
                    System.out.println(queryEntity);
                    TaskState state = query(queryEntity);
                    System.out.println(CommonUtils.formatGrpcEntity(state));
                } catch (Exception e1) {
                    e.printStackTrace();
                    printHelp();
                }
            }
        }
    }

    private static void printHelp() {
        System.out.println("InitGrpc [config-file-path] ");
        System.out.println("File format:");
        System.out.println("\tadd:{\"ip\":\"\",\"sourceGrpcPort\":,\"srcDirs\":[],\"targetDirs\":[],\"targetTCGrpcPort\":,\"targetTransferPort\":}");
        System.out.println("\tquery:{\"ip\":\"\",\"grpcPort\":,\"taskId\":\"\"}");
    }

    private static ExecResult add(AddEntity task) {
        // 客户端添加任务。
        SyncTarget.Builder targetBuilder = SyncTarget.newBuilder()
                .setIp(task.getTargetIp())
                .setGrpcPort(task.getTargetTCGrpcPort())
                .setTransferPort(task.getTargetTransferPort());
        SyncTask.Builder builder = SyncTask.newBuilder();
        builder.addAllFiles(task.getSrcDirs())
                .addAllTargetDirs(task.getTargetDirs())
                .setSyncType(SyncType.SYNC_ALL)
                .setTargetInfo(targetBuilder);
        InitCopyGrpcClient client = new InitCopyGrpcClient(task.getIp(), task.getSourceGrpcPort());
        ExecResult result = client.add(builder.build());
        client.close();
        return result;
    }

    private static TaskState query(QueryEntity task) {
        InitCopyGrpcClient client = new
                InitCopyGrpcClient(task.getIp(), task.getGrpcPort());
        final TaskState state = client.query(QueryTask.newBuilder()
                .setTaskId(task.getTaskId())
                .build());
        client.close();
        return state;
    }
}
