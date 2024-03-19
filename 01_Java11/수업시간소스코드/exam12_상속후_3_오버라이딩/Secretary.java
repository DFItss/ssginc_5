package exam12_상속후_3_오버라이딩;

//비서 클래스
public class Secretary extends Employee{
	
	public Secretary(String name, int salary) {
		this.name = name;
		this.salary =salary;
	}
	//getter, setter 작성
	// 2가지 변수를 한번에 리턴해주는 메서드 작성
	@Override
	public String getEmployee() {
		return name+"\t"+salary;
	}
}
