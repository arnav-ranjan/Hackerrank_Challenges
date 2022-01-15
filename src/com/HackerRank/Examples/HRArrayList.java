package com.HackerRank.Examples;

import java.io.*;
import java.util.*;

public class HRArrayList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d,q,x,y;

        ArrayList[] array = new ArrayList[n];

        for(int i = 0; i < n; i++) {

            d = scan.nextInt();
            array[i] = new ArrayList();

            for(int j = 0; j < d; j++) {
                array[i].add(scan.nextInt());
            }

        }
        q = scan.nextInt();
        for(int k = 0; k < q; k++) {
            x = scan.nextInt();
            y = scan.nextInt();

            try{
                System.out.println(array[x-1].get(y-1));
            } catch ( Exception e) {
                System.out.println("ERROR!");
            }
        }


    }

}
