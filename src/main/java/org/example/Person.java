package org.example;


public class Person {
    String firstName ;
    String lastName ;
    int age ;
    String eMail;
    String job ;
    String city ;



    public Person (String firstName , String lastName , int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age ;
    }

    public Person (String firstName , String lastName , int age ,String eMail , String job , String city ) {
        this(firstName ,lastName ,age);
        this.eMail = eMail;
        this.job = job ;
        this.city = city;
    }


    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }

    public boolean isTeen() {
        return this.age >= 13 && this.age<=19 ;
    }



}
