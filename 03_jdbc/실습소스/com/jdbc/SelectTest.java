package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

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
	      try {
			con =  DriverManager.getConnection(url, userid, passwd);
			
			  // 4) sql문 작성 ==> 문장끝의 ; 반드시 제외.
		      String sql = "select deptno as no, dname, loc from dept"; 
			
		      // 5) PreparedStatement 얻기 (sql문 전송 담당 객체)
		      pstmt = con.prepareStatement(sql);
		      
		      // 6) sql 문 전송. ==> ResultSet 은 select한 결과값이고 테이블로 생각하자.
		      ResultSet rs  = pstmt.executeQuery();
		      
		      // 7) ResultSet 에서 컬럼값 얻기
		      while(rs.next()) {
		    	  
		    	  int deptno = rs.getInt("no"); // 컬럼헤더값
		    	  String dname = rs.getString(2); // 컬럼헤더 위치값
		    	  String loc = rs.getString("loc"); // 컬럼헤더값
		    	  
		    	  System.out.println(deptno+"\t"+dname+"\t"+loc);
		      }
		      
		      
		  }catch (SQLException e) {
			e.printStackTrace();
		}
	      

	       
	    
	       
	      
	}//end main
}//end class




