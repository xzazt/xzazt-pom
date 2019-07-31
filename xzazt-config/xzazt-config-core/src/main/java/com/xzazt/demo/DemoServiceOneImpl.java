package com.xzazt.demo;

import com.alibaba.fastjson.JSONObject;
import com.xzazt.annotation.OrderIndex;
import org.springframework.stereotype.Service;

@Service
@OrderIndex(num = 1)
public class DemoServiceOneImpl implements DemoService{
    @Override
    public boolean doMain(JSONObject jsonObject) {
        System.out.println("我是1111");
        return true;
    }
}
