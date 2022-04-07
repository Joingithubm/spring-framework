package com.design.structural.bridge;

/**
 * @author: fanchao
 * @date: 2022/03/03 15:11
 * @description：抽象化角色
 */
public abstract class Bag {

    protected Color color;

    public void setColor(Color color){
        this.color = color;
    }

    abstract void getName();
}
