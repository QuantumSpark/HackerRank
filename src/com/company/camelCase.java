package com.company;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-07-31.
 */
public class camelCase {

    public static void solve () {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        doThis(s);
    }


    private static void doThis (String s) {
        int aAscii = 97;
        int zAscii = 122;
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
           int ithAscii = (int) s.charAt(i);

            if (!(ithAscii >= aAscii && ithAscii <= zAscii )) {
                count++;
            }
        }

        System.out.println(count);
    }
}
