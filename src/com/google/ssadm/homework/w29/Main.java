package com.google.ssadm.homework.w29;

// Напишите метод который реализует линейный поиск элемента
// в массиве целых чисел. Если такой элемент в массиве есть
// то верните его индекс, если нет то метод должен возвращать
// число - «-1»

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[10];
        int elem = 0;

        Arrays.setAll(array, i -> ThreadLocalRandom.current().nextInt(0, 10 + 1));
        System.out.println("We have the following array: " + Arrays.toString(array));

        System.out.println("Searching for " + elem);
        int index = findFirstElement(array, elem);
        System.out.println((index >= 0) ? ("Element found by index - " + index) : "Element not found");

        ArrayList<Integer> myList = findAllElements(array, elem);
        if(myList.toArray().length>1){
            System.out.println("Element found more than one time on indexes: " + Arrays.toString(myList.toArray()));
        }
    }

    private static int findFirstElement(int[] array, int elem) {
        int index = -1;
        for(int i = 0; i < array.length - 1; i++){
            if(array[i]==elem){
                return i;
            }
        }
        return index;
    }

    private static ArrayList<Integer> findAllElements(int[] array, int elem) {
        ArrayList<Integer> myList = new ArrayList<>();
        for(int i = 0; i < array.length - 1; i++){
            if(array[i]==elem){
                myList.add(i);
            }
        }
        return myList;
    }
}
