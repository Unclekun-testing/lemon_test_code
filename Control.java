package com.lemon.day03;

/**
 * @Project: test
 * @Site: 2679824572
 * @Forum: Monster
 * @Copyright: ©bode
 * @Author: 达达
 * @Create: 2021-03-26 20:19
 * @Desc：
 **/

public class Control {
    public static void main(String[] args){
        //打印直角三角形
//        for(int i=0;i<5;i++) {
//            for(int j=0;j<=i;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //打印等边三角形
//        for(int i=1;i<=5;i++){
//            //控制空格
//            for(int j=1; j<=5-i; j++){
//                System.out.print(" ");
//            }
//            //控制星星的数量
//            for(int k=1;k<=i;k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }




        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }




        //求出0至100之间所有偶数以及奇数的和
//        int oddSum = 0;
//        int evenSum = 0;
//
//        for (int i = 0; i <= 100; i++) {
//            if (i%2==0) { // 偶数
//                evenSum = evenSum+i;
//            }else { // 奇数
//                oddSum = oddSum+i;
//            }
//        }
//        System.out.println("奇数和："+oddSum);
//        System.out.println("偶数和："+evenSum);
    }
}
