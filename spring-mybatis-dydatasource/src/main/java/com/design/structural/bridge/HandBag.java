package com.design.structural.bridge;

/**
 * @author: fanchao
 * @date: 2022/03/03 15:19
 * @description：手提包
 */
public class HandBag extends Bag{
    @Override
    void getName() {
        System.out.println(color.getColor() + "手提包");
    }
}
