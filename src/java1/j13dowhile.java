package java1;

public class j13dowhile {
    public static void main(String[] args) {
        int i =0;
        while(i <= 10){
            ++i;
            System.out.println(i);
        }
        int j =0;
        do{
            j++;
            System.out.println(j);
        }while(j<=3);

    }
    // while(true) - infinite loop
    // while(1) - error
}
