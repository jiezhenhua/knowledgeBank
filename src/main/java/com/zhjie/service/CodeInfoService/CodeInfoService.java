package com.zhjie.service.CodeInfoService;

import java.util.List;
import java.util.Map;

import com.zhjie.pojo.code.CodeInfo;

public interface CodeInfoService {

	List<CodeInfo> select(Map<String,Object> params);
}
