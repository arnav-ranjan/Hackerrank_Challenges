package com.HackerRank.Examples;

import java.math.BigInteger;
import java.util.Scanner;

public class HRBigInteger {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        BigInteger a, b;
        a = new BigInteger(scan.next());
        b = new BigInteger(scan.next());

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        scan.close();

    }

}
