package com.company;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-07-26.
 */
public class MagicSquareForming {
    public static void solve () {
        Scanner in = new Scanner(System.in);
        int[][] ref = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ref[i][j] = in.nextInt();
            }
        }
        dothis(ref);
    }

    private static void dothis (int[][] ref) {

        ArrayList<Integer> h = new ArrayList<Integer>();
        ArrayList<Integer> cost = new ArrayList<Integer>();
        ArrayList<Integer> costs = new ArrayList<Integer>();
        int[][] p1 =  {
            {8,1,6},
            {3,5,7},
            {4,9,2}};
        int[][] p2 =  {
                {4,3,8},
                {9,5,1},
                {2,7,6}};

        int[][] p3 =  {
                {2,9,4},
                {7,5,3},
                {6,1,8}};
        int[][] p4 =  {
                {6,7,2},
                {1,5,9},
                {8,3,4}};
        int[][] p5 =  {
                {6,1,8},
                {7,5,3},
                {2,9,4}};

        int[][] p6 =  {
                {8,3,4},
                {1,5,9},
                {6,7,2}};
        int[][] p7 =  {
                {4,9,2},
                {3,5,7},
                {8,1,6}};

        int[][] p8 =  {
                {2,7,6},
                {9,5,1},
                {4,3,8}};
        int count  = 0;
        for (int i =0; i < 3; i++) {
            for (int j =0;j < 3; j++){
                if (ref[i][j] != p1[i][j]) {
                    cost.add(Math.abs(p1[i][j]-ref[i][j]));
                } else {
                    count++;
                }
            }
        }
        h.add(count);
        costs.add(cost.stream().mapToInt(Integer::intValue).sum());
        count = 0;
        cost = new ArrayList<>();
        for (int i =0; i < 3; i++) {
            for (int j =0;j < 3; j++){
                if (ref[i][j] != p2[i][j]) {
                    cost.add(Math.abs(p2[i][j]-ref[i][j]));
                }else {
                    count++;
                }

            }
        }
        h.add(count);
        costs.add(cost.stream().mapToInt(Integer::intValue).sum());
        count = 0;
        cost = new ArrayList<>();
        for (int i =0; i < 3; i++) {
            for (int j =0;j < 3; j++){
                if (ref[i][j] != p3[i][j]) {
                    cost.add(Math.abs(p3[i][j]-ref[i][j]));
                }else {
                    count++;
                }
            }
        }
        h.add(count);
        costs.add(cost.stream().mapToInt(Integer::intValue).sum());
        count = 0;
        cost = new ArrayList<>();
        for (int i =0; i < 3; i++) {
            for (int j =0;j < 3; j++){
                if (ref[i][j] != p4[i][j]) {
                    cost.add(Math.abs(p4[i][j]-ref[i][j]));
                }else {
                    count++;
                }
            }
        }
        h.add(count);
        costs.add(cost.stream().mapToInt(Integer::intValue).sum());
        count = 0;
        cost = new ArrayList<>();
        for (int i =0; i < 3; i++) {
            for (int j =0;j < 3; j++){
                if (ref[i][j] != p5[i][j]) {
                    cost.add(Math.abs(p5[i][j]-ref[i][j]));
                }else {
                    count++;
                }
            }
        }
        h.add(count);
        costs.add(cost.stream().mapToInt(Integer::intValue).sum());
        count = 0;
        cost = new ArrayList<>();
        for (int i =0; i < 3; i++) {
            for (int j =0;j < 3; j++){
                if (ref[i][j] != p6[i][j]) {
                    cost.add(Math.abs(p6[i][j]-ref[i][j]));
                }else {
                    count++;
                }
            }
        }
        h.add(count);
        costs.add(cost.stream().mapToInt(Integer::intValue).sum());
        count = 0;
        cost = new ArrayList<>();
        for (int i =0; i < 3; i++) {
            for (int j =0;j < 3; j++){
                if (ref[i][j] != p7[i][j]) {
                    cost.add(Math.abs(p7[i][j]-ref[i][j]));
                }else {
                    count++;
                }
            }
        }
        h.add(count);
        costs.add(cost.stream().mapToInt(Integer::intValue).sum());
        count = 0;
        cost = new ArrayList<>();
        for (int i =0; i < 3; i++) {
            for (int j =0;j < 3; j++){
                if (ref[i][j] != p8[i][j]) {
                    cost.add(Math.abs(p8[i][j]-ref[i][j]));
                }else {
                    count++;
                }
            }
        }
        h.add(count);
        costs.add(cost.stream().mapToInt(Integer::intValue).sum());


        System.out.println(Collections.min(costs));
    }


}
