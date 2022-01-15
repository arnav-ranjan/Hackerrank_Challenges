package com.HackerRank.Examples;

import java.util.Scanner;

public class HRStringTokens {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String tokenFinder = "['!?,._@ ]+";
            String[] tokens = s.split(tokenFinder);

            System.out.println(tokens.length);

            for( String str : tokens) {
                System.out.println(str);
            }
        }




        scan.close();

    }
}
