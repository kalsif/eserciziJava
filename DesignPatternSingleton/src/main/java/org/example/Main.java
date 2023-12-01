package org.example;

public class Main {

    private static User user;

    public static User getUser(){
        if(user == null){
           user = new User();
        }

        return user;
    }

    public static void main(String[] args) {

        User u1 = getUser();

        u1.stampaInfo();


        User u2 = getUser();
        u2.setNome("Mario");
        u2.setEta(30);


        u2.stampaInfo();


    }
}