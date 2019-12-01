package com.zhjie.service.fwb;

import java.util.List;
import java.util.Map;

import com.zhjie.pojo.fwb.FwbInfo;

public interface FwbService {
	int insertSelective(FwbInfo fwb);
	List<FwbInfo> getList(Map<String,Object> params);
}
