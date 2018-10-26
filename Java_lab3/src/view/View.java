package view;

import model.Animal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by User on 22.09.2018.
 */


public class View {
    Scanner scanner;

    public View(){
        scanner = new Scanner(System.in);
    }

    public int menu(){
            int m = 0;
            System.out.printf("Menu\n" +
                    "1. Add new Animal\n" +
                    "2. Animal list\n" +
                    "3. list by age\n" +
                    "4. list of cur order\n" +
                    "5. list of cur genus and age\n" +
                    "6. exit\n");
            m = scanner.nextInt();
            return m;
    }


    public String inputstring(){
        return scanner.nextLine();
    }
    public String inputstring(String mes){
        System.out.printf("%s", mes);
        String r = scanner.next();
        System.out.printf("\n");
        return r;
    }
    public int inputInt(){
        return scanner.nextInt();
    }
    public int inputInt(String mes){
        System.out.printf("%s", mes);
        int r = scanner.nextInt();
        System.out.printf("\n");
        return r;
    }

    public void printList(ArrayList<Animal> arrayList){
        if(arrayList.isEmpty()){
            System.out.printf("No elements founnd\n\n");
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).toString());
        }
    }



    public void printListFormat(ArrayList<Animal> animals){
        if(animals.size() == 0){
            System.out.printf("Matches not found\n");
            return;
        }
        System.out.printf("%s %15s %15s %15s %15s %15s %15s %15s \n", "phylum", "class", "order", "family",
                "genus", "speices", "age", "color");
        System.out.println("_________________________________________________" +
                "_______________________________________________________________________________");
        for (int i = 0; i < animals.size(); i++) {
            System.out.printf("%s %15s %15s %15s %15s %15s %15s %15s \n", animals.get(i).getClassyficator().getPhylum(),
                    animals.get(i).getClassyficator().getaClass(), animals.get(i).getClassyficator().getOrder(),
                    animals.get(i).getClassyficator().getOrder(),
                    animals.get(i).getClassyficator().getGenus(), animals.get(i).getClassyficator().getSpeices(),
                    animals.get(i).getAge(), animals.get(i).getColor());
        }
        System.out.printf("\n\n");
    }

}
