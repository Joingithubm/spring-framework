package com.design.creation.builder;

/**
 * @author: fanchao
 * @date: 2022/02/28 17:57
 * @description：具体创建者1
 */
public class ConcreteBuilder extends Builder{
    @Override
    public void builderPartA() {
        product.setPartA(" ConcreteBuilder A");
    }

    @Override
    public void builderPartB() {
        product.setPartB("ConcreteBuilder B");
    }

    @Override
    public void builderPartC() {
        product.setPartC("ConcreteBuilder C");
    }
}
