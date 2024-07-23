package java1;

class base{
    static int x;


    base(){
        System.out.println("p constructor");
    }
    base(int x){
        System.out.println(x);
    }
    base(int x, int y){
        System.out.println(x + " and " + y);
    }
}

class c1 extends base{
    int y;
    int z;

    c1(){
        System.out.println("c1 constructor");
    }

    c1(int y) {
        super(0);
        System.out.println(y);
    }

    c1(int x, int y) {
        super(0);
        System.out.println(x + " and " +y);
    }
}
class c2 extends c1{
    c2(int x, int y){
        super(0);
        System.out.println(x + " and " + y);
    }
    }
public class j27constructorininheritence {
    public static void main(String[] args) {
        c1 ob1 = new c1(); // p then c1
        c1 ob2 = new c1(2);
        c1 ob3 = new c1(3,4);
        c2 ob4 = new c2(3,7);
    }
}
