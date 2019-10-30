package com.ysd.demo.service;

import java.util.List;

import com.ysd.demo.entity.Fenye;
import com.ysd.demo.entity.Student;

public interface StudentService {
	Fenye<Student> selectStudent(Fenye<Student> fenye);

	// 根据卡号查询学生
	Student selectCard(String studentCardId);

	// 修改卡号状态(进入)
	Integer updateStudentStatus(Student student);

	// 修改卡号状态(进出)
	Integer updateStudentStatu1(Student student);

	// 导出
	List<Student> selectS(List<Integer> studentId);

}
