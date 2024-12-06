package org.howard.edu.lsp.finalexam.question2;

/**
 * @author Rista Subedi
 * Interface for random number generation strategies.
 * Implementing classes must provide a method to generate random numbers.
 */
public interface RandomStrategy {
    /**
     * Generates a random positive integer.
     * 
     * @return a randomly generated positive integer
     */
    int generate();
}