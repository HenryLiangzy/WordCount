package Stemming;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Spilt {

    public static String replaceSymbols(String input_sentence){
        String output_sentence = null;

        Pattern p = Pattern.compile("(,|\\.|!|@|\\\"|\\'|%|\\?|\\(|\\)|\\$|\\d|&|;)");
        Matcher m = p.matcher(input_sentence);

        output_sentence = m.replaceAll(" ");

        return output_sentence;
    }

    public static void main(String[] args){

        String test = "test, this is a 56$ test. Who? 56% and @mail.com (help) you&me";

        String output = Spilt.replaceSymbols(test);

        System.out.println(output);
    }
}
