package com.example.lesson1;

public class Customers{
	private int cid;
	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + "]";
	}
	private int cname;
	private int cemail;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCname() {
		return cname;
	}
	public void setCname(int cname) {
		this.cname = cname;
	}
	public int getCemail() {
		return cemail;
	}
	public void setCemail(int cemail) {
		this.cemail = cemail;
	}
	
}