package java1;

import java.util.Scanner;

public class j3Scannerinput {
    public static void main(String[] args) {
        System.out.println("taking input using scanner: ");
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter your number a: ");
        int a = Sc.nextInt();
//        boolean num = Sc.hasNextInt();
//        System.out.println(num);
        System.out.println("enter your number b: ");
        int b = Sc.nextInt();
        System.out.println("sum: " + (a + b));
        String str = Sc.next();
        System.out.println(str); // harry
        String str2 = Sc.nextLine();
        System.out.println(str2); //harry is good.
    }
}
