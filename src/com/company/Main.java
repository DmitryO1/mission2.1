package com.company;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        int sum = A.length()+B.length();
        System.out.println(sum);
        if(A.compareTo(B) >0)
        {
            System.out.println("Yes");
        }
        else   {System.out.println("No");}

        String c = A.substring(0,1).toUpperCase()+A.substring(1);
        String d = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(c+" "+d);




    }
}