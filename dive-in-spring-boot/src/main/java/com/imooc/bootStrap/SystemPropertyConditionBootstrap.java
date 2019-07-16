package com.imooc.bootStrap;

import com.imooc.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@ConditionalOnSystemProperty(name="user.name",value="zxy")
public class SystemPropertyConditionBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context=new SpringApplicationBuilder(SystemPropertyConditionBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        context.close();

    }



}
