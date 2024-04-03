

package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SS {

public static void main(String[] args) {
//Dept 테이블 조회
// 1)mysql 접속 정보
String driver ="com.mysql.cj.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/testdb";
String userid = "root";
String passwd = "1234";

//*oracle
/* String driver ="oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:서비스명";
String userid ="system|sys";
String passwd = "1234";
*/
//2)드라이버로딩 + 트라이캐치
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}


//3) connection 연결
Connection con = null;
PreparedStatement pstmt =null;

try {
con = DriverManager.getConnection(url,userid, passwd);


//4)sql문 작성 // 문장 끝의 ; 반드시 제외
String sql = "select deptno as no, dname, loc from dept";


//5)PreparedStatement 얻기(sql문 전송 담당 객체)
pstmt = con.prepareStatement(sql);

//6)sql문 전송 ==> ResultSet은 select한 결과 값 = 테이블
ResultSet rs = pstmt.executeQuery();

//7) ResultSet 에서 컬럼값 얻기
while (rs.next()) {
int deptno = rs.getInt("no"); //컬럼헤드값
String dname = rs.getString(2);
String loc = rs.getString("loc");

System.out.println(deptno+"\t"+dname+"\t"+loc);



}
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}


}










