package com.imooc.springapplication;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring应用事件引导类
 */
public class SpringApplicationEventBootstrap {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();

        context.addApplicationListener(event -> {
            System.out.println("监听到事件： "+event);
        });

        context.refresh();

        context.publishEvent("Hello World");

        context.publishEvent(new ApplicationEvent("Hello World") {
        });

        context.close();

    }
}
