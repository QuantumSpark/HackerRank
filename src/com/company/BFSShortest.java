package com.company;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by QuantumSpark on 2016-07-31.
 */
public class BFSShortest {

    public static void solve () {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i = 0; i < t ; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] adjmatrix = new int[n][n];
            int[] discovered = new int[n];
            for (int j = 0; j < m ; j++ ) {
                int tmp1 = in.nextInt();
                int tmp2 = in.nextInt();

                adjmatrix[tmp1-1][tmp2-1] = 1;
                adjmatrix[tmp2-1][tmp1-1] = 1;

            }
            int s = in.nextInt();
            dothis(adjmatrix,discovered,s, n);
        }
    }

    private static void dothis(int[][] adjmatrix, int[] discovered, int s, int n) {
        int[] list = new int[n];
        Queue<Integer> q = new ConcurrentLinkedQueue<>();
        q.add(s-1);
        discovered[s-1] = 1;
        while (!q.isEmpty()) {
            int u = q.remove();
                for (int  v =0; v < n ; v++) {


                    if (adjmatrix[u][v] == 1 && discovered[v] == 0 ) {
                            list[v] = list[u] + 6;
                        q.add(v);
                        discovered[v] = 1;

                    }
                }

        }

        for (int i = 0; i < n; i ++) {
            if (i != (s-1)) {
                if (list[i] == 0) {
                    System.out.print("-1" + " ");
                }else {
                    System.out.print(list[i] + " ");
                }
            }
        }
        System.out.println("");

    }
}
