package org.example.ooptask;

public class Person implements Animal {

    private String name;
    private int age;


    //constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //mutator and accessor
    //getter and setter
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
       this.age = age;
    }

    public String getName(){
      return name;
    }

    public int getAge(){
        return age;
    }

    //@Override
    public void eat() {
        System.out.println("I will eat");
    }

    @Override
    public void sleep() {
        System.out.println("I will sleep");
    }
}
