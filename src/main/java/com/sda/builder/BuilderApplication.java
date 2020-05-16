package com.sda.builder;


import java.util.Arrays;

public class BuilderApplication {

    public static void main(String[] args) {

        UserWithLombok userWithLombok = UserWithLombok.builder()
                .age(25)
                .firstName("Jan")
                .lastName("Kowalski")
                .whatever("blabla")
                .names(Arrays.asList("Anna", "Karolina", "Mateusz"))
                .build();

        System.out.println(userWithLombok.toString());
    }

}
