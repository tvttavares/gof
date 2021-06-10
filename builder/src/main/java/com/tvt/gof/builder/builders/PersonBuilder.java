package com.tvt.gof.builder.builders;

import com.tvt.gof.builder.model.Person;

public class PersonBuilder {
    private String firstName;
    private String middleName;
    private String lastName;
    private String motherName;
    private String fatherName;
    private int height;
    private int weight;

    public PersonBuilder() {
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public Person build() {
        return new Person(this);
    }

    public Person build2() {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setMiddleName(middleName);
        person.setLastName(lastName);
        person.setMotherName(motherName);
        person.setFatherName(fatherName);
        person.setHeight(height);
        person.setWeight(weight);
        return person;
    }

    public PersonBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public PersonBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder withMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public PersonBuilder withFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public PersonBuilder withHeight(int height) {
        this.height = height;
        return this;
    }

    public PersonBuilder withWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }


}