package exam05_연산자;

public class Operator04_논리연산자 {

	public static void main(String[] args) {

		//4. 논리 연산자 ( &&, ||, ! )
		// 실행결과는 논리값 ( true/false) 으로 반환됨.
		
		
		//가. && ( and, 그리고 해석 )
		// && 논리식, Short circuit logical 연산자
		System.out.println( true  &&  true  );   //  true
		System.out.println( true  &&  false  );  //  false
		System.out.println( false  &&  true  );  //  false
		System.out.println( false  &&  false  ); //  false
		System.out.println();
		
		//나. || ( or, 또는 해석 )
		// || 논리식, Short circuit logical 연산자
		System.out.println( true  ||  true  );   //  true
		System.out.println( true  ||  false  );  //  true
		System.out.println( false  ||  true  );  //  true
		System.out.println( false  ||  false  ); //  false
		
		//다. ! ( not , 부정 )
		// ! 논리식
		System.out.println( !true   );   //  false
		System.out.println( !false  );  //  true
		
		
	
		
	}

}
