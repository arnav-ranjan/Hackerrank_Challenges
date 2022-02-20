package com.HackerRank.Examples;

import java.util.*;

public class HRTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        try {
            int result = x/y;
            System.out.println(result);

        } catch ( Exception e) {
            System.out.println(e);
        }
    }

}
