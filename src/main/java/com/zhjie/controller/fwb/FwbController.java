package com.zhjie.controller.fwb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhjie.common.AjaxJson;
import com.zhjie.pojo.fwb.FwbInfo;
import com.zhjie.service.fwb.FwbService;

@Controller
@RequestMapping(value="/fwb")
public class FwbController {

	@Autowired
	FwbService fwbService;
	@RequestMapping(value = "/fwbtest1", method = RequestMethod.GET)
	public String fwbtest1(){
		return "fwb/fwbTest1";
	}
	@RequestMapping(value = "/toAddFwb", method = RequestMethod.GET)
	public String toAddFwb(){
		return "fwb/addFwb";
	}
	/**
	 * 添加数据
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/dosave")
	@ResponseBody
	public AjaxJson<Object> doSave(@RequestBody(required=true) Map<String, Object> params) throws Exception{
		AjaxJson<Object> j = new AjaxJson<>();
		String fwbContent = (String) params.get("fwbContent");
		FwbInfo fwb = new FwbInfo();
		fwb.setContent(fwbContent);
		int count = 0;
		try {
			count = fwbService.insertSelective(fwb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(count==0){
			j.setCode(-1);
			j.setMsg("保存数据失败！");
		}
		return j;
	}
	/**
	 * 查询数据
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getlist")
	@ResponseBody
	public Map<String,Object> getList(int page,int limit) throws Exception{
		Map<String,Object> params = new HashMap<>();
		List<FwbInfo> list = fwbService.getList(params);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("data", list);
		map.put("count", list.size());
		map.put("code", 0);
		return map;
	}
}
