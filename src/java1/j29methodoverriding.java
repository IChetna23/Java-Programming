package java1;

class a{
    int a;
    public void fun(){
        System.out.println("fun of a class");
    }
    public void fun(int x){
        a = x;
        System.out.println(a);  // method overloading - same class - diff parameters
    }
}
class b extends a{
    @Override
    public void fun(){
        System.out.println("fun of b class"); // method overriding - diff class - same parameters
    }
}
public class j29methodoverriding {
    public static void main(String[] args) {
        b d = new b();
        d.fun();
    }
}
