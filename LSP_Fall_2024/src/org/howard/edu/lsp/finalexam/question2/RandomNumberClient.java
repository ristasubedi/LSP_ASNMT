package org.howard.edu.lsp.finalexam.question2;

/**
 * @author Rista Subedi
 * Client class to demonstrate the use of RandomNumberService with different strategies.
 */
public class RandomNumberClient {
    /**
     * Main method to execute the client program.
     * Demonstrates random number generation using both the built-in and custom strategies.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();

        RandomStrategy builtInStrategy = new BuiltInRandomStrategy();
        RandomStrategy customStrategy = new CustomRandomStrategy();

        System.out.println("Built-in Strategy Random Number: " + service.generateRandomNumber(builtInStrategy));
        System.out.println("Custom Strategy Random Number: " + service.generateRandomNumber(customStrategy));
    }
}