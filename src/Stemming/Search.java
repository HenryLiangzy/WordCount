package Stemming;


import java.util.ArrayList;
import java.util.List;

public class Search {

    //input the file string and the dictionary string get list back
    public static List searchWord(List<String> wordList, List<item> wholeList) {
        boolean isExist = false;

        //process all the input word list
        for (int i = 0; i < wordList.size(); i++){

            //Stemming the word
            String temp_string = Stemmer.stemmingWord(wordList.get(i));

            //check if there same word exist
            for (int j = 0; j < wholeList.size(); j++){


                if (wholeList.get(j).getWord().compareToIgnoreCase(temp_string) == 0){
                    isExist = true;
                    wholeList.get(j).addTimes();
                    break;
                }


            }

            if (isExist == false){
                item add_word = new item(temp_string, 1);
                wholeList.add(add_word);
            }

        }

        return wholeList;
    }
}
