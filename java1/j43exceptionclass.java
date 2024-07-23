package java1;

import java.util.Scanner;

class myexception extends Exception{
    @Override
    public String toString() {
        return  "i am string";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "i am msg";
    }

}
public class j43exceptionclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<9);
        try {
            throw new myexception();
        } catch (myexception e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}