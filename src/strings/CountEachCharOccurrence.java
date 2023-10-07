package strings;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharOccurrence {

	/*
	 * program to find number of occurrences of each character in a given string
	 * 
	 * 
	 * 1. We create a HashMap called charFrequencyMap to store character frequencies.
	 * 
	 * 2. We remove spaces from the input string and convert it to lowercase (you can skip this step if you want to consider 
	 * uppercase and lowercase characters as separate).
	 * 
	 * 3. We convert the input string into a character array.
	 * 
	 * 4. We iterate through each character in the array, checking if it exists in the charFrequencyMap. If it does, we increment its count; otherwise, 
	 * we add it to the map with a count of 1.
	 * 
	 * 5. After processing all characters, we iterate through the charFrequencyMap to print the character frequencies.
	 */
	public static void main(String[] args) {
		
		String str = "this is a java program";
		
		countCharacterFrequency(str);
	}
	
	public static void countCharacterFrequency(String text)
	{
		//create a HashMap to store character frequencies
		Map<Character, Integer>  charFrequencyMap = new HashMap<>();
		
		//Remove the spaces and convert the string to lowercase (optional)
		text = text.replaceAll("\\s+", "").toLowerCase();
		
		//Convert the string to a character array
		char ch[] = text.toCharArray();
		
		//Iterate through the characters and count their occurrences
		for(char c: ch)
		{
			if(charFrequencyMap.containsKey(c))
			{
				//if the character is already in the map, increment it's count
				charFrequencyMap.put(c, charFrequencyMap.get(c)+1);
			}else {
				//otherwise, add the character to the map with a count of 1
				charFrequencyMap.put(c, 1);
			}
		}
		
		//Print the character frequencies
		for(Map.Entry<Character, Integer> entry: charFrequencyMap.entrySet()){
			System.out.println("Character: "+entry.getKey()+" - Frequency: "+entry.getValue() );
		}
	}
}
