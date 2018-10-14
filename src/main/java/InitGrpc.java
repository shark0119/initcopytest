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
        System.out.println(" config-file-path ");
        System.out.println("add:{\"ip\":\"\",\"serverGrpcPort\":,\"srcDirs\":[],\"targetDirs\":[],\"tcGrpcPort\":,\"transferPort\":}");
        System.out.println("query:{\"ip\":\"\",\"grpcPort\":,\"taskId\":\"taskId\"}");
    }

    private static ExecResult add(AddEntity task) {
        // 客户端添加任务。
        SyncTask.Builder builder = SyncTask.newBuilder();
        builder.addAllFiles(task.getSrcDirs())
                .addAllTargetDirs(task.getTargetDirs())
                .setSyncType(SyncType.SYNC_ALL)
                .setTargetInfo(SyncTarget.newBuilder()
                        .setIp(task.getIp())
                        .setGrpcPort(task.getTcGrpcPort())
                        .setTransferPort(task.getTransferPort())
                        .build());
        InitCopyGrpcClient client = new InitCopyGrpcClient(task.getIp(), task.getServerGrpcPort());
        return client.add(builder.build());
    }

    private static TaskState query(QueryEntity task) {
        InitCopyGrpcClient client = new
                InitCopyGrpcClient(task.getIp(), task.getGrpcPort());
        return client.query(QueryTask.newBuilder()
                .setTaskId(task.getTaskId())
                .build());
    }
}
