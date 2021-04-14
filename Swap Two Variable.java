package com.company;


public class Main {

    public static void main(String[] args){
        String x = "Orange";
        String y = "Apple";

        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println(x);
        System.out.println(y);

    }
}
