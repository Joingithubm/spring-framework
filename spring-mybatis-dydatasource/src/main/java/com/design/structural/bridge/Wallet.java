package com.design.structural.bridge;

/**
 * @author: fanchao
 * @date: 2022/03/03 15:20
 * @description：钱包
 */
public class Wallet extends Bag{
    @Override
    void getName() {
        System.out.println(color.getColor() + "钱包");
    }
}
