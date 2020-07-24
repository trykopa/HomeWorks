package com.google.ssadm.homework.w21_40.w27;

// Реализуйте метод параметрами которого являются -
// целое число, вещественное число и строка.
// Возвращает он конкатенацию строки с суммой вещественного и целого числа.

public class Main {
    public static void main(String[] args) {

        int i = 27;
        double a = .1d;
        String myString = "Integer i + double a = ";

        System.out.println(concatIntDoubleString(i, a, myString));
    }

    private static String concatIntDoubleString(
            int i, double a, String myString
    ) {
        return myString + (i + a);
    }
}
