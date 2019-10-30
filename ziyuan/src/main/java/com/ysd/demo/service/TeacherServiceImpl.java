package com.ysd.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysd.demo.dao.TeacherMapper;
import com.ysd.demo.entity.Fenye;
import com.ysd.demo.entity.Section;
import com.ysd.demo.entity.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	private TeacherMapper teacherMapper;

	// 分页显示所有
	public Fenye<Teacher> selectTeacher(Fenye<Teacher> fenye) {
		List<Teacher> selectTeacher = teacherMapper.selectTeacher(fenye);
		Integer selectCountTeacher = teacherMapper.selectCountTeacher(fenye);
		fenye.setRows(selectTeacher);
		fenye.setTotal(selectCountTeacher);
		return fenye;
	}

	// 根据卡号查询老师
	public Teacher selectTeacherCardId(String teacherCardId) {
		Teacher selectTeacherCardId = teacherMapper.selectTeacherCardId(teacherCardId);
		return selectTeacherCardId;
	}

	// 修改卡号状态(进入)
	public Integer updateTeacherStatuIn(Teacher teacher) {
		Integer updateTeacherStatuIn = teacherMapper.updateTeacherStatuIn(teacher);
		return updateTeacherStatuIn;
	}

	// 修改卡号状态(进出)
	public Integer updateTeacherStatuOut(Teacher teacher) {
		Integer updateTeacherStatuOut = teacherMapper.updateTeacherStatuOut(teacher);
		return updateTeacherStatuOut;
	}

	// 导出
	public List<Teacher> selectT(List<Integer> teacherId) {
		return teacherMapper.selectT(teacherId);
	}

	// 导入
	public void saveExcelList(List<Teacher> personInfoList) {
		teacherMapper.saveExcelList(personInfoList);
	}

	public List<Teacher> queryExcelList(Map<String, Object> map) {
		return teacherMapper.queryList(map);
	}

	@Override
	public Section selectSection(String sectionName) {
		// TODO Auto-generated method stub
		return teacherMapper.selectSection(sectionName);
	}

}
