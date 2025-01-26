package org.example;

import java.util.*;

public class App {
    public static void main(String[] args) {
        comparatorName CN = new comparatorName();
        comparatorAge CA = new comparatorAge();

        TreeSet<Person> peopleByName = new TreeSet<>(CN);
        TreeSet<Person> peopleByAge = new TreeSet<>(CA);

        Person person1 = new Person("Marius", 20);
        Person person2 = new Employed("Oana", 30, "Bachelor");
        Person person3 = new Person("Mircea", 40);
        Person person4 = new Unemployed("Ioana", 50, "High school");

        peopleByName.add(person1);
        peopleByName.add(person2);
        peopleByName.add(person3);
        peopleByName.add(person4);

        peopleByAge.add(person1);
        peopleByAge.add(person2);
        peopleByAge.add(person3);
        peopleByAge.add(person4);

        System.out.println("We will print all the persons by their names: \n");
        for (Person p : peopleByName) {
            ;
            System.out.println(p.getName() + " " + p.getAge());
        }


        System.out.println("We will print all the persons by their ages: \n");
        for (Person p : peopleByAge) {
            ;
            System.out.println(p.getAge() + " " + p.getName());
        }


        HashMap<Person, List<Hobby>> peopleHobbies = new HashMap<>();

        Country country1 = new Country("Romania");
        Country country2 = new Country("R. Moldova");

        Address address1 = new Address("Bucharest", country1);
        Address address2 = new Address("Chisinau", country2);

        Hobby hobby1 = new Hobby("Swimming", 3, address2);
        Hobby hobby2 = new Hobby("Dancing", 4, address1);

        peopleHobbies.put(person1, Arrays.asList(hobby1));
        peopleHobbies.put(person2, Arrays.asList(hobby2));
        peopleHobbies.put(person3, Arrays.asList(hobby2));
        peopleHobbies.put(person4, Arrays.asList(hobby1));


        System.out.println("Below you may check the name, hobbies and countries where they can be practiced : \n");
        for (Person m : peopleHobbies.keySet()) {
            System.out.println("Name of the person: " + m.getName());

//            List<Hobby> h = peopleHobbies.get(m);
//            for (Hobby h : hobbies) {
//                System.out.println("The hobby is " + m.getPersonsHobbies());
//            }

            List<Hobby> h = peopleHobbies.get(m);
            for (Hobby hobby : h) {
                System.out.println("Hobby of the person: " + hobby.getHobbyName());


                Address hobbyAddress = hobby.getHobbyAddresses();
                System.out.println("Country of the persons hobby: " + hobbyAddress.getCountryName().getCountryName());

            }
        }
    }
}

//nu prea am inteles de ce e nevoie de 2 .getCountryName() la ultimul print pentru adresa ca info sa arate ok.