package com.athome.mapper;

import com.athome.entity.CourseEntity;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: fanchao@dtstack.com
 * @Date: 2022-01-11 10:41 上午
 */
public interface CourseMapper {

    int insert(CourseEntity entity);
    List<Map> selectAll();
}
