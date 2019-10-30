package com.ysd.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class Computer {
	private Integer computerId;
	private String computerName;
	private String Ip;
	private Integer readRoomId;
	private String computerRemark;
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Computer(Integer computerId, String computerName, String ip, Integer readRoomId, String computerRemark) {
		super();
		this.computerId = computerId;
		this.computerName = computerName;
		Ip = ip;
		this.readRoomId = readRoomId;
		this.computerRemark = computerRemark;
	}
	public Integer getComputerId() {
		return computerId;
	}
	public void setComputerId(Integer computerId) {
		this.computerId = computerId;
	}
	public String getComputerName() {
		return computerName;
	}
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	public String getIp() {
		return Ip;
	}
	public void setIp(String ip) {
		Ip = ip;
	}
	public Integer getReadRoomId() {
		return readRoomId;
	}
	public void setReadRoomId(Integer readRoomId) {
		this.readRoomId = readRoomId;
	}
	public String getComputerRemark() {
		return computerRemark;
	}
	public void setComputerRemark(String computerRemark) {
		this.computerRemark = computerRemark;
	}
	@Override
	public String toString() {
		return "Computer [computerId=" + computerId + ", computerName=" + computerName + ", Ip=" + Ip + ", readRoomId="
				+ readRoomId + ", computerRemark=" + computerRemark + "]";
	}
	

}
