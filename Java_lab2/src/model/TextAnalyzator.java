package model;

import java.util.ArrayList;

/**
 * Created by User on 21.09.2018.
 */


public class TextAnalyzator {
    private ArrayList<String> words;

    public TextAnalyzator(){
        words = new ArrayList<>();
    }

    public ArrayList<String> getWords(){
        return words;
    }

    public void separator(String text){
        text = text.trim();
        char[] textArray = text.toCharArray();
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            if(textArray[i] != ' '){
                word += textArray[i];
            }
            else {
                this.words.add(word);
                word = "";
            }
        }
        this.words.add(word);
    }

    private int tryParse(String s){
        int a = 0;
        try{
            a = Integer.parseInt(s);
        }catch (NumberFormatException nfe){

        }
        return a;
    }


    public int summator(){
        int n = 0;
        for (int i = 0; i < words.size(); i++) {
            n+=tryParse(words.get(i));
        }
        return n;
    }



}
