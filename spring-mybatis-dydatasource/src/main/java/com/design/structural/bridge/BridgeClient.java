package com.design.structural.bridge;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: fanchao
 * @date: 2022/03/03 15:20
 * @description：
 */
public class BridgeClient {
    public static void main(String[] args) throws IOException {
        Color color = new Yellow();
        Color red = new Red();
        Bag bag = new Wallet();
        bag.setColor(color);
        bag.getName();

        bag.setColor(red);
        bag.getName();

        FileInputStream fileInputStream = new FileInputStream("");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        bufferedInputStream.read();
        fileInputStream.read();


    }

}
