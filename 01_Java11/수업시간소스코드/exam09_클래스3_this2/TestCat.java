package exam09_클래스3_this2;

public class TestCat {

	public static void main(String[] args) {

	   // 변수로 관리	  
	   Cat c1 = new Cat("야옹이1", 1);
	   Cat c2 = new Cat("야옹이2", 5);
	   Cat c3 = new Cat("야옹이3", 3);
	   Cat c4 = new Cat("야옹이4", 4);
	   Cat c5 = new Cat("야옹이5", 2);
	   
	   Cat c100 = new Cat("야옹이100", 2, "수컷");
	
	   System.out.printf("이름:%s, 나이:%d, 성별:%s \n", 
		         c1.name, c1.age, c1.gender);
	   System.out.printf("이름:%s, 나이:%d, 성별:%s \n", 
		         c2.name, c2.age, c2.gender);
	   System.out.printf("이름:%s, 나이:%d, 성별:%s \n", 
		         c3.name, c3.age, c3.gender);
	   System.out.printf("이름:%s, 나이:%d, 성별:%s \n", 
		         c4.name, c4.age, c4.gender);
	   System.out.printf("이름:%s, 나이:%d, 성별:%s \n", 
		         c5.name, c5.age, c5.gender);
	   
	   System.out.printf("이름:%s, 나이:%d, 성별:%s \n", 
		         c100.name, c100.age, c100.gender);
	   
	}
}
