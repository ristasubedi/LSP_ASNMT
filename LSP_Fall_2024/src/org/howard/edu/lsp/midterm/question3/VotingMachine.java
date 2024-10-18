package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

/**
 * VotingMachine class manages candidates and votes.
 */
public class VotingMachine {

	// A map to store candidates and their vote counts.
    private Map<String, Integer> candidates;

    /**
     * Constructor to initialize the VotingMachine.
     */
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    /**
     * Adds a candidate to the list.
     *
     * @param name The name of the candidate to be added.
     */
    
    public void addCandidate(String name) {
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0); // Initializing the candidate with 0 votes.
        }
    }

    /**
     * Casts a vote for the given candidate.
     *
     * @param name The name of the candidate to vote for.
     */
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1); // Increment the vote count by 1.
        } else {
            System.out.println("Candidate not found: " + name);
        }
    }

    /**
     * Returns a string representation of the votes for each candidate.
     *
     * @return A string showing the candidates and their vote counts.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString();
    }
}
    