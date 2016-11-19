package com.company;

import java.util.*;

/**
 * Created by QuantumSpark on 2016-11-17.
 */
public class LuckBalance {
    public class thing {
        int l = 0;
        int t = 0;

        thing(int l, int t) {
            this.l = l;
            this.t = t;
        }
    }


    public static void solve () {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        List<Integer> importantLuck = new ArrayList<>();
        for (int i = 0 ; i< n ; i++) {
            int l = in.nextInt();
            int t = in.nextInt();

            count += l;
            if (t == 1) {
                importantLuck.add(l);
            }
        }
        Collections.sort(importantLuck);
        int luckToSubstract = 0;
        for (int i =0; i < importantLuck.size() - k; i++){
            luckToSubstract +=importantLuck.get(i);
        }

        System.out.println(count- 2*luckToSubstract);

    }


}
