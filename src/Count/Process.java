package Count;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class Process {
    public static void main(String[] args){

        //Create the file object
        File in = new File("test.txt");
        FileInputStream input_file = null;

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

        //Construct the regular expression
        System.out.print("Input the match word:");
        Scanner keyboard_input = new Scanner(System.in);
        String input_phrase = keyboard_input.nextLine();

        //Start to count the word
        MatchWord.main(input_file, input_phrase);


        //end the operation of the file and close it safely
        try{
            input_file.close();
            System.out.println("Close the file successful");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
