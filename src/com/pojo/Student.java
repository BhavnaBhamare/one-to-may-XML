package com.pojo;

// Generated Oct 1, 2019 11:28:56 AM by Hibernate Tools 3.4.0.CR1

/**
 * Student generated by hbm2java
 */
public class Student implements java.io.Serializable {

	private Integer sid;
	private Department department;
	private String sfname;
	private String slname;
	private String semail;
	private String sphone;
	private String saddress;
	private String sdateofbirth;

	public Student() {
	}

	public Student(Department department, String sfname, String slname, String semail, String sphone, String saddress,
			String sdateofbirth) {
		this.department = department;
		this.sfname = sfname;
		this.slname = slname;
		this.semail = semail;
		this.sphone = sphone;
		this.saddress = saddress;
		this.sdateofbirth = sdateofbirth;
	}

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getSfname() {
		return this.sfname;
	}

	public void setSfname(String sfname) {
		this.sfname = sfname;
	}

	public String getSlname() {
		return this.slname;
	}

	public void setSlname(String slname) {
		this.slname = slname;
	}

	public String getSemail() {
		return this.semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getSphone() {
		return this.sphone;
	}

	public void setSphone(String sphone) {
		this.sphone = sphone;
	}

	public String getSaddress() {
		return this.saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public String getSdateofbirth() {
		return this.sdateofbirth;
	}

	public void setSdateofbirth(String sdateofbirth) {
		this.sdateofbirth = sdateofbirth;
	}

}
