package com.company;

import java.util.Scanner;
import java.util.jar.Pack200;

/**
 * Created by QuantumSpark on 2016-07-05.
 */
public class CavityMap {

    public CavityMap () {

    }

    public static  void solve() {

        Scanner in = new Scanner(System.in);


        System.out.println("Choose the size of the square");
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

    public static void replaceX( char [][] ref, int n) {
        for (int i = 0; i< n; i++) {
            for (int j = 0; j< n;j++) {


                if ( (i>=1) && (j>=1) && (j<(n-1)) && (i<(n-1))) {
                    char currentCell = ref[i][j];
                    char leftCell = ref[i][j - 1];
                    char rightCell = ref[i][j + 1];
                    char topCell = ref[i + 1][j];
                    char bottomCell = ref[i - 1][j];
                    boolean condition1 = currentCell > leftCell;
                    boolean condition2 = currentCell > rightCell;
                    boolean condition3 = currentCell > topCell;
                    boolean condition4 = currentCell > bottomCell;

                    if (condition1 && condition2 && condition3 && condition4) {
                        System.out.print("X");
                    } else {
                        System.out.print(currentCell);
                    }
                } else {
                    System.out.print(ref[i][j]);
                }

            }
            System.out.println("");
        }
    }
}
