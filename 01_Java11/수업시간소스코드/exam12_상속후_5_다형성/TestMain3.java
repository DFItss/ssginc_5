package exam12_상속후_5_다형성;

public class TestMain3 {

	public static void main(String[] args) {
	
	   // 다형성 활용 예 - 배열
	   Employee  [] empArray = {  new Employee("강감찬", 200),
			                      new Manager("이순신1", 200, "인사"),
			                      new Engineer("홍길동", 100, "JAVA"),
			                      new Manager("이순신2", 200, "인사"),
			                      new Secretary("유관순", 200),
			                      new Manager("이순신3", 200, "인사"),};
	   
	   //1. 배열 출력
	   for(Employee e: empArray) {
		   System.out.println(e.getEmployee()); 
	   }
	   System.out.println();
	   
	   //2. Manager만 출력하시오
	   for(Employee e: empArray) {
		   if(e instanceof Manager) {
		      System.out.println(e.getEmployee());
		   }
	   }
	
	  //3. 배열에서 Manager에 추가된 depart만 출력하시오.
	   for(Employee e: empArray) {
		   if(e instanceof Manager) {
			   //형변환
			   Manager m =(Manager)e;
		      System.out.println(m.getDepart());
		   }
	   }
	   
	}
}
