package com.athome.main;

import com.alibaba.fastjson.JSONObject;
import com.athome.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: fanchao@dtstack.com
 * @Date: 2022-02-16 3:09 下午
 */
public class JsonConvert {
    public static void main(String[] args) {

        JSONObject object = new JSONObject();
        object.put("id",1);
        object.put("name","zhangsan");

        JSONObject object1 = new JSONObject();
        object1.put("class","class3");
        object1.put("student",object);

        System.out.println(object1);

        List<Student> list = new ArrayList<>();
        Student student = new Student();
        student.setName("zhangsan");
        Student student1 = new Student();
        student1.setName("lisi");
        Student student2 = new Student();
        student2.setName("wangwu");
        list.add(student);
        list.add(student1);
        list.add(student2);

        System.out.println(list.stream().map(u->u.getName()).collect(Collectors.joining(",")));
    }
}
