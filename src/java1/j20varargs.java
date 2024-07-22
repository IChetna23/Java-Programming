package java1;

public class j20varargs {
    static int sum(int x, int...arr){
        int result =0;
        for(int each: arr) {
            result += each;
        }
        return result;
    } // varargs
    public static void main(String[] args) {
        System.out.println("sum of 1, 2 is : " + sum(1, 2));
        System.out.println("sum of 1, 2, 3 is : " + sum(1, 2, 3));
        System.out.println("sum of 1, 2, 3, 4 is : " + sum(1, 2, 3, 4));
        System.out.println("sum of 1, 2, 3, 4, 5 is : " + sum(1, 2, 3 , 4, 5));
//        sum(); - error - x compulsory
    }
}
