package com.zipcodewilmington.person;

import java.security.PublicKey;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name = "";
    private int age = Integer.MAX_VALUE;
    private char gender;
    private float height = 0;
    private int weight = 0;

    // Default constructor
    public Person() {
    }

    public Person(String name1, int age1, char gen1, float het1, int wgt1)
    {
        this.name = name1;
        this.age = age1;
        this.gender = gen1;
        this.height = het1;
        this.weight = wgt1;
    }

    public Person(String name)
    {
        this.name = name;
    }

    public Person(int age, int weight)
    {
        this.age = age;
        this.weight = weight;
    }
    public Person(char gender)
    {
        this.gender = gender;
    }
    public Person(float height)
    {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

        public String getName()
    {
        return this.name;
    }

    public Integer getAge()
    {
        return this.age;
    }
    // Getter
    public float getHeight()
    {
        return this.height;
    }

    // Setter
    public void setHeight(float height)
    {
        this.height = height;
    }

    public char getGender()
    {
        return this.gender;
    }

    // Setter
    public void setGender(char gender)
    {
        this.gender = gender;
    }

    public int getWeight()
    {
        return this.weight;
    }

    // Setter
    public void setWeight(int weight)
    {
        this.weight = weight;
    }
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setHeight(160);
        System.out.println(person1.getHeight());

        Person person2 = new Person("Jay Guzzo", 12, 'M', 53.5f, 90);
        Person person3 = new Person("John Guzzo", 52, 'M', 70.2f, 170);
        System.out.println("Person 2's name is " + person2.getName() + " with age: " + person2.getAge());
        System.out.println("Person 3's name is " + person3.getName() + " with age: " + person3.getAge());

    }
}