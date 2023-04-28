package org.yup;

import org.yup.Person;
public class TheApp {

    public static void main (String[] args) {

        Person marvin = new Person("Marvin", 24);
        Person rial = new Person("Rial", 75);

        System.out.println(marvin.sayHello());
        System.out.println(marvin.sayAge());
        System.out.println(rial.sayHello());
        System.out.println(rial.sayAge());
        System.out.println(rial.longGreeting());
        System.out.println(marvin.longGreeting());
    }

}
