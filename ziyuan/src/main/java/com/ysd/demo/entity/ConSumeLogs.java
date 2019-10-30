package com.ysd.demo.entity;


import org.springframework.stereotype.Component;

@Component
public class ConSumeLogs {
	private Integer Id;
	private String cardNo;
	private Integer readRoomId;
	private String inTime;
	private String outTime;
	private Integer status;
	
	private ReadRoom readRoom;
	
	public ConSumeLogs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ConSumeLogs(Integer id, String cardNo, Integer readRoomId, String inTime, String outTime, Integer status,
			ReadRoom readRoom) {
		super();
		Id = id;
		this.cardNo = cardNo;
		this.readRoomId = readRoomId;
		this.inTime = inTime;
		this.outTime = outTime;
		this.status = status;
		this.readRoom = readRoom;
	}

	public ReadRoom getReadRoom() {
		return readRoom;
	}

	public void setReadRoom(ReadRoom readRoom) {
		this.readRoom = readRoom;
	}

	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public Integer getReadRoomId() {
		return readRoomId;
	}
	public void setReadRoomId(Integer readRoomId) {
		this.readRoomId = readRoomId;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ConSumeLogs [Id=" + Id + ", cardNo=" + cardNo + ", readRoomId=" + readRoomId + ", inTime=" + inTime
				+ ", outTime=" + outTime + ", status=" + status + ", readRoom=" + readRoom + "]";
	}
	

}
