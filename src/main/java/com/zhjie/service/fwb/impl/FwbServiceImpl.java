package com.zhjie.service.fwb.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhjie.dao.fwb.FwbInfoMapper;
import com.zhjie.pojo.fwb.FwbInfo;
import com.zhjie.service.fwb.FwbService;
@Service
public class FwbServiceImpl implements FwbService {

	@Autowired
	private FwbInfoMapper fwbInfoMapper ;
	@Override
	public int insertSelective(FwbInfo fwb) {
		return fwbInfoMapper.insertSelective(fwb);
	}
	@Override
	public List<FwbInfo> getList(Map<String,Object> params) {
		return fwbInfoMapper.select(params);
	}

}
