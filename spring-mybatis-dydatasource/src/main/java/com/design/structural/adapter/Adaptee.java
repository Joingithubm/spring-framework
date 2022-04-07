package com.design.structural.adapter;

/**
 * @author: fanchao
 * @date: 2022/03/03 14:24
 * @description：适配者及已经存在的接口
 */
public class Adaptee {
    /**
     * 已存在接口
     */
    public void specialRequest(){
        System.out.println("我是已经存在的接口");
    }
}
