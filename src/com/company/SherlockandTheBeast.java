package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by QuantumSpark on 2016-06-09.
 */
public class SherlockandTheBeast {
    private int numTestCases;
    private List<Integer>  numDigits = new ArrayList<>();

    public SherlockandTheBeast(int numTestCases, List numDigits) {
        this.numTestCases = numTestCases;
        this.numDigits = numDigits;
    }


    public void solve () {
        int i = 0;
        int digit = 0;
        while (i < numTestCases) {
            digit = numDigits.get(i);

            System.out.println(this.SolveForEachCase(digit).toString());
            i++;
        }

    }
    private StringBuilder SolveForEachCase(int testcase) {
        StringBuilder str = new StringBuilder();

        // if testcase = 5
        // i = 5 , LLL=0
        // i = 4, LLL= 1
        // i = 3, LLL=2
        // i = 2, LLL=3
        for (int i = testcase; testcase > 0 ; i--) {
            int LLL= (testcase -i);
            if ( i %3 ==0 && LLL % 5 ==0){
                for (int j=0; j < i; j++) {
                    str.append("5");
                }
                for(int k =0 ; k <LLL ; k++)  {
                    str.append("3");
                }
                break;
            }
        }
        if (str.length() == 0) {
            return str.append("-1");
        }

        return str;
    }
}
