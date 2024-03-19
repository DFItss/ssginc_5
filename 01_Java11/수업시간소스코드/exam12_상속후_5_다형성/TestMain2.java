package exam12_상속후_5_다형성;

public class TestMain2 {

	public static void main(String[] args) {
	
	   // 다형성 활용 예 - 배열
	   Employee  [] empArray = {  new Employee("강감찬", 200),
			                      new Engineer("홍길동", 100, "JAVA"),
			                      new Manager("이순신", 200, "인사"),
			                      new Secretary("유관순", 200)};
	   for(Employee e: empArray) {
		   System.out.println(e.getEmployee()); // Employee에 getEmployee() 있기 에러 발생이 안된다.
	   }
	   
	   for(Object e: empArray) {
		 //  System.out.println(e.getEmployee()); // Object에 getEmployee() 없기 때문에 에러 발생됨
	   }
	   
	   // 다형성 배열 확장하면 자바의 모든 데이터를 저장할 수 있는 능력이 생긴다.
	   Object [] obj = { "hello", 20, 3.14, true, 
			              new Engineer("홍길동", 100, "JAVA")};
	   
	   
	   
	}
}
