package com.jdbc4_DML;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

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
public List<DeptDTO> select() {
List<DeptDTO> list = null;
	    	  Connection con = null;
	    	  try {
				  con =  DriverManager.getConnection(url, userid, passwd);
				  //DeptDAO 연동
				  DeptDAO dao = new  DeptDAO();
 list = dao.select(con);
	    	  }catch (SQLException e) {
	  			e.printStackTrace();
	  		  }finally {
	  			   try {
	  				if(con!=null)con.close();
	  			} catch (SQLException e) {
	  				e.printStackTrace();
	  			}
	  		  }//end finally
return list;
	      }//end select

		@Override
		public int insert(DeptDTO dto) {
int n = 0;
			  Connection con = null;
	    	  try {
				  con =  DriverManager.getConnection(url, userid, passwd);
				  //DeptDAO 연동
				  DeptDAO dao = new  DeptDAO();
n = dao.insert(con, dto);
	    	  }catch (SQLException e) {
	  			e.printStackTrace();
	  		  }finally {
	  			   try {
	  				if(con!=null)con.close();
	  			} catch (SQLException e) {
	  				e.printStackTrace();
	  			}
	  		  }//end finally
return n;
		}

		@Override
		public int delete(int deptno) {
			int n = 0;
			  Connection con = null;
	    	  try {
				  con =  DriverManager.getConnection(url, userid, passwd);
				  //DeptDAO 연동
				  DeptDAO dao = new  DeptDAO();
n = dao.delete(con, deptno);
	    	  }catch (SQLException e) {
	  			e.printStackTrace();
	  		  }finally {
	  			   try {
	  				if(con!=null)con.close();
	  			} catch (SQLException e) {
	  				e.printStackTrace();
	  			}
	  		  }//end finally
	    	  return n;
		}

}
