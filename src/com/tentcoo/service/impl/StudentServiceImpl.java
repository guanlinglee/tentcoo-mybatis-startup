package com.tentcoo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tentcoo.dao.ClassDao;
import com.tentcoo.dao.StudentDao;
import com.tentcoo.entity.ClassEntity;
import com.tentcoo.entity.StudentEntity;
import com.tentcoo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Resource
	StudentDao studentDao;
	
	@Resource
	ClassDao classDao;

	@Override
	public void addStudent(StudentEntity student) {
		studentDao.addStudent(student);
	}

	@Override
	public void updateStudent(StudentEntity student) {
		studentDao.updateStudent(student);
	}

	@Override
	public void deleteStudent(StudentEntity student) {
		studentDao.deleteStudent(student);
	}

	@Override
	public void addClass(ClassEntity classInfo) {
		classDao.addClass(classInfo);
	}

	@Override
	public List<StudentEntity> getAllStudent() {
		return studentDao.getAllStudent();
	}

	@Override
	public ClassEntity getClassEntity(String className) {
		ClassEntity classEntity = classDao.getClassByName(className);
		if(classEntity == null ) {
			String id = Long.toString(System.currentTimeMillis());
			classEntity = new ClassEntity();
			classEntity.setClassId(id);
			classEntity.setClassName(className);
			classDao.addClass(classEntity);
		}
		return classEntity;
	}

}
