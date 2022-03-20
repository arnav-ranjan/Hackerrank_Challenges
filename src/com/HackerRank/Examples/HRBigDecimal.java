package com.HackerRank.Examples;

import java.math.BigDecimal;
import java.util.*;

public class HRBigDecimal {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++) {
            s[i]=sc.next();
        }
        sc.close();

        Arrays.sort(s, Collections.reverseOrder((o1, o2) -> {

            BigDecimal a = new BigDecimal(o1);
            BigDecimal b = new BigDecimal(o2);

            return a.compareTo(b);
        }));

        //Output
        for(int i=0;i<n;i++) {
            System.out.println(s[i]);
        }
    }
}

