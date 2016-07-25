package com.company;
import java.util.*;
import java.io.*;
/**
 * Created by QuantumSpark on 2016-07-24.
 */
public class BiggerIsGreater {

    public static void solve () {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for (;t>0; t--) {
            String s = in.nextLine();
            setUp(s);
        }

    }

    private static void setUp (String s) {
        char[] array = s.toCharArray();
        nextPermutation(array);
    }
    // Time complexity O(n)
    // https://www.nayuki.io/page/next-lexicographical-permutation-algorithm
    private static void nextPermutation(char[] array) {
        // Find longest non-increasing suffix
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i]) {
            i--;
        }
        // Now i is the head index of the suffix

        // If it fails to the find largest non-increasing suffix, then the current permutation,
        // is the last permutation
        if (i <= 0) {
            System.out.println("no answer");
            return;
        }

        // Let array[i - 1] be the pivot
        // Find rightmost element that exceeds the pivot
        int j = array.length - 1;
        while (array[j] <= array[i - 1]) {
            j--;
        }

        // Now the value array[j] will become the new pivot
        // Assertion: j >= i

        // Swap the pivot with array[j]
        char tmp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = tmp;

        // Reverse the suffix
        //
        j = array.length - 1;
        while (i < j) {
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            i++;
            j--;
        }
        System.out.println(String.valueOf(array));
    }
}
