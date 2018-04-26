package Stemming;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stemmer {

    public static String stemmingWord(String input_word){
        String output_word = input_word;

        Pattern pattern = Pattern.compile("([a-zA-Z]+)(ness|ing|ed|ly|s)+");
        Matcher matcher = pattern.matcher(input_word);

        if (matcher.find()){
            output_word = matcher.replaceAll(matcher.group(1));
        }


        return output_word;
    }

    public static void main(String[] args){

        List<String> testList = Spilt.main();


        for (int i = 0; i < testList.size(); i++){
            System.out.println(stemmingWord(testList.get(i)));
        }
    }

}
