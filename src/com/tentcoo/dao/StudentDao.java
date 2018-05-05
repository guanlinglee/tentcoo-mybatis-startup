package com.tentcoo.dao;

import java.util.List;

import com.tentcoo.entity.StudentEntity;

/**
 * 学生数据库访问层接口
 * @author Shaobin.Ou
 * @since 1.0.0
 */
public interface StudentDao {
	
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
	 * 
	 * @param studentNumber 学号
	 * @return 学生实体
	 */
	public StudentEntity getStudentByNumber(String studentNumber);
	
	/**
	 * 读取所有的学生
	 * @return 学生实体列表
	 */
	public List<StudentEntity> getAllStudent();
	
}
