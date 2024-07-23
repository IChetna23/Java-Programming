package java1;

public class j14forloop {
    public static void main(String[] args) {
        int k = 0;
        for(int m =0; m<3; m++){
            if(k==4)
                continue; // skip remaining code and rebegin
            k = k+2;
            System.out.println(k);
            // breaak end loop
        }
    }
}
