package com.Demo08_文件过滤器;

import java.io.File;
import java.io.FileFilter;

/*
*   文件过滤器：
*          FileFilter
*    在list和listFIle方法中使用
* */
public class FilefilterDemo {
    public static void main(String[] args) {
        File fileDry=new File("C:\\Users\\admin\\Desktop\\java基础");

        //定义一个类
        MyFileFillter ff=new MyFileFillter();

        // 或使用虚拟内部类
//        FileFilter ff=new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                if (pathname.getName().endsWith(".PNG")){
//                return true ;
//            }else return false;
//            }
//        };

        File[] files=fileDry.listFiles(ff);
        for (File file: files) {
            System.out.println(file);
        }
    }
}
