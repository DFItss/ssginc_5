package com.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//역할: -비즈니즈로직코드(가공), -트랜잭션처리(*****)
// Connection con 까지만 얻으면 됨.
public class DeptServiceImpl implements DeptService {

	      String driver ="com.mysql.cj.jdbc.Driver";
	      String url = "jdbc:mysql://localhost:3306/testdb";
	      String userid ="root";
	      String passwd = "1234";
	      
	      //생성자
	      public DeptServiceImpl() {
	    	try {
	   			Class.forName(driver);
	   		} catch (ClassNotFoundException e) {
	   			e.printStackTrace();
	   		} 
	      }
	      
	      // 메서드
	      @Override
	      public void select() {
	    	  Connection con = null;
	    	  try {
				  con =  DriverManager.getConnection(url, userid, passwd);
		
				  //DeptDAO 연동
				  DeptDAO dao = new  DeptDAO();
				  dao.select(con);
				  
	    	  }catch (SQLException e) {
	  			e.printStackTrace();
	  		  }finally {
	  			   try {
	  				if(con!=null)con.close();
	  			} catch (SQLException e) {
	  				e.printStackTrace();
	  			}
	  		  }//end finally
	      }//end select
	      
	      
	      
	      
	      
	      
	      
}
