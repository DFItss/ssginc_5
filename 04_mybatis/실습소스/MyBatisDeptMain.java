import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.DeptDTO;

public class MyBatisDeptMain {

	public static void main(String[] args) {

	   //1. SqlSession 얻기
		SqlSession session =
				MySqlSessionFactory.getSession();
		
		//2. SqlSession의 메서드를 이용해서 DeptMapper.xml과 연동
		List<DeptDTO> list = session.selectList("findAll");
		
		System.out.println("################################");
		DeptDTO xxx  = session.selectOne("findByDeptno", 10);
		
		
		System.out.println("################################");
		
		DeptDTO yyy = new DeptDTO();
		yyy.setDname("인사과");
		yyy.setLoc("BOSTON");
		List<DeptDTO> list2 = session.selectList("findByDnameOrLoc", yyy);
		System.out.println("################################");
		
		HashMap<String, String> map = new HashMap<>();
		map.put("x", "인사과");
		map.put("y", "BOSTON");
		List<DeptDTO> list3 = session.selectList("findByDnameOrLoc2", map);
		//3. 출력
		System.out.println(list3);
		
		//4. close작업
		session.close();
	}
}
