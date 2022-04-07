package com.design.structural.proxy;

/**
 * @author: fanchao
 * @date: 2022/03/03 14:05
 * @description：代理类对象
 */
public class ProxySubject extends Subject{

    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        requestPre();
        realSubject.request();
        requestAfter();
    }

    private void requestPre(){
        System.out.println(" ProxySubject do pre!!!");
    }

    private void requestAfter(){
        System.out.println("ProxySuject do after!!!");
    }
}
