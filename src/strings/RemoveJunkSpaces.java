package strings;

public class RemoveJunkSpaces {

	public static void main(String[] args) {

		String str = "to #$@##@*#junk 24224 $@$@ spaces";
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str);
	}

}
