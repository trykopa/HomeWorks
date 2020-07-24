package com.google.ssadm.homework.w21_40.w39;

// The Hamming distance between two binary numbers is the number of positions at which the bits differ.
// For example:
// 117 = 0 1 1 1 0 1 0 1
//  17 = 0 0 0 1 0 0 0 1
// -----------------------------------
// H = 0 + 1 + 1 + 0 + 0 + 1 + 0 + 0 = 3 - Hamming distance between (117,17)
// You are given two positive integers (N, M) in decimal form. You
// it is necessary to calculate the Hamming distance between these two
// numbers.

public class HammingDistance {
    final static int n = 117;
    final static int m = 17;
    
    public static void main(String[] args) {
        int ham = hammingDistance(n, m);
        System.out.printf("2) Hamming distance between %d and %d is %d", n, m, ham);
    }

    private static int hammingDistance(int n , int m) {
        int res = n ^ m;

        //old and classic way
        int count = 0;
        for(int i = 0; i < 32; i++){
            if(((res >>> i) & 1) == 1) count++;
        }
        System.out.printf("1) Hamming distance between %d and %d is %d %n", n, m, count);

        //or simple ;)
        return Integer.bitCount(res);
    }
}
