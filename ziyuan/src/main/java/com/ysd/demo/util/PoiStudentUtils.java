package com.ysd.demo.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hpsf.DocumentSummaryInformation;
import org.apache.poi.hpsf.SummaryInformation;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.ysd.demo.entity.Student;
import com.ysd.demo.entity.Teacher;

public class PoiStudentUtils {
	public static ResponseEntity<byte[]> exportEmp2Excel(List<Student> student){
		    HttpHeaders headers = null;
	        ByteArrayOutputStream baos = null;
	        try {
	            //1.创建Excel文档
	            HSSFWorkbook workbook = new HSSFWorkbook();
	            //2.创建文档摘要
	            workbook.createInformationProperties();
	            //3.获取文档信息，并配置
	            DocumentSummaryInformation dsi = workbook.getDocumentSummaryInformation();
	            //3.1文档类别
	            dsi.setCategory("资源信息");
	            //3.2设置文档管理员
	            dsi.setManager("dsz");
	            //3.3设置组织机构
	            dsi.setCompany("dsz集团");
	            //4.获取摘要信息并配置
	            SummaryInformation si = workbook.getSummaryInformation();
	            //4.1设置文档主题
	            si.setSubject("学生信息表");
	            //4.2.设置文档标题
	            si.setTitle("员工信息");
	            //4.3 设置文档作者
	            si.setAuthor("dsz集团");
	            //4.4设置文档备注
	            si.setComments("备注信息暂无");
	            //创建Excel表单
	            HSSFSheet sheet = workbook.createSheet("新乡职业技术学院学生信息表");
	            //创建日期显示格式
	            HSSFCellStyle dateCellStyle = workbook.createCellStyle();
	            dateCellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy"));
	            //创建标题的显示样式
	            HSSFCellStyle headerStyle = workbook.createCellStyle();
	            headerStyle.setFillForegroundColor(IndexedColors.YELLOW.index);
	            headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	            //定义列的宽度
	            sheet.setColumnWidth(0, 5 * 256);
	            sheet.setColumnWidth(1, 12 * 256);
	            sheet.setColumnWidth(2, 10 * 256);
	            sheet.setColumnWidth(3, 5 * 256);
	            sheet.setColumnWidth(4, 12 * 256);
	            sheet.setColumnWidth(5, 20 * 256);
	            sheet.setColumnWidth(6, 10 * 256);
	            sheet.setColumnWidth(7, 10 * 256);
	            sheet.setColumnWidth(8, 16 * 256);
	            sheet.setColumnWidth(9, 12 * 256);
	            sheet.setColumnWidth(10, 15 * 256);
	            sheet.setColumnWidth(11, 20 * 256);
	            sheet.setColumnWidth(12, 16 * 256);
	            sheet.setColumnWidth(13, 14 * 256);
	            sheet.setColumnWidth(14, 14 * 256);
	            sheet.setColumnWidth(15, 12 * 256);
	            sheet.setColumnWidth(16, 8 * 256);
	            sheet.setColumnWidth(17, 16 * 256);
	            sheet.setColumnWidth(18, 20 * 256);
	            sheet.setColumnWidth(19, 12 * 256);
	            sheet.setColumnWidth(20, 8 * 256);
	            sheet.setColumnWidth(21, 25 * 256);
	            sheet.setColumnWidth(22, 14 * 256);
	            sheet.setColumnWidth(23, 12 * 256);
	            sheet.setColumnWidth(24, 12 * 256);
	            //5.设置表头
	            HSSFRow headerRow = sheet.createRow(0);
	            HSSFCell cell0 = headerRow.createCell(0);
	            cell0.setCellValue("编号");
	            cell0.setCellStyle(headerStyle);
	            HSSFCell cell1 = headerRow.createCell(1);
	            cell1.setCellValue("卡号");
	            cell1.setCellStyle(headerStyle);
	            HSSFCell cell2 = headerRow.createCell(2);
	            cell2.setCellValue("姓名");
	            cell2.setCellStyle(headerStyle);
	            HSSFCell cell3 = headerRow.createCell(3);
	            cell3.setCellValue("性别");
	            cell3.setCellStyle(headerStyle);
	            HSSFCell cell4 = headerRow.createCell(4);
	            cell4.setCellValue("备注");
	            cell4.setCellStyle(headerStyle);
	            HSSFCell cell5 = headerRow.createCell(5);
	            cell5.setCellValue("学号");
	            cell5.setCellStyle(headerStyle);
	            HSSFCell cell6 = headerRow.createCell(6);
	            cell6.setCellValue("系");
	            cell6.setCellStyle(headerStyle);
	            HSSFCell cell7 = headerRow.createCell(7);
	            cell7.setCellValue("专业");
	            cell7.setCellStyle(headerStyle);
	            HSSFCell cell8 = headerRow.createCell(8);
	            cell8.setCellValue("学历");
	            cell8.setCellStyle(headerStyle);
	            
	            
	            //6.装数据
	            for (int i = 0; i < student.size(); i++) {
	                HSSFRow row = sheet.createRow(i + 1);
	                Student teacher = student.get(i);
	                row.createCell(0).setCellValue(teacher.getStudentId());
	                row.createCell(1).setCellValue(teacher.getStudentCardId());
	                row.createCell(2).setCellValue(teacher.getStudentName());
	                row.createCell(3).setCellValue(teacher.getStudentSex());
	                row.createCell(4).setCellValue(teacher.getStudentRemark());
	                row.createCell(5).setCellValue(teacher.getStudentStuNo());
	                row.createCell(6).setCellValue(teacher.getMembership().getMemberShipDepartment());
	                row.createCell(7).setCellValue(teacher.getMembership().getMemberShipSpeciaty());
	                row.createCell(8).setCellValue(teacher.getMembership().getMemberShipDegree());
	            }
	            headers = new HttpHeaders();
	            headers.setContentDispositionFormData("attachment",
	                    new String("学生表.xls".getBytes("UTF-8"), "iso-8859-1"));
	            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
	            baos = new ByteArrayOutputStream();
	            workbook.write(baos);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 return new ResponseEntity<byte[]>(baos.toByteArray(), headers, HttpStatus.CREATED);
		 
		 
	 }

}
