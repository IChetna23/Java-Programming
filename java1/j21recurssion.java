package java1;

public class j21recurssion {
    static int fac(int n){
        System.out.println(n);
        if(n==0 ||n==1)
            return 1;
        else
            return (n*fac(n-1));
    }
    static int faci(int n){
        if(n==0 ||n==1)
            return 1;
        else {
            int p = 1;
            for (int i = 1; i < n; i++) {
                p = p * i;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int f = faci(9);
        System.out.println("fac = " + f);
    }

    public static interface Bicycle {
        void up();
        void down();
        void left();
        void right();
        void space();

    }
}
