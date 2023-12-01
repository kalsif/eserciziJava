package org.example;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        PersonBuilder person1 = new PersonBuilder();
        person1.setFistName("Antonio");
        person1.setLastName("Troiano");

        Person p1 = person1.build();


        PersonBuilder person2 = new PersonBuilder();
        person2.setFistName("Mario");
        person2.setLastName("Rossi");
        person2.setAge(30);

        Person p2 = person2.build();

        System.out.println(p1);
        System.out.println(p2);
    }
}