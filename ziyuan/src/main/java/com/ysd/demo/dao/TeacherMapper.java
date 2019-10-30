package com.ysd.demo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ysd.demo.entity.Fenye;
import com.ysd.demo.entity.Section;
import com.ysd.demo.entity.Student;
import com.ysd.demo.entity.Teacher;

@Mapper
public interface TeacherMapper {
	List<Teacher> selectTeacher(Fenye<Teacher> fenye);

	Integer selectCountTeacher(Fenye<Teacher> fenye);

	// 根据卡号查询老师
	Teacher selectTeacherCardId(String teacherCardId);

	// 修改卡号状态(进入)
	Integer updateTeacherStatuIn(Teacher teacher);

	// 修改卡号状态(进出)
	Integer updateTeacherStatuOut(Teacher teacher);

	// 导出
	List<Teacher> selectT(List<Integer> teacherId);

	// 导入操作
	
	//查询（查询看是否卡号，姓名有重复）
	List<Teacher> queryList(Map<String, Object> map);
    //添加多个数据
	void saveExcelList(@Param("personInfoList") List<Teacher> personInfoList);
	//查询科室（导入的excel中sectionName是string类型而数据库中是int类型，由此写此方法）
	Section selectSection(String sectionName);

}
