package com.zhjie.controller.zsManage;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhjie.common.AjaxJson;
import com.zhjie.common.init.SysInitBean;
import com.zhjie.pojo.zsManage.KnowledgeInfo;
import com.zhjie.service.zsManage.KnowledgeInfoService;

@Controller
@RequestMapping(value="/zsManage")
public class ZsManageController {

	@Autowired
	KnowledgeInfoService knowledgeInfoService;
	
	@RequestMapping(value = "/zsHome", method = RequestMethod.GET)
	public String zsHome(){
		return "zsManage/zsHome";
	}
	
	@RequestMapping(value = "/addZs", method = RequestMethod.GET)
	public String addZs(){
		return "fwb/addFwb";
	}
	/**
	 * 查询
	 * @param page
	 * @param limit
	 * @return
	 */
	@RequestMapping("/getlist")
	@ResponseBody
	public Map<String,Object> selectKnowledgeList(@RequestBody(required=true) Map<String, Object> params){
		PageHelper.startPage((int)params.get("page"), (int)params.get("limit"));
		List<KnowledgeInfo> list = knowledgeInfoService.select(params);
		PageInfo<KnowledgeInfo> pageInfo=new PageInfo<KnowledgeInfo>(list);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("data", list);
		map.put("count", pageInfo.getTotal());
		map.put("code", 0);
		return map;
	}
	
	/**
	 * 添加数据
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/dosave")
	@ResponseBody
	public AjaxJson<Object> doSave(@RequestBody(required=true) Map<String, Object> params,HttpSession session) throws Exception{
		AjaxJson<Object> j = new AjaxJson<>();
		String fwbContent = (String) params.get("content");
		KnowledgeInfo bean = new KnowledgeInfo();
		bean.setZsContent(fwbContent);
		bean.setInsertTime(new Date());
		bean.setInsertUser((String)session.getAttribute("username"));
		bean.setZsTitle((String) params.get("title"));
		bean.setZsType((String)params.get("zsType"));
		for (String key : params.keySet()) {
			if("id".equals(key)){
				bean.setId(Integer.parseInt((String)params.get("id")) );
			}
		}
		int count = 0;
		try {
			count = knowledgeInfoService.insertSelective(bean);
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
	 * 保存数据
	 * @param params
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveOrUpdate")
	@ResponseBody
	public AjaxJson<Object> saveOrUpdate(@RequestBody(required=true) Map<String, Object> params,HttpSession session) throws Exception{
		AjaxJson<Object> j = new AjaxJson<>();
		params.put("insertTime", new Date());
		params.put("insertUser", session.getAttribute("username"));
		int count = 0;
		try {
			count = knowledgeInfoService.saveOrUpdate(params);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(count==0){
			j.setCode(-1);
			j.setMsg("保存数据失败！");
		}
		return j;
	} 
	
	@RequestMapping("/delete")
	@ResponseBody
	public AjaxJson<Object> delete(@RequestBody(required=true) Map<String, Object> params) throws Exception{
		AjaxJson<Object> j = new AjaxJson<>();
		int count = 0;
		try {
			count = knowledgeInfoService.deleteByPrimaryKey((Integer) params.get("id"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(count==0){
			j.setCode(-1);
			j.setMsg("删除数据失败！");
		}
		return j;
	} 
	
}
