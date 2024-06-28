package in.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MoveInSync2_Gpt {

	public static void main(String[] args) {
		String s = "saiprasad";
		int input = 1; // Change this to 1 for highest character, 2 for second highest character

		char highestChar = findHighestCharacter(s, input);
		System.out.println("Highest character based on input " + input + ": " + highestChar);
	}

	public static char findHighestCharacter(String s, int input) {
		// Step 1: Count frequency of each character
		Map<Character, Integer> charCount = new HashMap<>();
		for (char c : s.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}

		// Step 2: Sort characters by their frequency in descending order
		// This creates a list of characters sorted by frequency (highest to lowest)
		var sortedChars = charCount.entrySet().stream()
				.sorted(Map.Entry.<Character, Integer>comparingByValue().reversed()).map(Map.Entry::getKey)
				.collect(Collectors.toList());

		// Step 3: Based on input, return the highest or second highest character
		if (input == 1 && !sortedChars.isEmpty()) {
			return sortedChars.get(0); // Highest character
		} else if (input == 2 && sortedChars.size() > 1) {
			return sortedChars.get(1); // Second highest character
		} else {
			throw new IllegalArgumentException("Invalid input or not enough distinct characters");
		}
	}

}
