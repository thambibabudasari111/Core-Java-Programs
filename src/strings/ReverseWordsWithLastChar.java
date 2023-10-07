package strings;
public class ReverseWordsWithLastChar {
    public static void main(String[] args) {
        String input = "Hello world, how are you?";
        String result = reverseWordsWithLastChar(input);
        System.out.println(result);
    }
    
    public static String reverseWordsWithLastChar(String input) {
        String[] words = input.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        char lastChar = '\0'; // Initialize with a null character
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = reverseWord(word);
            
            if (i > 0) {
                reversed.append(lastChar); // Append the last character of previous word
            }
            
            reversed.append(reversedWord);
            lastChar = reversedWord.charAt(reversedWord.length() - 1);
        }
        
        return reversed.toString();
    }
    
    public static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
