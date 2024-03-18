package exam09_클래스4_메서드2;

public class Cat {
	
	// private로 지정하면 외부클래스에서 접근이 불가능
	private String name;
	private int age;
	private String gender;

	
	// 생성자: private된 변수를 초기화하자.
	// 기본생성자는 무조건 작성하자.
	public Cat() {}
	//오버로딩 생성자
	public Cat(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//메서드
	// 이름 변경하는 메서드: 나 번 사용하자
	// 나.파라미터 있고 리턴값 없는 경우
	public void setName(String name) {
		this.name = name;
	}
	// 나이 변경하는 메서드
    public void setAge(int age) {
    	this.age = age;
    }
	// 성별 변경하는 메서드
    public void setGender(String gender) {
    	this.gender = gender;
    }
	
   // 이름 조회하는 메서드:  다 번
   // 다. 파라미터 없고 리턴값 있는 경우
    public String getName() {
    	return name;
    }
    
    // 나이 조회하는 메서드:
    public int getAge() {
    	return age;
    }
    // 성별 조회하는 메서드:	
    public String getGender() {
    	return gender;
    }
	
}




