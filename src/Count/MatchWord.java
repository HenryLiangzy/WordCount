package Count;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchWord {



    //test for the regular expression
    public static int main(FileInputStream input_file){

        //Create the BufferedReader object
        BufferedReader bf_file = new BufferedReader(new InputStreamReader(input_file));

        //Construct the regular expression
        System.out.println("Input the match word:");
        Scanner keyboard_input = new Scanner(System.in);
        String input_phrase = keyboard_input.nextLine();

        Express expression = new Express();
        Pattern pattern = Pattern.compile(expression.editExpress(input_phrase));
        Matcher matcher = null;

        int times = 0;
        String read_line = null;

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

        return times;
    }
}
