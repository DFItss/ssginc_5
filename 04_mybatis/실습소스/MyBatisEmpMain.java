import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
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
		
		//3.선택적 update
//		EmpDTO dto4 = new EmpDTO();
//		dto4.setSal(8500);
//		dto4.setEname("강길동");
//		dto4.setEmpno(3);
//int n3 = session.update("com.config.EmpMapper.update", dto4);
//session.commit();
//System.out.println(n3 + " 개가 수정됨.");
		
		
		// 4. multi update
//		List<Integer> list4 = Arrays.asList(3, 7369, 7499);
//int n4 = session.update("com.config.EmpMapper.updateSal", list4);
//session.commit();
//System.out.println(n4 + " 개가 수정됨.");		
		
		// 5. 다중 조건
		HashMap<String, String> map = new HashMap<>();
//		map.put("xxx", "MANAGER");  // select empno, sal from emp where sal > 1500 order by sal desc
//		map.put("xxx", "SALESMAN"); // select empno, sal from emp where sal > 2500 order by sal desc
List<EmpDTO> list5 = session.selectList("com.config.EmpMapper.multiChoose", map);	
for (EmpDTO k : list5) {
	System.out.println(k.getEmpno()+"\t"+ k.getJob()+ "\t" + k.getSal());
}
		
		// 6. 단일 컬럼
//int cnt = session.selectOne("com.config.EmpMapper.totalCount");
//System.out.println("총레코드갯수:"+ cnt);
		
		//7. 페이징 처리
//		int curPage=2;
//		int perPage=3; // 페이지당 보여줄 레코드 갯수
//		int skip = (curPage-1)*perPage;
//		
//List<EmpDTO> list7 = session.selectList("com.config.EmpMapper.paging", null, 
//		                           new RowBounds(skip, perPage));
//for (EmpDTO xxx : list7) {
//	System.out.println(xxx.getEmpno()+"\t"+xxx.getEname());
//}
session.close();
	}
}




