package com.company;
import java.util.Scanner;

/**
 * Created by QuantumSpark on 2016-06-12.
 */
// Had help from https://www.youtube.com/watch?v=0AqwxpoVlDI
public class TheGridSearch {

    public TheGridSearch () {

    }

    public void solve( ){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int p =0; p<t;p++) {


            int R = in.nextInt();
            int C = in.nextInt();

            char[][] ref = new char[R][C];

            for (int i =0; i< R; i++) {
                System.out.println("Hello");
                char[] mChars = in.next().toCharArray();
                for (int j = 0; j < C; j++) {
                    ref[i][j] = mChars[j];
                }
            }
            int r = in.nextInt();
            int c = in.nextInt();

            char[][] target = new char[r][c];
            for (int i =0; i< r; i++) {
                System.out.println("Hello");
                char[] mChars = in.next().toCharArray();
                for (int j = 0; j < c; j++) {
                    target[i][j] = mChars[j];

                }
            }
            if (contains(R,C,r,c,ref,target)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }


    }

    public static boolean contains(int R, int C, int r, int c, char[][] ref, char[][] target ){
        boolean flag;
        for (int i =0; i<=R-r ; i++) {
            for (int j=0; j<= C-c; j++) {
                flag = false;
                for (int k=0 ; k< r; k++) {
                    for (int l=0; l<c;l++) {
                        if (ref[i+k][j+l] != target[k][l]) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag) break;

                }
                if (!flag) return true;

            }
        }
        return false;
    }

}
