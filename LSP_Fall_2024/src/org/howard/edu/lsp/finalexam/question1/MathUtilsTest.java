package org.howard.edu.lsp.finalexam.question1;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	MathUtils mathUtils = new MathUtils();

    @Test
    void testFactorialWithValidInputs() {
        assertEquals(1, mathUtils.factorial(0)); // For edge case: 0 factorial
        assertEquals(1, mathUtils.factorial(1)); // For edge case: 1 factorial
        assertEquals(120, mathUtils.factorial(5)); // For common case
    }

    @Test
    void testFactorialWithNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1));
    }

    @Test
    void testIsPrimeWithValidInputs() {
        assertFalse(mathUtils.isPrime(0)); // Not prime
        assertFalse(mathUtils.isPrime(1)); // Not prime
        assertTrue(mathUtils.isPrime(7));  // Prime number
        assertFalse(mathUtils.isPrime(10)); // Composite number
    }

    @Test
    void testGcdWithValidInputs() {
        assertEquals(5, mathUtils.gcd(10, 5)); // Common case
        assertEquals(1, mathUtils.gcd(9, 28)); // Coprime numbers
        assertEquals(10, mathUtils.gcd(10, 0)); // Zero as one input
    }

    @Test
    void testGcdWithBothInputsZero() {
        assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0));
    }
}
