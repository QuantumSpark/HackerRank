package com.company;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-07-17.
 */
public class GameOfThrone {

    public static void solve () {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        pal(s);
    }

    private static void pal(String s){
        int[] alpha = new int[26];
        int baseChar = 97;
        int n = s.length();
        for (int i =0; i<n; i++) {
            alpha[s.charAt(i)-baseChar]++;
        }

        for (int i =0; i< 26; i++) {
            System.out.print(alpha[i] + ",");
        }
       for (int i =0; i< 26; i++) {
         if (alpha[i] == 1) {
             alpha[i] = 0;
             break;
         }
       }

        for (int i =0; i< 26; i++) {
            if (alpha[i] % 2 != 0 && alpha[i] % 3 != 0 ) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

}
