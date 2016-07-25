package com.company;

import java.io.*;
import java.util.*;
import java.util.stream.*;

/**
 * Created by QuantumSpark on 2016-07-24.
 */
public class cutTheSticks {

    public static void solve () {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        dothis(ar);
    }

    private static void dothis (int [] ar) {
       int ref = ar.length;
        while(ref != 0) {
           List<Integer> l = IntStream.of(ar).boxed().collect(Collectors.toList());
           System.out.println(l.size());
           int m = Collections.min(l);
           l.removeAll(Collections.singleton(m));
           ar = l.stream().mapToInt(i -> i).toArray();
           for (int i = 0; i < ar.length; i++) {
               ar[i] -= m;
           }
           ref = l.size();
       }
    }




    private static void printArray(int [] l) {
        for(Integer n: l){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
