package com.zhjie.service.CodeInfoService.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhjie.dao.code.CodeInfoMapper;
import com.zhjie.pojo.code.CodeInfo;
import com.zhjie.service.CodeInfoService.CodeInfoService;
@Service
public class CodeInfoServiceImpl implements CodeInfoService {

	@Autowired
	CodeInfoMapper codeInfoMapper;
	@Override
	public List<CodeInfo> select(Map<String,Object> params) {
		return codeInfoMapper.select(params);
	}

}
