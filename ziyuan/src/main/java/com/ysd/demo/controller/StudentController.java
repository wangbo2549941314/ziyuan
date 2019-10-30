package com.ysd.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ysd.demo.entity.Fenye;
import com.ysd.demo.entity.Student;
import com.ysd.demo.entity.Teacher;
import com.ysd.demo.service.StudentService;
import com.ysd.demo.service.TeacherService;
import com.ysd.demo.util.PoiStudentUtils;
import com.ysd.demo.util.PoiUtils;

@RestController
@CrossOrigin
public class StudentController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private Fenye<Student> fenye;

	@RequestMapping("/selectStudentAll")
	public Fenye<Student> selectStudentAll(Integer page, Integer rows) {
		fenye.setPage((page - 1) * rows);
		fenye.setPageSize(rows);
		studentService.selectStudent(fenye);
		return fenye;
	}

	// 根据卡号查询学生
	@RequestMapping("/selectStudentCard")
	public Integer selectCard(String studentCardId) {
		Student selectStudentCard = studentService.selectCard(studentCardId);
		Teacher selectTeacherCardId = teacherService.selectTeacherCardId(studentCardId);
		if (selectStudentCard != null && selectTeacherCardId == null) {
			if (selectStudentCard.getStudentStatus() == 1) {
				return 1;
			} else {
				return -1;
			}
		} else if (selectStudentCard == null && selectTeacherCardId != null) {
			if (selectTeacherCardId.getTeacherStatus() == 1) {
				return 2;
			} else {
				return -2;
			}
		} else {
			return 3;
		}

	}

	// 修改卡号状态(进入)
	@RequestMapping("/updateStudentStatus")
	public Integer updateStudentStatus(Student student) {
		Integer updateStudentStatus = studentService.updateStudentStatus(student);
		return updateStudentStatus;
	}

	// 修改卡号状态(进出)
	@RequestMapping("/updateStudentStatu1")
	public Integer updateStudentStatu1(Student student) {
		Integer updateStudentStatuOut = studentService.updateStudentStatu1(student);
		return updateStudentStatuOut;
	}
	  //导出
		@RequestMapping("/selectS")
		public ResponseEntity<byte[]> selectS(String studentId) {//ResponseEntity处理请求中返回的 请求状态与请求信息的
			String[] split = studentId.split(",");
			List<Integer> list = new ArrayList<Integer>();
			for (int i=0;i<split.length;i++) {
				list.add(Integer.parseInt(split[i]));
			}
			return PoiStudentUtils.exportEmp2Excel(studentService.selectS(list));
		}
	
	
	
}
