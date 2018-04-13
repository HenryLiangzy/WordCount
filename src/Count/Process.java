package Count;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;

public class Process {
    public static void main(String[] args){

        File in = new File("test.txt");
        FileInputStream input_file = null;

        //read the file from the disk
        try{
            input_file = new FileInputStream(in);
            System.out.println("Import file successful");

        }catch (IOException e){
            e.printStackTrace();
        }

        long length = in.length();
        System.out.println("The length of file is:" + length);

        int times = 0;
        times = MatchWord.main(input_file);

        System.out.println("There is " + times + " times in this file\n");


        //end the operation of the file and close it safely
        try{
            input_file.close();
            System.out.println("Close the file successful");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
