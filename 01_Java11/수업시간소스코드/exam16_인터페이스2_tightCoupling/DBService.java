package exam16_인터페이스2_tightCoupling;

public class DBService {
	//사용하는 클래스를 직접 지정
	MySQLDAO dao;
	
	public void setDAO(MySQLDAO dao) {
		this.dao = dao;
	}
	
	public void connect() {
		dao.connect_mysql();
	}
}
