package com.imooc.service;

import com.imooc.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@ConditionalOnSystemProperty(name="user.name",value="zxy")
@Service
public class Java7CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
        int sum=0;

        for(int i=0;i<values.length;i++){
            sum+=values[i];
        }

        return sum;
    }
}
