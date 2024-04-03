package com.jdbc4_DML2_예외처리;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// 역할: MySQL DB 연동
// DAO 패턴: Data Access Object
public class DeptDAO {

	// 부서 삭제
	public int delete(Connection con, int deptno) {
int n = 0;
		 PreparedStatement pstmt = null;
	     try {
String sql = "delete from dept where deptno=?";
             pstmt = con.prepareStatement(sql);
pstmt.setInt(1, deptno);
n = pstmt.executeUpdate();
		  }catch (SQLException e) {
			e.printStackTrace();
		  }finally {
			   try {
				if(pstmt!=null)pstmt.close();
			} catch (SQLException e) {e.printStackTrace();}
		  }//end finally
return n;		
	}
	
	
	
	
	
	//부서 저장
	public int insert(Connection con, DeptDTO dto)
throws DuplicatedDeptnoException{
      int n = 0;
		 PreparedStatement pstmt = null;
	     try {
	    	  String sql = "insert into dept ( deptno, dname, loc ) "
		  		       + " values (?,?,?)";
              pstmt = con.prepareStatement(sql);
      pstmt.setInt(1, dto.getDeptno());
      pstmt.setString(2, dto.getDname());
      pstmt.setString(3, dto.getLoc());
      n = pstmt.executeUpdate();
		  }catch (SQLException e) {
			
// 중복예외처리 클래스를 만들고 명시적으로 생성한다.
throw new DuplicatedDeptnoException(dto.getDeptno()+" 값이 중복");
			  
		  }finally {
			   try {
				if(pstmt!=null)pstmt.close();
			} catch (SQLException e) {e.printStackTrace();}
		  }//end finally
return n;
	}//end insert
	

	
	
	// 목록보기
	public List<DeptDTO> select(Connection con) {
		
		 //DTO 누적하는 용도로 ArrayList를 사용한다.
List<DeptDTO> list = new ArrayList<>();
		
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
		    	  //DTO 저장하고 누적해야 된다.
DeptDTO dto = new DeptDTO(deptno, dname, loc);
list.add(dto);
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
	     
return list;
	}//end select
}
