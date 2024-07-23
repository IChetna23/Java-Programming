package java1;

public class j18referenece {
    static int change1(int x){
        x = 90;
        System.out.println(x);
        return x;
    } // passing by value - direct variable
    static int change2(int []y){
        y[2] = 7;
        System.out.println(y[2]);
        return y[2];
    } // reference by object
    public static void main(String[] args) {
        int x = 89;
        change1(x);
        System.out.println(x);
        int []y = {1,2,3,4};
        change2(y);
        System.out.println(y[2]);
    }
}
