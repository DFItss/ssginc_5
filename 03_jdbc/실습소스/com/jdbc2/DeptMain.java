package com.jdbc2;

public class DeptMain {

	public static void main(String[] args) {

		// DeptService 연동
		DeptService service = new DeptServiceImpl();
		service.select();
		
	}
}
