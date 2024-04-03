package com.jdbc4_DML;

import java.util.List;
import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {

		Scanner scan  = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1. 전체목록");
			System.out.println("2. 부서저장");
			System.out.println("0. 종료");
			System.out.println("-------------------");
			String num = scan.nextLine();
			if("0".equals(num)) {
				System.out.println("프로그램 종료됨.");
				System.exit(0);
			}else if("1".equals(num)) {
				// DeptService 연동
				DeptService service = new DeptServiceImpl();
			    List<DeptDTO> list =service.select();
			    for (DeptDTO dto : list) {
					System.out.println(dto);
				}
			}else if("2".equals(num)) {
				System.out.println("부서번호를 입력하세요.");
				String deptno = scan.next();
				System.out.println("부서명를 입력하세요.");
				String dname = scan.next();
				System.out.println("부서위치를 입력하세요.");
				String loc = scan.next();
				
				//DTO 저장해서 DAO로 전달
				DeptDTO dto = new DeptDTO(Integer.parseInt(deptno), dname, loc);
						
						
				
				
			}else {
				System.out.println("번호를 잘못 입력했습니다.");
			}
			
			
		}//end while
		
	}// end main
}//end class



