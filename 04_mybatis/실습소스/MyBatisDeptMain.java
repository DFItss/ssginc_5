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
		
		//3. 출력
		System.out.println(list);
		
		//4. close작업
		session.close();
	}
}
