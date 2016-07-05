package com.company;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;
/**
 * Created by QuantumSpark on 2016-06-10.
 */
public class ServiceLane {

    private int size ;
    private List<Integer> highway;

    public ServiceLane ( int size) {
        this.size = size;
        highway = new ArrayList<>();
    }

    public void solve() {
        Scanner in = new Scanner(System.in);
        int inputfromuser;
        for (int i =0; i< size; i++) {
            inputfromuser = in.nextInt();
            highway.add(inputfromuser);
        }

        System.out.println("Enter two points");
        int A = 0;
        int B = 0;
        A = in.nextInt();
        B = in.nextInt();
        int min = (Integer) highway.get(A);
        for (int i = A; i <= B; i++) {
            if (min > (Integer) highway.get(i)) {
                min = (Integer) highway.get(i);
            }
        }

        System.out.print(min);


    }
}
