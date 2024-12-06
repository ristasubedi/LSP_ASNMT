package org.howard.edu.lsp.finalexam.question2;

/**
 * @author Rista Subedi
 * A singleton service for generating random numbers using different strategies.
 * The service utilizes the Strategy design pattern to allow clients to choose
 * a specific random number generation implementation at runtime.
 */

public class RandomNumberService {
    private static RandomNumberService instance;

    /**
     * Private constructor to prevent external instantiation.
     */
    private RandomNumberService() {}

    /**
     * Retrieves the singleton instance of the RandomNumberService.
     * 
     * @return the single instance of RandomNumberService
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Generates a random number using the provided strategy.
     * 
     * @param strategy the random number generation strategy to use
     * @return the generated random number
     */
    public int generateRandomNumber(RandomStrategy strategy) {
        return strategy.generate();
    }
}