package com.company;
import java.util.Scanner;

/**
 * Created by QuantumSpark on 2016-06-12.
 */
public class TheGridSearch {

    public TheGridSearch () {

    }

    public void solve( ){
        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        System.out.println("X is " +x);
//        int y =  in.nextInt();
//        System.out.println("Y is " +y);
//        int c;

//        5 15
//        111111111111111
//        111111111111111
//        111111011111111
//        111111111111111
//        111111111111111
//        3 5
//        11111
//        11111
//        11110



//        int[][] ref = new int[][]{
//                {7,2,8,3,4,5,5,8,6,4},
//                {6,7,3,1,1,5,8,6,1,9},
//                {8,9,8,8,2,4,2,6,4,3},
//                {3,8,3,0,5,8,9,3,2,4},
//                {2,2,2,9,5,0,5,8,1,3},
//                {5,6,3,3,8,4,5,3,7,4},
//                {6,4,7,3,5,3,0,2,9,3},
//                {7,0,5,3,1,0,6,6,0,1},
//                {0,8,3,4,2,8,2,9,5,6},
//                {4,6,0,7,9,2,4,1,3,7},
//        };

        int[][] ref = new int[][] {
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,0,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}


        };

//        for (int i =0; i< x; i++) {
//            for (int j = 0; j < y; j++) {
//                System.out.println("(" + i + "),("+j+")");
//                c = in.nextInt();
//                System.out.println("(" + i + "),("+j+")= " + c);
//                ref[i][j] = c;
//            }
//        }


//        int x2 = in.nextInt();
//        int y2 = in.nextInt();

//        int[][] target = new int[][]{
//
//                {9,5,0,5},
//                {3,8,4,5},
//                {3,5,3,0}
//
//
//        };

        int[][] target = new int[][]{

                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,0}


        };


//        for (int i =0; i< x2; i++) {
//            for (int j = 0; j < y2; j++) {
//                System.out.println("(" + i + "),("+j+")");
//                c = in.nextInt();
//                System.out.println("(" + i + "),("+j+")= " + c);
//                target[i][j] = c;
//            }
//        }
        int x =5;
        int y = 15;
        int x2= 3;
        int y2 = 5;
        int ycounter = 0;
        boolean s = false ;
        for (int i = 0; i < x ; i++) {

                for (int j = 0; j < y; j++) {
                    System.out.println(i + "," + j);
                    if (ycounter == y2) {
                        if (couldItBe(ref,target,i,j-ycounter,x,y2,x2)) {
                            s = true;
                            break;
                        }
                    } else if (ref[i][j] == target[0][ycounter]) {
                        ycounter++;
                    }
                }
                ycounter = 0;
        }
        if (s) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    private boolean couldItBe (int[][] ref, int[][] target, int xcounter, int y, int x, int y2, int x2) {
        int counter = 0;
        for (int i = 0; i < x2; i++) {
           if (i+ xcounter <= x) {
               for (int j = 0; j < y2; j++) {
                   int xxxx = i + xcounter;
                   int yyyy = j + y;
                   if (ref[xxxx][yyyy] == target[i][j]) {
                       counter++;
                   }
               }
           }else {
               return false;
           }
        }

        if (counter == (x2*y2)) {
            return true;
        }
        return false;
    }

}
