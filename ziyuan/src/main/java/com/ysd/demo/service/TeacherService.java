package com.ysd.demo.service;

import java.util.List;
import java.util.Map;

import com.ysd.demo.entity.Fenye;
import com.ysd.demo.entity.Section;
import com.ysd.demo.entity.Teacher;

public interface TeacherService {
	// 查询所有
	Fenye<Teacher> selectTeacher(Fenye<Teacher> fenye);

	// 根据卡号查询老师
	Teacher selectTeacherCardId(String teacherCardId);

	// 修改卡号状态(进入)
	Integer updateTeacherStatuIn(Teacher teacher);

	// 修改卡号状态(进出)
	Integer updateTeacherStatuOut(Teacher teacher);

	// 导出
	List<Teacher> selectT(List<Integer> teacherId);

	// 导入
	 List<Teacher>  queryExcelList(Map<String,Object> map);
	 
	void saveExcelList(List<Teacher> personInfoList);
	Section selectSection(String sectionName);

	 
}
