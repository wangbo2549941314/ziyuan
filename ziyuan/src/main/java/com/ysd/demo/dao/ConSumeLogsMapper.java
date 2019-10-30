package com.ysd.demo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ysd.demo.entity.ConSumeLogs;

@Mapper
public interface ConSumeLogsMapper {
	// 添加日志记录
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
	
	//折线图
	List<Map<String, Object>> selectConSumeLogsNum();
}
