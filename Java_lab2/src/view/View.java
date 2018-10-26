package view;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by User on 21.09.2018.
 */


public class View {

    public String inputText(){
        System.out.printf("Please, input text:\n");
        return new Scanner(System.in).nextLine();
    }


    public String toString(ArrayList<String> arrayList){
        return arrayList.toString();
    }

    public void outMes(String mes){
        System.out.printf("%s", mes);
    }
}
