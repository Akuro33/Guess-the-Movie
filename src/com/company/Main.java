package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        RandomMovie movie = new RandomMovie();
        String gmovie = "nona";


       // System.out.println(gmovie); //Tester do Losowania
        gmovie = gmovie.toLowerCase();
        String hided = gmovie.replaceAll("[a-z]", "_");
        StringBuilder Hiden = new StringBuilder(hided);

       // System.out.println(Hiden);


        int wrong = 0;
        System.out.println("You are Guessing: "+ hided);
        System.out.println("You have guessed (" + wrong + ") wrong letters.");
        System.out.print("Guess a Letter: ");
        char letter = sc.next().charAt(0);

        while (!gmovie.equals(Hiden.toString())) {
            int lenght = hided.length();
            boolean check = true;
            letter = Character.toLowerCase(letter);


            for (int i = 0; i < lenght; i++) {
                int aletter = (int) letter;
                int aGmovie = (int) gmovie.charAt(i);


                if (aletter==aGmovie){
                    Hiden.setCharAt(i, letter);
                                       //System.out.println("You are Guessing: "+ Hiden);  // Tester
                    check = false;
                }


            }
            if (check) {
                wrong++;
            }
            if (!gmovie.equals(Hiden.toString())){
                System.out.println("You are Guessing: "+ Hiden);
                System.out.println("You have guessed (" + wrong + ") wrong letters.");
                System.out.print("Guess a Letter: ");
                letter = sc.next().charAt(0);
            }


            if (wrong == 10) {
                System.out.println("Niestety nie udało ci się zgadnąć tytułu filmu.");
                break;
            }

        }

        if (gmovie.equals(Hiden.toString())){
            System.out.println("Wygrałeś! Ten tytuł to rzeczywiście: "+gmovie);
        }





        }
    }


