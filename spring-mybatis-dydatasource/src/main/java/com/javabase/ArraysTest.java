package com.javabase;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: fanchao
 * @date: 2022/03/31 16:20
 * @description：Arrays类方法的测试
 */
public class ArraysTest {
    public static void main(String[] args) {
        // 1. copyOf()
        copyOf();

        // 2. copyOfRange()
        copyOfRange();

        // 3. sort
        sort();
    }

    public static void copyOf(){
        int[] str = new int[]{1,2,3,4,5};
        int[] ints = Arrays.copyOf(str, 3);
        System.out.println(Arrays.toString(ints));
    }

    public static void copyOfRange(){
        int[] str = new int[]{1,2,3,4,5};
        int[] ints = Arrays.copyOfRange(str, 2, str.length);
        System.out.println(Arrays.toString(ints));
    }

    public static void sort(){
        int[] str = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(str));
    }
}
