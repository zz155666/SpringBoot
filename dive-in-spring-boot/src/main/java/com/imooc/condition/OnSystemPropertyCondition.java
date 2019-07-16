package com.imooc.condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

import java.util.Map;

/**
 * 系统属性判断
 */
public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        MultiValueMap<String, Object> multiValueMap=metadata.getAllAnnotationAttributes(ConditionalOnSystemProperty.class.getName());

        Map<String, Object> attributes= multiValueMap.toSingleValueMap();

        String propertyzName=String.valueOf(attributes.get("name"));

        String propertyValue=String.valueOf(attributes.get("value"));



        return "zxy1".equals(propertyValue);
    }
}
