package com.practiceset1;

import java.util.Scanner;

public class AddThreeNumbers {


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("enter three numbers");
        System.out.println("enter A");
        int a = sn.nextInt();
        System.out.println("enter B");
        int b = sn.nextInt();
        System.out.println("enter C");
        int c = sn.nextInt();
        System.out.print("the sum of A+B+C: " + (a+b+c));

         }


}
