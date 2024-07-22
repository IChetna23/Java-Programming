package java1;

public class j45finallyblock {
    public static int fun(){
        try{
            int a=9;
            int b=3;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println("error");
        }
        finally {
            System.out.println("function ends");
        }
        return 0;
    }
    public static void main(String[] args) {
//        System.out.println(fun());
        int a = 50;
        int b =9;
        while(true){
            try {
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("loop ends for" + b);
            }
            b--;
        }
    }
}
