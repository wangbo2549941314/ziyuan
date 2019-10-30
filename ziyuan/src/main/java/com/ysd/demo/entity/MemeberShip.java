package com.ysd.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class MemeberShip {
	private Integer memberShipId;
	private String memberShipDepartment;
	private String memberShipSpeciaty;
	private String memberShipDegree;
	public MemeberShip() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemeberShip(Integer memberShipId, String memberShipDepartment, String memberShipSpeciaty,
			String memberShipDegree) {
		super();
		this.memberShipId = memberShipId;
		this.memberShipDepartment = memberShipDepartment;
		this.memberShipSpeciaty = memberShipSpeciaty;
		this.memberShipDegree = memberShipDegree;
	}
	public Integer getMemberShipId() {
		return memberShipId;
	}
	public void setMemberShipId(Integer memberShipId) {
		this.memberShipId = memberShipId;
	}
	public String getMemberShipDepartment() {
		return memberShipDepartment;
	}
	public void setMemberShipDepartment(String memberShipDepartment) {
		this.memberShipDepartment = memberShipDepartment;
	}
	public String getMemberShipSpeciaty() {
		return memberShipSpeciaty;
	}
	public void setMemberShipSpeciaty(String memberShipSpeciaty) {
		this.memberShipSpeciaty = memberShipSpeciaty;
	}
	public String getMemberShipDegree() {
		return memberShipDegree;
	}
	public void setMemberShipDegree(String memberShipDegree) {
		this.memberShipDegree = memberShipDegree;
	}
	@Override
	public String toString() {
		return "MemeberShip [memberShipId=" + memberShipId + ", memberShipDepartment=" + memberShipDepartment
				+ ", memberShipSpeciaty=" + memberShipSpeciaty + ", memberShipDegree=" + memberShipDegree + "]";
	}

	

}
