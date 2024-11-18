package com.kyan.hello;

public class demo04 {
    public static void main(String[] args) {
        int[] arry = {16, 26, 36, 6, 100};
        int sum = 0;
        System.out.println(arry.length);
        System.out.println("------------");

        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
            sum += arry[i];
        }
        System.out.println(sum);
        System.out.println("------------");

        int[] arry2 = new int[4];
        System.out.println(arry2.length);
        arry2[0] = 1;
        arry2[1] = 2;
        arry2[2] = 3;
        arry2[3] = 4;
        for (int i = 0; i < arry2.length; i++) {
            System.out.println(arry2[i]);
        }
        System.out.println("------------");

        boolean[] arry3 = new boolean[4];
        for (int i = 0; i < arry3.length; i++) {
            System.out.println(arry3[i]);
        }
        System.out.println("------------");

        String[] arry4 = new String[4];
        for (int i = 0; i < arry4.length; i++) {
            System.out.println(arry4[i]);
        }
    }
}
