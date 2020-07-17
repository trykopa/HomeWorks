package com.google.ssadm.homework.w30;

// Напишите метод который вернет количество слов в строке текста.

public class Main {
    public static void main(String[] args) {
        String myString = "Напишите метод который вернет количество слов в строке текста.";
        System.out.println("В строке " + "\n" + myString + "\n" + countWordsInString(myString) + " слов");
    }

    private static int countWordsInString(String myString) {
        return myString.split("\\s*(\\s|,|!|\\.)\\s*").length;
    }
}
