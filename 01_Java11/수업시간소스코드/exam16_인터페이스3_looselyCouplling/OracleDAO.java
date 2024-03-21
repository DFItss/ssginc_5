package exam16_인터페이스3_looselyCouplling;

public class OracleDAO implements DBDAO {
	@Override
	public void connect() {
		System.out.println("OracleDAO connect 호출");
	}

}
