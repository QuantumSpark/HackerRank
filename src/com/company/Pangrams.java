package com.company;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by QuantumSpark on 2016-07-10.
 */
public class Pangrams {

    public static void solve () {
        Scanner in = new Scanner(System.in);
        System.out.println("HELLO");
        String s = in.nextLine();
        String trimmedInput = s.trim().toLowerCase();
        char[] charInput = trimmedInput.toCharArray();

        isItPanagram(charInput);
    }

    private static void isItPanagram (char[] input) {
        int i = 0;
        LinkedList<Character> ref = new LinkedList<Character>();
        for (char c: input) {
            if (Character.isLetter(c)  && !ref.contains(c)) {
                i++;
            }
            ref.add(c);

        }

        if (i == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }


    }
}
