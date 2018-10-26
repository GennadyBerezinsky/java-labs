package model;

/**
 * Created by User on 21.09.2018.
 */


public class Model {
    private TextAnalyzator textAnalyzator;

    public Model(){
        textAnalyzator = new TextAnalyzator();
    }

    public void initializeSeparator(String mes){
        textAnalyzator.separator(mes);
    }

    public int counter(){
        return textAnalyzator.summator();
    }

    public TextAnalyzator getTextAnalyzator(){
        return textAnalyzator;
    }
}
