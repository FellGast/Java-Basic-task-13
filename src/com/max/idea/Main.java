package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        sc.close();
        String[] t = s.split(" ");
        int k = 0;
        for(int i = 0; i < t.length; i++)
        {

            if(t[i].matches("[a-zA-Z]+"))
            {
                System.out.println(t[i]);
                k++;
            }
        }
        System.out.println(k);
    }
}
