package com.company;
import java.util.*;
import java.io.*;
/**
 * Created by QuantumSpark on 2016-07-23.
 */
public class SherlockandAnagram {

    public static void solve () {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();
        for (int i = 0 ;i < t ; i++) {
            String s = in.nextLine();
            unOrderPairs(s);
        }
    }

    private static void unOrderPairs(String s) {

        int n = s.length();
        int count = 0;
        String temp;

        for (int i =0; i < n-1; i++) {
            Hashtable t = new Hashtable();
            Hashtable r = new Hashtable();
            LinkedList<String> list = new LinkedList<>();
            for (int j = 0 ; j < n - i ; j++) {
                temp =  sortAlphabet(s.substring(j, j+i+1));
                t.put(j, temp);
                list.add(temp);
            }

            for (int k = 0 ; k < list.size() ; k++) {
                int o = Collections.frequency(list, t.get(k));
                if (!r.containsValue(t.get(k))) {
                    if (o > 1) {
                        count += o * (o - 1) * 0.5 ;

                    }
                    r.put(k,t.get(k));
                }

            }
        }
        System.out.println(count);
    }

    private static String sortAlphabet (String s) {
        int[] alpha = new int[26];
        int baseChar = 97;
        int n = s.length();
        for (int i = 0; i< n ; i++) {
            alpha[s.charAt(i) - baseChar]++;
        }

        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (int i = 0 ; i < 26 ; i++) {
            while (alpha[i] != 0) {
                int ascii = i+baseChar;
                sb.append((char)ascii);
                alpha[i]--;
                j++;
            }

            if (j == n) {
                break;
            }
        }

        return sb.toString();
    }
}
