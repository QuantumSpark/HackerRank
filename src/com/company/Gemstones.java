package com.company;
import java.io.*;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-07-14.
 */
public class Gemstones {


    public static void solve () {

        List<String> sss = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n ; i++) {

            String s = in.nextLine();
            sss.add(s);
        }
        findComp(sss);
    }

    private static void findComp(List<String> sss) {
        int n = sss.size();
        int[][] alphabets = new int[26][n];
        int baseChar= 97;

        for (int i =0 ; i < n ; i++) {
            String temp = sss.get(i);
            for(int j=0;j<temp.length();j++){
                alphabets[temp.charAt(j)-baseChar][i]++;
            }
        }

        int count = 0;
        int s= 0;
        for (int i = 0; i < 26; i++) {
            for (int j =0 ; j < n; j++) {
                int t1 = alphabets[i][j];

                if (t1 != 0) {
                    s++;
                }
            }

            if (s==n) {
                count++;
            }
            s =0;
        }
        System.out.println(count);
    }
}
