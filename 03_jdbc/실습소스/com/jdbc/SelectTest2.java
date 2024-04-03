package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest2 {

	public static void main(String[] args) {

		// Dept 테이블 조회
		  // 1) mysql 접속 정보
	      String driver ="com.mysql.cj.jdbc.Driver";
	      String url = "jdbc:mysql://localhost:3306/testdb";
	      String userid ="root";
	      String passwd = "1234";
		
	      // 2) 드라이버 로딩
	      try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	      
	      //3) Connection 연결
	      Connection con = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      try {
			  con =  DriverManager.getConnection(url, userid, passwd);
		      String sql = "select deptno as no, dname, loc"
		      		       + " from dept"
		      		       + " where deptno = ? or dname = ?"; 
		      pstmt = con.prepareStatement(sql);
		      
		      // ? 대신에 실제값 설정
		      
		      pstmt.setString(2, "인사과");
		      pstmt.setInt(1, 10);
		      
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
			
			   //8. 역순
			   try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }//end finally
	      

	       
	    
	       
	      
	}//end main
}//end class




