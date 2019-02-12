package com.kozitski.epam;

import com.kozitski.epam.domain.Person;

public class MainTest {

    public static void main(String[] args) {

        System.out.println(new Person().builder().name("Andrei").age(18).lastName("Kozitski").build());

    }

}
