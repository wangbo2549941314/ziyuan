package com.ysd.demo.entity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Fenye<T>{
	private Integer page;
	private Integer pageSize;
	private Integer total;
	private List<T> rows;
	
	private Student student;
	private Teacher teacher;
	private ConSumeLogs conSumeLogs;
	
	public ConSumeLogs getConSumeLogs() {
		return conSumeLogs;
	}
	public void setConSumeLogs(ConSumeLogs conSumeLogs) {
		this.conSumeLogs = conSumeLogs;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Fenye [page=" + page + ", pageSize=" + pageSize + ", total=" + total + ", rows=" + rows + ", student="
				+ student + ", teacher=" + teacher + "]";
	}
	
	
	

}
