package com.company;

import sun.jvm.hotspot.debugger.cdbg.Sym;

import java.io.*;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-07-17.
 */
public class BeautifulBinaryString {

    public static void solve () {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        bbs(s, n);
    }

    private static void bbs (String s, int n){
        int count = 0;
        int i = 0;
        while (i <= n-3) {
            String a = s.substring(i, i + 3);
                if (s.substring(i, i + 3).equals("010")) {
                    count++;
                    i += 3;
                } else {
                    i++;
                }

        }

        System.out.println(count);
    }
}
