package com.company;
import java.io.*;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-07-15.
 */
public class LoveLetter {

    public static void solve () {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i<n;i++){
            String s = in.nextLine();
            replacePalindrome(s);
        }
    }

    private static void replacePalindrome (String s) {
        int baseChar = 97;
        int n = s.length();
        int count = 0;
        for (int i =0 ; i < n/2; i++) {
            int j = n-i-1;
            if (s.charAt(i) != s.charAt(j)) {

                    char ns;
                    int x;
                    if ((int) s.charAt(i) > (int) s.charAt(j)) {
                        int ascii = (int) s.charAt(i);
                        ascii--;
                        ns = (char) ascii;
                        x = i;
                    } else {
                        int ascii = (int) s.charAt(j);

                        ascii--;
                        ns = (char) ascii;
                        x = j;
                    }
                    StringBuilder sb = new StringBuilder(s);
                    sb.setCharAt(x,ns);
                    s = sb.toString();
                    count++;
                i--;
            }
        }

        System.out.println(count);
    }
}
