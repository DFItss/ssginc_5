package exam16_인터페이스3_looselyCouplling;

public class MySQLDAO implements DBDAO {
	@Override
	public void connect() {
		System.out.println("MySQLDAO connect 호출");
	}

}
