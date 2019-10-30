package com.ysd.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ysd.demo.dao.StudentMapper;
import com.ysd.demo.entity.Fenye;
import com.ysd.demo.entity.Student;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private Student student;
	// 查询所有学生
	public Fenye<Student> selectStudent(Fenye<Student> fenye) {
		List<Student> selectStudent = studentMapper.selectStudent(fenye);
		Integer selectCountStudent = studentMapper.selectCountStudent(fenye);
		fenye.setRows(selectStudent);
		fenye.setTotal(selectCountStudent);
		return fenye;
	}

	// 根据卡号查询学生
	public Student selectCard(String studentCardId) {
		Student selectCard = studentMapper.selectCard(studentCardId);
		return selectCard;
	}

	//修改卡号状态（进入）
	public Integer updateStudentStatus(Student student) {
		Integer updateStudentStatus = studentMapper.updateStudentStatus(student);
		return updateStudentStatus;
	}

	//修改卡号状态（进出）
	public Integer updateStudentStatu1(Student student) {
		Integer updateStudentStatu1 = studentMapper.updateStudentStatu1(student);
		return updateStudentStatu1;
	}

	//导出
	public List<Student> selectS(List<Integer> studentId) {
		return studentMapper.selectS(studentId);
	}

	
	

}
