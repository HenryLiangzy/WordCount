package Stemming;

public class item {
    private String word;
    private int times;

    public item(String word, int times){
        this.word = word;
        this.times = times;
    }

    public int getTimes(){
        return times;
    }

    public String getWord(){
        return word;
    }

    public void setWord(String word){
        this.word = word;
    }

    public void addTimes(){
        this.times = this.times + 1;
    }

    public void delTimes(){
        this.times--;
    }


}
