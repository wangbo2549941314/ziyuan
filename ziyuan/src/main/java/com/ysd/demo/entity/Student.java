package com.ysd.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private Integer studentId;
	private String studentCardId;
	private String studentName;
	private String studentSex;
	private Integer memberShipId;
	private Integer studentStatus;
	private String studentRemark;
	private String studentStuNo;
	 
	private MemeberShip membership;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer studentId, String studentCardId, String studentName, String studentSex, Integer memberShipId,
			Integer studentStatus, String studentRemark, String studentStuNo, MemeberShip membership) {
		super();
		this.studentId = studentId;
		this.studentCardId = studentCardId;
		this.studentName = studentName;
		this.studentSex = studentSex;
		this.memberShipId = memberShipId;
		this.studentStatus = studentStatus;
		this.studentRemark = studentRemark;
		this.studentStuNo = studentStuNo;
		this.membership = membership;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentCardId() {
		return studentCardId;
	}

	public void setStudentCardId(String studentCardId) {
		this.studentCardId = studentCardId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSex() {
		return studentSex;
	}

	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}

	public Integer getMemberShipId() {
		return memberShipId;
	}

	public void setMemberShipId(Integer memberShipId) {
		this.memberShipId = memberShipId;
	}

	public Integer getStudentStatus() {
		return studentStatus;
	}

	public void setStudentStatus(Integer studentStatus) {
		this.studentStatus = studentStatus;
	}

	public String getStudentRemark() {
		return studentRemark;
	}

	public void setStudentRemark(String studentRemark) {
		this.studentRemark = studentRemark;
	}

	public String getStudentStuNo() {
		return studentStuNo;
	}

	public void setStudentStuNo(String studentStuNo) {
		this.studentStuNo = studentStuNo;
	}

	public MemeberShip getMembership() {
		return membership;
	}

	public void setMembership(MemeberShip membership) {
		this.membership = membership;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentCardId=" + studentCardId + ", studentName=" + studentName
				+ ", studentSex=" + studentSex + ", memberShipId=" + memberShipId + ", studentStatus=" + studentStatus
				+ ", studentRemark=" + studentRemark + ", studentStuNo=" + studentStuNo + ", membership=" + membership
				+ "]";
	}
	
	
	
	
	 

}
