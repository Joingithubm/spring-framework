package com.athome.main;

import com.alibaba.druid.util.StringUtils;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description:
 * @Author: fanchao@dtstack.com
 * @Date: 2022-01-18 2:58 下午
 */
public class MatchMain {


    public static void main(String[] args) {

       String oracle = "\"dbo\".\"nanqi_20210906090101\"";
       String sqlserver = "[dbo].[nanqi_20210906090101]";
        System.out.println(transformTablePrefix(sqlserver,"fanchao_"));
        System.out.println(transformTablePrefix(oracle,"fanchao_"));

        System.out.println(transformTableSuffix(sqlserver,"fanchao_"));
        System.out.println(transformTableSuffix(oracle,"fanchao_"));

     //   int indexOf = getIndexOf("[dbo].[nanqi_20210906090101]", "\\[", 1);
      //  System.out.println(indexOf);
    }

    private static String transformTablePrefix(String table, String convertSrc){

        if (table.contains(".")){
            StringBuilder builder = new StringBuilder(table);
            if (table.startsWith("[") && table.endsWith("]")){
                int index = table.lastIndexOf("[");
                builder.insert(index+1, convertSrc);
                return builder.toString();
            }
            if (table.startsWith("\"") && table.endsWith("\"")){
               int index = table.indexOf("\"",table.indexOf("\"",table.indexOf("\"")+1)+1);
                builder.insert(index+1,convertSrc);
                return builder.toString();
            }
        }
        return table;
    }

    private static String transformTableSuffix(String table, String convertSrc){

        if (table.contains(".")){
            StringBuilder builder = new StringBuilder(table);
            if (table.startsWith("[") && table.endsWith("]")){
                int index = table.lastIndexOf("]");
                builder.insert(index, convertSrc);
                return builder.toString();
            }
            if (table.startsWith("\"") && table.endsWith("\"")){
                int index = table.lastIndexOf("\"");
                builder.insert(index,convertSrc);
                return builder.toString();
            }
        }
        return table;
    }
    /**
     * &#64;param data 指定字符串
     * &#64;param str 需要定位的特殊字符或者字符串
     * &#64;param num   第n次出现
     * &#64;return  第n次出现的位置索引
     */
    public static int getIndexOf(String data,String str,int num){
        Pattern pattern  =  Pattern.compile(str);
        Matcher findMatcher  =  pattern.matcher(data);
        //标记遍历字符串的位置
        int indexNum = 0;
        while(findMatcher.find()) {
            indexNum++;
            if (indexNum == num) {
                break;
            }
        }
        return findMatcher.start();
    }
}
