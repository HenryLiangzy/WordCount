package Count;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchWord {



    //test for the regular expression
    public static void main(FileInputStream input_file, String match_Word){

        //Create the BufferedReader object
        BufferedReader bf_file = new BufferedReader(new InputStreamReader(input_file));

        Express expression = new Express();
        Pattern pattern = Pattern.compile(expression.editExpress(match_Word));
        Matcher matcher = null;


        long costTime_start = System.currentTimeMillis();
        int times = 0;
        String read_line = null;

        //use double while loop to read all the line and count the word in each line
        try{
            while ((read_line = bf_file.readLine()) != null){
                matcher = pattern.matcher(read_line);
                while (matcher.find()){
                    times++;
                }
            }

            bf_file.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        //Output the result
        long costTime_end = System.currentTimeMillis();
        long total = costTime_end - costTime_start;
        System.out.println("\nThere is " + times + " times in this file");
        System.out.println("Word count totally cost "+ total + " ms");

    }
}
