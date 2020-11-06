# java-elasticsearch

1.实现基于spring-data-elasticsearch 以及 elasticsearch-rest-high-level-client 两种方式操作Elasticsearch。
  <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-data-elasticsearch</artifactId>
  </dependency>
  <dependency>
      <groupId>org.elasticsearch.client</groupId>
      <artifactId>elasticsearch-rest-high-level-client</artifactId>
      <version>7.9.2</version>
  </dependency>
  /t/n

2.实现springboot logback 连接 logstash,日志信息写到es当中。
  <!--日志写入logstash-->
  <appender name="logstash" class="net.logstash.logback.appender.LogstashTcpSocketAppender">
      <destination>ruoweiserver002:4567</destination>
      <encoder charset="UTF-8" class="net.logstash.logback.encoder.LogstashEncoder">
          <!-- 用户自定义Json字符串，用于向logstash提交额外的自定义属性。可在logstash的input里接收该参数 -->
          <customFields>{"app_name":"lxDapp"}</customFields>
      </encoder>
  </appender>

  <!--监控指定的日志类-->
  <logger name="com.hp.elasticsearch.common.LogStashUtil" level="INFO">　　
      <appender-ref ref="logstash"/>　
  </logger>

  <root level="INFO">
      <appender-ref ref="STDOUT" />
  </root>
