package com.lemon.day03;

/**
 * @Project: test
 * @Site: 2679824572
 * @Forum: Monster
 * @Copyright: ©bode
 * @Author: 达达
 * @Create: 2021-03-29 15:45
 * @Desc：
 **/

public class NestFor {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //遍历二维数组
//        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(arr.length);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+"]");
//            for(int j=0;j<=arr.length-1;j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
        //while循环
//        int i=1;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }
    }
}
