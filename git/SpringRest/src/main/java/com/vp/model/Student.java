package com.vp.model;

public class Student {
	
	int sid;
	String uname;
	String address;
	
	
	public Student() {
		super();
		
	}
	public Student(int sid, String uname, String address) {
		super();
		this.sid = sid;
		this.uname = uname;
		this.address = address;
	}
	/**
	 * @return the sid
	 */
	public int getSid() {
		return sid;
	}
	/**
	 * @param sid the sid to set
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}
	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}
	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", uname=" + uname + ", address=" + address + "]";
	}
	

}
