package com.company;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-07-17.
 */
public class AbsolutePermutation {

    public static void solve () {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for (int i =0; i < t; i++) {
           String s = in.nextLine();
            String [] pairs = s.split(" ");
            perm(pairs[0],pairs[1]);
        }
    }

    private  static void perm(String n , String k) {

        Integer nn = new Integer(n);
        Integer kk = new Integer(k);
        int[] sb = new int[nn];
        int max1 =0;
        int max2 =0;
        for (int i = 0; i < nn; i++) {

            sb[i] = i+1;
            max1 += sb[i] ;
        }
        if (kk != 0) {
            for (int i = 0; i < nn; i++) {
                if ((i / kk) % 2 == 0) {
                    sb[i] += kk;
                } else {
                    sb[i] -= kk;
                }
                max2 += sb[i];
            }
        } else {
            for (int i = 0; i < nn; i++) {
                System.out.print(sb[i] + " ");
            }
            System.out.println();
            return;
        }
        if (max1 == max2) {
            for (int i = 0; i < nn; i++) {
                System.out.print(sb[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println(-1);
        }

    }
}
