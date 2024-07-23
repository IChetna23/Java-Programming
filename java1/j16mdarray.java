package java1;

public class j16mdarray {
    public static void main(String[] args) {
        int [][]flats = new int[2][3];
        flats[0][0] = 9;
        flats[0][1] = 9;
        flats[0][2] = 9;
        flats[1][0] = 9;
        flats[1][1] = 9;
        flats[1][2] = 9;
        for(int i = 0; i < flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
                System.out.println(flats[i][j]);
            }
        }
    }

}
