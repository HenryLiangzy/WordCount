package Stemming;

import java.util.List;

public class Print {

    public static void printScreen(List<item> wordList){


        for (int i = 0; i < wordList.size(); i++){

            System.out.println(wordList.get(i).getWord() + "  " + wordList.get(i).getTimes());

        }

    }

    public static void printFile(List<item> wordList){

    }
}
