package exam13_Object_toString;

class Test{
	int num;
	int num2;
	
	public Test(int n ,int n2) {
		num=n;
		num2=n2;
	}
	// num과 num2 한번에 리턴하는 메서드 추가
	public String getNums() {
		return num+"\t"+num2;
	}
	@Override
	public String toString() {
		return "Test [num=" + num + ", num2=" + num2 + "]";
	}


}
public class ObjectTest {

	public static void main(String[] args) {
		
		Test t = new Test(10, 20);
		System.out.println(t.getNums()); // 10 20
		
		//toString() 자동호출
		System.out.println(t); // 10 20
		System.out.println(t.toString()); // 10 20
		
		
		// Java API
		 String s = "hello";
        
		 System.out.println(s);  // hello
		 System.out.println(s.toString()); // hello
		
		
		
		
		
	}

}
