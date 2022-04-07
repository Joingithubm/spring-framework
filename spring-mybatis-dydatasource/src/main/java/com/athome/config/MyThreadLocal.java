package com.athome.config;

/**
 * @Description:
 * @Author: fanchao@dtstack.com
 * @Date: 2022-01-11 3:29 下午
 */
public class MyThreadLocal {
    private static ThreadLocal<String> local = new ThreadLocal<>();

    /**
     * 指定当前线程使用的是哪个数据
     */
    public static void addDataSource(String dataSourceName){
        local.set(dataSourceName);
    }

    /**
     *  获取当前线程的数据源
     * @return
     */
    public static String getDataSource(){
        return local.get();
    }

    /**
     *  重置当前数据源
     */
    public static void removeDataSource(){
        local.remove();
    }

}
