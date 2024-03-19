package exam12_상속후_3_오버라이딩;

//관리자 클래스
public class Manager extends Employee {
	
	String depart; //부서명
	
	public Manager(String name,
	        int salary,
	        String depart) {

		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}
	//getter, setter 작성
	// 3가지 변수를 한번에 리턴해주는 메서드 작성
	@Override
	public String getEmployee() {
		return name+"\t"+salary+"\t"+depart;
	}
}
