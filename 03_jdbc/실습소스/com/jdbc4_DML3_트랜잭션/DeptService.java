package com.jdbc4_DML3_트랜잭션;

import java.sql.Connection;
import java.util.List;

//역할: - 메서드 강제, loosely coupling, 어떤 기능인지 쉽게 알 수 있다.
public interface DeptService {
	public List<DeptDTO> select();
	public int insert(DeptDTO dto)throws DuplicatedDeptnoException;
	public int delete(int deptno);
	
	//트랜잭션처리
	public int insertDelete(DeptDTO dto, int deptno)throws DuplicatedDeptnoException;
}
