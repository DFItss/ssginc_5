package exam09_클래스2_생성자2;

// 고양이 객체 관리용도
/*  
   1. 클래스 문법:
    접근지정자 class 클래스명{
    
    }
    
    2. 클래스명 
     - 사용자 정의 식별자
     - 반드시 첫글자는 대문자
     - 의미있는 명사형
     
    3. 클래스 구성요소
      - 변수(멤버, 멤버변수, 인스턴스 변수)
      - 메서드(멤버, 멤버메서드)
      - 생성자(constructor): 멤버에 포함안됨.
      
    4. 클래스 사용
      - 반드시 객체 생성해야 된다.
        객체 생성 작업을 '인스턴스화' 한다고 함.
      - new 이용. 생성된 클래스는 heap메모리에 인스턴스로 생성됨.
      - 문법:
         
           클래스명  변수명 =  new 클래스명([값,값2,..]);
           
           
 */
public class Cat {

	String name;
	int age;
	String gender;
	
	//기본생성자가 자동으로 생성됨.
    public Cat() {
    	System.out.println("Cat() 생성자");
    }
	
	 // 명시적으로 생성자를 만들면 기본생성자는 자동생성안됨.
	 public Cat(String n) {
		 System.out.println("Cat(String n) 생성자");
	 }
	 public Cat(int n) {
		 System.out.println("Cat(int n) 생성자");
	 }
	 
	 public Cat(String n, int n2) {
		 System.out.println("Cat(String n, int n2) 생성자");
	 }
	 
	 public Cat(String n, int n2, String n3) {
		 System.out.println("Cat(String n, int n2, String n3) 생성자");
	 }
}








