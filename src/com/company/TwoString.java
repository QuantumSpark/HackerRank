package com.company;

import java.io.*;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-07-17.
 */
public class TwoString {

    public static void solve () {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();
        for (int i = 0; i < t; i++) {
            String s1 = in.nextLine();

            String s2 = in.nextLine();

            twoString(s1,s2);
        }
    }

    private static void twoString (String s1, String s2) {
        int [] alpha1 = new int[26];
        int [] alpha2 = new int[26];
        int baseChar = 97;
        for (int i =0; i < s1.length(); i++) {
            if (alpha1[(int) s1.charAt(i) - baseChar]==0) {
                alpha1[(int) s1.charAt(i) - baseChar]++;
            }
        }
        for (int j =0; j < s2.length(); j++) {
            if (alpha2[(int) s2.charAt(j) - baseChar]==0) {
                alpha2[(int) s2.charAt(j) - baseChar]++;
            }
        }

        int max = 0;
        int temp;
        for (int k = 1; k < 26; k++ ) {
            temp = alpha1[k] + alpha2[k];
            if (max < temp) {
                max = temp;
            }
        }

        if (max == 0 || max == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
