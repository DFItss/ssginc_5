package exam04_표준출력;

public class ConsoleTest {

	public static void main(String[] args) {

		//1. System.out.println(값)
		// 새로운 줄에 출력이 된다.
		System.out.println("hello");
		System.out.println("world");
		System.out.println();
		
		//2. System.out.print(값)
		// 새로운 줄 없이 현재줄에 출력이 된다.
		System.out.print("hello");
		System.out.print("world");
		System.out.println();
		
		System.out.print("hello\n");
		System.out.print("world");
		System.out.println();
		
		
		//3. System.out.printf("  ", ...);  // ... 는 가변인자라고 하고 갯수는 정해져 있지 않음,
		//  print 처럼 한줄에 출력
		//  https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Formatter.html#syntax
		// 정수값: %d
		// 실수값: %f
		// 문자값: %c
		// 논리값: %b
		// 문자열: %s
		
		System.out.printf("%d \n", 19);
		System.out.printf("%f \n", 3.14F);
		System.out.printf("%f \n", 3.14D);
		System.out.printf("%c \n", '남');
		System.out.printf("%b \n",  true);
		System.out.printf("%s \n",  "홍길동");
		
		// 특정포맷으로 모니터에 출력이 가능하다.
		System.out.printf("%.2f \n", 3.148643256887);
		System.out.printf("%3d \n", 19);
		
		//
		String name ="홍길동";
		int age = 20;
		
		//출력결과?  이름:홍길동, 나이:20
		System.out.println("이름:"+name+", 나이:"+age);
		
		System.out.printf("이름:%s, 나이:%d", name, age);
		
	}

}
