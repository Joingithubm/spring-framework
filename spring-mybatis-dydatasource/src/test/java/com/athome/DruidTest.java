package com.athome;



import com.athome.config.MyThreadLocal;
import com.athome.entity.CourseEntity;
import com.athome.mapper.CourseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: fanchao@dtstack.com
 * @Date: 2022-01-11 4:15 下午
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ApplicationMain.class})
public class DruidTest {

    @Autowired
    CourseMapper courseMapper;

    @Test
    public void test(){
        MyThreadLocal.addDataSource("3307");
        List<Map> maps = courseMapper.selectAll();
        System.out.println(maps);
        MyThreadLocal.removeDataSource();


    }
}
