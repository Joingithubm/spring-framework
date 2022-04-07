package com.athome.main.nio;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

/**
 * @author: fanchao
 * @date: 2022/02/25 15:27
 * @description：读取文件
 */
public class InputFileMain {

    public static void main(String[] args) throws IOException {

        StringBuilder builder = new StringBuilder();

        FileInputStream fileInputStream = new FileInputStream("/Users/edy/IdeaProjects/spring-framework/spring-mybatis-dydatasource/file/1.txt");
        ByteBuffer buffer = ByteBuffer.allocate(16);
        FileChannel inputStreamChannel = fileInputStream.getChannel();

        FileOutputStream fileOutputStream = new FileOutputStream("/Users/edy/IdeaProjects/spring-framework/spring-mybatis-dydatasource/file/2.txt");

        FileChannel channel = fileOutputStream.getChannel();

        String str = "xxx1x1x1x1xfsfsihjfoafjaoifjaojfoajfiojfslkfoasjfslkfdjaojfansdfnaoisjfosamlfasjfioajfoafiosjofjaofafjoijfaosdflajfoiasjfafasjofasjcvlxmkjvoisajfoa";


        while (inputStreamChannel.read(buffer) != 1){
            buffer.flip();
//            while (buffer.hasRemaining()){
//                builder.append((char) buffer.get());
//            }
            channel.write(buffer);
            buffer.clear();
        }

        System.out.println(builder.toString());





        //   fileOutputStream.write(builder.toString().getBytes(StandardCharsets.UTF_8));
    }
}
