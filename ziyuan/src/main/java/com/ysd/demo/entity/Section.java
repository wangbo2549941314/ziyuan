package com.ysd.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class Section {
	private Integer sectionId;
	private String sectionName;
	private String sectionRamk;

	public Section() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Section(Integer sectionId, String sectionName, String sectionRamk) {
		super();
		this.sectionId = sectionId;
		this.sectionName = sectionName;
		this.sectionRamk = sectionRamk;
	}

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public String getSectionRamk() {
		return sectionRamk;
	}

	public void setSectionRamk(String sectionRamk) {
		this.sectionRamk = sectionRamk;
	}

	@Override
	public String toString() {
		return "Section [sectionId=" + sectionId + ", sectionName=" + sectionName + ", sectionRamk=" + sectionRamk
				+ "]";
	}

}
