package com.zhjie.common.init;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import com.zhjie.pojo.code.CodeDetail;
import com.zhjie.pojo.code.CodeInfo;
import com.zhjie.service.CodeInfoService.CodeDetailService;
import com.zhjie.service.CodeInfoService.CodeInfoService;
/**
 * 实现ServletContextAware，可以获得servletcontext
 * @Component注解了，直接在xml里配置这个bean就行了，系统自动调用
 * @author Administrator
 *
 */
@Component
public class SysInitBean implements  ServletContextAware{

	public static Map<String,Map<String,Object>> CodeCache = new HashMap<>();
	@Autowired
	private CodeInfoService codeInfoService;
	@Autowired
	private CodeDetailService codeDetailService;
	@Override
	public void setServletContext(ServletContext sc) {
		//初始化数据字典到application中
		List<CodeInfo> list = codeInfoService.select(null);
		Map<String,Object> params = new HashMap<>();
		for (CodeInfo code : list) {
			params.put("codeId", code.getCodeId());
			Map<String,Object> codeDetailMap = new HashMap<>();
			List<CodeDetail> listCode = codeDetailService.select(params);
			for (CodeDetail codeDetail : listCode) {
				codeDetailMap.put(codeDetail.getCodeValue(), codeDetail.getCodeName());
			}
			CodeCache.put(code.getCodeId(), codeDetailMap);
		}
	}

}
