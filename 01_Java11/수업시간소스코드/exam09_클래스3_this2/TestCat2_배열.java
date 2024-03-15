package exam09_클래스3_this2;

public class TestCat2_배열 {

	public static void main(String[] args) {

	   // 배열로 관리
	 
	   //1. Cat배열 선언
		Cat [] cats;
	   //2. 배열 생성
		cats = new Cat[6];
		
	   //3. 배열 초기화
		cats[0]=new Cat("야옹이1", 1);
	Cat c2 = new Cat("야옹이2", 5);
		cats[1]=c2;
		cats[2]=new  Cat("야옹이3", 3);
		cats[3]=new Cat("야옹이4", 4);
		cats[4]=new Cat("야옹이5", 2);
		cats[5]=new Cat("야옹이100", 2, "수컷");
		
		//일반 for문
		for(int idx=0; idx < cats.length; idx++) {
			Cat c1 = cats[idx];
			System.out.printf("이름:%s, 나이:%d, 성별:%s \n", 
			         c1.name, c1.age, c1.gender);
		}
		System.out.println();
		//foreach문 
		for(Cat c1  : cats) {
			System.out.printf("이름:%s, 나이:%d, 성별:%s \n", 
			         c1.name, c1.age, c1.gender);
		}
		
	   
	}
}
