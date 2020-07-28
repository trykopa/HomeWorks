package com.google.ssadm.homework.w21_40.w33;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;

public class JohnsonAndTrotterAlgo{
    // Start array
    final static int[] array = {1,2,3,4,5};

    private final static boolean LEFT_TO_RIGHT = true;
    private final static boolean RIGHT_TO_LEFT = false;

    public static void main(String[] argc) {
        printPermutation(array);
    }

    // This function mainly calls printOnePerm()
    // one by one to print all permutations.
    public static void printPermutation(int[] array) {
        // To store current directions
        boolean[] dir = new boolean[array.length];

        IntStream.range(0, array.length).forEach(i -> System.out.print(array[i]));
        System.out.print("  - start array\n");

        // initially all directions are set to RIGHT TO LEFT i.e. 0.
        IntStream.range(0, array.length).forEach(i -> dir[i] = RIGHT_TO_LEFT);

        // for generating permutations in the order.
        IntStream.range(1, factor(array.length)).forEach(i -> printOnePerm(array, dir, array.length));
    }

    // Prints a single permutation
    public static void printOnePerm(int[] a, boolean[] dir, int n) {
        int mobile = getMobile(a, dir, n);
        int pos = searchArr(a, n, mobile);

        // swapping the elements according to the direction i.e. dir[].
        if (dir[a[pos - 1] - 1] == RIGHT_TO_LEFT) {
            int temp = a[pos - 1];
            a[pos - 1] = a[pos - 2];
            a[pos - 2] = temp;
        } else if (dir[a[pos - 1] - 1] == LEFT_TO_RIGHT) {
            int temp = a[pos];
            a[pos] = a[pos - 1];
            a[pos - 1] = temp;
        }

        // changing the directions for elements greater than largest mobile integer.
        IntStream.range(0, n).filter(i -> a[i] > mobile).forEach(i -> {
            if (dir[a[i] - 1] == LEFT_TO_RIGHT)
                dir[a[i] - 1] = RIGHT_TO_LEFT;

            else if (dir[a[i] - 1] == RIGHT_TO_LEFT)
                dir[a[i] - 1] = LEFT_TO_RIGHT;
        });

        Arrays.stream(a, 0, n).forEach(System.out::print);
        System.out.print(" ");
    }

    // To carry out step 1 of the algorithm i.e. to find the largest mobile integer.

    public static int getMobile(int[] a, boolean[] dir, int n) {
        int mobile_prev = 0, mobile = 0;

        for (int i = 0; i < n; i++) {
            // direction 0 represents RIGHT TO LEFT.
            if (dir[a[i] - 1] == RIGHT_TO_LEFT && i != 0) {
                if (a[i] > a[i - 1] && a[i] > mobile_prev) {
                    mobile = a[i];
                    mobile_prev = mobile;
                }
            }

            // direction 1 represents LEFT TO RIGHT.
            if (dir[a[i] - 1] == LEFT_TO_RIGHT && i != n - 1) {
                if (a[i] > a[i + 1] && a[i] > mobile_prev) {
                    mobile = a[i];
                    mobile_prev = mobile;
                }
            }
        }
        return mobile;
    }

    // To end the algorithm for efficiency it ends
    // at the factorial of n because number of
    // permutations possible is just n!.
    @SuppressWarnings("OptionalGetWithoutIsPresent")
    public static int factor(int n){
        return IntStream
                .rangeClosed(2, n) // stream of int from 2 to i
                .mapToObj(BigInteger::valueOf) // stream of BigInteger objects
                .reduce(BigInteger::multiply) // multiply all BigInteger
                .get()
                .intValue();
    }

    // Utility functions for finding the position
    // of largest mobile integer in a[].
    public static int searchArr(int[] a, int n, int mobile) {
        for (int i = 0; i < n; i++) {
            if (a[i] == mobile) {
                return i + 1;
            }
        }
        return 0;
    }

}
