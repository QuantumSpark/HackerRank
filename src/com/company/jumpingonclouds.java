package com.company;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-07-30.
 */
public class jumpingonclouds {

    public static void solve () {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Integer[] ar = new Integer[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }

        doThis(ar);
    }

    private static void doThis(Integer[] ar) {

        int i = 0;
        int count = 0;
        while (i < ar.length - 1) {

            if (i+2 < ar.length && ar[i + 2] == 1) {
                if (ar[i + 1] != 1) {
                    count++;
                    i++;
                }
            } else if (ar[i + 1] == 1 || ar[i + 1] == 0 || (i+2 < ar.length && ar[i + 2] == 0)) {
                if ( i+2 < ar.length && ar[i + 2] != 1) {
                    count++;
                    i += 2;
                } else if (ar [i+1] != 1) {
                    count++;
                    i++;
                }
            }
        }

        System.out.println(count);
    }
}
