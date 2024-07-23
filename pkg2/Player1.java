package pkg2;

import java1.j10IfElse;

public class Player1 {
    public static void main(String[] args) {
        GamingConsole p1=new AeroplaneSimulator();
        GamingConsole p2=new CarSimulator();
        j10IfElse a=new j10IfElse();
        Object[] arr=new Object[]{p1,p2,a};
        for(Object ob:arr) {
            if (!(ob instanceof GamingConsole)) {
                getGameName(ob);
            }
        } // loose bonding
        int[] arr2=new int[]{1,3,4,2,45};



        for(int i=0;i<arr2.length;i+=2)
        {
            System.out.println(i);
        }
        for(int temp: arr2)
        {
            System.out.println(temp);
        }

    }

    public static
    void getGameName(Object a)
    {
        System.out.println(a.getClass().getName());
    }
}
