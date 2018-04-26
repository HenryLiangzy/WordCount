package Stemming;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Spilt {

    public static List replaceSymbols(String input_sentence){
        String output_sentence = null;

        Pattern p = Pattern.compile("(,|\\.|!|@|\\\"|\\'|%|\\?|\\(|\\)|\\$|\\d|&|;)");
        Matcher m = p.matcher(input_sentence);

        output_sentence = m.replaceAll(" ");

        List<String> wordList = new ArrayList<String>();

        Pattern pattern = Pattern.compile("\\b([a-zA-Z]+)\\b");
        Matcher matcher = pattern.matcher(output_sentence);

        while (matcher.find()){
            wordList.add(matcher.group(1));
        }

        return wordList;
    }


    public static List main(){

        List<String> Word;

        String test = "test, this is a 56$ test. Who? 56% and @mail.com (help) you&me\n" +
                "Hello World\n" +
                "This is the test\n" +
                "a test for cloud computing course\n" +
                "cat cat cat\n" +
                "cat cat\n" +
                "act cats";


        Word = Spilt.replaceSymbols(test);

        for (int i = 0; i < Word.size(); i++){
            System.out.println(Word.get(i));
        }

        //System.out.println(output);
        return Word;
    }
}
