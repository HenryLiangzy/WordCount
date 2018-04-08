package Count;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;

public class Process {
    public static void main(String[] args){

        File in = new File("NovelTexts.txt");
        FileInputStream input_file = null;
        try{
            input_file = new FileInputStream("NovelTexts.txt");
            System.out.println("Import file successful");

        }catch (IOException e){
            e.printStackTrace();
        }

        long length = in.length();
        System.out.println("The length of file is:" + length);



        try{
            input_file.close();
            System.out.println("Close the file successful");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
