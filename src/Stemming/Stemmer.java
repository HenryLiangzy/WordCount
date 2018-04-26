package Stemming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stemmer {
    public static String stemmingWord(String input_word){
        String output_word = null;

        Pattern pattern = Pattern.compile("([a-zA-Z]+)(ness|ing|ed|ly|s)+");
        Matcher matcher = pattern.matcher(input_word);

        if (matcher.find()){
            output_word = matcher.replaceAll(matcher.group(1));
        }



        return output_word;
    }

    public static void main(String[] args){
        String test = "fuckness";

        System.out.println(stemmingWord(test));
    }

}
