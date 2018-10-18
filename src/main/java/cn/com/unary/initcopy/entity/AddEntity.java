package cn.com.unary.initcopy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 *
 *
 * @author Shark.Yin
 * @since 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AddEntity {
    private String ip;
    private String targetIp;
    private Integer targetTCGrpcPort;
    private Integer targetTransferPort;
    private Integer sourceGrpcPort;
    private List<String> srcDirs;
    private List<String> targetDirs;
}
