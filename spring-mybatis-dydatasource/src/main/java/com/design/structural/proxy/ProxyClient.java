package com.design.structural.proxy;

/**
 * @author: fanchao
 * @date: 2022/03/03 14:08
 * @description：代理客户端
 */
public class ProxyClient {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);
        proxySubject.request();
    }
}
