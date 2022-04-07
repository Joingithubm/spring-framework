package com.athome.main;

import com.mysql.cj.util.StringUtils;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: fanchao@dtstack.com
 * @Date: 2022-02-17 3:56 下午
 */
public class ListMain {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(2);

        list2.add(10);
        list2.add(2);
        list1 = list1.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);


        Collection<Integer> intersection = CollectionUtils.intersection(list1, list2);

        System.out.println(Arrays.toString(intersection.toArray()));
    }
}
