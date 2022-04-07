package com.design.structural.decorator;

/**
 * @author: fanchao
 * @date: 2022/03/11 15:08
 * @description：具体装饰器1
 */
public class ConcreteDecorator1 extends Decorator{

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operator(){
        super.operator();
        addFunction();
    }

    public void addFunction(){
        System.out.println("我是装饰器1 增加的方法");
    }
}
