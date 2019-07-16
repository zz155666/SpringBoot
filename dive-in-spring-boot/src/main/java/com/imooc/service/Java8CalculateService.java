package com.imooc.service;

import com.imooc.condition.ConditionalOnSystemProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@ConditionalOnSystemProperty(name="user.name",value="zxy1")
@Service
@Slf4j
public class Java8CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
        log.info("java8");
        return Stream.of(values).reduce(0,Integer::sum);
    }
}
