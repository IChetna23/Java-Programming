package java1.j48;

import java.io.*;
import java.util.Scanner;

public class filehandling {
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
