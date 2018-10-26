package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by User on 22.09.2018.
 */


public class Model {
    private ArrayList<Animal> animalList;

    public Model(){
        animalList = new ArrayList<>();
    }

    public void fillFromFile(String path){
        try{
            File file = new File(path);
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNext()){
                animalList.add(new Animal(new Classyficator.Builder().setPhylum(fileScanner.next()).setaClass(fileScanner.next())
                        .setOrder(fileScanner.next()).setFamily(fileScanner.next()).setGenum(fileScanner.next())
                        .setSpeices(fileScanner.next()).build(), Integer.parseInt(fileScanner.next()), fileScanner.next()));
            }
        } catch (FileNotFoundException fnfe){
            System.err.println("File acsess error");
        }
    }

    public void add(Animal a){
        animalList.add(a);
    }

    public ArrayList<Animal> getAnimalList(){
        return animalList;
    }

    public ArrayList<Animal> checkAge(int age){
        ArrayList<Animal> higherAge = new ArrayList<>();
        for (int i = 0; i < animalList.size(); i++) {
            if(animalList.get(i).checkAge(age) != null){
                higherAge.add(animalList.get(i));
            }
        }
        return higherAge;
    }

    public ArrayList<Animal> getByOrder(String order){
        ArrayList<Animal> res = new ArrayList<>();
        for (int i = 0; i < animalList.size(); i++) {
            if(animalList.get(i).getCurOrder(order) != null){
                res.add(animalList.get(i));
            }
        }
        return res;
    }

    public ArrayList<Animal> getGenusColor(String genus, String color){
        ArrayList<Animal> res = new ArrayList<>();
        for (int i = 0; i < animalList.size(); i++) {
            if(animalList.get(i).getCurGenusAndColor(genus, color) != null){
                res.add(animalList.get(i));
            }
        }
        return res;
    }




}
