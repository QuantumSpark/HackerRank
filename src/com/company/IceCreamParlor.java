package com.company;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-07-31.
 */
public class IceCreamParlor {

    public static void solve () {


        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i< t; i++) {
            int m = in.nextInt();
            int n = in.nextInt();
            Integer[] ar = new Integer[n];
            for (int j = 0; j< n ; j++) {
                ar[j] = in.nextInt();
            }
            doThis(ar,m);
        }
    }

    private static void doThis (Integer[] ar, int m){



        for (int i = 0; i<  ar.length;i++) {
           for (int j = i+1; j < ar.length; j++ ) {
               if (ar[i] + ar[j] == m) {
                   System.out.println((i+1) + " " + (j+1));

               }
           }
        }
    }
}
