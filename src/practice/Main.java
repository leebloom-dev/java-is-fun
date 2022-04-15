package practice;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // First create a HashMap object
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add key/values (Country, City)
        capitalCities.put("Seoul", "South Korea");
        capitalCities.put("Tokyo", "Japan");
        capitalCities.put("Washington D.C.", "United States of America");

        // Print all HashMap key/value pairs
        System.out.println(capitalCities);

        // Access the value using a key
        System.out.println("Japan Capital: " + capitalCities.get("Tokyo"));

        // Remove an item
        capitalCities.remove("Washington D.C.");
        System.out.println(capitalCities);

        // Clear all items in a HashMap
        capitalCities.clear();
        System.out.println(capitalCities);

    }

}