package com.zhjie.controller.common;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhjie.common.AjaxJson;
import com.zhjie.common.init.SysInitBean;

@Controller
@RequestMapping(value="/common")
public class CommonController {

	/**
	 * 根据代码值获取代码名字
	 * @param params
	 * @param session
	 * @return
	 */
	@RequestMapping("/getCodeName")
	@ResponseBody
	public  AjaxJson<Object> getCodeName(@RequestBody(required=true) Map<String, Object> params, HttpSession session){
		AjaxJson<Object> j = new AjaxJson<>();
		j.setData(SysInitBean.CodeCache.get(params.get("code")).get(params.get("value")));
		return j;
	}
}
