package com.mentor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tgaryga on 6/3/2019
 */
public class Zad1Lambda {

    private static List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
    private static Map<Integer, String> mapa = new HashMap<>();

    public static void main(String[] args) {
        prepareMap();

//  ****      Zad 1A. Przekształć tworzenie nowego wątku w wersję z użyciem lambdy
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Nowy watek");
            }
        });
        t.start();

        System.out.println("Glowny watek");


//  ****      Zad 1B. Wypisz wszystkie elementy listy numbers


//  ****      Zad 1C. Wypisz wszystkie pary klucz-wartość mapy


//  ****      Zad 1D. Przepisz powyzsze zadania z uzyciem Method Reference

    }

    private static void prepareMap() {
        mapa.put(1, "a");
        mapa.put(2, "b");
        mapa.put(3, "c");
    }
}
