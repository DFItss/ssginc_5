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
	
		List<DeptDTO> list =
				session.selectList("com.config.DeptMapper.findAll");
		System.out.println(list);
		//4. close작업
		session.close();
	}
}
