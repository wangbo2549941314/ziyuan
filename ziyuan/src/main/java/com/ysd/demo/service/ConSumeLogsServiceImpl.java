package com.ysd.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysd.demo.dao.ConSumeLogsMapper;
import com.ysd.demo.entity.ConSumeLogs;

@Service
public class ConSumeLogsServiceImpl implements ConSumeLogsService{
	@Autowired
	private ConSumeLogsMapper conSumeLogsMapper;

    //添加
	public Integer insertConSumeLogs(ConSumeLogs conSumeLogs) {
		Integer insertConSumeLogs = conSumeLogsMapper.insertConSumeLogs(conSumeLogs);
		return insertConSumeLogs;
	}

	//修改状态
	public Integer updateStatus(ConSumeLogs conSumeLogs) {
		Integer updateStatus = conSumeLogsMapper.updateStatus(conSumeLogs);
		return updateStatus;
	}

	//查询所在图书馆
	public ConSumeLogs selectReadRoom(String cardNo) {
		ConSumeLogs selectReadRoom = conSumeLogsMapper.selectReadRoom(cardNo);
		return selectReadRoom;
	}

	//柱状图
	public List<Map<String, Object>> seleltReadroomOne() {
		return conSumeLogsMapper.seleltReadroomOne();
	}

	//饼图
	public List<Map<String, Object>> selectTeacherNum() {
		return conSumeLogsMapper.selectTeacherNum();
	}

	//饼图
	public List<Map<String, Object>> selectStudentNum() {
		return conSumeLogsMapper.selectStudentNum();
	}

	//折线图
	public List<Map<String, Object>> selectConSumeLogsNum() {
		return conSumeLogsMapper.selectConSumeLogsNum();
	}



}
