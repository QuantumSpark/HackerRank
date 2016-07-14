package com.company; /**
 * Created by QuantumSpark on 2016-07-11.
 */
import java.io.*;
import java.util.*;
public class PalindromeIndex {
    // credit to Avinash89 and michal_lihocky
    public static void solve() {

       Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        in.nextLine();

        for (int i =0 ;i < n ; i++) {
            String s = in.nextLine();
            System.out.println(getIndex(s));
        }
    }

    private static int getIndex (String s) {
        int n = s.length();
        int i = 0, j=n-1;
        boolean notPalindrome = false;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                notPalindrome = true;
                break;
            }
            j--;i++;
        }
        if (notPalindrome) {
            // Check if it's a palindrome after it removes
            // the character from the right
            if (s.charAt(i) == s.charAt(j-1)
                    && s.charAt(i+1) == s.charAt(j-2)) {
                return j;
            }
            else {
                return i;
            }
        }
        return -1;
    }


}
