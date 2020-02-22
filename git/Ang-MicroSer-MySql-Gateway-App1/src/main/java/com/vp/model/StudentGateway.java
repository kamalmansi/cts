package com.vp.model;

public class StudentGateway {

	private Long sid;
	private String firstname;
    private String subject;
    
    
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	public StudentGateway() {
		super();
		
	}
	
	public StudentGateway(Long sid, String firstname, String subject) {
		super();
		this.sid = sid;
		this.firstname = firstname;
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "StudentGateway [sid=" + sid + ", firstname=" + firstname + ", subject=" + subject + "]";
	}
    
    
}
