package com.design.structural.adapter;

/**
 * @author: fanchao
 * @date: 2022/03/03 14:26
 * @description：适配器
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        System.out.println("我是适配器，下面是代理接口返回的结果：");
        specialRequest();
    }
}
