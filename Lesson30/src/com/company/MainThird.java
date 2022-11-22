package com.company;

import java.util.function.Predicate;

public class MainThird {
    public static int arrayProcess(int[] arr, Predicate<Integer> predicate){
        int sum = 0;
        for (Integer elem : arr){
            if (predicate.test(elem)){
                sum +=elem;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,12,31,432,7};

        //сумма четных
        System.out.println(arrayProcess(array, x -> x % 2 == 0));

        //сумма чисел от а до b
        int a = 2;
        int b = 4;
        System.out.println(arrayProcess(array, (x) -> (x >= a && x <= b)));


    }
}
