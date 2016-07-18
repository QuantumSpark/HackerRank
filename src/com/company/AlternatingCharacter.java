package com.company;

import java.util.*;
/**
 * Created by QuantumSpark on 2016-07-17.
 */
public class AlternatingCharacter {

    public static void solve () {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();

        for (int i =0; i < t ; i++) {
            String s = in.nextLine();
            isItAnAltneratingCharacter(s);
        }
    }

    private static void isItAnAltneratingCharacter(String s) {

        int n = s.length();
        int count = 0;
        for (int i =1; i < n; i++) {

            if (s.charAt(i-1) == s.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
