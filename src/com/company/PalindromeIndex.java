package com.company; /**
 * Created by QuantumSpark on 2016-07-11.
 */
import java.io.*;
import java.util.*;
public class PalindromeIndex {

    public static void solve() {

       Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        in.nextLine();

        for (int i =0 ;i < n ; i++) {
            String s = in.nextLine();
            System.out.println(getIndex(s,0,s.length()));
        }
    }
    
    private static int getIndex (String s, int first, int last ) {
        int n = last;
        for (int i = first ; i <n/2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                StringBuilder sb1 = new StringBuilder(s);
                sb1 = sb1.deleteCharAt(i);
                StringBuilder sb2 = new StringBuilder(s);
                sb2 = sb2.deleteCharAt(n - i - 1);
                if (getIndex(sb1.toString(),0,sb1.length()) == -1) {
                    return i;
                }
                else if (getIndex(sb2.toString(),0,sb2.length()) == -1) {
                    return n-i-1;
                }
            }
        }
        return -1;
    }


}
