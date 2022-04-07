package com.athome.main;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.athome.config.MyThreadLocal;
import com.athome.entity.CourseEntity;
import com.athome.mapper.CourseMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: fanchao@dtstack.com
 * @Date: 2022-01-11 3:00 下午
 */
public class DruidMain {

    public static void main(String[] args) throws SQLException {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        CourseMapper courseMapper = (CourseMapper) context.getBean("CourseMapper");
        MyThreadLocal.addDataSource("3307");
        List<Map> courseEntities = courseMapper.selectAll();
        System.out.println(courseEntities);

    }
}
