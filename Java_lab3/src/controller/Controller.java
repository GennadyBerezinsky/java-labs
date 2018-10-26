package controller;

import model.Animal;
import model.Classyficator;
import model.Model;
import view.View;

import java.util.Scanner;

/**
 * Created by User on 22.09.2018.
 */


public class Controller {
    private Model model;
    private View view;


    public Controller(){
        model = new Model();
        view = new View();
    }

    private void caseOneListener(){
        String phylum = view.inputstring("Input phylum: ");
        String aClass = view.inputstring("input class: ");
        String order = view.inputstring("Input order: ");
        String family = view.inputstring("Input family: ");
        String genus = view.inputstring("input genus: ");
        String speices = view.inputstring("Input speices: ");
        Classyficator c = new Classyficator.Builder().setPhylum(phylum).setaClass(aClass)
                .setOrder(order).setFamily(family).setGenum(genus)
                .setSpeices(speices).build();
        int age = view.inputInt("Input age: ");
        String color = view.inputstring("Input color: ");
        model.add(new Animal(c, age, color));
    }


    private void menuListener(int menu){
        switch (menu){
            case 1:
                caseOneListener();
                break;
            case 2:
                //view.printList(model.getAnimalList());
                view.printListFormat(model.getAnimalList());
                break;
            case 3:
                int age = view.inputInt("Input age: ");
                view.printListFormat(model.checkAge(age));
                break;
            case 4:
                String order = view.inputstring("Input order: ");
                view.printListFormat(model.getByOrder(order));
                break;
            case 5:
                String genus = view.inputstring("Input genus: ");
                String color = view.inputstring("Input color: ");
                view.printListFormat(model.getGenusColor(genus, color));
                break;
            case 6:
                System.exit(0);
                break;
        }
    }

    public void runner(){
        model.fillFromFile("src/animals.txt");
        int m;
        while (true){
            m = view.menu();
            menuListener(m);
        }
    }
}
