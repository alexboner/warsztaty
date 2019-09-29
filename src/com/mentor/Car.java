package com.mentor;

/**
 * Created by tgaryga on 6/3/2019
 */
public class Car {

    private String name;

    private int year;

    private int distance;

    public Car(String name, int year, int distance) {
        this.name = name;
        this.year = year;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
