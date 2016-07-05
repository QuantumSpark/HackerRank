package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
/**
 * Created by QuantumSpark on 2016-06-12.
 */
public class LisaWorkbook {

    public LisaWorkbook () {

    }


    public void solve () {
        Scanner in = new Scanner(System.in);
        int chapter = in.nextInt();
        int  maxproblem = in.nextInt();
        int a;
        List<Integer> info = new ArrayList<>();
        for (int l = 0; l < chapter; l++) {
            a = in.nextInt();
            info.add(a);
        }

        int count = 0;
        int problemperchapter =0; // 3
        int currentpage = 1;
        for (int i = 1; i<= chapter; i++) {
            problemperchapter=info.get(i-1);

            for (int j = 1; j<=problemperchapter ;j++) {
                if (currentpage == j) {
                    count ++;
                }
                if (j != problemperchapter) {
                    if ((j % maxproblem) == 0) {
                        currentpage++;
                    }
                }
            }
            currentpage++;
        }

        System.out.println(count);
    }
}
