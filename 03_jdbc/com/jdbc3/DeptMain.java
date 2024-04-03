package com.jdbc3;

import java.util.List;

public class DeptMain {

	public static void main(String[] args) {

		// DeptService 연동
		DeptService service = new DeptServiceImpl();
	    List<DeptDTO> list =service.select();
		
	    for (DeptDTO dto : list) {
			System.out.println(dto);
		}
	    
	}
}



