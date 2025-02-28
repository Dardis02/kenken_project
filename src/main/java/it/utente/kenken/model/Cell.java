package main.java.it.utente.kenken.model;

import com.sun.jdi.Value;

public class Cell {
    private int row;
    private int col;
    private int value; // 0 equivale a vuoto

    public Cell (int row, int col){
        if (row < 0 || col < 0) {
            throw new IllegalArgumentException("Row and column must be non-negative");
        }
        this.row = row;
        this.col = col;
        this.value = 0; // inizialemnte vuota
    }

    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value){
        this.value=value;
    }
}