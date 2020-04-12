package com.Demo04_File类的list和listFile方法;

import java.io.File;

/*
*   File类的list和listFile方法;
*
*   1,public String[] list();
*   2,public file[] listFiles;
*       注意：只能列出当前文件夹下的一级子文件或子文件夹
*
*   扩展：
*       public boolean delete();//删除文件，或者空的文件夹
* */
public class FileDemo {
    public static void main(String[] args) {
        //删除文件夹2，文件夹2 不是空文件夹
        File f2=new File("C:\\Users\\admin\\Desktop\\java基础\\文件夹2");
        File[] paths=f2.listFiles();
        for (File file:paths) {
            file.delete();
        }
        //表示文件夹为空，可以直接删除
        f2.delete();

    }
    //File类的list和listFile方法;
    public static void demo01(){
        File f1=new File("C:\\Users\\admin\\Desktop\\java基础\\文件夹1");
        //1,public String[] list();
//        String[] array=f1.list();
//        for (String s:array) {
//            System.out.println(s);
//        }

        //2,public file[] listFiles;
        File[] flarray=f1.listFiles();
        for (File f:flarray
        ) {
            // System.out.println(f);
            System.out.println(f.getName());
        }
    }
}
