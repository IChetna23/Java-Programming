package java1;

import java.util.Scanner;

public class j42nestedtrycatch {
    public static void main(String[] args) {
        int [] arr = {4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);;
        boolean flag1 = true;
        int i =0;
        while(flag1){
            System.out.println("enter index to be accessed - ");
            int index;
            index = sc.nextInt();
            i++;
            if(i==5){
                break;
            }
            try {
                System.out.println("okk");
                try {
                    System.out.println("element at index is - " + arr[index]);
                }
                catch(Exception e){
                    System.out.println("erroe! at level 2");
                }
            }
            catch(Exception e){
                System.out.println("exception at level 1" + e);
            }
        }
        System.out.println("nice . move ahead . ");
        System.out.println("enter a no - ");
        int b= sc.nextInt();
        boolean flag2 = true;
        int j =0;
        while(flag2){
            j++;

            try {
                    System.out.println("q = " + arr[i]/b);
                }
            catch(Exception e){
                    System.out.println("div error");
                }
            if(i==5){
                break;
            }
        }

        System.out.println("program terminated");
    }
}
