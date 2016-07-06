package com.company;

import java.util.Scanner;

/**
 * Created by QuantumSpark on 2016-07-05.
 */
public class CavityMap {

    public CavityMap () {

    }

    public void solve() {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int p =0; p<t;p++) {

            int n = in.nextInt();
            char[][] ref = new char[n][n];
            for (int i =0; i< n; i++) {
                System.out.println("Hello");
                char[] mChars = in.next().toCharArray();
                for (int j = 0; j < n; j++) {
                    ref[i][j] = mChars[j];
                }
            }

            replaceX(ref,n);

        }

    }

    public static void replaceX( char [][] ref, int n) {
        for (int i = 1; i< n-1; i++) {
            for (int j = 1; j< n-1;j++) {

                char r = ref[i][j];
                // case1 top left corner
                if (i==1 && j ==1) {
                    if (r == ref[i+1][j]) {
                       ref[i+1][j] = 'X';
                        ref[i][j]= 'X';
                    }
                    if (r == ref[i+1][j+1]) {
                        ref[i+1][j+1] = 'X';
                        ref[i][j]= 'X';
                    }
                    if (r == ref[i][j+1]) {
                        ref[i][j+1] = 'X';
                        ref[i][j]= 'X';
                    }
                }
                // case 2 top right corner
                else if (i==1 && j == (n-1) ) {
                    if (r == ref[i+1][j]) {
                        ref[i+1][j] = 'X';
                        ref[i][j]= 'X';
                    }
                    if (r == ref[i+1][j-1]) {
                        ref[i+1][j+1] = 'X';
                        ref[i][j]= 'X';
                    }
                    if (r == ref[i][j-1]) {
                        ref[i][j+1] = 'X';
                        ref[i][j]= 'X';
                    }
                }

                //case 3 bottom left corner
                else if (i == (n-1) && j==1 ) {
                    if (r == ref[i-1][j]) {
                        ref[i+1][j] = 'X';
                        ref[i][j]= 'X';
                    }
                    if (r == ref[i-1][j+1]) {
                        ref[i+1][j+1] = 'X';
                        ref[i][j]= 'X';
                    }
                    if (r == ref[i+1][j+1]) {
                        ref[i][j+1] = 'X';
                        ref[i][j]= 'X';
                    }
                }
                // case 4 bottom right corner
                else if (i == (n-1) && j == (n-1)) {
                    if (r == ref[i-1][j]) {
                        ref[i+1][j] = 'X';
                        ref[i][j]= 'X';
                    }
                    if (r == ref[i][j-1]) {
                        ref[i+1][j+1] = 'X';
                        ref[i][j]= 'X';
                    }
                    if (r == ref[i-1][j-1]) {
                        ref[i][j+1] = 'X';
                        ref[i][j]= 'X';
                    }
                }



            }
        }
    }
}
