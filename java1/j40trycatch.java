package java1;

import java.util.Scanner;

public class j40trycatch {
    public static void main(String[] args) {
        System.out.println("enter a - ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter b - ");
        int b = sc.nextInt();
        try {
            int c = a/b;
            System.out.println("integer part of quotient when a/b is - " + c);
        }
        catch (Exception e){
            System.out.println("cant divide because - " + e);
        }
    }
}
