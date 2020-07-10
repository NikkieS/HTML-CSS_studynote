package model;

public class Report {
	private int idx;
	private String sname;
	private String stn;
	private String report;
	
	public Report(int idx, String sname, String stn, String report) {
		this.idx = idx;
		this.sname = sname;
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

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
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
		return "Report [idx=" + idx + ", sname=" + sname + ", stn=" + stn + ", report=" + report + "]";
	}
}
