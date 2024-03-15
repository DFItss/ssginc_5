package exam09_클래스3_this2;


public class Cat {

	String name; // 인스턴스 변수
	int age;
	String gender;
	
	//오버로딩 생성자
	public Cat() {}
	public Cat(String name, int age, String gender ) { //로컬변수
		System.out.println("생성자");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Cat(String name, int age ) {
		this(name, age, "암컷"); //반드시 첫라인
	}

}








