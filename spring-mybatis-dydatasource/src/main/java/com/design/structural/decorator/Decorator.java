package com.design.structural.decorator;

/**
 * @author: fanchao
 * @date: 2022/03/11 15:04
 * @description：抽象装饰者
 */
public abstract class Decorator implements Component{

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operator() {
        component.operator();
    }


}
