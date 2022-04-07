package com.design.structural.adapter;

/**
 * @author: fanchao
 * @date: 2022/03/03 14:31
 * @description：适配器客户端
 */
public class AdapterClient {
    public static void main(String[] args) {

        Target target = new Adapter();
        target.request();
    }


}
