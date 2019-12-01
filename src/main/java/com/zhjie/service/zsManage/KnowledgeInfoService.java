package com.zhjie.service.zsManage;

import java.util.List;
import java.util.Map;

import com.zhjie.pojo.zsManage.KnowledgeInfo;

public interface KnowledgeInfoService {

	List<KnowledgeInfo> select(Map<String,Object> params);
	
	int insertSelective(KnowledgeInfo bean);
	
	int saveOrUpdate(Map<String,Object> params);
	
	int deleteByPrimaryKey(Integer id);
}
