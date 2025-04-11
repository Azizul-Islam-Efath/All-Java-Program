package com.mycompany.arraylist;

import java.util.*;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<String> cities1 = new ArrayList<>();
        cities1.add("Bangladesh");
        cities1.add("LONDON");
        cities1.add("Malaysia");
        cities1.add("New Work");
        cities1.add(0, "Maldiv");
        System.out.println("Cities 1 : ");
        System.out.println(cities1);

        ArrayList<String> cities2 = new ArrayList<>();
        cities2.add("America");
        cities2.add("Australia");
        cities2.add("Mianmar");
        cities2.add("New Delhi");
        cities2.add(0, "New york");
        System.out.println("Cities 2 : ");
        System.out.println(cities2);

        //adding two list
        System.out.println("\n\nAdded Both Cities: ");
        cities1.addAll(cities2);
        System.out.println(cities1);

        //seeing index value
        System.out.println("First index value from list 1: ");
        System.out.println(cities1.get(0));
        //setting value
        System.out.println(cities1.set(1, "Argentina"));
        System.out.println("Replacing value from list 1: ");
        System.out.println(cities1);

        //size
        System.out.println("Size before removing:");
        System.out.println(cities1.size());

        //removing element
        System.out.println(cities1.remove(1));
        System.out.println("Removing element from list 1: ");
        System.out.println(cities1);

        //size
        System.out.println("Size after removing:");
        System.out.println(cities1.size());

        //checking if its empty
        System.out.println("Checking if the list is empty:");
        System.out.println(cities1.isEmpty());

        //clearing list
        System.out.println("Clearing cities 2:");
        cities2.clear();
        System.out.println(cities2);
        System.out.println("Checking if the list 2 is empty:");
        System.out.println(cities2.isEmpty());

        //checking if it   contains
        System.out.println("Checking if it contains: ");
        System.out.println("America");
        System.out.println(cities1.contains("America"));

        //printing list individually
        System.out.println("Printing cities: ");
        for (int i = 0; i < cities1.size(); i++) {
            System.out.println("Index[" + i + "]" + "=" + cities1.get(i));
        }

        //compare array list
        System.out.println("Comparing list 1 and 2,if they are uqual:");
        System.out.println(cities1.equals(cities2));

        //ordering the list at asscending
        Collections.sort(cities1);
        System.out.println("Sorted list 1 in asscending order is:\n" + cities1);

        //descending
        System.out.println("\nSorted list 1 in disscending order is:");
        Collections.sort(cities1, Collections.reverseOrder());
        System.out.println(cities1);

       
    }
}
