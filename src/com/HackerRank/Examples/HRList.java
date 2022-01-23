package com.HackerRank.Examples;

import  java.util.*;

public class HRList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            int number = scan.nextInt();
            list.add(number);
        }

        int q = scan.nextInt();
        for(int i = 0; i < q; i++){

            String action = scan.next();

            if(action.equals("Insert")) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                list.add(x, y);
            } else {
                int removeIndex = scan.nextInt();
                list.remove(removeIndex);
            }

        }
        scan.close();

        for (Integer num : list) {
            System.out.print(num + " ");
        }

    }

}
