package com.Demo02_File类的获取方法;

import java.io.File;

/*
*   File对象的获取方法：
*
*   1,public String getAbsolutePath();//获取绝对路径
*   2,public String getName() //获取当前File对象的名字
*   3,public String getPath()  //获取创建File对象时，传递的路径
*   4,public Long Length(); //获取File对象的占用的字节空间，如果此路径名表示的是目录（文件夹）；则返回值是不确定的
* */
public class FileDemo {
    public static void main(String[] args) {
//        //1，获取绝对路径
//       // File f1=new File("C:\\Users\\admin\\Desktop\\java基础\\数据类型.PNG");
//        File f2=new File("1.txt");
//        String pant=f2.getAbsolutePath();
//        System.out.println(pant);

        //获取当前File对象的名字
//        File f1=new File("C:\\Users\\admin\\Desktop\\java基础\\数据类型.PNG");
//        File f2=new File("C:\\Users\\admin\\Desktop");
//        String name1=f1.getName();
//        String name2=f2.getName();
//        System.out.println(name1);
//        System.out.println(name2);

//        //3，使用getPath()获取路径
//        File f1=new File("C:\\Users\\admin\\Desktop\\java基础\\数据类型.PNG");
//        File f2=new File("1.txt");
//        File f3=new File("D:\\javademo\\java21_IO-File，递归\\1.txt");
//        System.out.println(f1.getPath());
//        System.out.println(f2.getPath());
//        System.out.println(f3.getPath());

        //4,public Long Length(); //获取File对象的占用的字节空间
        File f1=new File("C:\\Users\\admin\\Desktop\\java基础\\数据类型.PNG");
        long ken=f1.length();
        System.out.println(ken);
        //如果此路径名表示的是目录（文件夹）；则返回值是不确定的
        File f2=new File("C:\\Users\\admin\\Desktop\\java基础");
        System.out.println(f2.length());

    }
}
