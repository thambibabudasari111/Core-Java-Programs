package strings.practice1;

import java.util.HashMap;

public class DuplicateWordsInString {

	public static void main(String[] args) {

		
	}
	
	public static void duplicateWords(String inputString)
	{
		//splitting input string into two words
		String[] words = inputString.split(" ");
		
		//creating one HashMap with words as key and their count as value
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		
		//checking each word
		for(String word: words)
		{
			//whether it is present in wordCount
			if(wordCount.containsKey(word.toLowerCase()))
			{
				//If it is present, incrementing it's count by 1
				wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase()));
				
			}
			else
			{
				
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
