package com.company;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-07-31.
 */
public class StringConstruction {

    public static void solve () {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for (int i = 0; i < t; i++) {
            String s = in.nextLine();
            doThis(s);
        }
    }

    private static void doThis (String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        int prevSize = 0;
        for (int i = 0; i< s.length(); i++) {
           set.add(s.charAt(i));
            if (set.size() > prevSize) {
                count++;
            }
            prevSize = set.size();
        }
        System.out.println(count);
    }
}

