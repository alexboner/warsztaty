package com.mentor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by tgaryga on 6/3/2019
 */
public class Zad3MoreStreams {

    private static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9);

    private static List<Car> cars = new ArrayList<>();


    public static void main(String[] args) {

//        **** Zad3.1.A Napisz pętle, która wyświetli wszystkie parzyste elementy listy numbers


//        **** Zad3.1.B Zrób to samo poprzez stream

//        **** Zad3.2.A Napisz pętle, do wyświetlania podwojonych wartości z listy numbers

//        **** Zad3.2.B Zrób to samo poprzez stream


//        **** Zad3.3.A Napisz kod, który sumuje podwojone parzyste elementy listy numbers

//        **** Zad3.3.B Zrób to z użyciem funkcji reduce


//        **** Zad3.3.C Zrób to z użyciem funkcji sum

//        **** Zad3.4.A Zapisz podwojone wartości parzystych elementow listy numbers w osobnej liście


//        **** Zad3.5 Zgrupować elementy listy cars w mapę, gdzie kluczem jest połączona nazwa samochodu z rokiem
//        produkcji, a wartością jest obiekt samochodu.
        prepareCars();

//        **** Zad3.6.A Zgrupować elementy listy cars mapę, gdzie kluczem jest nazwa samochodu (marka), a wartością jest
//        lista wszystkich samochodów o tej nazwie


//        **** Zad3.6.B Zrób to co wyżej, ale wartością nich będzie lista przebiegów

    }

    private static void prepareCars() {
        cars.add(new Car("Mazda", 2016, 50000));
        cars.add(new Car("BMW", 2006, 250000));
        cars.add(new Car("BMW", 2016, 55000));
        cars.add(new Car("Audi", 2011, 65000));
        cars.add(new Car("Mazda", 2012, 90000));
        cars.add(new Car("BMW", 2018, 25000));
        cars.add(new Car("Opel", 2015, 60000));
    }
}
