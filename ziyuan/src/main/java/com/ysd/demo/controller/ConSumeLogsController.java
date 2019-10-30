package com.ysd.demo.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ysd.demo.entity.ConSumeLogs;
import com.ysd.demo.service.ConSumeLogsService;

@RestController
@CrossOrigin
public class ConSumeLogsController {
	@Autowired
	private ConSumeLogsService conSumeLogsService;

	// 添加日志记录
	@RequestMapping("/insertConSumeLogs")
	public Integer insertConSumeLogs(ConSumeLogs conSumeLogs) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		conSumeLogs.setInTime(sdf.format(new Date()));
		Integer insertConSumeLogs = conSumeLogsService.insertConSumeLogs(conSumeLogs);
		return insertConSumeLogs;
	}

	// 修改状态
	@RequestMapping("/updateStatus")
	public Integer updateStatus(ConSumeLogs conSumeLogs) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		conSumeLogs.setOutTime(sdf.format(new Date()));
		Integer updateStatus = conSumeLogsService.updateStatus(conSumeLogs);
		return updateStatus;
	}

	// 查询所在图书馆
	@RequestMapping("/selectReadRoom")
	public ConSumeLogs selectReadRoom(String cardNo) {
		ConSumeLogs selectReadRoom = conSumeLogsService.selectReadRoom(cardNo);
		return selectReadRoom;
	}

	// 柱状图
	@RequestMapping("/seleltReadroomOne")
	public List<Map<String, Object>> seleltReadroomOne() {
		return conSumeLogsService.seleltReadroomOne();
	}

	// 饼图
	@RequestMapping("/selectTeacherNum")
	public List<Map<String, Object>> selectTeacherNum() {
		List<Map<String, Object>> selectTeacherNum = conSumeLogsService.selectTeacherNum();
		return selectTeacherNum;
	}

	// 饼图
	@RequestMapping("/selectStudentNum")
	public List<Map<String, Object>> selectStudentNum() {
		List<Map<String, Object>> selectStudentNum = conSumeLogsService.selectStudentNum();
		return selectStudentNum;
	}

	// 折线图
	@RequestMapping("/selectConSumeLogsNum")
	public List<Map<String, Object>> selectConSumeLogsNum() {
		List<Map<String, Object>> selectConSumeLogsNum = conSumeLogsService.selectConSumeLogsNum();
		return selectConSumeLogsNum;
	}

}
