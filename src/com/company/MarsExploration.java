package com.company;

import java.util.*;
import java.io.*;
/**
 * Created by QuantumSpark on 2016-07-23.
 */
public class MarsExploration {

    public static void solve () {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        findReplacement(s);
    }

    private static void findReplacement (String s) {

        String ref = "SOS";
        int count = 0 ;
        for (int i =0, j =0; i< s.length(); i++) {
            if (s.charAt(i) != ref.charAt(j)) {
                count++;
            }
            j++;
            if (j>2) {
                j=0;
            }
        }

        System.out.println(count);
    }
}
