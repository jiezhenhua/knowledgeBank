<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
    <div class="layui-col-md10">
        <form class="layui-form layui-from-pane" id="updateFwb"   style="margin-top:20px" >
            <input type="hidden" name="id" id="id">
            <div class="layui-form-item">
                    <textarea id="content" name="content" style="height:400px;width:300px;">
                    </textarea>
            </div>

            <div class="layui-form-item" style="margin-top:40px" id="check">
                <div class="layui-input-block">
                    <button class="layui-btn  layui-btn-submit " lay-submit="" lay-filter="formDemo" >确认修改</button>
                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                </div>
            </div>
        </form>
    </div>
</div>
<div class="layui-row" id="DetailFwb" style="display:none;">
    <div class="layui-col-md10">
         <div class="layui-form-item" id="contentHtml">
                
         </div>
    </div>
</div>
<button type="button" class="layui-btn" onclick="doShow()">新增富文本</button>
<table class="layui-table" lay-data="{width: 600, height:330, url:'fwb/getlist', page:true, id:'id'}" lay-filter="fwb">
  <thead>
    <tr>
      <th lay-data="{type:'checkbox', fixed: 'left'}"></th>
      <th lay-data="{field:'id', width:80, sort: true, fixed: true}">ID</th>
      <th lay-data="{field:'content', width:280}">内容</th>
      <th lay-data="{fixed: 'right', width:178, align:'center', toolbar: '#barOperation'}"></th>
    </tr>
  </thead>
</table>
<script type="text/html" id="barOperation">
  <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
</body>
<script type="text/javascript" src="static/common/jquery/jquery.min.js"></script>  <!-- 引入jquery.js 必须最先引入Jquery.js  -->
<script type="text/javascript" src="static/common/layui/layui.all.js"></script>  <!-- 引入layuiy.js  -->
<script type="text/javascript" src="static/common/kindeditor/kindeditor-all.js"></script>  <!-- 引入富文本  -->
<script type="text/javascript" src="static/common/kindeditor/lang/zh-CN.js"></script>  <!-- 引入富文本  -->
<script type="text/javascript" src="static/fwb/fwb.js"></script>
<script type="text/javascript">
var basePath = "<%=basePath%>";
</script>
</html>