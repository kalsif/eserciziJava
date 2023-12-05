package org.example;

import static org.example.User.getUser;

public class Main {


    public static void main(String[] args) {

        User u1 = getUser();

        u1.stampaInfo();


        User u2 = getUser();
        u2.setNome("Mario");
        u2.setEta(30);


        u2.stampaInfo();
    }
}