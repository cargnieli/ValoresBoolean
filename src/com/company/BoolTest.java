package com.company;

public class BoolTest {

    public static void main(String[] args) {

        boolean b;

        b = false;
        System.out.println("b é: " + b);
        b = true;
        System.out.println("b é: " + b);

        if (b) System.out.println("Isto é executado ");

        b = false;
        if (b) System.out.println("Isto não é executado");

        System.out.println("10 > 9 é: " + (10 > 9));



    }
}
