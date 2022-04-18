package com.codewithhary;
import java.util.*;
public class cgpa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your marks");
        System.out.print("science: ");
        int a = in.nextInt();
        System.out.print("\nmaths: ");
        int b = in.nextInt();
        System.out.print("\nphysics: ");
        int c = in.nextInt();
        System.out.println();

        float marks = (((float) a + b + c) / 300 * 100) / 9.5f;
        System.out.print(marks);
    }
}
