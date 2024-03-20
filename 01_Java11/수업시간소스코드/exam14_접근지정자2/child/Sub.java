package exam14_접근지정자2.child;

import exam14_접근지정자2.parent.Super;

public class Sub extends Super{

private int m = 100;
	
	public void info() {
		System.out.println("public:" + n1);
		System.out.println("protected:" + n2);
//		System.out.println("default:" + n3);
		//System.out.println("private:" + n4);
		System.out.println("private:" + m);
	}
}
