package com.Demo07_使用递归遍历文件夹;

import java.io.File;
import java.util.List;

/*
*   使用递归遍历一个文件夹下的所有文件（包括一级的，也包括n级的文件）
*   1,列出java基础的一级文件
* */
public class DiguiDemo {
    public static void main(String[] args) {
        File javaJichu=new File("C:\\Users\\admin\\Desktop\\java基础");
        showAll(javaJichu);
    }

    //定义一个方法，列出一个文件夹下的所有文件
    public static void showAll(File path){

        File[] files=path.listFiles();
        for (File file:files) {
            if (file.isFile()){
                System.out.println(file);
            }
            else showAll(file);
        }
    }
}
