package exam09_클래스3_this;


public class Cat {

	String name; // 인스턴스 변수
	int age;
	String gender;
	
	//오버로딩 생성자
	public Cat() {}
	public Cat(String name, int age, String gender ) { //로컬변수
		System.out.println(this);
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Cat(String n, int n2 ) {
		name=n; // this생략
		age=n2; // this생략
	}
	public Cat(String n) {
		name=n; // this생략
	}
}








