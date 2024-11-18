package com.kyan.hello;

import java.util.Random;

public class demo02 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int n = r.nextInt(10);//范围从0开始，取10个，即0-9
            System.out.println(n);
        }
        System.out.println("------------");
        int m = r.nextInt(45) - 3;
        System.out.println(m);//m的取值范围是-3 ~ 41的整数。
    }
}
