package Stemming;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Process {

    public static void main(String[] args){

        Scanner input_keyboard = new Scanner(System.in);
        System.out.print("Input the novel path:");
        String file_path = input_keyboard.nextLine();

        //Create the file object
        File in = new File(file_path);
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

        BufferedReader bf_file = new BufferedReader(new InputStreamReader(input_file));

        List<item> wordList = new ArrayList<item>();
        String read_line = null;
        List<String> wordTemp = new ArrayList<String>();
        long costTime_start = System.currentTimeMillis();

        //main process step
        try{
            while ((read_line = bf_file.readLine()) != null){


                wordList = Search.searchWord(Spilt.replaceSymbols(read_line), wordList);

            }

            bf_file.close();
            input_file.close();

        }catch (IOException e){
            e.printStackTrace();
        }

        long costTime_end = System.currentTimeMillis();
        long total = costTime_end - costTime_start;
        System.out.println("Total cost: " + total + " ms");

        System.out.print("Input s to print the result on screen or f export the result file, or b both of them:");
        String decide = input_keyboard.nextLine();

        if (decide.equalsIgnoreCase("s")){
            Print.printScreen(wordList);
        }
        else if (decide.equalsIgnoreCase("f")){
            Print.printFile(wordList, total);
        }
        else if(decide.equalsIgnoreCase("b")){
            Print.printScreen(wordList);
            Print.printFile(wordList, total);
        }
        else {
            System.out.println("Invalid input");
        }

    }
}
