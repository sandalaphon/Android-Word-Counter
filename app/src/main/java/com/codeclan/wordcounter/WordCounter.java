package com.codeclan.wordcounter;



public class WordCounter {
    private String inputedText;

    public WordCounter(String inputedText){
        this.inputedText = new String(inputedText);
    }

    public int countWords(){
        if(inputedText==null||inputedText.isEmpty()){
            return 0;
        }
        String[] words = inputedText.split("\\s+");
        return words.length;
    }


}
