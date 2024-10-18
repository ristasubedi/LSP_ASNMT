package org.howard.edu.lsp.midterm.question3;


/**
 * Driver class to test the VotingMachine.
 */

public class VotingMachineDriver {
	public static void main(String[] args) {
        // Create a new VotingMachine instance.
        VotingMachine vm = new VotingMachine();

        // Add candidates to the voting machine.
        vm.addCandidate("Alsobrooks");
        vm.addCandidate("Hogan");

        // Cast votes for the candidates.
        vm.castVote("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.castVote("Hogan");

        // Print the vote results.
        System.out.println(vm.toString());
    }

}


