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
<link rel="stylesheet" href="static/common/kindeditor/themes/default/default.css" media="all">
<link rel="stylesheet" href="static/common/layui/css/layui.css" media="all">
<title>Insert title here</title>
</head>
<body>
<form class="layui-form layui-form-pane" action="">
  <div class="layui-form-item" style="margin-top: 10px;">
    <label class="layui-form-label">标题</label>
    <div class="layui-input-block">
      <input type="text" name="title" lay-verify="required" lay-reqtext="标题不能为空" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item layui-form-text">
    <div class="layui-input-block">
      <textarea placeholder="请输入内容" class="layui-textarea" id="content" name="content">
      	输入内容
      </textarea>
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">类型</label>
    <div class="layui-input-block">
      <select name="zsType" lay-filter="zsType" lay-verify="required" lay-reqtext="类型不能为空">
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
</body>
<script type="text/javascript" src="static/common/jquery/jquery.min.js"></script>  <!-- 引入jquery.js 必须最先引入Jquery.js  -->
<script type="text/javascript" src="static/common/layui/layui.all.js"></script>  <!-- 引入layuiy.js  -->
<script type="text/javascript" src="static/common/kindeditor/kindeditor-all.js"></script>  <!-- 引入富文本  -->
<script type="text/javascript" src="static/common/kindeditor/lang/zh-CN.js"></script>  <!-- 引入富文本  -->
<script type="text/javascript" src="static/fwb/addFwb.js"></script>
<script type="text/javascript">
var basePath = "<%=basePath%>"; 
</script>
</html>