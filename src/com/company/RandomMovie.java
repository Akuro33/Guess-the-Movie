package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RandomMovie {
    public String RandomMovies() throws FileNotFoundException {
        File file = new File("Movies.txt");
        Scanner scanner = new Scanner(file);
        //Losowy Film z Listy, jako iż nie
        int random = (int) (Math.random() * 20);
        String gmovie = "nona";
        //System.out.println(random);
        for (int i = 0; i <= random; i++) {
            String movies = scanner.nextLine();
            if (i == random) {
                gmovie = movies;
                break;
            }
        }
        return gmovie;
    }
}