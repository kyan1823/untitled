package com.kyan.hello;

import java.util.Random;

public class demo06 {
    public static void main(String[] args) {
        System.out.println(captcha(8));
    }

    public static String captcha() {
        return captcha(6);
    }

    public static String captcha(int len) {
        if(len < 0){
            return null;
        }
        Random rand = new Random();
        int n = 0;
        char[] arr = new char[len];
        for (int i = 0; i < len; i++) {
            int type = rand.nextInt(3);
            switch (type) {
                case 0:
                //number 数字
                    n = rand.nextInt(10) + 48;
                    break;
                case 1:
                //capital_char 大写字母
                    n = rand.nextInt(26) + 65;
                    break;
                case 2:
                //char 小写字母
                    n = rand.nextInt(26) + 97;
                    break;
            }
            arr[i] = (char)n;
        }
        return String.valueOf(arr);
    }
}
