package Count;

import java.io.FileInputStream;
import java.io.IOException;

public class Process {
    public static void main(String[] args){

        FileInputStream input_file = null;
        try{
            input_file = new FileInputStream("NovelTexts.txt");
            System.out.println("Import file successful");

        }catch (IOException e){
            e.printStackTrace();
        }




        try{
            input_file.close();
            System.out.println("Close the file successful");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
