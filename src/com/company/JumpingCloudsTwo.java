package com.company;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-07-31.
 */
public class JumpingCloudsTwo {

    public static void solve () {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Integer[] ar = new Integer[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }

        doThis(ar, k, n);
    }

    private static void doThis (Integer[] ar, int k, int n ) {
        int E = 100;

        for (int i = 0; i<ar.length; i+=k) {
           if (ar[i] == 1) {
               E-= 3;
           } else {
               E-= 1;
           }
        }
        System.out.println(E);
    }
}
