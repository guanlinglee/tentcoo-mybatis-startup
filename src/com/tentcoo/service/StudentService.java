package com.tentcoo.service;

import java.util.List;

import com.tentcoo.entity.ClassEntity;
import com.tentcoo.entity.StudentEntity;

public interface StudentService {
	
	/**
	 * 添加一个学生
	 * @param student 学生实体
	 */
	public void addStudent(StudentEntity student);
	
	/**
	 * 更新一个学生
	 * @param student 学生实体
	 */
	public void updateStudent(StudentEntity student);
	
	/**
	 * 删除一个学生
	 * @param student 学生实体
	 */
	public void deleteStudent(StudentEntity student);
	
	/**
	 * 添加一条班级记录
	 * @param classInfo 班级实体
	 */
	public void addClass(ClassEntity classInfo);
	
	/**
	 * 获取全部学生
	 * @return
	 */
	public List<StudentEntity> getAllStudent();
	/**
	 * 
	 * 获取班级
	 * @param className 班级名字
	 * @return 班级实体
	 */
	public ClassEntity getClassEntity(String className);

}
