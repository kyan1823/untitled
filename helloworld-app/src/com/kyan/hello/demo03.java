package com.kyan.hello;

import java.util.Random;
import java.util.Scanner;

public class demo03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int i =0;
        do {
            System.out.println("Please enter a number between 0 and 99");
            int number1 = sc.nextInt();
            i++;
            if (number > number1) {
                System.out.println("The number you typed is less than the number");
            }else if (number < number1) {
                System.out.println("The number you typed is greater than the number");
            }
            else {
                System.out.println("The number you typed is equals to the number");
                break;
            }
            }while (true);
        System.out.println("You tried " + i + " times");
        }
    }

