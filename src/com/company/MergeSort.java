package com.company;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-10-06.
 */
public class MergeSort {


    public static void solve (){

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        Integer[] inputs = new Integer[size];
        for (int i = 0; i < size; i++) {
            inputs[i] = in.nextInt();
        }
        mergeSort(inputs,0,size);

    }

    public static void merge (Integer[] array, int lo, int mid, int hi ){
        int n1 = mid-lo;
        int n2 = hi-mid;

        int[] halfList1 = new int[n1+1];
        int[] halfList2 = new int[n2+1];

        for (int i = 0 ; i < n1; i++) {
            halfList1[i] = array[lo+i];
        }

        for (int j = 0 ; j < n2;j++) {
            halfList2[j] = array[mid+j];
        }

        halfList1[n1] = Integer.MAX_VALUE;
        halfList2[n2] = Integer.MAX_VALUE;
        int i = 0, j=0;
        for (int k =lo; k < hi ; k++) {
            if (halfList1[i] <= halfList2[j]) {
                array[k] = halfList1[i];
                i++;
            } else {
                array[k] = halfList2[j];
                j++;
            }
        }

        printArray(array,lo,hi);

    }

    public static void mergeSort (Integer[] A, int lo, int hi) {
        if (hi - lo >1) {
            int mid = (lo+hi)/2;
            mergeSort(A,lo,mid);
            mergeSort(A, mid, hi);
            merge(A,lo,mid,hi);
            printArray(A,lo,hi);
        }

    }

    private static void printArray(Integer[] A, int lo, int hi){
        for (int i =lo; i < hi ; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}

