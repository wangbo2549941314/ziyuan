package com.ysd.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ysd.demo.entity.ReadRoom;
import com.ysd.demo.service.ReadRoomService;
@RestController
@CrossOrigin
public class ReadRoomController {
	@Autowired
	private ReadRoomService readRoomService;
	@RequestMapping("/selectReadRoom1")
	public List<ReadRoom> selectReadRoom() {
		return readRoomService.selectReadRoom();
		
	}
}
