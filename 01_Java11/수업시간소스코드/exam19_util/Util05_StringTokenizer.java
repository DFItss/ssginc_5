package exam19_util;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Util05_StringTokenizer {

	public static void main(String[] args) {

		String s = "홍길동,이순신,유관순";
		
		//1. String의 split 메서드
		String [] s2 = s.split(",");
		System.out.println(Arrays.toString(s2));
		
		//2. java.util.StringTokenizer 이용
		StringTokenizer st = new StringTokenizer(s, ",");
		System.out.println("token 갯수: " + st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println("token 얻기: " + st.nextToken());			
		}
		
		// 구분자가 여러개인 경우에도 잘 분리해준다.
		String x = "홍|길동,이순|신,유관순/AAA/BBB";
		StringTokenizer st2 = new StringTokenizer(x, "/,|");
		while(st2.hasMoreTokens()) {
			System.out.println("token 얻기2: " + st2.nextToken());			
		}
		
		
	}//end main
}//end class
