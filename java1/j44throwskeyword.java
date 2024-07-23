package java1;

class Myex extends Exception{
    @Override
    public String toString() {
        return "radius should not be negative";
    }
}
public class j44throwskeyword {
    public static void r(int r) throws Myex{
        double area = Math.PI*r*r;
        if(r<0)
            throw new Myex();
        System.out.println(area);
    }
    public static int divide(int a, int b ) throws Exception{
        int c = a/b;
        return c;
    }

    public static void main(String[] args) {
        try {
            System.out.println((divide(27,9)));
        }
        catch(Exception e){
            System.out.println("cant divide " + e);
        }
        try{
            r(-4);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
