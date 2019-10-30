package com.ysd.demo.controller;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sun.istack.NotNull;
import com.ysd.demo.entity.Fenye;
import com.ysd.demo.entity.Section;
import com.ysd.demo.entity.Teacher;
import com.ysd.demo.service.TeacherService;
import com.ysd.demo.util.PoiUtils;

import net.sf.json.JSONObject;

@RestController
@CrossOrigin
public class TeacherController {
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private Fenye<Teacher> fenye;

	// 显示所有学生
	@RequestMapping("/selectTeacher")
	public Fenye<Teacher> selectALL(Integer page, Integer rows) {
		fenye.setPage((page - 1) * rows);
		fenye.setPageSize(rows);
		Fenye<Teacher> selectTeacher = teacherService.selectTeacher(fenye);
		return selectTeacher;
	}

	// 根据卡号查询老师
	@RequestMapping("/selectTeacherCardId")
	public Teacher selectTeacherCardId(String teacherCardId) {
		Teacher selectTeacherCardId = teacherService.selectTeacherCardId(teacherCardId);
		return selectTeacherCardId;
	}

	// 修改卡号状态(进入)
	@RequestMapping("/updateTeacherStatuIn")
	public Integer updateTeacherStatuIn(Teacher teacher) {
		Integer updateTeacherStatuIn = teacherService.updateTeacherStatuIn(teacher);
		return updateTeacherStatuIn;
	}

	// 修改卡号状态(进入)
	@RequestMapping("/updateTeacherStatuOut")
	public Integer updateTeacherStatuOut(Teacher teacher) {
		Integer updateTeacherStatuOut = teacherService.updateTeacherStatuOut(teacher);
		return updateTeacherStatuOut;
	}
   //导出
	@RequestMapping("/selectT")
	public ResponseEntity<byte[]> selectT(String teacherId) {//ResponseEntity处理请求中返回的 请求状态与请求信息的
		String[] split = teacherId.split(",");
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<split.length;i++) {
			list.add(Integer.parseInt(split[i]));
		}
		return PoiUtils.exportEmp2Excel(teacherService.selectT(list));
	}
	//导入
	@PostMapping(value = "/uploadExcel")
    public Map<String,Object> uploadExcel(MultipartFile file,Integer type) {
		 Map<String, Object> map = new HashMap<String, Object>();
    	JSONObject json = new JSONObject();//JSON格式的数据结构（key-value 结构）
        try { 
            map.put("state", "00");  // 操作成功    put在JSONObject对象中设置键值对
            List<Teacher> TeacherList = new ArrayList<Teacher>();
            //把一张xls的数据表读到workbook里
            InputStream inputStream = file.getInputStream();
            HSSFWorkbook workbook=null;
            workbook= new HSSFWorkbook(inputStream);
            HSSFSheet sheetAt = workbook.getSheetAt(0);
            //读第1个工作表
            HSSFSheet hssfSheet = workbook.getSheetAt(0);
            //循环取出数据
            for (int i=1;i<hssfSheet.getLastRowNum();i++) {
            	Teacher teacher = new Teacher();
                HSSFRow row = hssfSheet.getRow(i);
                if(row == null){//跳出第一行   一般第一行都是表头没有数据意义
                    continue;
                }
                
                row.getCell(1).setCellType(row.getCell(1).CELL_TYPE_STRING);//读取数据前设置单元格类型
                String teacherCardId = row.getCell(1).getStringCellValue().trim();
                if(teacherCardId==null  || teacherCardId.isEmpty() || "".equals(teacherCardId)){//第1列数据
                	map.put("message", "你的第"+(i+1)+"行卡号信息未填,则导入失败！");
                	return  map;
                }
                teacher.setTeacherCardId(teacherCardId);
                
                row.getCell(2).setCellType(row.getCell(2).CELL_TYPE_STRING);
                String teacherName = row.getCell(2).getStringCellValue().trim();
                if(teacherName==null  || teacherName.isEmpty() || "".equals(teacherName)){
                	map.put("message", "你的第"+(i+1)+"行姓名信息未填,则导入失败！");
                	return  map;
                }
                teacher.setTeacherName(teacherName);
                
                
                row.getCell(3).setCellType(row.getCell(3).CELL_TYPE_STRING);
                String teacherSex = row.getCell(3).getStringCellValue().trim();
                if(teacherSex==null  || teacherSex.isEmpty() || "".equals(teacherSex)){
                	map.put("message", "你的第"+(i+1)+"行性别信息未填,则导入失败！");
                	return  map;
                }
            	teacher.setTeacherSex(teacherSex);
                
                row.getCell(4).setCellType(row.getCell(4).CELL_TYPE_STRING);
            	String setSectionId = row.getCell(4).getStringCellValue();
                if(setSectionId==null  || setSectionId.isEmpty() || "".equals(setSectionId) ){
                	map.put("message", "你的第"+(i+1)+"行科室信息未填,则导入失败！");
                	return  map;
                }
                Section selectSection = teacherService.selectSection(setSectionId);
            	teacher.setSectionId(selectSection.getSectionId());
            	
            	
            	row.getCell(5).setCellType(row.getCell(5).CELL_TYPE_STRING);
            	String teacherStatus = row.getCell(5).getStringCellValue().trim();
                if(teacherStatus==null  || teacherStatus.isEmpty() || "".equals(teacherStatus)){
                	map.put("message", "你的第"+(i+1)+"行状态信息未填,则导入失败！");
                	return  map;
                }
                teacher.setTeacherStatus(Integer.parseInt(teacherStatus));
				
                row.getCell(6).setCellType(row.getCell(6).CELL_TYPE_STRING);
                String teacherRemark = row.getCell(6).getStringCellValue().trim();
				  if(teacherRemark==null  || teacherRemark.isEmpty() || "".equals(teacherRemark)){
					  map.put("message", "你的第"+(i+1)+"行备注信息未填,则导入失败！");
	                	return  map;
				  }
				  teacher.setTeacherRemark(teacherRemark);
				 
				  
				  
				  TeacherList.add(teacher); 
            
            }
            if(TeacherList !=  null && TeacherList.size()>0){
                String[] certNumArray = new String[TeacherList.size()];
                for(int i=0;i<TeacherList.size();i++){
                    certNumArray[i] =  TeacherList.get(i).getTeacherCardId();
                }
                map.put("type",type);
                map.put("certNumArray",certNumArray);
 
                // 查询是否有重复
                List<Teacher>  list = teacherService.queryExcelList(map); 
                if(list !=null && list.size()>0){ 
                    String exsitCertNums = "";
                    for(int i=0;i<list.size();i++){
                        exsitCertNums += " '"+list.get(i).getTeacherCardId()+"',<br/>";
                    }
                    exsitCertNums = exsitCertNums.substring(0,exsitCertNums.length()-1);
                    map.put("state", "02");  // 人员已经存在，不可重复上传
                    map.put("exsitCertNums", exsitCertNums);  // 重复人员身份证号码
                    return json;
                } 
                //调用service执行保存personInfoLists的方法
                teacherService.saveExcelList(TeacherList); 
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return map;
    }
}
