import java.util.List;
import java.util.Scanner;

import com.dao.EmpDAO;
import com.dto.EmpDTO;
import com.service.EmpService;
import com.service.EmpServiceImpl;

public class EmpMain {

	public static void main(String[] args) {

		EmpService service = new EmpServiceImpl();
		service.setDao(new EmpDAO());
        Scanner scan  = new Scanner(System.in);	
		while(true) {
			System.out.println("1. 전체목록");
			System.out.println("2. 사원삭제");
			System.out.println("0. 종료");
			System.out.println("-------------------");
			String num = scan.next();
			if("1".equals(num)) {
List<EmpDTO> list = service.findAll();
for (EmpDTO e : list) {
	System.out.println(e);
}
			}else if("2".equals(num)) {
				
				System.out.println("삭제할 사원번호를 입력하세요.");
				String deptno = scan.next();
                int n = service.removeByEmpno(Integer.parseInt(deptno));
                System.out.println(n+" 개가 삭제됨.");			
				
			}else if("0".equals(num)) {
				System.out.println("프로그램 종료됨.");
				System.exit(0);
			}
			
		}//end while
	}//end main
}//end class
