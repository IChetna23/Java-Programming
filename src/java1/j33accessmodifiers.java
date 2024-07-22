package java1;

class Abc{
    public int a =1;
    protected int b =2;
    int c =3; // default - protected
    private int d =4;
    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d); // accessed same class
    }
}

class in extends Abc{
    public void meth(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
//        System.out.println(d); // not accessed - sub class
    }
}

public class j33accessmodifiers {
    public static void main(String[] args) {
        in ob1 = new in();
        System.out.println(ob1.a);
        System.out.println(ob1.b);
        System.out.println(ob1.c);
//        System.out.println(ob1.d); // not accessed - package
        ob1.meth();
    }
}

// world - only public accessed
