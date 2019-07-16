package com.imooc.annotation;

import com.imooc.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class HelloWorldImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata){
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
