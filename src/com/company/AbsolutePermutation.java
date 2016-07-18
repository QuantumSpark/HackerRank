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
        int[] s = new int[nn];
        List<Integer> sb2 = new ArrayList<Integer>();
        for (int i =0; i < nn; i++) {
            s[i] = i+1;
        }

        for (int i =0 ; i < nn; i++) {
            int c1 = s[i];
           for (int j = 0 ;j < nn; j++) {

               int c2 = s[j];
               if (Math.abs(c1 - c2) == kk) {
                   if (!sb2.contains(s[j])) {
                       sb2.add(s[j]);
                       break;
                   }
               }
           }


        }


           if (sb2.contains(0) || sb2.size() != nn) {
               System.out.println("-1");
               return;
           }
        for (int i =0; i < sb2.size(); i++) {

                System.out.print(sb2.get(i) + " ");


        }
        System.out.println();


    }
}
