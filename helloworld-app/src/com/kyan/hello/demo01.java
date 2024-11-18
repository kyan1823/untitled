package com.kyan.hello;

public class demo01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println(i);
        }
        System.out.println("----");
        System.out.println(sum);

        System.out.println("------------");

        int i = 1;
        int sum2 = 0;
        while (i <= 100) {
            sum2 += i;
            i++;
        }
        System.out.println(sum2);

        System.out.println("------------");

        double p = 0.1;
        int count = 0;
        double sum3 = 0;
        while (sum3 <= 8848680) {
            sum3 += p;
            p *= 2;
            count++;
        }
        System.out.println(count);
        System.out.println(sum3);

        System.out.println("------------");

        do {
            System.out.println("helloworld");
        }while (false);//do...while循环至少执行一次
    }
}
