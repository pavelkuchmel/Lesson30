package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface sort{
    int compare(String[] o1, String[] o2);
}

public class Main {

    public static void main(String[] args) {
        String[] arrayOne = {"Мама мыла раму", "Долго мыла мама раму", "Папа маме не помогал", "У папы футбол"};
        String[] arrayTwo = {"Мама психанула", "Ударила папу", "Папа обиделся и забухал"};
        String[] arrayThree = {"Папа пошел к соседу", "Мама пошла спать", "Конец"};

        List<String[]> list = new ArrayList<>();
        list.add(arrayOne);
        list.add(arrayTwo);
        list.add(arrayThree);

        Comparator<String[]> sortLength = new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1.length - o2.length;
            }
        };

        Comparator<String[]> sortWordsLength = new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int array1 = 0;
                for (String str : o1){
                    array1 += str.length();
                }
                int array2 = 0;
                for (String str : o2){
                    array2 += str.length();
                }
                return array1 - array2;
            }
        };

        list.sort(sortLength);
        System.out.println(Arrays.deepToString(list.toArray()));

        list.sort((String[] o1, String[] o2) -> {return o1.length - o2.length;});
        System.out.println(Arrays.deepToString(list.toArray()));


    }
}
