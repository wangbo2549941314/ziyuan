package com.ysd.demo.service;

import java.util.List;
import java.util.Map;

import com.ysd.demo.entity.ConSumeLogs;

public interface ConSumeLogsService {
	// 添加
	Integer insertConSumeLogs(ConSumeLogs conSumeLogs);

	// 修改状态
	Integer updateStatus(ConSumeLogs conSumeLogs);

	// 查询所在图书馆
	ConSumeLogs selectReadRoom(String cardNo);

	// 柱状图
	List<Map<String, Object>> seleltReadroomOne();

	// 饼图
	List<Map<String, Object>> selectTeacherNum();

	// 饼图
	List<Map<String, Object>> selectStudentNum();

	// 折线图
	List<Map<String, Object>> selectConSumeLogsNum();

}
