package exam12_상속후_2_super;

//비서 클래스
public class Secretary extends Employee{
	
	String name;
	
	public Secretary(String name, int salary) {
		this.name = name;
		this.salary =salary;
	}
	//getter, setter 작성
	// 2가지 변수를 한번에 리턴해주는 메서드 작성
	public String getSecretary() {
		System.out.println("부모의 name호출:"+ super.name);
		return this.name+"\t"+salary;
	}
}
