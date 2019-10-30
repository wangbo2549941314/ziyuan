package com.ysd.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
	private Integer teacherId;
	private String teacherCardId;
	private String teacherName;
	private String teacherSex;
	private Integer sectionId;
	private Integer teacherStatus;
	private String teacherRemark;
	
	private Section section;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Teacher(Integer teacherId, String teacherCardId, String teacherName, String teacherSex, Integer sectionId,
			Integer teacherStatus, String teacherRemark, Section section) {
		super();
		this.teacherId = teacherId;
		this.teacherCardId = teacherCardId;
		this.teacherName = teacherName;
		this.teacherSex = teacherSex;
		this.sectionId = sectionId;
		this.teacherStatus = teacherStatus;
		this.teacherRemark = teacherRemark;
		this.section = section;
	}


	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherCardId() {
		return teacherCardId;
	}

	public void setTeacherCardId(String teacherCardId) {
		this.teacherCardId = teacherCardId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherSex() {
		return teacherSex;
	}

	public void setTeacherSex(String teacherSex) {
		this.teacherSex = teacherSex;
	}

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public Integer getTeacherStatus() {
		return teacherStatus;
	}

	public void setTeacherStatus(Integer teacherStatus) {
		this.teacherStatus = teacherStatus;
	}

	public String getTeacherRemark() {
		return teacherRemark;
	}

	public void setTeacherRemark(String teacherRemark) {
		this.teacherRemark = teacherRemark;
	}

	public Section getSection() {
		return section;
	}


	public void setSection(Section section) {
		this.section = section;
	}


	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherCardId=" + teacherCardId + ", teacherName=" + teacherName
				+ ", teacherSex=" + teacherSex + ", sectionId=" + sectionId + ", teacherStatus=" + teacherStatus
				+ ", teacherRemark=" + teacherRemark + ", section=" + section + "]";
	}




}
