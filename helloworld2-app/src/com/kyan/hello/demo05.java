package com.kyan.hello;

import java.util.Random;

public class demo05 {
    public static void main(String[] args) {
        System.out.println(captcha());
    }

    public static String captcha() {
        char[] arr2 = captcha(6);
        return String.valueOf(arr2);
    }

    public static char[] captcha(int a) {
        Random rand = new Random();
        char[] arr2 = new char[a];
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4' ,'5', '6', '7', '8', '9'};
        for (int i = 0; i < arr2.length; i++) {
            int r = rand.nextInt(62);
            arr2[i] = arr[r];
        }
        return arr2;
    }
}
