package com.HackerRank.Examples;

import java.util.Scanner;

public class HRStringReverse {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            /* Enter your code here. Print output to STDOUT. */

            char[] charArray = A.toCharArray();
            String reversedStr = "";


            for( int i = charArray.length - 1 ;  i <= charArray.length - 1 ;i--) {
                if ( i == -1 ) break;

                System.out.println(i);
                System.out.println(charArray[i]);

                reversedStr += charArray[i];
            }

            System.out.println(reversedStr);

            if(reversedStr.equals(A)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }



