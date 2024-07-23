package java1;

public class j15array {
    public static void main(String[] args) {
        int [] marks = new int[5];
    //  declare and memory alloc
        marks[0] = 90;
        marks[0] = 60;
        marks[1] = 45;
        marks[3] = 67;
        marks[4] = 79;
    //  marks[5] = 89; - error - out of index specified
        System.out.println(marks[4]);
        int [] m = {4, 6, 5, 8};
        for(int i=0; i<m.length; i++){
            System.out.println("m at " + i + " => " + m[i]);
        }
        for(int i=m.length-1; i>=0; i--){
            System.out.println("m at " + i + " => " + m[i]);
        }
        // for each loop
        for(int each: m){
            System.out.println(each);
        }
    }
}
