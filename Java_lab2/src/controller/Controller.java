package controller;

import model.Model;
import view.View;

/**
 * Created by User on 21.09.2018.
 */


public class Controller {
    Model model;
    View view;

    public Controller(){
        model = new Model();
        view = new View();
    }

    public void runner(){
        String mes = view.inputText();

        model.initializeSeparator(mes);
        System.out.printf("%s\n", view.toString(model.getTextAnalyzator().getWords()));
        System.out.println(model.counter());
    }
}
