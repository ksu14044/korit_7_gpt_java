package com.korit.main;

import com.korit.util.ForEachPrinter2;

// 제네릭
public class Main3 {
    public static void main(String[] args) {
        String[] names = new String[]{"a", "b", "c"};
        Integer[] numbers = new Integer[]{1, 2, 3};
        ForEachPrinter2.print(names);
        ForEachPrinter2.print(numbers);
    }
    public static void print(Integer[] nums) {

        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}
