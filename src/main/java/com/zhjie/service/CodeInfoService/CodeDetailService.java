package com.zhjie.service.CodeInfoService;

import java.util.List;
import java.util.Map;

import com.zhjie.pojo.code.CodeDetail;

public interface CodeDetailService {

	List<CodeDetail> select(Map<String,Object> params);
}
