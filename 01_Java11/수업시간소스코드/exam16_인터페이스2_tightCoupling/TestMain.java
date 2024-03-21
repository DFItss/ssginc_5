package exam16_인터페이스2_tightCoupling;

public class TestMain {

	public static void main(String[] args) {

		DBService service = new DBService();
		// Oracle 사용
		//service.setDAO(new OracleDAO());
		//service.connect();
		
		// MySQL 변경
		service.setDAO(new MySQLDAO());
		service.connect();
	}

}
