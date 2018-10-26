package model;

/**
 * Created by User on 16.09.2018.
 */


public class Model {
    private ArrayMover arrayMover;

    public Model(){
        arrayMover = new ArrayMover(6, 6);
    }

    public void runner(int n){
        arrayMover.cyclicMove(n);
    }

    public byte[][] getArray(){
        return arrayMover.getArr();
    }







}
