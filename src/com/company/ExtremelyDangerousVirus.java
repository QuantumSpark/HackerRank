package com.company;
import java.util.*;
import java.math.*;
/**
 * Created by QuantumSpark on 2016-07-27.
 */
public class ExtremelyDangerousVirus {

    public static void solve () {

        Scanner in = new Scanner(System.in);
        int n = 3;
        BigInteger[] ar = new BigInteger[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextBigInteger();
        }
        doThis(ar);
    }

    private static void doThis (BigInteger[] ar) {
        BigInteger a =ar[0];
        BigInteger b =ar[1];
        BigInteger t =ar[2];
        BigInteger bi = new BigInteger("2");
        BigInteger bi2 = new BigInteger("1000000007");
        BigInteger an;
        BigInteger c = a.add(b);
        BigInteger d = c.divide(bi);

        System.out.println(d.modPow(t,bi2));


    }
}
