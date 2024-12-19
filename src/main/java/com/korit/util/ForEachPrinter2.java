package com.korit.util;

public class ForEachPrinter2 {

    public static <T> void print(T[] array) {
        for(T data : array) {
            System.out.println(data);
        }
    }
}
