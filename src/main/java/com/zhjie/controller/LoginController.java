package com.zhjie.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhjie.common.AjaxJson;
import com.zhjie.pojo.User;
import com.zhjie.service.UserService;


@Controller
@RequestMapping(value="/login")
public class LoginController {

	@Autowired 
	private UserService userService;
	/**
	 * 登录
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/dologin")
	@ResponseBody
	public AjaxJson<Object> doLogin(@RequestBody(required=true) Map<String, Object> params, HttpSession session) throws Exception{
		AjaxJson<Object> j = new AjaxJson<>();
		String userName = (String) params.get("username");
		String password = (String) params.get("password");
		boolean isSuccess = false;
		//身份验证成功
		User user = userService.getUser(userName);
		if(user == null){
			j.setCode(-1);
			j.setMsg("用户不存在！");
		}else{
			if(!password.equals(user.getPassword())){
				j.setCode(-1);
				j.setMsg("密码错误！");
			}else{
				isSuccess = true;
				session.setAttribute("username", user.getUsername());
				session.getServletContext().setAttribute(session.getId(), user.getUsername());
			}
		}
		if(isSuccess){
		}else{
			
		}
		return j;
	}

	/**
	 * 退出登录
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/loginout")
	public String loginOut(HttpSession session) throws Exception{
		session.removeAttribute("username");
		session.getServletContext().removeAttribute(session.getId());
		return "index";
	}
}
