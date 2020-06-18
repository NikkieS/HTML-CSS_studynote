package prac;

import java.sql.Date;

// VO : 읽기 전용
// DTO : 읽기, 쓰기 전용
public class Emp {
	
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
	
	public Emp() {}
	
	public Emp(int empno, String ename, String job, int mgr, Date hiredate, int sal, int comm, int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
	public int getEmpno() {
		return empno;
	}
	public String getEname() {
		return ename;
	}
	public String getJob() {
		return job;
	}
	public int getMgr() {
		return mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public int getSal() {
		return sal;
	}
	public int getComm() {
		return comm;
	}
	public int getDeptno() {
		return deptno;
	}
}
