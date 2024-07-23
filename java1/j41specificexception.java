package java1;

import java.util.Scanner;

public class j41specificexception {
    public static void main(String[] args) {
        int [] array = {3, 4, 5, 6, 8};
        System.out.println("enter the index of array - ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter the number u want to divide with - ");
        int b = sc.nextInt();
        try{
            System.out.println("no at index " + a + " is - " + array[a]);
            System.out.println("quotient - " + array[a]/b);
        }
        catch(ArithmeticException e){
            System.out.println("some arithmetic exception occured." + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("some array exception occured." + e);
        }
        catch(Exception e){
            System.out.println("some exception occured." + e);
        }

    }
}
