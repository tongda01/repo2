package com.Demo01_File类;

import java.io.File;

/*
*   File类：
*       描述：文件和目录路径名的抽象表示
*   文件：可以直接保存数据
*   目录路径名：文件夹，分类管理文件
*
*   结论：File类可以表示文件，也可以表示文件夹
*
*   构造：
*       public File(String filepath)
*           绝对路径：以盘符开头的路径
*           相对路径：相对于当前项目的根目录
*      public File(String parent,String path)；
*      public File(File parent,String child);
* */
public class FileDemo0 {
    public static void main(String[] args) {
        //1,使用File(String filepath)构造创建File对象
//        File f1=new File("C:\\Users\\admin\\Desktop\\java基础\\数据类型.PNG");
//        System.out.println(f1);
//        //2， 使用public File(String parent,String path)构造创建File对象
//        File f2=new File("C:\\Users\\admin\\Desktop\\java基础","数据类型.PNG");
//        File f3=new File("C:\\Users\\admin","Dsktop\\java基础\\数据类型.PNG");
//        System.out.println(f2);
//        System.out.println(f3);
       //使用public File(File parent,String child)创建Filr对象
        File f4=new File("C:\\Users\\admin\\Desktop\\java基础");
        File f5=new File(f4,"数据类型.PNG");
        System.out.println(f5);
    }
}
