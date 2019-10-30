package com.ysd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysd.demo.dao.ReadRoomMapper;
import com.ysd.demo.entity.ReadRoom;

@Service
public class ReadRoomServiceImpl implements ReadRoomService{
	@Autowired
	private ReadRoomMapper readRoomMapper;

	public List<ReadRoom> selectReadRoom() {
		return readRoomMapper.selectReadRoom();
	}

}
