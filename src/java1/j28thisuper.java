package java1;

class one{
    int a;
    one(int a){
        this.a = a;
        System.out.println("constructor");
    }
    // this - pass object in a function - reference
    int geta(){
        return a;
    }
}
class two extends one{
    int y;
    two(int y){
        super(0);
        this.y=y;
    }
    void gety(){
        System.out.println(y);
    }
}

public class j28thisuper {
    public static void main(String[] args) {
//        one x = new one(23);
//        System.out.println(x.geta());
        two r = new two(4);
        r.gety();
    }
}
