package exam05_연산자;

public class Operator02_대입연산자 {

	public static void main(String[] args) {

		//2. 대입 연산자 ( =, +=, -=, *=, /=, %= )

		int n = 10;
		int n2 = 3;
		
		// n+=n2;   n과 n2을 더해서 n에 저장. 풀어쓰면     n=n+n2;
		n += n2;  //  n=n+n2; 동일
	    System.out.println(n +" " + n2);	// 13 3
	
	   // n-=n2;   n에서 n2을 빼서 n에 저장. 풀어쓰면     n=n-n2;
 		n -= n2;  //  n=n-n2; 동일
 	    System.out.println(n +" " + n2);	// 
 	    
 	   // n *=n2;   n과 n2을 곱해서 n에 저장. 풀어쓰면     n=n*n2;
 		n *= n2;  //  n=n*n2; 동일
 	    System.out.println(n +" " + n2);	// 
 	 	     
 	    // n /=n2;   n를 n2로 나눠서 n에 저장. 풀어쓰면     n=n/n2;
 		n /= n2;  //  n=n/n2; 동일
 	    System.out.println(n +" " + n2);	// 
 	    
 	    // n %=n2;   n를 n2을 나눠서 나머지를 n에 저장. 풀어쓰면     n=n%n2;
 		n %= n2;  //  n=n%n2; 동일
 	    System.out.println(n +" " + n2);	//  
 	    
	}

}
