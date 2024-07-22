package java1;

import java.io.File;

public class j11logicalrelationaloperators {
    public static void main(String[] args) {
            System.out.println("For Logical AND...");
            boolean a = true;
            boolean b = false;
//        if (a && b){
//            System.out.println("Y");
//        }
//        else{
//            System.out.println("N");
//        }

            System.out.println("For Logical OR...");

//        if (a || b){
//            System.out.println("Y");
//        }
//        else{
//            System.out.println("N");
//        }

            System.out.println("For Logical NOT");
            System.out.print("Not(a) is ");
            System.out.println(!a);
            System.out.print("Not(b) is ");
            System.out.println(!b);

        }

    public static class j49filehandling {
        public static void main(String[] args) {
    //        create

    //        File myfile = new File("fileone.txt");
    //        try {
    //            myfile.createNewFile();
    //            System.out.println("created file");
    //        } catch (IOException e) {
    //            throw new RuntimeException("could not create file" + e);
    //        }

    //        write


    //        try{
    //            FileWriter fileWriter = new FileWriter("fileone.txt");
    //            fileWriter.write("hey welcome");
    //            fileWriter.close();
    //        }
    //        catch (Exception e){
    //            System.out.println("could not write");
    //        }

    //        read

    //        File myFile = new File("fileone.txt");
    //        try {
    //            Scanner sc = new Scanner(myFile);
    //            while(sc.hasNextLine()){
    //                String line = sc.nextLine();
    //                System.out.println(line);
    //            }
    //            sc.close();
    //        } catch (FileNotFoundException e) {
    //            e.printStackTrace();
    //        }

    //        delete

            File myFile = new File("fileone.txt");
            if(myFile.delete()){
                System.out.println("I have deleted: " + myFile.getName());
            }
            else{
                System.out.println("Some problem occurred while deleting the file");
            }
        }
    }
}