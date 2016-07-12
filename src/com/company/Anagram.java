package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import com.sun.tools.javac.util.ArrayUtils;
import sun.jvm.hotspot.debugger.cdbg.Sym;

import java.util.stream.*;
/**
 * Created by QuantumSpark on 2016-07-11.
 */

// had help from zhangtao_todd
public class Anagram {

    public static void solve () {
        System.out.println("SSSS");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n ;i++) {
            String s = in.nextLine();
            System.out.println(anagram(s));
        }
    }



    private static int anagram (String s) {



        if (s.length() % 2 != 0) {
            return -1;
        } else {
            int count=0;

            String half1 = s.substring(0, (s.length()/2));
            String half2 = s.substring(s.length()/2);
            char [] half1Char = half1.toCharArray();
            for (char c: half1Char){
                if (half2.indexOf(c) == -1) {
                    count++;
                }else {
                    half2 = half2.substring(0,half2.indexOf(c))+half2.substring(half2.indexOf(c)+1);
                }
            }


            return count;

        }
    }


}
