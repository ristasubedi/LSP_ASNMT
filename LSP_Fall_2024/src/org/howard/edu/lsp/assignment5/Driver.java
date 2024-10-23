package org.howard.edu.lsp.assignment5;

/**
 * {@summary class to test the program}
 * @author Rista Subedi
 */

public class Driver {
	/**
	 * {@summary method to test the behaviors of the IntegerSet methods}
	 * @param args
	 * @throws IntegerSetException
	 */

	public static void main(String[] args) throws IntegerSetException{
		    
			// new set set1
			IntegerSet set1 = new IntegerSet();
			
			// adding values to the set 
			set1.add(1);
			set1.add(2);
			set1.add(3);
			//printing values of set1 in string form
			System.out.println("Value of Set1 is: "+ set1.toString()); // [1,2,3]
			// check for smallest 
			try {
				System.out.println("Smallest value in Set1 is: " + set1.smallest());//1
			} catch (IntegerSetException e) {
				System.out.println(e);
			}
			// check for largest 
			try {
				System.out.println("largest value in Set1 is: " + set1.largest()); // 3
			} catch (IntegerSetException e) {
				System.out.println(e);
			}
			// check if the set is empty or not 
			System.out.println("check set1 : "+ set1.isEmpty()); // false 
			
			// add an element and check 
			set1.add(4);
			System.out.println("new Set1 after adding an item : "+ set1.toString()); // [1,2,3,4]
			// remove an element 
			set1.remove(4);
			System.out.println("removing an item from set : "+set1.toString()); // [1,2,3]
			System.out.println();
			// another set set2 
			IntegerSet set2 = new IntegerSet();
			// adding values to the set 
			set2.add(3);
			set2.add(4);
			set2.add(5);
			//printing values of set1 in string form
			System.out.println("Value of Set2 is: "+ set2.toString()); // [3,4,5]
			// check for smallest 
			try {
				System.out.println("Smallest value in Set2 is: " + set2.smallest());//3
			} catch (IntegerSetException e) {
				System.out.println(e);
			}
			// check for largest 
			try {
				System.out.println("largest value in Set2 is: " + set2.largest()); // 5
			} catch (IntegerSetException e) {
				System.out.println(e);
			}
			// check if the set is empty or not 
			System.out.println("Is set2 empty?  "+ set2.isEmpty()); // false 
			System.out.println();
			System.out.println("Value of Set1 is : " + set1.toString());
			System.out.println("Value of Set2 is : " + set2.toString());
			set1.union(set2); 
			System.out.println("Union of set1 and set 2 : " + set1.toString());// [1,2,3,4,5]
			System.out.println();
			System.out.println("Value of Set1 is : " + set1.toString());
			System.out.println("Value of Set2 is : " + set2.toString());
			set1.intersect(set2);
			System.out.println("Intersection of set1 and set2 : "+set1.toString());//[3,4,5]
			System.out.println();
			System.out.println("Value of Set1 is : " + set1.toString());
			System.out.println("Value of Set2 is : " + set2.toString());
			set1.diff(set2);
			System.out.println("Difference of Set1 and Set2:"+set1.toString()); //[]
			System.out.println("is set1 empty?"+ set1.isEmpty()); // true 
			// add new element in set1 
			System.out.println("adding 6 in set1");
			set1.add(6);
			System.out.println("Value of Set1 is : " + set1.toString());
			System.out.println("Value of Set2 is : " + set2.toString());
			set1.diff(set2);
			System.out.println("Difference of Set1 and Set2:"+set1.toString()); //[6]
			System.out.println();
			System.out.println("adding 3 and 4 in the updated set1");
			set1.add(3);
			set1.add(4);
			System.out.println("Value of Set1 is : " + set1.toString()); // [6,3,4]
			System.out.println("Value of Set2 is : " + set2.toString()); // [3,4,5]
			set1.complement(set2);
			System.out.println("Complement of Set1 and Set2:"+set1.toString()); //[5]
			System.out.println("is set1 empty?"+ set1.isEmpty()); // false
			System.out.println();
			System.out.println("check the length of the sets");
			System.out.println("Value of set1 is: " + set1.toString()); // [5]
			System.out.println("The length of set1 is: " + set1.length()); // [1]
			System.out.println("Value of set2 is: " + set2.toString()); // [3,4,5]
			System.out.println("The length of set2 is: " + set2.length()); // [3] 
			System.out.println();
			System.out.println("Check the clear method ");
			System.out.println("Value of set2 is: " + set2.toString()); // [3,4,5]
			set2.clear();
			System.out.println("Value of set2 after clear method " + set2.toString()); // []
			
			System.out.println();
			System.out.println("checking on empty set");
			System.out.println("Value of Set2 is: "+ set2.toString()); // []
			// check for smallest 
			try {
				System.out.println("Smallest value in Set2 is: " + set2.smallest());//3
			} catch (IntegerSetException e) {
				System.out.println(e);
			}
			// check for largest 
			try {
				System.out.println("largest value in Set2 is: " + set2.largest()); // 5
			} catch (IntegerSetException e) {
				System.out.println(e);
			}
			System.out.println("Is set empty? "+set2.isEmpty()); // true 
			set2.remove(5);
			System.out.println("removing an element from empty set "+set2.toString()); // doesnot do anything
			System.out.println("length of set2 is " + set2.length()); //0 
			set2.add(9);
			System.out.println("added 9 to set2 : "+set2.toString());
			set2.remove(11);
			System.out.println("removing non existing element(11):  " + set2.toString());
			
			// check for adding duplicate 
			System.out.println();
			System.out.println("Check if element can be added if already exits");
			System.out.println("Set2 before "+set2.toString());
			set2.add(9);
			System.out.println("set2 after adding 9 : "+set2.toString()); // [9]
			set2.add(9);
			System.out.println("trying to add 9 again : "+set2.toString()); // [9]
			
			System.out.println();
			System.out.println("equality check of two sets");
			set1.add(1);
			set1.add(6);
			set2.add(8);
			set2.add(0);
			System.out.println("Value of Set1 is: "+ set1.toString());
			System.out.println("Value of Set2 is: "+ set2.toString());
			System.out.println("Are sets equal ? "+ set1.equals(set2)); //false
			System.out.println("for same sets");
			set1.clear();
			set1.add(9);
			set1.add(0);
			set1.add(8);
			System.out.println("Value of Set1 is: "+ set1.toString());
			System.out.println("Value of Set2 is: "+ set2.toString());
			System.out.println("Are sets equal ? "+ set1.equals(set2)); // true 
			System.out.println("after clearing both sets");
			set1.clear();
			set2.clear();
			System.out.println("Value of Set1 is: "+ set1.toString());
			System.out.println("Value of Set2 is: "+ set2.toString());
			System.out.println("Are sets equal ? "+ set1.equals(set2)); // false
			
			
			

}

};
