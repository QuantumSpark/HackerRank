package com.company;
import java.util.*;
import java.io.*;

/**
 * Created by QuantumSpark on 2016-07-24.
 */
public class InsertionSortII {

    private static void insertionSortPart2(int[] ar) {
        int count = 0;
        for (int i = 1; i < ar.length ; i++) {
            int tmp = ar[i];
            int j = i-1;
             while (j >= 0 && ar[j] >tmp ) {
                ar[j+1] =ar[j];
                 j--;
             }
            ar[j+1] = tmp;
             printArray(ar);
        }
    }

    public static void solve() {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionSortPart2(ar);

    }
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

}
