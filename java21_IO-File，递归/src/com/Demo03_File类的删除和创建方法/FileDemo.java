package com.Demo03_File类的删除和创建方法;

import java.io.File;
import java.io.IOException;

/*
*   File对象的删除和创建方法：
*
*   1，创建方法：
*       创建文件：
*           public boolean createNewFile();//创建一个 新的文件（只能是文件，不能是文件夹）
*       创建文件夹：
*           public boolean mkdir();//创建一个新的文件夹，返回是否成功
*
*   2，判断方法，
*         判断文件或者文件是否存在：
*               public boolean exists()  ;//返回时候文件或者文件夹是否存在
*         判断是否是文件：
*               public boolean isFile(); //返回时候是文件
*         判断是否是文件夹：
*               public boolean isDirectory();//返回是否是文件夹
*         判断文件或者文件是否存在：
*               public boolean exists(0  ;//返回时候文件或者文件夹是否存在
*   3,删除方法：
*           public boolean delete(); //删除文件或者文件夹
*               可以删除的是单个文件，或者是空文件夹
* */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        demo01();
    }
    //删除文件或者文件夹
    public static void demo03() throws IOException {
        File f1=new File("C:\\Users\\admin\\Desktop\\java基础\\1.txt");
        boolean b=f1.delete();

        System.out.println(b);
    }

    //创建文件或文件夹
    public static  void demo01() throws IOException {
                //1,创建一个File对象（这个File对象必须代表一个文件）
        File f1=new File("C:\\Users\\admin\\Desktop\\java基础\\1.txt");

        //调用方法创建文件
//        boolean b1= f1.createNewFile();
//        if (b1) {
//            System.out.println("创建成功");
//        } else {
//            System.out.println("创建失败");
//
//        }
        //2，创建一个File对象（这个FIle对象必须代表一个文件夹）
        File f2=new File("C:\\Users\\admin\\Desktop\\java基础\\文件夹1");
        boolean b2=f2.mkdir();
        if (b2){
            System.out.println("创建成功");
        }else {
            System.out.println("创建失败");
        }
    }

    //判断是否是文件或文件夹
    public static void demo02(){
        //3 public boolean isFile(); //返回时候是文件
        File f3=new File("C:\\Users\\admin\\Desktop\\java基础\\1.txt");
        boolean b=f3.exists();
        if (b) {
            boolean b1 = f3.isFile();
            boolean b2 = f3.isDirectory();
            if (b1) {
                System.out.println("是文件");
            } else if (b2) {
                System.out.println("是文件夹");
            }
        }else {
            System.out.println("文件不存在");
        }
    }
}
