package com.company;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by QuantumSpark on 2016-07-12.
 */
public class MinDistance {

    public static void solve() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        findMinDist(A);
    }
    private static void findMinDist(int[] A) {
        int size = A.length;
        int min = 0;
        for (int i =0 ; i < size; i++) {
            for (int j = 0 ; ) {

            }
            if (A[i] == A[size -i -1]) {
                int j = size -i - 1;
                int d = Math.abs(j-i);
                if (min != 0) {
                    min = Math.min(d,min);
                }else {
                    min =d;
                }
            }
        }
        if (min != 0) {
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}
