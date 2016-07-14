package com.company;
import java.io.*;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-07-12.
 */
public class FunnyString {

    public static void solve () {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for (int i =0; i < t; i++) {
            String s = in.nextLine();
            funny(s);
        }
    }


    private static void funny (String s){
        StringBuilder sb = new StringBuilder(s);
        String r = sb.reverse().toString();

        for (int i = 1 ; i < s.length() ; i++) {
            int a = s.charAt(i);
            int b = s.charAt(i-1);
            int c = r.charAt(i);
            int d = r.charAt(i-1);
            if (Math.abs(a-b) != Math.abs(c-d)) {
                System.out.println("Not Funny");
                return;
            }
        }
        System.out.println("Funny");

    }
}
