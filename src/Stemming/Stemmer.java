package Stemming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stemmer {
    public String stemmingWord(String input_word){
        String output_word = null;

        Pattern pattern = Pattern.compile("\\b(s|ing|ness|ed|ly)*\\b");
        Matcher matcher = pattern.matcher(input_word);

        return output_word;
    }
}
