package org.example;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        PersonBuilder person1 = new PersonBuilder("Antonio","Troiano");



        Person p1 = person1.build();


        PersonBuilder person2 = new PersonBuilder("Mario","Rossi");
        person2.setAge(30);
        person2.setAddress("Via Roma");
        person2.setEmail("ciaociao@gmail.com");

        Person p2 = person2.build();

        System.out.println(p1);
        System.out.println(p2);



    }
}