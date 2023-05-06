package com.dmdev.lesson10;

import java.util.Locale;

public class Task3 {
    public static void main(String[] args) {
        String result = format("Ivan", "Petrov", "Sidorovoch");
        System.out.println(result);
    }

    public static String format(String firstName, String lastName, String patronymicName) {
//        char firstNamechar = firstName.toUpperCase().charAt(0);
//        char lastNamechar = lastName.toUpperCase().charAt(0);
//        char patronymicNamechar = patronymicName.toUpperCase().charAt(0);
        char firstNamechar = Character.toUpperCase(firstName.charAt(0));
        char lastNamechar = Character.toUpperCase(lastName.charAt(0));
        char patronymicNamechar = Character.toUpperCase(patronymicName.charAt(0));
//        return firstNamechar + "." + lastNamechar + "." + patronymicNamechar;
        return String.format("%s.%s.%s", firstNamechar,lastNamechar,patronymicNamechar);
    }
}
