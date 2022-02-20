package com.HackerRank.Examples;

import java.util.Scanner;


class MyPowerCalculator {

    long power(int b, int p) throws Exception{
        long result;

        if ( b == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } else if ( b < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }

        result = (long) Math.pow(b, p);

        return result;
    }

}

public class HRExceptionHandling {
    public static final MyPowerCalculator my_calculator = new MyPowerCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
