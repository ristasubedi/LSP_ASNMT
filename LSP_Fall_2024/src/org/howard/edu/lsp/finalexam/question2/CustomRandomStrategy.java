package org.howard.edu.lsp.finalexam.question2;

/**
 * @author Rista Subedi
 * A custom random number generation strategy that uses the Math.random() method.
 */
public class CustomRandomStrategy implements RandomStrategy {
    /**
     * Generates a random positive integer using Math.random().
     * 
     * @return a randomly generated positive integer
     */
    @Override
    public int generate() {
        return (int) (Math.random() * Integer.MAX_VALUE);
    }
}

