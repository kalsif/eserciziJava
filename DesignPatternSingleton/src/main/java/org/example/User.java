package org.example;


public class User {
    private static User user;

    public static User getUser(){
        if(user == null){
            user = new User();
        }

        return user;
    }

    private String nome;
    private int eta;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void stampaInfo(){
        System.out.println("Nome : " + nome + " , Età : " + eta);
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }
}
