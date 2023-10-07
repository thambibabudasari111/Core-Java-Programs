package strings;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharsInString {

	
	/*
	 * Find duplicate characters in a string
	 * 
	 * 1. We create a HashMap called charFrequencyMap to store the frequencies of characters in the input string.
	 * 2. We convert the input string into a character array using toCharArray().
	 * 3. We iterate through each character in the array, checking if it exists in the charFrequencyMap. 
	 * If it does, we increment its count; otherwise, we add it to the map with a count of 1.
	 * 4. After processing all characters, we iterate through the charFrequencyMap to find and print characters 
	 * with counts greater than 1, indicating duplicates.
	 * 
	 */
	
	public static void main(String[] args) {

		String str = "thisisajavaprogram";
		findDuplicateCharacters(str);
	}

	public static void findDuplicateCharacters(String text)
	{
		//create a hashmap to find the character frequencies 
		Map<Character, Integer> charFrequenceMap = new HashMap<>();
		
		//convert the string to character array
		char[] characters = text.toCharArray();
		
		
		//iterate through the characters and count their occurrences
		for(char c: characters)
		{
			//if character is already in map, increment it's count
			if(charFrequenceMap.containsKey(c)) {
				charFrequenceMap.put(c, charFrequenceMap.get(c)+1);
			}
			else {
				//otherwise, add the characters to the map with a count of 1
				charFrequenceMap.put(c, 1);
			}
		}
		
		//Iterate through the map to find and print duplicate characters
		for(Map.Entry<Character, Integer> entry: charFrequenceMap.entrySet()) {
			if(entry.getValue()>1)
			{
				System.out.println("Duplicate characters: "+ entry.getKey()+ " - Occurrences: "+entry.getValue());
			}
		}	
	}
}
