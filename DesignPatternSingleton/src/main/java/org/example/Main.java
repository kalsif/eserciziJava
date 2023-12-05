package org.example;

public class Main {
    public static void main(String[] args) {

        User u1 = User.getUser();

        u1.stampaInfo();


        User u2 = User.getUser();
        u2.setNome("Mario");
        u2.setEta(30);


        u2.stampaInfo();
    }
}