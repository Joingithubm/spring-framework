package com.design.structural.proxy;

/**
 * @author: fanchao
 * @date: 2022/03/03 14:03
 * @description：真实类对象
 */
public class RealSubject extends Subject{
    @Override
    public void request() {
        System.out.println("I am RealSubject1!!!");
    }
}
