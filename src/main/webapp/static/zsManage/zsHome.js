var serverScriptPath,editorPluginsPath;
KindEditor.ready(function(K) {
	   //全局配置
	   serverScriptPath=basePath+'static/common/kindeditor/jsp/';//服务端文件文件夹URL绝对路径,最后要有/
	   editorPluginsPath=basePath+'static/common/kindeditor/plugins/';//编辑器的插件文件夹URL绝对路径,最后要有/
	   //全局配置结束
});
layui.use(['table','form'], function(){
  var table = layui.table;
  var form = layui.form;
//方法级渲染
  table.render({
    elem: '#zsTable'
    ,url: 'zsManage/getlist'
	,method: 'post'
    ,contentType: 'application/json'
    ,dataType : "json"
    ,cols: [[
       {checkbox: true, fixed: true}
      ,{field:'id', title: 'ID', width:'5%', sort: true, fixed: true}
      ,{field:'zsType', title: '类型', width:'10%',templet : function(d){return getZsType(d.zsType)}}
      ,{field:'zsTitle', title: '标题', width:'20%', sort: true}
      ,{field:'zsContent', title: '内容', width:'46%'}
      ,{field:'right', width:'15%', align:'center', toolbar: '#barZsHome'}
    ]]
    ,id: 'zsReload'
    ,page: true
    ,height: 500
  });

  //监听表格复选框选择
  table.on('checkbox(zsHome)', function(obj){
    console.log(obj)
  });
  //监听工具条
  table.on('tool(zsHome)', function(obj){
    var data = obj.data;
    if(obj.event === 'detail'){
    	 $("#check").hide();
         $("#id").val(data.id);
         $("#zsTitle").html(data.zsTitle);
         $("#zsType").html(data.zsType);
         $("#contentHtml").html(data.zsContent);
         layer.open({
             type:1,
             title:"查看富文本信息",
             area: ['700px', '600px'],
             maxmin: true,
             content: $("#DetailFwb")
         });
    } else if(obj.event === 'del'){
      layer.confirm('确定删除该条数据', function(index){
    	  $.ajax({
      	      type: "POST",
      	      url: "zsManage/delete",
      	      contentType : "application/json",
      	      data: JSON.stringify(data),
      	      dataType : "json",
      	      success: function(res){
      	    	  if(res.code == -1){
      	    		  layer.open({
      	   	    		  title: '消息'
      	   	    		  ,content: res.msg
      	   	    		}); 
      	    	  	}else{
      	    	  	layer.open({
    	   	    		  title: '消息'
    	   	    		  ,content: '删除成功!'
    	   	    		}); 
      	    	  	obj.del();
      	    	  	layer.close(index);
      	    	  	}
      		      }
      	   });
      });
    } else if(obj.event === 'edit'){
    	$("#check").show();
        $("#id").val(data.id);
        $("#title").val(data.zsTitle)
        $("#content").val(data.zsContent);
        var select = 'dd[lay-value=' + data.zsType + ']';
        $('#zsType').siblings("div.layui-form-select").find('dl').find(select).click();
        layer.open({
            type:1,
            title:"查看富文本信息",
            area: ['700px', '600px'],
            maxmin: true,
            content: $("#EditFwb"),
            end: function(){
    			layer.closeAll();
    			KindEditor.ready(function(K) {
    				KindEditor.remove('#content');
    			});
    		}
        });
        KindEditor.create('#content', {//指定textarea
    	    //不要改动
    	   uploadJson : serverScriptPath+'upload_json.jsp',
    	   fileManagerJson : serverScriptPath+'file_manager_json.jsp',
    	    cssPath :editorPluginsPath+'code/prettify.css',
    	    emoticonsPath:editorPluginsPath+"/emoticons/images/",
    	    //不要改动结束
    	    allowImageUpload:true,//允许上传图片
    	    allowFileManager:true, //允许对上传图片进行管理
    		    afterBlur: function(){  //利用该方法处理当富文本编辑框失焦之后，立即同步数据
    		        KindEditor.sync("#content") ;
    		  }
    	 });
        KindEditor.html('#content',data.content);
    }
  });
  
  var $ = layui.$, active = {
    getCheckData: function(){ //获取选中数据
      var checkStatus = table.checkStatus('zsReload')
      ,data = checkStatus.data;
      if(JSON.stringify(checkStatus).data.size() == 0){
    	  layer.alert("提示",{icon: 5});
      }
      layer.alert(JSON.stringify(data));
    }
    ,getCheckLength: function(){ //获取选中数目
      var checkStatus = table.checkStatus('zsReload')
      ,data = checkStatus.data;
      layer.msg('选中了：'+ data.length + ' 个');
    }
    ,isAll: function(){ //验证是否全选
      var checkStatus = table.checkStatus('zsReload');
      layer.msg(checkStatus.isAll ? '全选': '未全选')
    }
    ,reload: function(){
        var zsTitle = $('#zsTitleQuery').val();
  	    var zsContent = $('#zsContentQuery').val();
  	    var zsType = $('#zsTypeQuery').val();
        var id = $('#idQuery').val();
        //执行重载
        table.reload('zsReload', {
          page: {
            curr: 1 //重新从第 1 页开始
          }
          ,where: {
        	  id:id,zsTitle:zsTitle,zsContent:zsContent,zsType:zsType
          }
        }, 'data');
      }
    ,addZs: function(){
    	layer.open({
      	  type: 2, 
      	  area: ['800px', '630px'],
      	  content: 'zsManage/addZs' //这里content是一个URL，如果你不想让iframe出现滚动条，你还可以content: ['http://sentsin.com', 'no']
      	}); 
    }
    
  };
  
  $('.queryTable .layui-btn').on('click', function(){
    var type = $(this).data('type');
    console.log(type);
    active[type] ? active[type].call(this) : '';
  });
  $('.operTable .layui-btn').on('click', function(){
	    var type = $(this).data('type');
	    console.log(type);
	    active[type] ? active[type].call(this) : '';
	  });
//监听提交
  form.on('submit(submitBtn)', function(data){
  	//获取富文本内容
  	var fwbContent = $('#content').val();
  	if(fwbContent == '' || fwbContent == null){
  		layer.open({
  	    		  title: '提示'
  	    		  ,content: '内容不能为空!'
  	    		}); 
  		return false;
  	}
  	data.field.content = fwbContent;
  	$.ajax({
  	      type: "POST",
  	      url: "zsManage/saveOrUpdate",
  	      contentType : "application/json",
  	      data: JSON.stringify(data.field),
  	      dataType : "json",
  	      success: function(res){
  	    	  if(res.code == -1){
  	    		  layer.open({
  	   	    		  title: '消息'
  	   	    		  ,content: '保存失败!'
  	   	    		}); 
  	    	  	}else{
  	    	  		 layer.open({
  	   	    		  title: '消息'
  	   	    		  ,content: '保存成功!'
  	   	    		}); 
  	    	  	}
  		      }
  	   });
  	return false;
  	});
  function getZsType(zsType){
	  var params = {code:'ZS_TYPE',value:zsType};
	  var retvalue;
	  $.ajax({
  	      type: "POST",
  	      async: false,
  	      url: "common/getCodeName",
  	      contentType : "application/json",
  	      data: JSON.stringify(params),
  	      dataType : "json",
  	      success: function(res){
  	    	  if(res.code == -1){
  	    		  layer.msg('获取数据失败'); 
  	    	  	}else{
  	    	  	retvalue = res.data;
  	    	  	}
  		      }
  	   });
	  return retvalue;
  }
});