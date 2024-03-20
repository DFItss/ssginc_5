package exam15_추상클래스2_적용전;

// Engineer, Secretary, Manger 클래스들의
// 공통적인 속성과 메서드를 뽑아서 
// 더 큰 개념의 클래스를 만들자..
public class Employee {
	String name;
	int salary;
	
	//getter, setter
	
	public String getEmployee() {
		return name+"\t"+salary;
	}
}
