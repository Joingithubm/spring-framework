package com.athome.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Description:
 * @Author: fanchao@dtstack.com
 * @Date: 2022-01-11 3:27 下午
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return MyThreadLocal.getDataSource();
    }
}
