package com.HackerRank.Examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class HRPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger number;
        number = new BigInteger(n);

        if (!number.isProbablePrime(4)) {
            System.out.println("not prime");
        } else {
            System.out.println("prime");
        }


        bufferedReader.close();
    }


}
