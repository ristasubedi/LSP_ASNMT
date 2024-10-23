package org.howard.edu.lsp.assignment5;
import java.util.List;
import java.util.ArrayList;

/**
 * @author Rista Subedi
 * **/
/** Class for implementation of set operation from ArrayList
 * 
 */

public class IntegerSet {
	// Store the set elements in an ArrayList
    private List<Integer> set = new ArrayList<>();
    /**
     * {@summary constructor of the class IntegerSet}
     * @return void 
    */
    public IntegerSet() {
    }
    /** 
     * {@summary Constructor if you want to pass in already initialized}
     * @param array object 
     */

    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }
    /**
     * {@summary Clears the internal representation of the set}
     * @return void 
     */

    public void clear() {
        set.clear();
    }
    
    /**
     * {@summary  Returns the length of the set}
     * @return length
     */
    
    public int length() {
        return set.size();
    }
    /**
     * {@summary Returns true if the 2 sets are equal, false otherwise;
        Two sets are equal if they contain all of the same values in ANY order. This overrides
        the equals method from the Object class.}
     * @param set2 IntegerSet 
     * @return Returns true if the 2 sets are equal, false otherwise;

     */
    
    public boolean equals(IntegerSet set2) {
        // check lengths first
        if (set.size() != set2.set.size()) {
            return false;
        }
        for (int ele : set) {
            if (!set2.contains(ele)) {
                return false;
            }
        }
        return true;
    };
    

    /**
     * {@summary method to check if set contain the given value or not}
     * @param integer value to be checked
     * @return boolean 
     */
    public boolean contains(int value) {
        return set.contains(value);
    };
    /**
     * {@summary method to return the largest value from the given set}
     * @return largest integer value
     * @throws IntegerSetException if the set is empty 
    */
    
    public int largest() throws IntegerSetException {
    	int max_element = (int) Float.NEGATIVE_INFINITY;
    	// edge case 
    	if (set.size() == 0) {
    		throw(new IntegerSetException("Set should not be empty"));
    	}
    	
    	for (int i=0;i < set.size();i++) {
    		if (set.get(i) > max_element) {
    			max_element = set.get(i);
    		};
    	}
    	return max_element;
    	
    };
    
    /**
     * {@summary method to return the smallest value from the given set}
     * @return smallest integer value
     * @throws IntegerSetException if the set is empty 
     */
    public int smallest() throws IntegerSetException {
    	int min_element = (int) Float.POSITIVE_INFINITY;
    	// edge case 
    	if (set.size()==0) {
    		throw(new IntegerSetException("Set should not be empty"));
    		
    	}
    	for (int i=0;i < set.size();i++) {
    		if (set.get(i)  < min_element) {
    			min_element = set.get(i);
    		};
    	}
    	return min_element;
    };
    
    /**
     * {@summary method to Adds an item to the set or does nothing it already there	}
     * @param item integer to be added in the set 
    */
  	public void add(int item) {
  		if (!set.contains(item)){
  			set.add(item);
  			
  		}
  		
  	}; 
  	
  	/**
  	 * {@summary method to remove an item from the set or does nothing if not there}
  	 * @param item integer 
  	 */
  	public void remove(int item) {
  		if (set.contains(item)) {
  			set.remove(Integer.valueOf(item));
  		}
  	}; 
   /**
    * {@summary method to find union from two sets}
    * @param intSetb IntegerSet 
    */
   public void union(IntegerSet intSetb) {
	   for (int i=0; i < intSetb.length();i++) {
		   if (!set.contains(intSetb.set.get(i))) {
			   set.add(intSetb.set.get(i));
			   
		   }
	   }
	   
   };
   
   /**
    * {@summary method to intersect, all elements in s1 and s2} 
    * @param intSetb IntegerSet to be intersect 
    */
   public void intersect(IntegerSet intSetb) {
	   set.retainAll(intSetb.set);
   }; 
   
   /**
     * {@summary method to find the Set difference, i.e., s1 –s2}
     * @param intSetb IntegerSet 
    */
   public void diff(IntegerSet intSetb) {
	   set.removeAll(intSetb.set);
   }; 
   /**
    * {@summary method to find Set complement, all elements not in s1}
    * @param intSetb IntegerSet 
    */
   public void complement(IntegerSet intSetb) {
	   // create new object 
	   IntegerSet integerSetObj = new IntegerSet();
	   integerSetObj.union(intSetb);
	   for (int i=0; i < this.set.size(); i++) {
		   integerSetObj.remove(this.set.get(i));
	   }
	   this.set = integerSetObj.set;
	   
	   
	}
   /**
    * {@summary method to check if the set is empty or not}
    * @return boolean true if the set is empty, false otherwise
    */
   boolean isEmpty() {
	   return set.isEmpty();
	     
   }; 
   /**
    * {@summary method to Return String representation of your set}
    * @return stringValue of the given set 
 }
    */
      public String toString() {
		return set.toString();
   };
   
};

