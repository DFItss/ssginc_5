package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteTest {

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
		      
			  String sql = "delete from dept where deptno=?";
	

		      // 5) PreparedStatement 얻기 (sql문 전송 담당 객체)
		      pstmt = con.prepareStatement(sql);
		      
	// ? 대신에 값 설정
	pstmt.setInt(1, 1);

		      
		      // 6) sql 문 전송. ==> DML 은  정수로 반환. 
	 		  int n = pstmt.executeUpdate();
	 		  System.out.println(n + " 개가 삭제됨.");
	 		  
		  }catch (SQLException e) {
			e.printStackTrace();
		  }finally {
			   //8. 역순
			   try {
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }//end finally
	      

	       
	    
	       
	      
	}//end main
}//end class




