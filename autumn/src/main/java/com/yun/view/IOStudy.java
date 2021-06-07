package com.yun.view;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Created by yunN on 2021/04/22.
 */
public class IOStudy {

    private static final ThreadLocal threadLocal = new ThreadLocal();

    public static void main(String[] args) throws Exception {

        /*//字节流
        //1.字节输入流
        FileInputStream fis = new FileInputStream("/Users/yunnuan/Desktop/files/fileInputStream.txt");
        byte[] length = new byte[1024];
        int read = fis.read(length);
        System.out.println(new String(length).substring(0,read));
        System.out.println("*********************");

        int count = 0;
        int temp = 0;
        while ((temp = fis.read())!=(-1)){
            length[count++] = (byte) temp;
        }
        fis.close();
        System.out.println(new String(length));

        //2.字节输出流
        FileOutputStream fos
                = new FileOutputStream("/Users/yunnuan/Desktop/files/fileInputStream.txt", true);
        String str = "fileOutputStream.txt";
        byte[] b = str.getBytes();
        for (byte value : b) {
            fos.write(value);
        }
        fos.close();*/

        if (null == threadLocal.get()) {
            System.out.println("null");
            threadLocal.set("vip");
        }
        System.out.println(threadLocal.get());
    }

}
