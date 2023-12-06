package org.example;

public class PersonBuilder {
    private String fistName;
    private String lastName;
    private int age;
    private String address;
    private String email;

    public PersonBuilder(String fistName,String lastName){
        this.fistName = fistName;
        this.lastName = lastName;
    }

    public PersonBuilder setFistName(String fistName) {
        this.fistName = fistName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;

    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }


    public PersonBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Person build(){
        return new Person(fistName,lastName,age,address,email);
    }

}