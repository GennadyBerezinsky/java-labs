package view;

import java.util.Scanner;

/**
 * Created by User on 16.09.2018.
 */

public class View {
    public void arrayPrint(byte[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public int inputInt(){
        int a = 0;
        System.out.printf("intput number of lines to shift: ");
        a = new Scanner(System.in).nextInt();
        if(a < 0){
            System.out.printf("Pease input integer more than 0\n");
            a = 0;
        }
        return a;
    }
}
