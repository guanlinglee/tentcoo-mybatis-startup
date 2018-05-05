package com.tentcoo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tentcoo.entity.ClassEntity;
import com.tentcoo.entity.StudentEntity;
import com.tentcoo.service.StudentService;

@Controller
public class StudentController {
	
	@Resource
	StudentService studentService;
	
	@RequestMapping(value= {"/","index.html"})
	public String getIndexPage(HttpServletRequest request , HttpServletResponse response) {
		request.setAttribute("data", studentService.getAllStudent());
		return "index";
	}
	
	@RequestMapping(value="add_student")
	@ResponseBody
	public Map<String,Object> getStudentInfo(String studentNumber, String studentName,String className){
		Map<String,Object> resMap = new HashMap<String,Object>();
		ClassEntity classInfo = studentService.getClassEntity(className);
		StudentEntity student = new StudentEntity();
		student.setStudentName(studentName);
		student.setStudentNumber(studentNumber);
		student.setClassInfo(classInfo);
		studentService.addStudent(student);
		resMap.put("status", "ok");
		return resMap;
	}

}
