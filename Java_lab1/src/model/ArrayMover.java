package model;
/*
 *   Created by Gennady
 *   on 21.09.2018
 */

public class ArrayMover {
    private byte[][] arr;

    public byte[][] getArr() {
        return arr;
    }

    public ArrayMover(int n, int m){
        arr = new byte[n][m];
        generate();
    }

    private void generate(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (byte)((Math.random()*100)-50);
            }
        }
    }

    private int colunms(){
        return arr[0].length;
    }

    private int rows(){
        return arr.length;
    }

    private int newIndex(int old, int n, int len){
        return ( old < n ) ? len - (n - old) : old - n;
    }

    private void copy(byte[] arr, byte[] val){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = val[i];
        }
    }

    private int cyclicN(int n, int len){
        return n % len;
    }



    public void cyclicMove(int n){
        int cyclicN = cyclicN(n, rows());
        byte[][] res = new byte[rows()][colunms()];

        for (int i = 0; i < rows(); i++) {
            copy(res[newIndex(i, cyclicN, rows())], arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = res[i][j];
            }
        }

    }

}
