package com.ysd.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class ReadRoom {
	private Integer readRoomId;
	private String readRoomName;
	private String readRoomRemark;

	public ReadRoom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReadRoom(Integer readRoomId, String readRoomName, String readRoomRemark) {
		super();
		this.readRoomId = readRoomId;
		this.readRoomName = readRoomName;
		this.readRoomRemark = readRoomRemark;
	}

	public Integer getReadRoomId() {
		return readRoomId;
	}

	public void setReadRoomId(Integer readRoomId) {
		this.readRoomId = readRoomId;
	}

	public String getReadRoomName() {
		return readRoomName;
	}

	public void setReadRoomName(String readRoomName) {
		this.readRoomName = readRoomName;
	}

	public String getReadRoomRemark() {
		return readRoomRemark;
	}

	public void setReadRoomRemark(String readRoomRemark) {
		this.readRoomRemark = readRoomRemark;
	}

	@Override
	public String toString() {
		return "ReadRoom [readRoomId=" + readRoomId + ", readRoomName=" + readRoomName + ", readRoomRemark="
				+ readRoomRemark + "]";
	}

}
