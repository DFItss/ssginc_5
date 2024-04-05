package com.service;

import java.util.List;

import com.dto.EmpDTO;

public interface EmpService {

	public List<EmpDTO> findAll();
	public int save(EmpDTO dto);
	public int remove(int empno);
}
