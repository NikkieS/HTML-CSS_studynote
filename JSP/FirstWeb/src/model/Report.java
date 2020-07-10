package model;

public class Report {
	private int idx;
	private String uname;
	private String stn;
	private String report;
	
	public Report(int idx, String sname, String stn, String report) {
		this.idx = idx;
		this.uname = sname;
		this.stn = stn;
		this.report = report;
	}

	public Report() {
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String sname) {
		this.uname = sname;
	}

	public String getStn() {
		return stn;
	}

	public void setStn(String stn) {
		this.stn = stn;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	@Override
	public String toString() {
		return "Report [idx=" + idx + ", sname=" + uname + ", stn=" + stn + ", report=" + report + "]";
	}
}
