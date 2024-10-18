package org.howard.edu.lsp.midterm.question2;

/**
 * Driver class to test the Calculator class methods.
 */
public class CalculatorDriver {

    /**
     * The main method to execute the Calculator's sum functionality.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Testing sum of two integers
        System.out.println(Calculator.sum(5, 10));  // Output: 15 (sum of two integers)

        // Testing sum of two double values
        System.out.println(Calculator.sum(3.5, 7.8));  // Output: 11.3 ( sum of two doubles)

        // Testing sum of an array of integers
        System.out.println(Calculator.sum(new int[] {1, 2, 3, 4, 5}));  // Output: 15 (sum of array of integers)
    }
}

