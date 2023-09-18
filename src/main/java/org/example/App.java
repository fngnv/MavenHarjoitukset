package org.example;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {

        Scanner lukija = new Scanner(System.in);
        System.out.println("c vai f?");

        String vastaus = lukija.nextLine();

        if(vastaus.equals("c")) {
            muunnaFtoC(10);
        } else {
            muunnaCtoF(10);
        }

    }

    public static double muunnaFtoC(double f) {
        double c = (f - 32) / 1.8;
        return c;
    }

    public static double muunnaCtoF(double c) {
        double f = c * 1.8 + 32;
        return f;
    }
}
