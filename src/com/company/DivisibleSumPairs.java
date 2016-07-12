package com.company;
import sun.awt.image.ImageWatched;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * Created by QuantumSpark on 2016-07-12.
 */
public class DivisibleSumPairs {

    public static void solve () {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();

        }
        findPairs(a,k);
    }

    private static void findPairs(int[] a, int k) {
        int count = 0;
        int check = 1;


     for (int j = 0; j<a.length; j++) {
         for (int i = check; i < a.length; i++) {
             if ((a[j] + a[i]) % k == 0) {
                 count++;
             }

         }
         check++;
     }
        System.out.println(count);

    }

}
