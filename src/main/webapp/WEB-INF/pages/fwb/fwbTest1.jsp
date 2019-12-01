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
<div style="width: 400px;height: 500px;position: absolute;">
<textarea id="editor_id" name="content">
</textarea>
<button type="button" class="layui-btn" id="submitBtn">提交数据</button>
</div>
</body>
<script type="text/javascript" src="static/common/jquery/jquery.min.js"></script>  <!-- 引入jquery.js 必须最先引入Jquery.js  -->
<script type="text/javascript" src="static/common/layui/layui.all.js"></script>  <!-- 引入layuiy.js  -->
<script type="text/javascript" src="static/common/kindeditor/kindeditor-all.js"></script>  <!-- 引入富文本  -->
<script type="text/javascript" src="static/common/kindeditor/lang/zh-CN.js"></script>  <!-- 引入富文本  -->
<script type="text/javascript" src="static/fwb/fwbTest.js"></script>
<script type="text/javascript">
var basePath = "<%=basePath%>"; 
</script>
</html>