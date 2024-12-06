package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * @author Rista Subedi
 * A random number generation strategy that uses Java's built-in Random class.
 */
public class BuiltInRandomStrategy implements RandomStrategy {
    private final Random random = new Random();

    /**
     * Generates a random positive integer using Java's Random class.
     * 
     * @return a randomly generated positive integer
     */
    @Override
    public int generate() {
        return random.nextInt(Integer.MAX_VALUE);
    }
}