package Count;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Match {



    //test for the regular expression
    public static int main(FileInputStream input_file){
        int times = 0;

        System.out.println("Input the match word:");
        Scanner keyboard_input = new Scanner(System.in);
        String input_phrase = keyboard_input.nextLine();


        Express expression = new Express();
        Pattern pattern = Pattern.compile(expression.editExpress(input_phrase));
        //Match match = pattern.matcher()



        return times;
    }
}
