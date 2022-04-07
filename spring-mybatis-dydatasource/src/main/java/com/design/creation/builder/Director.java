package com.design.creation.builder;

/**
 * @author: fanchao
 * @date: 2022/02/28 17:59
 * @description：指挥者
 */
public class Director {

    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    public Product construct(){
        builder.builderPartA();
        builder.builderPartB();
        builder.builderPartC();
        return builder.builderProduct();
    }
}
