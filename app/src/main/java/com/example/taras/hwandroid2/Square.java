package com.example.taras.hwandroid2;

/**
 * Created by Taras on 26.11.2016.
 */

public class Square {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int square(){
        return side * side;
    }

    public int perimetr(){
        return side * 4;
    }

    public void setSide(int side) {
        if (side > 0)
            this.side = side;
    }

    public void print (){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "square" + square()+
                "perimetr" + perimetr()+
                '}';
    }
}
