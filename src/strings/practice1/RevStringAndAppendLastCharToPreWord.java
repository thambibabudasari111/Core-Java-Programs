package strings.practice1;

public class RevStringAndAppendLastCharToPreWord {

	public static void main(String[] args) {

		/*
		 * reverse each words in a string and append last character of previous word to the next word
		 * 
		 * 1.Split the input string into words.
			2. Iterate through the words.
			3. Reverse each word.
			4. Append the last character of the previous word to the reversed word (except for the first word).
			5. Concatenate the modified words to form the final string.
		 */
		
		String input = "my name is thambi babu";
        String result = reverseWordsWithAppend(input);
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + result);
        
		
	}
	
	public static String reverseWordsWithAppend(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        if (words.length > 0) {
            // Reverse the first word
            String reversedWord = reverseWord(words[0]);
            result.append(reversedWord);

            // Process the rest of the words
            for (int i = 1; i < words.length; i++) {
                String currentWord = words[i];
                String lastLetterOfPreviousWord = words[i - 1].substring(words[i - 1].length() - 1);
                reversedWord = reverseWord(currentWord);
                result.append(lastLetterOfPreviousWord).append(reversedWord);
            }
        }

        return result.toString();
    }

    public static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }





}
