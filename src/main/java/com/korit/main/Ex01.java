package com.korit.main;

import java.util.*;
class Ex01 {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> array = new ArrayList<>();
        for(int i = 0; i<arr.length ; i++){
            array.add(arr[i]);
        }
        System.out.println(array);
        for(int a : delete_list){
            if(array.contains(a)){
                System.out.println(a);
                array.remove(a);
            }
        }
        int[] answer = new int[array.size()];
        for(int j = 0 ; j<array.size(); j++){
            answer[j] = array.get(j);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};
        Ex01 ex01 = new Ex01();
        int[] result = ex01.solution(arr, delete_list);
        for(int i : result){
            System.out.println(i);
        }
    }
}