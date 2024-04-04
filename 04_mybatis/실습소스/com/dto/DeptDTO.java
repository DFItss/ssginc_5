package com.dto;

// 역할: dept 테이블의 컬럼을 저장하는 역할.
// 규칙: select할 때 반환되는 컬럼의 헤더값으로 변수를 지정해야 된다.
public class DeptDTO {

	int deptno;
	String dname;
	String loc;
	
	public DeptDTO() {	}

	public DeptDTO(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "DeptDTO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
	
}
