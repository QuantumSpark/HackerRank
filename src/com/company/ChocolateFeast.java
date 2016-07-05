package com.company;

/**
 * Created by QuantumSpark on 2016-06-11.
 */
public class ChocolateFeast {


    public ChocolateFeast () {

    }

    public int solve (int N , int C, int M) {
        int amountOfChocolates = N/C;
        int wrapper = amountOfChocolates;
        int leftover  =0;
        while (wrapper >= M) {
           wrapper = wrapper - (M-1);
            amountOfChocolates++;
        }
        // N =6  , C =2 , M =2
        // wrapper = 6/2 = 3
        // wrapper = 3, M = 2
        // additionalChocolates = aOc-m = 1
        // unused  wrapper = 3 -2 = 1
        // usused wrapper + additionalChocolates >=2(discount)


        return amountOfChocolates;
    }




}
