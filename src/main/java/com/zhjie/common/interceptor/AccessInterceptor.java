package com.zhjie.common.interceptor;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/**
 * 检查是否登录拦截器
 * @author Administrator
 *
 */
public class AccessInterceptor extends HandlerInterceptorAdapter{
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		super.afterCompletion(request, response, handler, ex);
	}
 
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}
 
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object obj) throws Exception {
        System.out.println("[AccessInterceptor]:preHandle执行");
        HttpSession session = request.getSession();
        ServletContext application = session.getServletContext();
        if(application.getAttribute(session.getId()) == null){    //未登录
        	response.setContentType("text/html;charset=utf-8"); 
        	response.setCharacterEncoding("utf-8");
            PrintWriter out = response.getWriter();
            StringBuffer sb = new StringBuffer("<script type=\"text/javascript\" charset=\"UTF-8\">");
            sb.append("alert(\"页面已失效，请重新登录！\");");
            sb.append("window.location.href='../login/loginout';");
            sb.append("</script>");
            out.print(sb.toString());
            out.close();
            return false;
        }else{    //已经登录
            return true;
        }
    }

}
