package com.imooc.configuration;

import com.imooc.annotation.EnableHelloWorld;
import com.imooc.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

@Configuration  //Spring 模式注解
@EnableHelloWorld //Spring @Enable 模块装配
@ConditionalOnSystemProperty(name="user.name",value="zxy1") //条件装配
public class HelloWorldAutoConfiguration {
}
