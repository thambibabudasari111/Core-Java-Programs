package strings;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String str = " Java programming  and  selenium  automation  ";
		
		str = str.replaceAll("\\s", "");
		
		System.out.println(str);
		
		
		
		
	}

}
