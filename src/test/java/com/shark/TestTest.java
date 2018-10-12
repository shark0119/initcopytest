package com.shark;

import cn.com.unary.initcopy.entity.AddEntity;
import cn.com.unary.initcopy.entity.QueryEntity;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.ArrayList;

public class TestTest {
    @Test
    public void test1 () {
        AddEntity addEntity = new AddEntity("", 12, 12, 12,
                new ArrayList<String>(), new ArrayList<String>());
        System.out.println(JSONObject.toJSONString(addEntity));
        QueryEntity queryEntity = new QueryEntity("", 12, "taskid");
        System.out.println(JSONObject.toJSONString(queryEntity));
    }
}
