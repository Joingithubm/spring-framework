package com.athome.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: fanchao@dtstack.com
 * @Date: 2022-01-11 7:15 下午
 */
@Configuration
public class DataSourceConfig {

    @Bean(value = "master3306")
    public DruidDataSource masterDataSource3306() throws SQLException {
        DruidDataSource druidDataSource=new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://1.117.48.220:3306/course_db");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("M4KpoCiX7XL9fnfm7UZWIasaESVuhfkyUywalpbjYlNQ38D7dQURKmtykJlVKRSVvzODgdNNBJaPTAEISe3tgw==");
        druidDataSource.setConnectionProperties("config.decrypt=true;config.decrypt.key=MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAI15NuYlet+LcyUlKXgQysixj/C+woXETaRWKXa4eN43adQ67j1wBG6IaBzczqKiV5PLsN9ZwdGWTFOtP2M7bjMCAwEAAQ==");
        druidDataSource.setFilters("config");
        return druidDataSource;
    }

    @Bean(value = "slave3307")
    public DruidDataSource slaveDataSource3307() throws SQLException {
        DruidDataSource druidDataSource=new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://1.117.48.220:3307/course_db");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("M4KpoCiX7XL9fnfm7UZWIasaESVuhfkyUywalpbjYlNQ38D7dQURKmtykJlVKRSVvzODgdNNBJaPTAEISe3tgw==");
        druidDataSource.setConnectionProperties("config.decrypt=true;config.decrypt.key=MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAI15NuYlet+LcyUlKXgQysixj/C+woXETaRWKXa4eN43adQ67j1wBG6IaBzczqKiV5PLsN9ZwdGWTFOtP2M7bjMCAwEAAQ==");
        druidDataSource.setFilters("config");
        return druidDataSource;
    }

    @Bean
    public DynamicDataSource dynamicDataSource(DataSource master3306) throws SQLException {
        DynamicDataSource dataSource = new DynamicDataSource();
        dataSource.setDefaultTargetDataSource(master3306);

        Map map=new HashMap();
        map.put("3306",masterDataSource3306());
        map.put("3307",slaveDataSource3307());
        dataSource.setTargetDataSources(map);
        return dataSource;
    }

    @Bean
    public SqlSessionFactoryBean sessionFactory(DataSource dynamicDataSource) throws IOException {
        SqlSessionFactoryBean factoryBean=new SqlSessionFactoryBean();
        factoryBean.setDataSource(dynamicDataSource);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resolver.getResources("classpath:/mapper/*.xml");
        factoryBean.setMapperLocations(resources);
        return factoryBean;
    }
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer=new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sessionFactory");
        mapperScannerConfigurer.setBasePackage("com.athome.mapper");
        return mapperScannerConfigurer;
    }


}
