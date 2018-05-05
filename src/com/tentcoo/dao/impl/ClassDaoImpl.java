package com.tentcoo.dao.impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.tentcoo.dao.ClassDao;
import com.tentcoo.entity.ClassEntity;

@Repository // 给Spring框架标记这是一个存储仓库
public class ClassDaoImpl implements ClassDao {
	
	@Resource
	SqlSessionTemplate sqlSessionTemplate; // 请Spring自动实例化一个SqlSessionTemplate

	@Override
	public void addClass(ClassEntity classInfo) {
		sqlSessionTemplate.insert("ClassDao.addClass",classInfo);
	}

	@Override
	public void updateClass(ClassEntity classInfo) {
		sqlSessionTemplate.update("ClassDao.updateClass",classInfo);
	}

	@Override
	public void deleteClass(ClassEntity classInfo) {
		sqlSessionTemplate.delete("ClassDao.deleteClass",classInfo);
	}

	@Override
	public ClassEntity getClassByName(String className) {
		return sqlSessionTemplate.selectOne("ClassDao.getClassByName",className);
	}
	
}
