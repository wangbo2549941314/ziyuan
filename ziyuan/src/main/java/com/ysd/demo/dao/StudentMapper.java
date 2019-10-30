package com.ysd.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ysd.demo.entity.Fenye;
import com.ysd.demo.entity.Student;
@Mapper
public interface StudentMapper {
	//查询所有学生
	 List<Student> selectStudent(Fenye<Student> fenye);
	 //查询学生数量
	 Integer selectCountStudent(Fenye<Student> fenye);
	//根据卡号查询学生
	 Student selectCard(String studentCardId);
	 //修改卡号状态(进入)
	 Integer updateStudentStatus(Student student);
	 //修改卡号状态(进出)
	 Integer updateStudentStatu1(Student student);
	 //导出
	 List<Student> selectS(List<Integer> studentId);
	 

}
