package com.tentcoo.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.tentcoo.dao.StudentDao;
import com.tentcoo.entity.StudentEntity;

@Repository // 给Spring框架标记这是一个存储仓库
public class StudentDaoImpl implements StudentDao {
	
	@Resource
	SqlSessionTemplate sqlSessionTemplate; // 请Spring自动实例化一个SqlSessionTemplate

	@Override
	public void addStudent(StudentEntity student) {
		sqlSessionTemplate.insert("StudentDao.addStudent",student);
	}

	@Override
	public void updateStudent(StudentEntity student) {
		sqlSessionTemplate.update("StudentDao.updateStudent",student);
	}

	@Override
	public void deleteStudent(StudentEntity student) {
		sqlSessionTemplate.delete("StudentDao.updateStudent",student);
	}

	@Override
	public StudentEntity getStudentByNumber(String studentNumber) {
		return sqlSessionTemplate.selectOne("StudentDao.getStudentByNumber",studentNumber);
	}

	@Override
	public List<StudentEntity> getAllStudent() {
		return sqlSessionTemplate.selectList("StudentDao.getAllStudent");
	}
	
}
