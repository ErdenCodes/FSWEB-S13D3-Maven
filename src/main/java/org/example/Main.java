package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20, "john.doe@example.com", "Developer", "New York");
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());


        Wall wall = new Wall(5.0, 3.0);


        System.out.println("Duvarın Genişliği: " + wall.getWidth());
        System.out.println("Duvarın Yüksekliği: " + wall.getHeight());


        double area = wall.getWidth() * wall.getHeight();
        System.out.println("Duvarın Yüzey Alanı: " + area);
    }
}