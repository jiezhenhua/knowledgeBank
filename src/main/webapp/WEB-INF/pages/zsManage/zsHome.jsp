<%@page import="java.util.Map"%>
<%@page import="com.zhjie.common.init.SysInitBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>"></base>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="static/common/layui/css/layui.css" media="all">
<link rel="stylesheet" href="static/common/kindeditor/themes/default/default.css" media="all">
<title>Insert title here</title>
</head>
<body>  
 <div class="layui-row" id="EditFwb" style="display:none;">
    <div class="layui-col-md12">
    	<form class="layui-form layui-form-pane" action="">
    	<input type="hidden" name="id" id="id">
		  <div class="layui-form-item" style="margin-top: 10px;">
		    <label class="layui-form-label">标题</label>
		    <div class="layui-input-block">
		      <input type="text" name="title" id="title" lay-verify="required" lay-reqtext="标题不能为空" autocomplete="off" placeholder="请输入标题" class="layui-input">
		    </div>
		  </div>
		  <div class="layui-form-item layui-form-text">
		    <div class="layui-input-block">
		      <textarea placeholder="请输入内容" class="layui-textarea" id="content" name="content" style="width:99%;height: 350px;">
		      	输入内容
		      </textarea>
		    </div>
		  </div>
		  <div class="layui-form-item">
		    <label class="layui-form-label">类型</label>
		    <div class="layui-input-block">
		      <select name="zsType" lay-filter="zsType" id="zsType" lay-verify="required" lay-reqtext="类型不能为空">
		        <option value="">请选择</option>
		        <option value="1">JAVA</option>
		        <option value="2">JS</option>
		        <option value="3">数据库</option>
		        <option value="4">HTML</option>
		        <option value="5">LINUX</option>
		      </select>
		    </div>
		  </div>
		  <div class="layui-form-item">
		    <button class="layui-btn layui-btn-normal" lay-submit="" lay-filter="submitBtn" style="margin-left: 5px">新增知识点</button>
		  </div>
		</form>
    </div>
</div>
<div class="layui-row" id="DetailFwb" style="display:none;">
    <div class="layui-col-md10">
     	 <h2 id="zsTitle" style="text-align: center;"></h2>
     	 <ul>
     	 	<li id="zsType"></li>
     	 </ul>
         <div class="layui-form-item" id="contentHtml">
         </div>
    </div>
</div>
  <br>
 <div class="queryTable">
 	 ID:
  	<div class="layui-inline">
    	<input class="layui-input" name="idQuery" id="idQuery" autocomplete="off">
  	</div>
  	标题:
  	<div class="layui-input-inline">
        <input name="zsTitleQuery" id="zsTitleQuery" autocomplete="off" class="layui-input">
      </div>
         内容:
    <div class="layui-input-inline">
        <input name="zsContentQuery" id="zsContentQuery" autocomplete="off" class="layui-input">
      </div>
  	知识类型:
  	 <div class="layui-inline layui-form">
      <select name="zsTypeQuery" id="zsTypeQuery">
         <option value="">请选择</option>
        <option value="1">JAVA</option>
        <option value="2">JS</option>
        <option value="3">数据库</option>
        <option value="4">HTML</option>
        <option value="5">LINUX</option>
      </select>
    </div>
 	<button class="layui-btn" id="query-btn" data-type="reload">搜索</button>
</div>
<br>
<div class="layui-btn-group operTable">
  <button class="layui-btn" data-type="addZs">新增</button>
  <button class="layui-btn" data-type="getCheckData">删除</button>
</div>
<table class="layui-hide" id="zsTable" lay-filter="zsHome"></table> 

<script type="text/html" id="barZsHome">
  <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
               
          
<script type="text/javascript" src="static/common/layui/layui.all.js"></script>  <!-- 引入layuiy.js  -->
<script type="text/javascript" src="static/common/kindeditor/kindeditor-all.js"></script>  <!-- 引入富文本  -->
<script type="text/javascript" src="static/common/kindeditor/lang/zh-CN.js"></script>  <!-- 引入富文本  -->
<script type="text/javascript" src="static/zsManage/zsHome.js"></script>
<script>
var basePath = '<%=basePath%>';
</script>

</body>
</html>