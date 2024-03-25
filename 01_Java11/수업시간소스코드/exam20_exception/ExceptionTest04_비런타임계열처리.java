package exam20_exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest04_비런타임계열처리 {

	public static void main(String[] args) {
	
		File f = new File("C:\\java_study\\eclipse\\workspace\\HelloTest\\src\\exam20_exception\\ExceptionTest04_비런타임계열처리.java");
		
		try {
			FileReader reader = new FileReader(f);
			BufferedReader buffer = new BufferedReader(reader);
			String s = buffer.readLine(); // 한줄  읽기
			while( s!= null) {
				System.out.println(s);
				s = buffer.readLine(); // 한줄  읽기
			}
		} catch (FileNotFoundException e) {  // new BufferedReader(reader)
			e.printStackTrace();
		} catch (IOException e) {             // buffer.readLine();
			e.printStackTrace();
		}
		
	}//end main
}//end class
