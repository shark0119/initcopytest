package cn.com.unary.initcopy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AddEntity {
    private String ip;
    private Integer tcGrpcPort;
    private Integer transferPort;
    private Integer serverGrpcPort;
    private List<String> srcDirs;
    private List<String> targetDirs;
}
