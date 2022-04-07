package com.design.structural.decorator;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author: fanchao
 * @date: 2022/03/11 15:12
 * @description：装饰器客户端
 */
public class DecoratorClient {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        Decorator decorator = new ConcreteDecorator1(component);
        decorator.operator();

        System.out.println(UUID.randomUUID());
    }
}
