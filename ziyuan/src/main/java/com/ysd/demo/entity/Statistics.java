package com.ysd.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class Statistics {
	private Integer statisticsId;
	private Integer readRoomId;
	private Integer PeopleNum;
	private String year;
	private String month;
	private String days;
	
	private ReadRoom readRoom;

	public Statistics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Statistics(Integer statisticsId, Integer readRoomId, Integer peopleNum, String year, String month,
			String days, ReadRoom readRoom) {
		super();
		this.statisticsId = statisticsId;
		this.readRoomId = readRoomId;
		PeopleNum = peopleNum;
		this.year = year;
		this.month = month;
		this.days = days;
		this.readRoom = readRoom;
	}

	public Integer getStatisticsId() {
		return statisticsId;
	}

	public void setStatisticsId(Integer statisticsId) {
		this.statisticsId = statisticsId;
	}

	public Integer getReadRoomId() {
		return readRoomId;
	}

	public void setReadRoomId(Integer readRoomId) {
		this.readRoomId = readRoomId;
	}

	public Integer getPeopleNum() {
		return PeopleNum;
	}

	public void setPeopleNum(Integer peopleNum) {
		PeopleNum = peopleNum;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public ReadRoom getReadRoom() {
		return readRoom;
	}

	public void setReadRoom(ReadRoom readRoom) {
		this.readRoom = readRoom;
	}

	@Override
	public String toString() {
		return "Statistics [statisticsId=" + statisticsId + ", readRoomId=" + readRoomId + ", PeopleNum=" + PeopleNum
				+ ", year=" + year + ", month=" + month + ", days=" + days + ", readRoom=" + readRoom + "]";
	}
	

}
