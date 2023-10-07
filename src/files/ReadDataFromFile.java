package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {

	public static void main(String[] args) throws IOException {

		
		/*
		 * Approach 1: using FileReader, BufferededReader
		 */
		
		
		FileReader fr = new FileReader("C:\\Users\\thamb\\OneDrive\\Documents\\text.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		
		String str ; 
		
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		
		br.close();
		
	}

}
