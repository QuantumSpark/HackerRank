package com.company;
import java.io.*;
import java.util.*;


/**
 * Created by QuantumSpark on 2016-07-12.
 */
public class CaesarCipher {

    public static void solve () {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        int k = in.nextInt();
        cipher(s,k);

    }

    private static void cipher(String s, int k) {
        char [] thing  = s.toCharArray();

        for (char c: thing) {
            if (!Character.isLetter(c)) {
                System.out.print(c);
            } else {
                char aA = (Character.isLowerCase(c)) ?
                        'a' : 'A';
                int ascii = aA + (c - aA + k)%26 ;
                System.out.print((char) ascii);
            }
        }
    }
}
