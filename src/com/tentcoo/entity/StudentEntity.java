package com.tentcoo.entity;

import org.apache.ibatis.type.Alias;

@Alias(value="StudentEntity")
public class StudentEntity {

	private String studentNumber;
	private String studentName;
	private ClassEntity classInfo;

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public ClassEntity getClassInfo() {
		return classInfo;
	}

	public void setClassInfo(ClassEntity classInfo) {
		this.classInfo = classInfo;
	}

	@Override
	public String toString() {
		return "StudentEntity [studentNumber=" + studentNumber + ", studentName=" + studentName + ", classInfo="
				+ classInfo + "]";
	}

}
