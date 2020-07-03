package model;

import java.util.HashMap;
import java.util.Map;

public class MemberInfo {
	private String uid;
	private String upw;
	private Map<String, String> list = new HashMap<String, String>();
	
	// default 생성자
	public MemberInfo() {
	}
	
	public MemberInfo(String uid, String upw) {
		super();
		this.uid = uid;
		this.upw = upw;
	}
	public void mPush() {
		list.put(this.uid, this.upw);
	}
	public Map<String, String> getList() {
		return list;
	}
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpw() {
		return upw;
	}

	public void setUpw(String upw) {
		this.upw = upw;
	}

	@Override
	public String toString() {
		return "MemberInfo [id=" + uid + ", pw=" + upw + "]";
	}
	
		
}
