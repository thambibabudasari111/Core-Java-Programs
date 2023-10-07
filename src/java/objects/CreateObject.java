package java.objects;

import java.text.NumberFormat;

public class CreateObject {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {

		/*
		 * Ways to create an object in Java
		 */
		
		
		//1
		TestClass obj = new TestClass();
		
		obj.testMethod2();
		
		//2
		NumberFormat obj1 = NumberFormat.getNumberInstance();
		
		
		//3 
		Class c = Class.forName("TestClass");
		
		TestClass obj2 = (TestClass)c.newInstance();
		
		
		//4
		CreateObject obj3 = new CreateObject();
		
		CreateObject obj4 = (CreateObject)obj3.clone();
	}
	
	public static void testMethod()
	{
		System.out.println("Test Method");
	}

}
