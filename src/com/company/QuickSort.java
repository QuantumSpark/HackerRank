package com.company;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-10-01.
 */
public class QuickSort {


    public static void solve () {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        Integer[] inputs = new Integer[size];
        for (int i = 0; i < size; i++) {
            inputs[i] = in.nextInt();
        }

        quicksort(inputs, 0, size);

    }

    public static int paritionIt (Integer[] nums, int lo, int hi) {
        int p = nums[lo];
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = lo + 1; i < hi ; i++) {
            if (nums[i] < p) {
                left.add(nums[i]);
            } else if (nums[i] > p) {
                right.add(nums[i]);
            }
        }
        int pos = lo ;
        for (Integer num : left) {
            nums[pos] = num;
            pos++;
        }

        nums[pos++] = p;

        for (Integer num : right) {
            nums[pos] = num;
            pos++;
        }


        return left.size() + lo;
    }

    public static int paritionInplace (Integer[] A, int lo, int hi) {
        int p = A[hi-1];
        int i = lo;
        for (int j = lo; j < hi-1; j++) {
            if (A[j] <= p) {
                int tmp = A[j];
                A[j] = A[i];
                A[i] = tmp;
               i++;
            }
        }
        int tmp =  A[i];
        A[i] = A[hi-1];
        A[hi-1] = tmp;
        printArray(A,lo,hi);
        return i;
    }

    public static int paritionOutPlace (Integer[] A, int lo, int hi) {
        int p = A[lo];
        int i = hi-1;
        for (int j = hi-1; j>=0 ; j--) {
            if (j >= 0 && A[j] > p) {
                int tmp = A[j];
                A[j] = A[i];
                A[i] = tmp;
                i--;
            }
        }
        int tmp =  A[i];
        A[i] = A[lo];
        A[lo] = tmp;
        return i;
    }



    public  static void quicksort(Integer[] A, int lo, int hi) {
        if (hi - lo  > 1) {
            int p = paritionIt(A, lo, hi);
            quicksort(A,lo,p);
            quicksort(A,p+1,hi);
            printArray(A, lo, hi);
        }

    }




    private static void printArray(Integer[] A, int lo, int hi){
        for (int i =lo; i < hi ; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

}
