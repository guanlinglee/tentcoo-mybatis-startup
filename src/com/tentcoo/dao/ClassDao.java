package com.tentcoo.dao;

import com.tentcoo.entity.ClassEntity;

public interface ClassDao {
	
	/**
	 * 添加一条班级记录
	 * @param classInfo 班级实体
	 */
	public void addClass(ClassEntity classInfo);
	
	/**
	 * 更新一条班级记录
	 * @param classInfo 班级实体
	 */
	public void updateClass(ClassEntity classInfo);
	
	/**
	 * 删除一条班级记录
	 * @param classInfo 班级实体
	 */
	public void deleteClass(ClassEntity classInfo);
	
	/**
	 * 根据班级名称获取班级
	 * @param className 班级
	 * @return 班级实体
	 */
	public ClassEntity getClassByName(String className);

}
