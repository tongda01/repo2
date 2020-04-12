package com.Demo05_递归的介绍;
/*
*   递归：是一个通用技术，所有的编程语言，只要有方法概念的编程语言，都具有递归
*
*   什么叫递归：
*       在一个方法的内部，再调用方法本身
*
*   无限递归本身是错误的：因为方法运行需要进栈，而栈空间不是无限大的
*
*   使用递归的前提：
*           1，必须有一个可以是递归结束的出口
*           2，递归的次数不能太多（具体的次数不确定）
*
*   建议在开发中能不用递归就不用递归
*           急剧消耗内存（最常见是杀毒软件 扫描硬盘）
*
*   递归的其他分类：
*           直接递归：
*               在A方法的内部，直接调用A方法
*           间接递归：
*               在A方法的内部调用的方法，在B方法的内部调用C方法，在C方法的内部嗲用A方法
* */
public class DiGuiDemo {
    public static void main(String[] args) {
        demo(20000);
    }
    public static void demo(int num){
        if (num<=0){
            return;
        }
        System.out.println(num);
        num--;
        demo(num);
    }
}
