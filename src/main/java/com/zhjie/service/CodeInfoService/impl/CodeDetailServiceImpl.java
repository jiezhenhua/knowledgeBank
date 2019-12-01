package com.zhjie.service.CodeInfoService.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhjie.dao.code.CodeDetailMapper;
import com.zhjie.pojo.code.CodeDetail;
import com.zhjie.service.CodeInfoService.CodeDetailService;
@Service
public class CodeDetailServiceImpl implements CodeDetailService{

	@Autowired
	CodeDetailMapper codeDetailMapper;
	@Override
	public List<CodeDetail> select(Map<String, Object> params) {
		return codeDetailMapper.select(params);
	}

}
