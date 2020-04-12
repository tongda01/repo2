package com.Demo09_介绍工具类;

import java.util.Arrays;
import java.util.List;

/*
*   Collection: 集合工具类
*       public static void shuffle(List list);//打乱集合的顺序
*       public static void sort(List list);// 排序集合
*
*   Arrays:数组工具类
*       public static List asList(数组/可变参数)；//吧一个数组转成List集合
*
*       public static void sort(数组);//数组排序
*
*       public static String toString(数组)；//把数组转成字符串
* */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] nums={45,64,5,64,12,78,654,4};
        //public static List asList(数组/可变参数)；//吧一个数组转成List集合
        //List<Integer> numsList= Arrays.asList(45,64,5,64,12,78,654,4);
        Arrays.sort(nums);

        //把数组转成字符串
        String s=Arrays.toString(nums);
        System.out.println(s);
    }
}
