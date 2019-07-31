package com.xzazt.service.impl;

import com.xzazt.annotation.OrderIndex;
import com.xzazt.config.SpringUtils;
import com.xzazt.demo.DemoService;
import com.xzazt.service.TestService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public void doTest() {
        Map<String, DemoService> beansOfType = SpringUtils.getBeansOfType(DemoService.class);
        Map<String,DemoService> map = new HashMap<>();
        int max = 0;
        for(Map.Entry<String, DemoService> entry : beansOfType.entrySet()){
            String key = entry.getKey();
            DemoService value = entry.getValue();
            int num = value.getClass().getAnnotation(OrderIndex.class).num();
            map.put("item"+num,value);
            if(max < num){
                max = num;
            }
        }
        for(int i = 1; i <= max; i++){
            DemoService demoService = map.get("item" + i);
            if(demoService != null){
                boolean b = demoService.doMain(null);
                if(!b){
                    return;
                }
            }
        }
    }
}
