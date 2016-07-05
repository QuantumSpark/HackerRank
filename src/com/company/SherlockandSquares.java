package com.company;
import java.lang.Math;

/**
 * Created by QuantumSpark on 2016-06-10.
 */

public class SherlockandSquares {

    private int inputA;
    private int inputB;


    /// A < B

    public SherlockandSquares (int inputA, int inputB) {
        this.inputA = inputA;
        this.inputB = inputB;
    }

    public void solve() {
        int result =0;
        double x=0;
        for(int i =inputA; i<= inputB ;i++ ) {
            x = (double) i;
            if (Math.sqrt(x) - Math.ceil(Math.sqrt(x)) == 0 ) {
                result++;
                i +=  (int)Math.sqrt(x) * 2;

            }
        }
        System.out.print(result);
    }

}
