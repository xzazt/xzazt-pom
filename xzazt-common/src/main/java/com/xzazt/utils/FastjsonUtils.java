package com.xzazt.utils;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class FastjsonUtils {

    public static JSONObject jsonToObj(String s){
        JSONObject job = JSONObject.parseObject(s);
        return job;
    }

    public static String objToJson(Object o){
        String json = JSONObject.toJSONString(o);
        return json;
    }

    public static String listToJson(List<Object> list){
        String json = JSONObject.toJSONString(list);
        return json;
    }

    public static void main(String[] args) {

    }
}
