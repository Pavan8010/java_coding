package com.company.HashMap;
import java.util.*;

public class HashMapOPeration {
    public static void main(String[] args) {

        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put("John", 25);
        map.put("Sarah", 32);
        map.put("David", 18);

        // Retrieving the value associated with a key
        int johnsAge = map.get("John");
        System.out.println("John's age is " + johnsAge);

        // Updating the value associated with a key
        map.put("Sarah", 33);

        // Removing an element from the HashMap
        map.remove("David");

        // Checking if a key exists in the HashMap
        boolean davidExists = map.containsKey("David");
        System.out.println("David exists in the map: " + davidExists);

        // Looping through the HashMap and printing its elements
        for (String name : map.keySet()) {
            int age = map.get(name);
            System.out.println(name + " is " + age + " years old");
        }


    }
}
