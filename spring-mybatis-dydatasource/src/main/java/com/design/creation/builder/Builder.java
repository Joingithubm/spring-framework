package com.design.creation.builder;

/**
 * @author: fanchao
 * @date: 2022/02/28 17:51
 * @description：抽象创建者
 */
public abstract class Builder {

    protected Product product = new Product();

    public abstract void builderPartA();

    public abstract void builderPartB();

    public abstract void builderPartC();

    public Product builderProduct(){
        return product;
    }
}
