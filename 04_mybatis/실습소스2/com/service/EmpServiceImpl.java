package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.EmpDTO;

public class EmpServiceImpl implements EmpService{

	@Override
	public List<EmpDTO> findAll() {
	 List<EmpDTO> list = null;	
	 SqlSession session = null;
      try {
		session = MySqlSessionFactory.getSession();
		//DAO 연동코드
		
      }finally {
		session.close();
      }
		return list;
	}

	@Override
	public int save(EmpDTO dto) {
		int n = 0;
		SqlSession session = null;
	      try {
			session = MySqlSessionFactory.getSession();
			//DAO 연동코드
			
	      }finally {
			session.close();
	      }
		
		return n;
	}

	@Override
	public int remove(int empno) {
		int n = 0;
		SqlSession session = null;
	      try {
			session = MySqlSessionFactory.getSession();
			//DAO 연동코드
			
	      }finally {
			session.close();
	      }
		
		return n;
	}

}
