package java1;

public class j19overloading {
    static void foo(){
        System.out.println("hello");
    }
    static void foo(int a){
        System.out.println("there are " + a + " people");
    }
    static void foo(int a, int b){
        System.out.println("there are " + a + " and " + b);
    } // parameters
    public static void main(String[] args) {
        foo();
        foo(3000);
        foo(70, 90); // arguements are actual
    }
}
