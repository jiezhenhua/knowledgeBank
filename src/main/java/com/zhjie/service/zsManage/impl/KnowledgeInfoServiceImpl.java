package com.zhjie.service.zsManage.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhjie.dao.zsManage.KnowledgeInfoMapper;
import com.zhjie.pojo.zsManage.KnowledgeInfo;
import com.zhjie.service.zsManage.KnowledgeInfoService;
@Service
public class KnowledgeInfoServiceImpl implements KnowledgeInfoService{
	@Autowired
	private KnowledgeInfoMapper knowledgeInfoMapper ;
	@Override
	public List<KnowledgeInfo> select(Map<String, Object> params) {
		return knowledgeInfoMapper.select(params);
	}
	@Override
	public int insertSelective(KnowledgeInfo bean) {
		return knowledgeInfoMapper.insertSelective(bean);
	}
	@Override
	public int saveOrUpdate(Map<String, Object> params) {
		return knowledgeInfoMapper.saveOrUpdate(params);
	}
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return knowledgeInfoMapper.deleteByPrimaryKey(id);
	}

}
