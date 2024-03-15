package exam09_클래스2_생성자5;


public class Cat {

	String name;
	int age;
	String gender;

	
	//이클립스에 의한 생성자 작성
	public Cat() {
	}
	public Cat(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Cat(String name) {
		this.name = name;
	}
	
	
}








