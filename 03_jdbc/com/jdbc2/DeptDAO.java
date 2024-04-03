package com.jdbc2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 역할: MySQL DB 연동
// DAO 패턴: Data Access Object
public class DeptDAO {

	public void select(Connection con) {
		 PreparedStatement pstmt = null;
	     ResultSet rs = null;
	     try {
		      String sql = "select deptno as no, dname, loc from dept"; 
		      
pstmt = con.prepareStatement(sql);
		      rs  = pstmt.executeQuery();
		      while(rs.next()) {
		    	  int deptno = rs.getInt("no"); // 컬럼헤더값
		    	  String dname = rs.getString(2); // 컬럼헤더 위치값
		    	  String loc = rs.getString("loc"); // 컬럼헤더값
		    	  System.out.println(deptno+"\t"+dname+"\t"+loc);
		      }
		  }catch (SQLException e) {
			e.printStackTrace();
		  }finally {
			   try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		  }//end finally
	}//end select
}
