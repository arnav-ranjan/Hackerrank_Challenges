package com.HackerRank.Examples;

import java.util.Scanner;

public class HRStringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        //System.out.println(s + "\n" + k);
        // get smallest
        for( int i = 0; i< s.length() - k + 1; i++ ) {

            String str = s.substring(i, i + k);
            //System.out.println(str);
            //System.out.println(str.compareTo(smallest));
            if( i == 0) {
                smallest = str;
                largest = str;
                //System.out.println("smallest substring: " + smallest);
            } else if (str.compareTo(smallest) < 0){
                smallest = str;
                //System.out.println("smallest substring: " + smallest);
            } else if(str.compareTo(largest) > 0) {
                largest = str;
                //System.out.println("largest substring: " + largest);
            }
        }
        //System.out.println("smallest substring: " + smallest);
        //System.out.println("largest substring: " + largest);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}


