package exam09_클래스2_생성자4;


public class Cat {

	String name;
	int age;
	String gender;
	
	//오버로딩 생성자
	public Cat() {}
	public Cat(String n, int n2, String n3 ) {
		name=n;
		age=n2;
		gender=n3;
	}
	public Cat(String n, int n2 ) {
		name=n;
		age=n2;
	}
	public Cat(String n) {
		name=n;
	}
}








