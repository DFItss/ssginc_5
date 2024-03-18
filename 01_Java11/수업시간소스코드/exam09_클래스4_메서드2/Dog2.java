package exam09_클래스4_메서드2;

public class Dog2 {

	//변수
	private String name;
	private int age;
	private String gender;

	//생성자
	public Dog2() {}
	public Dog2(String name, int age, String gender) {
		this.name = name;
		// age 유효성 체크
		if(ageCheck(age)) {
			this.age = age;			
		}else {
			System.out.println("age값을 확인하세요");
		}
		this.gender = gender;
	}
	//메서드 ( setter, getter )
	public void setAge(int age) {
		// age 유효성 체크
		if(ageCheck(age)) {  // this.ageCheck(age)
			this.age = age;			
		}else {
			System.out.println("age값을 확인하세요");
		}
	}
	//////////////////////////////////////////
    // age값의 유효성 체크하는 메서드
	public boolean ageCheck(int age) {
		if(age < 30) {
			return true;
		}else {
			return false;
		}
	}
	public boolean ageCheck2(int age) {
			return age < 30;
	}
	// 권장
	public boolean ageCheck3(int age) {
		boolean result = false;
		if(age < 30) {
			result =  true;
		}
		return result;
	}
	//////////////////////////////////////////
	
	
	
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
