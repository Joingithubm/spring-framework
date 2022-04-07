package com.design.creation.builder;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author: fanchao
 * @date: 2022/02/28 18:04
 * @description：客户端使用
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product);

        Map<String,String> map = new HashMap<>();
        map.put("工作流AAA","1");
        map.put("工作流AAAB","2");
        map.put("工作流AAAC","3");
        System.out.println(map);


    }
}
