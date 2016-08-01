package com.company;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-08-01.
 */
public class maxSubarray {

    public static void solve () {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t;i++) {
            int n = in.nextInt();
            Integer[] ar = new Integer[n];
            for (int j = 0; j < n ; j++) {
                ar[j] = in.nextInt();
            }
            int s = doThis(ar);
            System.out.print(s + " ");
            System.out.print(positiveSum(ar,s));
            System.out.println();
        }
    }

    private static Integer positiveSum(Integer[] ar, int s) {
        int count =0;
        for (Integer a: ar) {
            if ( a >= 0) {
                count += a;
            }
        }
        if (count ==0) {
            return s;
        }
        return count;
    }
    // https://en.wikipedia.org/wiki/Maximum_subarray_problem
    private static Integer doThis(Integer[] ar) {
        int max_ending_here = ar[0];
        int max_so_far = ar[0];
        for (int i =1; i < ar.length; i++) {
            max_ending_here = Math.max(ar[i], max_ending_here + ar[i]);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }

}
