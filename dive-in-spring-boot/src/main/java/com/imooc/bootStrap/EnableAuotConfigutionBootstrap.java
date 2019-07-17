package com.imooc.bootStrap;

import com.imooc.annotation.EnableHelloWorld;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableAutoConfiguration
@Slf4j
public class EnableAuotConfigutionBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=new SpringApplicationBuilder(EnableAuotConfigutionBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloWorld=context.getBean("helloWorld",String.class);

        log.info("helloWorld:"+helloWorld);

        context.close();
    }
}
