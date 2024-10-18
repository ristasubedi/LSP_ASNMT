package org.howard.edu.lsp.midterm.question4;


import java.util.HashMap;

/**
 * Driver class to test the functionality of the MapUtilities class.
 */

public class MapUtilitiesDriver {
	
	public static void main(String[] args) {
        // Create and populate the first HashMap
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Mary", "Ecstatic");
        map1.put("Bob", "Happy");
        map1.put("Felix", "Fine");

        // Create and populate the second HashMap
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("Mary", "Ecstatic");
        map2.put("Bob", "Happy");
        map2.put("Felix", "Tired");
        map2.put("Tom", "Fine");

        // Calculate the number of common key/value pairs
        int commonPairs = MapUtilities.commonKeyValuePairs(map1, map2);

        // Output the result
        System.out.println("Number of common key/value pairs is: " + commonPairs);
    }
	

}
