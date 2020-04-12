package com.Demo10_Map集合的嵌套;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
*   案例：
*       需要定义一个Map集合，保持学生的学号和他对应的名字
*               Map<String,String>
*                javaEE:
*                   heima001 张三
*                   heima003 李四
*                   heima003 王五
*                UI：
*                   heima001 小丽
*                   heima004 小红
*                   heima005 小美
*                PHP：
*                   heima001 小黑
*                   heima002 小白
*                   heima003 小黄
*/
public class MapMapDemp {
    public static void main(String[] args) {
        //1,存储javaEE的Map集合
        Map<String,String> eeMap=new LinkedHashMap<String,String>();
        eeMap.put("heima001","小丽");
        eeMap.put("heima003","小红");
        eeMap.put("heima005","小美");

        //2,存储UI的Map集合
        Map<String,String> uiMap=new LinkedHashMap<String,String>();
        eeMap.put("heima001","张三");
        eeMap.put("heima004","李四");
        eeMap.put("heima005","王五");
        //3,存储PHP的Map集合
        Map<String,String> phpMap=new LinkedHashMap<String,String>();
        eeMap.put("heima001","小黑");
        eeMap.put("heima002","小白");
        eeMap.put("heima003","小黄");
        //4，定义一个Map集合，存储以上三个map集合
        Map<String,Map<String,String>> czMap=new LinkedHashMap<String,Map<String,String>>();
        czMap.put("javaEE学院",eeMap);
        czMap.put("UI学院",uiMap);
        czMap.put("PHP学院",phpMap);
        //遍历czMap
        Set<String> czSet=czMap.keySet();
        Iterator<String> czit=czSet.iterator();
        while (czit.hasNext()){
            String czKey=czit.next();//获取学院的名字
            Map<String,String> czValue=czMap.get(czKey);//获取学院名字对应的集合
            System.out.println(czKey);
            System.out.println(czValue);
        }

  }
}
