package com.pojo;

// Generated Oct 1, 2019 11:28:56 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Department generated by hbm2java
 */
public class Department implements java.io.Serializable {

	private Integer did;
	private String dname;
	private String dphone;
	private String demail;
	private Set students = new HashSet(0);

	public Department() {
	}

	public Department(String dname, String dphone, String demail, Set students) {
		this.dname = dname;
		this.dphone = dphone;
		this.demail = demail;
		this.students = students;
	}

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDphone() {
		return this.dphone;
	}

	public void setDphone(String dphone) {
		this.dphone = dphone;
	}

	public String getDemail() {
		return this.demail;
	}

	public void setDemail(String demail) {
		this.demail = demail;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

}