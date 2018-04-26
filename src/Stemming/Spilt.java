package Stemming;


import java.util.ArrayList;
import java.util.List;
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

    public static List devideWord(String input_string){

        List<String> wordList = new ArrayList<String>();

        Pattern pattern = Pattern.compile("\\b([a-zA-Z]+)\\b");
        Matcher matcher = pattern.matcher(input_string);

        while (matcher.find()){
            wordList.add(matcher.group(1));
        }

        return wordList;
    }

    public static void main(String[] args){

        List<String> Word;

        String test = "test, this is a 56$ test. Who? 56% and @mail.com (help) you&me";

        String output = Spilt.replaceSymbols(test);

        Word = Spilt.devideWord(output);

        for (int i = 0; i < Word.size(); i++){
            System.out.println(Word.get(i));
        }

        //System.out.println(output);
    }
}
