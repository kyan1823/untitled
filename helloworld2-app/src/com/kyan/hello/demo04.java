package com.kyan.hello;

public class demo04 {
    public static void main(String[] args) {
        int[] arr1 = {12,22,32,26};
        int[] arr2 = {12,22,32,26};
        System.out.println(compare(arr1, arr2));
        int[] arr3 = {32,45,14,53,98};
        int[] arr4 = {452,643,683,232,725};
        System.out.println(compare(arr3,arr4));
    }
    public static boolean compare(int[] a, int[] b) {
//判断两个数组是否完全相等
        if (a == null && b == null) {
            return true;
        }else if (a == null || b == null) {
            return false;
        }else if (a.length != b.length) {
            return false;
        }else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
