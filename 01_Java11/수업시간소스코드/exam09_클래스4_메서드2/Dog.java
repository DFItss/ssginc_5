package exam09_클래스4_메서드2;

public class Dog {

	//변수
	private String name;
	private int age;
	private String gender;

	//생성자
	public Dog() {}
	public Dog(String name, int age, String gender) {
		this.name = name;
		// age 유효성 체크
		if(age < 30) {
			this.age = age;			
		}else {
			System.out.println("age값을 확인하세요");
		}
		this.gender = gender;
	}
	//메서드 ( setter, getter )
	public void setAge(int age) {
		// age 유효성 체크
		if(age < 30) {
			this.age = age;			
		}else {
			System.out.println("age값을 확인하세요");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
