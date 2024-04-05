import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.EmpDTO;

public class MyBatisEmpMain {

	public static void main(String[] args) {
		SqlSession session = MySqlSessionFactory.getSession();

		// 1. multi insert
//	    EmpDTO dto1 = new EmpDTO(1, "aaa1", "SALESMAN", 7369, null, 700, 0 , 30);
//	    EmpDTO dto2 = new EmpDTO(2, "aaa2", "SALESMAN", 7369, null, 700, 0 , 30);
//	    EmpDTO dto3 = new EmpDTO(3, "aaa3", "SALESMAN", 7369, null, 700, 0 , 30);
//		
//	    List<EmpDTO> list = Arrays.asList(dto1, dto2, dto3);
//	    
//	    
//int n = session.insert("com.config.EmpMapper.multiInsert",
//		      list);
//session.commit();
//System.out.println(n + " 개가 저장됨.");

		// 2. multi delete
//		List<Integer> list2 = Arrays.asList(1,2,9000,8000);
//int n2 = session.delete("com.config.EmpMapper.remove", list2);
//session.commit();
//System.out.println(n2 + " 개가 삭제됨.");
		
		//3. multi update
		EmpDTO dto4 = new EmpDTO();
		dto4.setSal(8500);
		dto4.setEname("강길동");
		dto4.setEmpno(3);
int n3 = session.update("com.config.EmpMapper.update", dto4);
session.commit();
System.out.println(n3 + " 개가 수정됨.");
session.close();
	}
}




