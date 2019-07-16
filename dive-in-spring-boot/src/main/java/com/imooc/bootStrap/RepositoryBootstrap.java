package com.imooc.bootStrap;

import com.imooc.repository.MyFirstLevelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.imooc.repository")
@Slf4j
public class RepositoryBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        MyFirstLevelRepository myFirstLevelRepository=
                context.getBean("myFirstLevelRepository",MyFirstLevelRepository.class);
        log.info("myFirstLevelRepository Bean   "+myFirstLevelRepository);

        context.close();
    }
}
