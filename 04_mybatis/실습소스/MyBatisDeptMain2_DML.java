import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.DeptDTO;

public class MyBatisDeptMain2_DML {

	public static void main(String[] args) {

	   //1. SqlSession 얻기
		SqlSession session =
				MySqlSessionFactory.getSession();
	
		//데이터 저장1
//		DeptDTO dto = new DeptDTO(1, "개발", "부산");
//		
//		int n = session.insert("com.config.DeptMapper2.save", dto);
//session.commit(); // ***********
//		System.out.println(n +" 개가 생성됨 ");
		
		// 데이터 수정
		DeptDTO dto2 = new DeptDTO(1, "IT개발", "부산시");
int n2 = session.update("com.config.DeptMapper2.update", dto2);
session.commit();
System.out.println(n2 +" 개가 수정됨 ");

        // 데이터 삭제
		int deptno = 1;
int n3 = session.delete("com.config.DeptMapper2.remove", deptno);
session.commit();
System.out.println(n3 +" 개가 삭제됨 ");


		List<DeptDTO> list =
				session.selectList("com.config.DeptMapper2.findAll");
		System.out.println(list);
		//4. close작업
		session.close();
	}
}
