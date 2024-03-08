package exam01_데이터종류;

public class PDT02_실수형2_범위 {

	public static void main(String[] args) {

		//기본형 데이터인 실수형: float, double
		//참조형 데이터: Float, Double
		
		System.out.println("float 저장범위");
		System.out.println(Float.MIN_VALUE);  // 1.4E-45
		System.out.println(Float.MAX_VALUE);  // 3.4028235E38
		
		System.out.println("double 저장범위");
		System.out.println(Double.MIN_VALUE);  // 4.9E-324
		System.out.println(Double.MAX_VALUE);  // 1.7976931348623157E308
	}
}
