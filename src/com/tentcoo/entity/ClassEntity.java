package com.tentcoo.entity;

import org.apache.ibatis.type.Alias;

@Alias(value="ClassEntity")
public class ClassEntity {

	private String classId;
	private String className;

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "ClassEntity [classId=" + classId + ", className=" + className + "]";
	}

}
