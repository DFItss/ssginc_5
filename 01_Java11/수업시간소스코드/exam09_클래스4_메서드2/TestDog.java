package exam09_클래스4_메서드2;

public class TestDog {

	public static void main(String[] args) {
		// 망치 2 수컷
		
		Dog d1 = new Dog("망치", 2000, "수컷");
		
		// 나이수정
		d1.setAge(1000);
		
		// 조회
		String name = d1.getName();
		int age = d1.getAge();
		String gender = d1.getGender();
		System.out.printf("이름:%s, 나이:%d 성별:%s  \n",
			      name, age, gender);
				
	}

}
