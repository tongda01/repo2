package com.Demo06_递归的练习;
/*
*   使用递归求：
*       1+2+3+4+....+n
*       =(1+2+..+n-1)+n\
*
*   使用递归注意两点:
*       1,明确你定义的方法的作用
*       2，找规律
*           1+2+3+...+10=(1+2+3+...+9)+10
*               getSum(10)=getSum(9)+10
*
*   间接递归：
*       1+（1+2）+（1+2+3）+（1+2+3+4）+...+(1+2+3+...+n)
*
* */
public class DiguiDemo {
    public static void main(String[] args) {
        int sum=getSum(10);
        System.out.println(sum);
        Long Ji=getJi(10l);
        System.out.println(Ji);

    }
    //定义方法，求1-n的和
    public static int   getSum(int num){
        if (num==1){
            return 1;
        } else
          return getSum(num-1)+num;
        //另一种方式getSum(n)=getSum(n+1)-n-1
//        if (num==100){
//            return 5050;
//        } else
//            return getSum(num+1)-num-1;
    }

    //定义方法，求1*2*3*...*n
    public static Long getJi(Long n){
        if (n==1){
            return 1l;
        }
        return getJi(n-1)*n;
    }

}
