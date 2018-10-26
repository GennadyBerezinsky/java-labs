package controller;

import model.Model;
import view.View;

import java.util.Scanner;

/**
 * Created by User on 16.09.2018.
 */

public class Controller {
    private Model model;
    private View view;

    public Controller(){
        model = new Model();
        view = new View();

    }

    public void runCotrol(){
        view.arrayPrint(model.getArray());
        int n = view.inputInt();
        model.runner(n);
        view.arrayPrint(model.getArray());
    }


}
