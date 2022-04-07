package com.athome.main;

import com.athome.entity.CourseEntity;
import com.athome.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Description:
 * @Author: fanchao@dtstack.com
 * @Date: 2022-02-11 5:51 下午
 */
public class OptionalTest {

    public static void main(String[] args) {
        List<CourseEntity> all = findAll();
        String meiyou = all.stream().filter(u -> u.getStatus()).findFirst().map(u -> u.getStudent()).map(u->u.getName()).orElse("xxxxx");
        System.out.println(meiyou);

        Student student = new Student();
        student.setId(1);
        student.setName("zhangsna");
        CourseEntity entity = new CourseEntity();
        entity.setCid(1);
        entity.setStatus(false);
      //  entity.setStudent(student);

        String s = Optional.ofNullable(entity).map(u -> u.getStudent()).map(u -> u.getName()).orElse("****");
        System.out.println(s);
    }

    public static List<CourseEntity> findAll(){
        List<CourseEntity> list = new ArrayList<>();

        Student student = new Student();
        student.setId(1);
        student.setName("zhangsna");
        CourseEntity entity = new CourseEntity();
        entity.setCid(1);
        entity.setStatus(false);
        entity.setStudent(student);
        list.add(entity);

        CourseEntity entity1 = new CourseEntity();
        entity1.setCid(2);
        entity1.setStatus(true);
        list.add(entity1);

        CourseEntity entity2 = new CourseEntity();
        entity2.setCid(2);
        entity2.setStatus(false);
        list.add(entity2);

        CourseEntity entity3 = new CourseEntity();
        entity3.setCid(3);
        entity3.setStatus(false);
        list.add(entity3);


        return list;
    }
}
