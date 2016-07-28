package com.company;
import java.util.*;
import java.io.*;
/**
 * Created by QuantumSpark on 2016-07-26.
 */
public class BirthdayCake {

    public static void solve () {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        Integer[] ar = new Integer[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        dothis(ar);
    }

    private static void dothis(Integer[] array) {
        List<Integer> l = Arrays.asList(array);
        int max = Collections.max(l);
        int o = Collections.frequency(l, max);
        System.out.println(o);
    }

}
