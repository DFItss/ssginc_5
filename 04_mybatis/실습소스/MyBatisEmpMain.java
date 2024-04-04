import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.EmpDTO;

public class MyBatisEmpMain {

	public static void main(String[] args) {

	    EmpDTO dto1 = new EmpDTO(1, "aaa1", "SALESMAN", 7369, null, 700, 0 , 30);
	    EmpDTO dto2 = new EmpDTO(2, "aaa2", "SALESMAN", 7369, null, 700, 0 , 30);
	    EmpDTO dto3 = new EmpDTO(3, "aaa3", "SALESMAN", 7369, null, 700, 0 , 30);
		
	    List<EmpDTO> list = Arrays.asList(dto1, dto2, dto3);
	    
	    SqlSession session = MySqlSessionFactory.getSession();
	    
int n = session.insert("com.config.EmpMapper.multiInsert",
		      list);
session.commit();
System.out.println(n + " 개가 저장됨.");

	    session.close();
	}
}




