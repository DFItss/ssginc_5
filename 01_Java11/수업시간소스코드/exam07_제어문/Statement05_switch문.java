package exam07_제어문;

public class Statement05_switch문 {

	public static void main(String[] args) {

	    // switch문
		// byte,short, int, char, String, enum
		
		int num = 10;
		switch(num) {
			case  5: System.out.println("값은 5");
					 break;
			case  10: System.out.println("값은 10");
					 break;		 
			case  15: System.out.println("값은 15");
			 		 break;
			default:  System.out.println("값은 default");
		}
		
		char c = 'A';
		switch (c) {
			case 'A':  System.out.println("값은 A"); break;
			case 'B':  System.out.println("값은 B"); break;
			case 'C':  System.out.println("값은 C"); break;
			default:  System.out.println("값은 default");break;
		}
		
		String s = "TUE";
		switch (s) {
			case "MON":  System.out.println("값은 MON"); 
			case "TUE":  System.out.println("값은 TUE");
			case "SUN":  System.out.println("값은 SUN"); 
			default:     System.out.println("값은 default");
		}
		
		
		
		
		
		System.out.println("END");
		
	}//end main
}
