package com.design.structural.decorator;

/**
 * @author: fanchao
 * @date: 2022/03/11 15:03
 * @description：抽象接口实现类
 */
public class ConcreteComponent implements Component{
    @Override
    public void operator() {
        System.out.println("我是抽象接口本来的实现方法");
    }
}
