package com.company;
import java.io.*;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-07-12.
 */
// Help From anirudherabelly
public class makingAnagram {

    public static void solve() {
       Scanner in = new Scanner(System.in);
        String s1 = in.nextLine().toLowerCase();
        String s2 = in.nextLine().toLowerCase();

        int cArr[] = new int[26];
        for(int i=0;i<s1.length();i++){
            cArr[s1.charAt(i)-97]++;
        }
        for(int i=0;i<s2.length();i++) {
            cArr[s2.charAt(i)-97]--;
        }
        // Similar chars will have 0  at index i;
        int count=0;
        for(int i=0;i<26;i++) {
            count+=Math.abs(cArr[i]);
        }
        System.out.println(count);

    }
}
