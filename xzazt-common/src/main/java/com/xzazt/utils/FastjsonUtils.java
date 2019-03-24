package com.xzazt.utils;

import com.alibaba.fastjson.JSONObject;

public class FastjsonUtils {

    public static JSONObject jsonToObj(String s){
        JSONObject job = JSONObject.parseObject(s);
        return job;
    }

    public static String objToJson(Object o){
        String json = JSONObject.toJSONString(o);
        return json;
    }
}
