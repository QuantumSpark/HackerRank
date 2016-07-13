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
        int min = -1;
        int p;
        boolean f = true ;
        for (int i =0 ; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (A[i] == A[j]) {

                    int d = Math.abs(j-i);

                    if (f)  {
                        f = false;
                        min = d;
                    }
                    p = d;
                    if (d < min){
                        min = p;
                    }
                }
            }


        }
        System.out.print(min);

    }
}
