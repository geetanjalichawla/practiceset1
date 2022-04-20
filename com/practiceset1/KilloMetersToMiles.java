package com.practiceset1;

import java.util.Scanner;

public class KilloMetersToMiles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter kilometers");
        float k  = in.nextFloat();
        System.out.println(k + "km into miles is: " + (k*(0.621371f)));//0.621371 is 1 kilometer

    }

    public static class Greet {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("enter your name : ");
              String name  = in.nextLine();
              System.out.println("hello " + name + " have a good day");
        }
    }
}
