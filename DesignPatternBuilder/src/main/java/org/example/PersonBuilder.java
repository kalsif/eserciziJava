package org.example;

public class PersonBuilder {
    private String fistName;
    private String lastName;
    private int age;
    private String address;

    public PersonBuilder(){
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

    public Person build(){
        return new Person(fistName,lastName,age,address,null);
    }

}