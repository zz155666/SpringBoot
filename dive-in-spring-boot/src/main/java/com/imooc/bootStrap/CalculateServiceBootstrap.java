package com.imooc.bootStrap;

import com.imooc.service.CalculateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * {@link CalculateService}
 */
@SpringBootApplication(scanBasePackages = "com.imooc.service")
@Slf4j
public class CalculateServiceBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context=new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
               // .profiles("Java8")
                .run(args);
        CalculateService service=context.getBean(CalculateService.class);

       log.info("CalculateService: "+service.sum(0,1,2,3,4,5));

    }

}
