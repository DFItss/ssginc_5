package exam09_클래스4_메서드2;

public class TestCat {

	public static void main(String[] args) {
		// 야옹이 2 암컷
		Cat c1 = new Cat("야옹이", 2, "암컷");
		
		// 값 변경 ==> set 메서드, setter 메서드라고 부른다.
		c1.setName("망치");
		c1.setGender("수컷");
		
		// 값 조회 ==> get 메서드, getter 메서드라고 부른다.
		String name = c1.getName();
		int age = c1.getAge();
		String gender = c1.getGender();
		System.out.printf("이름:%s, 나이:%d 성별:%s  \n",
				      name, age, gender);
		
		System.out.printf("이름:%s, 나이:%d 성별:%s  \n",
				c1.getName(), c1.getAge(), c1.getGender());
		
	}

}
