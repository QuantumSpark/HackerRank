package com.company;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-07-18.
 */
public class InsertionSortI {
    private static void insertIntoSorted(int[] ar) {
        int tmp = ar[ar.length-1];
        int j=ar.length-2;

        while (j< ar.length && ar[j]>tmp) {
            ar[j+1] = ar[j];
            printArray(ar);

            j--;
        }
        ar[j+1] = tmp;
        printArray(ar);
    }


    /* Tail starts here */
    public static void solve() {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
