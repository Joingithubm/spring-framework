package com.athome.entity;

import lombok.Data;

/**
 * @Description:
 * @Author: fanchao@dtstack.com
 * @Date: 2022-01-11 10:36 上午
 */
@Data
public class CourseEntity {

    private int cid;
    private String cname;
    private String cstatus;
    private Integer cuserId;
    private Boolean status;
    private Student student;
}
