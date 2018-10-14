package cn.com.unary.initcopy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class QueryEntity {
    private String taskId;
    private String ip;
    private Integer grpcPort;
}
