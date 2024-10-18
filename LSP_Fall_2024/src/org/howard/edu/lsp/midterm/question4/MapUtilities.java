package org.howard.edu.lsp.midterm.question4;


import java.util.HashMap;

/**
 * A utility class for performing operations on HashMaps.
 */

public class MapUtilities {

	 /**
     * Returns the number of key/value pairs that two HashMaps have in common.
     *
     * @param map1 The first HashMap.
     * @param map2 The second HashMap.
     * @return The number of key/value pairs that are common to both maps.
     */
	
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        // Return 0 if either map is empty
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int commonCount = 0;

        // Iterate over the entries of map1
        for (String key : map1.keySet()) {
            // Check if map2 contains the same key and value
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonCount++;
            }
        }

        return commonCount;
    }
    
}
