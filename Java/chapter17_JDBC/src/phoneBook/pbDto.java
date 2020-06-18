package phoneBook;

public class pbDto {

	private String pidx;
	private String pname;
	private String pnum;
	private String padd;
	private String pemail;
	private String ptype;

	private String pumajor;
	private int puyear;
	
	private String pcomname;
	private String pcomdept;
	private String pcomjob;
	
	private String pcafename;
	private String pcafenickname;
	
	// 기본 연락처
	public pbDto(String pidx, String pname, String pnum, String padd, String pemail) {
		this.pidx = pidx;
		this.pname = pname;
		this.pnum = pnum;
		this.padd = padd;
		this.pemail = pemail;
	}
	
	// 대학 연락처
	public pbDto(String pidx, String pname, String pnum, String padd, String pemail, String ptype, String pumajor,
			int puyear) {
		this.pidx = pidx;
		this.pname = pname;
		this.pnum = pnum;
		this.padd = padd;
		this.pemail = pemail;
		this.ptype = ptype;
		this.pumajor = pumajor;
		this.puyear = puyear;
	}
	
	// 직장 연락처
	public pbDto(String pidx, String pname, String pnum, String padd, String pemail, String ptype, String pcomname,
			String pcomdept, String pcomjob) {
		this.pidx = pidx;
		this.pname = pname;
		this.pnum = pnum;
		this.padd = padd;
		this.pemail = pemail;
		this.ptype = ptype;
		this.pcomname = pcomname;
		this.pcomdept = pcomdept;
		this.pcomjob = pcomjob;
	}
	
	// 동호회 연락처
	public pbDto(String pidx, String pname, String pnum, String padd, String pemail, String ptype, String pcafename,
			String pcafenickname) {
		this.pidx = pidx;
		this.pname = pname;
		this.pnum = pnum;
		this.padd = padd;
		this.pemail = pemail;
		this.ptype = ptype;
		this.pcafename = pcafename;
		this.pcafenickname = pcafenickname;
	}
	
	public pbDto(String pidx, String pname, String pnum, String padd, String pemail, String ptype, String pumajor,
			int puyear, String pcomname, String pcomdept, String pcomjob, String pcafename, String pcafenickname) {
		this.pidx = pidx;
		this.pname = pname;
		this.pnum = pnum;
		this.padd = padd;
		this.pemail = pemail;
		this.ptype = ptype;
		this.pumajor = pumajor;
		this.puyear = puyear;
		this.pcomname = pcomname;
		this.pcomdept = pcomdept;
		this.pcomjob = pcomjob;
		this.pcafename = pcafename;
		this.pcafenickname = pcafenickname;
	}

	public String getPidx() {
		return pidx;
	}

	public String getPname() {
		return pname;
	}

	public String getPnum() {
		return pnum;
	}

	public String getPadd() {
		return padd;
	}

	public String getPemail() {
		return pemail;
	}

	public String getPtype() {
		return ptype;
	}

	public String getPumajor() {
		return pumajor;
	}

	public int getPuyear() {
		return puyear;
	}

	public String getPcomname() {
		return pcomname;
	}

	public String getPcomdept() {
		return pcomdept;
	}

	public String getPcomjob() {
		return pcomjob;
	}

	public String getPcafename() {
		return pcafename;
	}

	public String getPcafenickname() {
		return pcafenickname;
	}
	
}
