package exam12_상속후_4_이클립스;

public class Secretary extends Employee {

	public Secretary() {
		super();
	}

	public Secretary(String name, int salary) {
		super(name, salary);
	}
	// 추가되는 속성 없음
	// getter/setter 메서드 없음
	// 오버라이딩메서드 필요없음. 부모 메서드와 동일함.
}
