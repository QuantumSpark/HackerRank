package com.company;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-07-26.
 */
public class CountingValley {

    public static void solve () {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        dothis(s,n);

    }

    private static void dothis (String s, int n){
        StringBuilder sb = new StringBuilder(s);
        int[] a = new int[n+1];
        int count = 0;
        for (int i = 1; i < n ; i++) {
            char c = sb.charAt(i - 1);
            if (c == 'D') {
                a[i] = a[i - 1] - 1;
            } else {
                a[i] = a[i - 1] + 1;
            }
        }
        if (sb.charAt(n-1) == 'D'){
            a[n] = a[n - 1] -1;
        } else {
            a[n] = a[n - 1] + 1;
        }
        int i = 0 ;
        while (i < n) {
            if (a[i] == 0 && a[i+1] <0) {
                int j = i+1;
                while (j< n && a[j] != 0) {
                    j++;
                }
                if (a[j]==0) {
                    count++;
                }
                if (j!=0) {
                    i = j;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }

        System.out.println(count);
    }

    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
