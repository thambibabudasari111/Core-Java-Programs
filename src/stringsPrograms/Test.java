package stringsPrograms;

public class Test {

	public static void main(String[] args) {

		
	    
		String str1 = "scaler";                          //Line1
		String str2 = new String("scaler");      //Line2
		str2.intern();                                       //Line 3
		System.out.println(str1 == str2);
	}

}
