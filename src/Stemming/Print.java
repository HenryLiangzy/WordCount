package Stemming;

import java.io.*;
import java.util.Calendar;
import java.util.List;

public class Print {

    public static void printScreen(List<item> wordList){


        for (int i = 0; i < wordList.size(); i++){

            System.out.println(wordList.get(i).getWord() + "  " + wordList.get(i).getTimes());

        }

    }

    public static void printFile(List<item> wordList, long totalCost){

        Calendar current_time = Calendar.getInstance();

        int hour = current_time.get(Calendar.HOUR_OF_DAY);
        int minute = current_time.get(Calendar.MINUTE);
        int second = current_time.get(Calendar.SECOND);

        String time_string = Integer.toString(hour) + "_" + Integer.toString(minute) + "_" + Integer.toString(second);

        try{
            File out = new File("WordCount_" + time_string + ".txt");
            OutputStream output_file = new FileOutputStream(out);
            OutputStreamWriter output_line = new OutputStreamWriter(output_file, "UTF-8");

            for (int i = 0; i < wordList.size(); i++){
                output_line.write(wordList.get(i).getWord() + " " + wordList.get(i).getTimes() + "\n");
            }

            output_line.write("Total cost " + totalCost + " ms to WordCount\n");

            output_line.close();
            output_file.close();

        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("Export the result file successful");
    }
}
