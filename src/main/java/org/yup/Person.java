package org.yup;

public class Person {

    String name = "";
    int age = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String sayHello(){
        return "Hi, my name is " + this.name + ".";
    }

    public String sayAge(){

        return "I am " + this.age + " years old.";
    }

    public String longGreeting(){

        return this.sayHello() + " " + this.sayAge();

    }

}
