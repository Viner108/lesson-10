package com.dmdev.lesson10;

public class Task1 {
    public static void main(String[] args) {
        String value = "asdvcsx :( dsnkcvjdushnzku :( jnskjcnkjn :) kdgbj :) :(";
        String result = replace(value);
        System.out.println(result);
    }

    public static String replace(String value) {
        return value.replace(":(", ":)");
    }
}
