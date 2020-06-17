package com.google.ssadm.homework.w14;
// Напечатайте таблицу умножения на 5.
// предпочтительно печатать 1 x 5 = 5, 2 x 5 = 10, а не просто 5, 10 и т. д.

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int num = 5;
        IntStream.range(0, 11).forEach(i -> System.out.printf("%d x %d = %d%n", i, num, i * num));
    }
}
