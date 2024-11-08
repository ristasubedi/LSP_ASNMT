package org.howard.edu.lsp.assignment6;
import org.howard.edu.lsp.assignment5.IntegerSetException;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


/**
 * @author Rista Subedi
 */
/**
 * Class for the implementation of the unit testing of IntegerSet Methods
 */
public class IntegerSetTest {
	// declaring four variables 
	IntegerSet set1;
	IntegerSet set2;
	IntegerSet set3;
	IntegerSet set4;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("===Set Up===");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("=== TearDown Class===");
	}
	/**
	 * {@summary method to set up for the variables}
	 * @throws Exception
	 * @return void
	 */
	@Before
	public void setUp() throws Exception {
		set1 = new IntegerSet();
		set2 = new IntegerSet();
		set3 = new IntegerSet();
		set4 = new IntegerSet();
	}
	/**
	 * 
	 * @throws Exception
	 */

	@After
	public void tearDown() throws Exception {
	}
	/**
	 * {@summary test case to check the clear method from IntegerSet}
	 */

	@Test
	@DisplayName("Test Cases For Clear Method")
	public void testClear() {
		set1.add(99);
		set1.add(100);
		set1.add(101);
		set1.clear();
		
		set2.add(102);
		set2.add(103);
		set2.add(104);
		set2.clear();
		
		set3.add(4);
		set3.clear();
		set3.add(0);
		
		// after calling clear method set should be empty check for that 
		assertTrue("set should be empty",set1.isEmpty());
		assertTrue("set should be empty",set2.isEmpty());
		
		// checking for set after adding element 
		assertTrue("Set should not be empty",set2.isEmpty());
		
	}
	/**
	 * {@summary test case to check the Length method from IntegerSet}
	 */
	
	@Test
	@DisplayName("Test Cases For Length Method")
	public void testLength() {
		set1.add(99);
		set1.add(100);
		set1.add(101);
		
		set2.add(102);
		set2.add(103);
		set2.add(104);
		set2.add(109);
		set2.add(110);
		
		set3.add(4);
		set3.add(1);
		set3.add(0);
		
		set4.add(105);
		set4.add(106);
		set4.add(109);
		set4.add(67);
		// after calling clear method set should be empty check for that 
		assertEquals("Length {99,100,101} should be 3",set1.length(),3);
		assertEquals("Length {102,103,104,109,110} should be 5",set2.length(),5);
		
		set4.clear();
		assertEquals("Length {} should be 0",set4.length(),0);
		
		assertNotEquals("Length {102,103,104,109,110} should be 5",set3.length(),8);
		// checking for set after adding element 
		
	}
	/**
	 * {@summary test case to check the Equals method from IntegerSet}
	 */
	@Test
	@DisplayName("Test Cases For Length Method")
	public void testEquals() {
		set1.add(99);
		set1.add(100);
		set1.add(101);
		
		set2.add(102);
		set2.add(103);
		set2.add(104);
		set2.add(109);
		set2.add(110);
		
		set3.add(4);
		set3.add(1);
		set3.add(0);
		
		set4.add(4);
		set4.add(1);
		set4.add(0);
		// check for equal sets
		assertEquals("{4,1,0}=={4,1,0}",set3.equals(set4),true);
		assertEquals("{99,100,101} != {102,103,104,109,110}",set1.equals(set2),false);

		// for empty set 
		set3.clear();
		assertEquals("{}=={4,1,0}",set3.equals(set4),false);
		
		set4.clear();
		assertEquals("{}=={}",set3.equals(set4),true);
	}
	
	/**
	 * {@summary test case to check the Contains method from IntegerSet}
	 */
	@Test
	@DisplayName("Test Cases For Contains Method")
	public void testContains() {
		set1.add(99);
		set1.add(100);
		set1.add(101);
		
		set2.add(102);
		set2.add(103);
		set2.add(104);
		set2.add(109);
		set2.add(110);
		
		set3.add(4);
		set3.add(1);
		set3.add(0);
		
		set4.add(4);
		set4.add(1);
		set4.add(0);
		// check for int to be in set
		assertEquals(" 99 is in {99,100,101}",set1.contains(99),true);
		assertEquals("110 is in {102,103,104,109,110}",set2.contains(110),true);
		assertEquals(set3.contains(0),true);

		// for not containig 
		assertEquals(set3.contains(100),false);
		assertEquals(set1.contains(2),false);
		assertEquals(set2.contains(10),false);
		
	}
	/**
	 * {@summary test case to check the Largest method from IntegerSet}
	 * @throw IntegerSetException
	 */
	@Test
	@DisplayName("Test Cases For Largest Method")
	public void testlargest() throws IntegerSetException {
		set1.add(99);
		set1.add(100);
		set1.add(101);
		
		set2.add(102);
		set2.add(103);
		set2.add(104);
		set2.add(109);
		set2.add(110);
		
		set3.add(4);
		set3.add(1);
		set3.add(0);
		
		// check for largest element 
		assertEquals(set1.largest(),101);
		assertEquals(set2.largest(),110);
		assertEquals(set3.largest(),4);
		
		// for empty set 
		Exception exception = assertThrows(IntegerSetException.class, () ->
        set4.largest());
		assertEquals("Set should not be empty",exception.getMessage());
}
		
	
	/**
	 * {@summary test case to check the Smallest method from IntegerSet}
	 */
	@Test
	@DisplayName("Test Cases For Smallest Method")
	public void testSmallest() throws IntegerSetException {
		set1.add(99);
		set1.add(100);
		set1.add(101);
		
		set2.add(102);
		set2.add(103);
		set2.add(104);
		set2.add(109);
		set2.add(110);
		
		set3.add(4);
		set3.add(1);
		set3.add(-99);
		
		// check for smallest element 
		assertEquals(set1.smallest(),99);
		assertEquals(set2.smallest(),102);
		assertEquals(set3.smallest(),-99);
		
		// for empty set 
		Exception exception = assertThrows(IntegerSetException.class, () ->
        set4.smallest());
		assertEquals("Set should not be empty",exception.getMessage());
}
	
	/**
	 * {@summary test case to check the Add method from IntegerSet}
	 */
	@Test
	@DisplayName("Test Cases For Add Method")
	public void testAdd() {
		set1.add(99);
		set1.add(100);
		set1.add(101);
		
		set2.add(102);
		set2.add(103);
		set2.add(104);
		
		set3.add(4);
		set3.add(1);
		set3.add(0);
		
		assertEquals(set1.contains(101),true);
		assertEquals(set2.contains(101),false);
		assertEquals(set3.contains(0),true);
		
		// after adding again 
		set1.add(1);
		assertEquals(set1.contains(1),true);
		
		set2.add(7);
		assertEquals(set2.contains(7),true);
		
	}
		
	
	/**
	 * {@summary test case to check the Remove method from IntegerSet}
	 */
	@Test
	@DisplayName("Test Cases For Remove Method")
	public void testRemove() {
		set1.add(99);
		set1.add(100);
		set1.add(101);
		
		set2.add(102);
		set2.add(103);
		set2.add(104);
		
		set3.add(4);
		set3.add(1);
		set3.add(0);
		
		assertEquals(set1.contains(101),true);
		assertEquals(set2.contains(101),false);
		assertEquals(set3.contains(0),true);
		
		// after removing again 
		set1.remove(101);
		set2.remove(102);
		set3.remove(0);
		assertEquals(set1.contains(101),false);
		assertEquals(set2.contains(102),false);
		assertEquals(set3.contains(0),false);
	}
	
	
	/**
	 * {@summary test case to check the ToString method from IntegerSet}
	 */
	@Test
	@DisplayName("Test Cases For ToString Method")
	public void testToString() {
		set1.add(99);
		set1.add(100);
		set1.add(101);
		
		set2.add(102);
		set2.add(103);
		set2.add(104);
		set2.add(109);
		set2.add(110);
		
		set3.add(4);
		set3.add(1);
		set3.add(0);
		
		set4.add(3);
		set4.add(1);
		set4.add(4);
		
		// set to string 
		assertEquals(set1.toString(),"[99, 100, 101]");
		assertEquals(set2.toString(),"[102, 103, 104, 109, 110]");
		assertEquals(set3.toString(),"[4, 1, 0]");
		assertEquals(set4.toString(),"[3, 1, 4]");
	}
	
	/**
	 * {@summary test case to check the Union method from IntegerSet}
	 */
	@Test
	@DisplayName("Test Cases For Union Method")
	public void testUnion() {
		set1.add(99);
		set1.add(100);
		set1.add(101);
		
		set2.add(102);
		set2.add(103);
		set2.add(104);
		set2.add(101);
		
		set3.add(9);
		
		set4.add(0);
		set4.add(1);
		
		set1.union(set2);
		set2.union(set3);
		set3.union(set4);
		
		// union 
		assertEquals(set1.toString(),"[99, 100, 101, 102, 103, 104]");
		assertEquals(set2.toString(),"[102, 103, 104, 101, 9]");
		assertEquals(set3.toString(),"[9, 0, 1]");

	}
	
	/**
	 * {@summary test case to check the InterSect method from IntegerSet}
	 */
	@Test
	@DisplayName("Test Cases For InterSect Method")
	public void testIntersect() {
		set1.add(99);
		set1.add(100);
		set1.add(101);
		
		set2.add(102);
		set2.add(103);
		set2.add(104);
		set2.add(101);
		
		set3.add(9);
		set3.add(1);
		
		set4.add(0);
		set4.add(1);
		set4.add(9);
		
		set1.intersect(set2);
		set2.intersect(set3);
		set3.intersect(set4);
		
		// union 
		assertEquals(set1.toString(),"[101]");
		assertEquals(set2.toString(),"[]");
		assertEquals(set3.toString(),"[9, 1]");
		assertNotEquals(set3.toString(),"[9, 0, 1]");
	}
	
	/**
	 * {@summary test case to check the Diff method from IntegerSet}
	 */
	@Test
	@DisplayName("Test Cases For Diff Method")
	public void testDiff() {
		set1.add(99);
		set1.add(100);
		set1.add(101);
		
		set2.add(102);
		set2.add(103);
		set2.add(104);
		set2.add(101);
		
		set3.add(9);
		set3.add(1);
		
		set4.add(0);
		set4.add(1);
		set4.add(9);
		
		set1.diff(set2);
		set2.diff(set3);
		set3.diff(set4);
		
		// union 
		assertEquals(set1.toString(),"[99, 100]");
		assertEquals(set2.toString(),"[102, 103, 104, 101]");
		assertEquals(set3.toString(),"[]");
		assertNotEquals(set3.toString(),"[9, 0, 1]");
	}
	
	/**
	 * {@summary test case to check the Complement method from IntegerSet}
	 */
	@Test
	@DisplayName("Test Cases For Complement Method")
	public void testComplement() {
		set1.add(99);
		set1.add(100);
		set1.add(101);
		
		set2.add(102);
		set2.add(103);
		set2.add(104);
		set2.add(101);
		
		set3.add(9);
		set3.add(1);
		
		set4.add(0);
		set4.add(1);
		set4.add(9);
		
		set1.complement(set2);
		set2.complement(set3);
		set3.complement(set4);
		
		// union 
		assertEquals(set1.toString(),"[102, 103, 104]");
		assertEquals(set2.toString(),"[9, 1]");
		assertEquals(set3.toString(),"[0]");
		assertNotEquals(set3.toString(),"[9, 0, 1]");
	}
	
	/**
	 * {@summary test case to check the IsEmpty method from IntegerSet}
	 */
	@Test
	@DisplayName("Test Cases For isempty Method")
	public void testIsEmpty() {
		set1.add(99);
		set1.add(100);
		set1.add(101);
		
		set2.add(102);
		set2.add(103);
		set2.add(104);
		set2.add(109);
		set2.add(110);
		
		// testing if set is empty or not 
		assertEquals(set1.isEmpty(),false);
		assertNotEquals(set2.isEmpty(),true);
		assertEquals(set3.isEmpty(), true);
		assertEquals(set4.isEmpty(), true);
	}

}
