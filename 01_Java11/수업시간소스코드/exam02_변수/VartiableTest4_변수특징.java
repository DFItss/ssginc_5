package exam02_변수;

public class VartiableTest4_변수특징 {

	int num = 200;

	public static void main(String[] args) {

	
		//변수 특징
		
		//1. 동일이름 사용 불가
		int  num = 10;
		//String num = "100";
	    System.out.println(num);
	    
	    //2. 로컬변수는 사용전에 반드시 초기화
	    
	    //3. 변수는 인식 범위 ( 블럭 scope 라고 부른다. )
	    // 나중에 javascript는 기본적으로 블럭 scope 아니고 함수 scope를 따른다.
	    
	    if(true){
	       int k = 2;    	
	       System.out.println(k);
	    }
	    //System.out.println(k);
	    
	}
}
