package com.hp.elasticsearch;

import com.hp.elasticsearch.common.LogStashUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class ESTests {

    @Test
    public void contextLoads() {
        LogStashUtil.sendMessage(
                "admin","这是从springboot传过去的日志","this is a log 日志",new Date(),"这是参数123abc");
        LogStashUtil.sendMessage(
                "admin","这是从springboot传过去的日志","this is a log 日志",new Date(),"这是参数123abc");
        LogStashUtil.sendMessage(
                "admin","这是从springboot传过去的日志","this is a log 日志",new Date(),"这是参数123abc");
        LogStashUtil.sendMessage(
                "admin","这是从springboot传过去的日志","this is a log 日志",new Date(),"这是参数123abc");
    }
}
