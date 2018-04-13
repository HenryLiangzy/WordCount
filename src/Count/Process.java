package Count;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class Process {
    public static void main(String[] args){

        //Read file
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input the file path:");
        String file_path = keyboard.nextLine();

        //Create the file object
        File in = new File(file_path);
        FileInputStream input_file = null;

        if (in.exists()){
            //read the file from the disk
            try{
                input_file = new FileInputStream(in);
                System.out.println("Import file successful");

            }catch (IOException e){
                e.printStackTrace();
            }

            //Calculate the file size
            long length = in.length();
            System.out.println("The length of file is:" + length);

            //Start to count the word
            MatchWord.main(input_file);


            //end the operation of the file and close it safely
            try{
                input_file.close();
                System.out.println("Close the file successful");
            }catch (IOException e){
                e.printStackTrace();
            }
            keyboard.close();
        }

        else {
            System.out.println("Cannot find the file, process exit");
        }
    }
}
