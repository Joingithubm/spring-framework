package com.athome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Description:
 * @Author: fanchao@dtstack.com
 * @Date: 2022-01-11 7:31 下午
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class,args);
    }
}
