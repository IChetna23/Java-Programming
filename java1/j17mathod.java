package java1;

public class j17mathod {
//    static - call without object
     int logic(int x, int y){
        int z;
        if(x<y)
            z = x+y;
        else
            z = x+y+2;
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c;
//        if(a<b)
//            c = a+b;
//        else
//            c = a+b+2;
        j17mathod ob1 = new j17mathod();
        c = ob1.logic(a,b);
//        c = logic(a,b);
        System.out.println(c); // 14
        int p = 6;
        int q = 6;
        int r;
//        if(p<q)
//            r = p+q;
//        else
//            r = p+q+2;
//        r = logic(a,b);
        r = ob1.logic(a,b);
        System.out.println(r); // 14

    }
}
