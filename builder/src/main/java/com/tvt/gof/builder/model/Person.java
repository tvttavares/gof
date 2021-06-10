package com.tvt.gof.builder.model;

import com.tvt.gof.builder.builders.PersonBuilder;

public class Person {

    private String firstName;
    private String middleName;
    private String lastName;
    private String motherName;
    private String fatherName;
    private int height;
    private int weight;

    public Person() {
    }

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Person(PersonBuilder personBuilder) {
        this.firstName = personBuilder.getFirstName();
        this.middleName = personBuilder.getMiddleName();
        this.lastName = personBuilder.getLastName();
        this.motherName = personBuilder.getMotherName();
        this.fatherName = personBuilder.getFatherName();
        this.height = personBuilder.getHeight();
        this.weight = personBuilder.getWeight();
    }

    public Person(PersonBuilder2 personBuilder2) {
        this.firstName = personBuilder2.firstName;
        this.middleName = personBuilder2.middleName;
        this.lastName = personBuilder2.lastName;
        this.motherName = personBuilder2.motherName;
        this.fatherName = personBuilder2.fatherName;
        this.height = personBuilder2.height;
        this.weight = personBuilder2.weight;
    }

//    public Person(String firstName, String middleName, String lastName, String motherName, String fatherName) {
//        this.firstName = firstName;
//        this.middleName = middleName;
//        this.lastName = lastName;
//        this.motherName = motherName;
//        this.fatherName = fatherName;
//    }
//
//    public Person(String firstName, String middleName, String lastName, String motherName, String fatherName, int height, int weight) {
//        this.firstName = firstName;
//        this.middleName = middleName;
//        this.lastName = lastName;
//        this.motherName = motherName;
//        this.fatherName = fatherName;
//        this.height = height;
//        this.weight = weight;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public static class PersonBuilder2 {
        private String firstName;
        private String middleName;
        private String lastName;
        private String motherName;
        private String fatherName;
        private int height;
        private int weight;

        public PersonBuilder2(String firstName) {
            this.firstName = firstName;
        }

        public PersonBuilder2 withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder2 withMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder2 withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder2 withMotherName(String motherName) {
            this.motherName = motherName;
            return this;
        }

        public PersonBuilder2 withFatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public PersonBuilder2 withHeight(int height) {
            this.height = height;
            return this;
        }

        public PersonBuilder2 withWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Person build3() {
            return new Person(this);
        }
    }
}