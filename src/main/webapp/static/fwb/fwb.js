var serverScriptPath,editorPluginsPath;
KindEditor.ready(function(K) {
	   //全局配置
	   serverScriptPath=basePath+'static/common/kindeditor/jsp/';//服务端文件文件夹URL绝对路径,最后要有/
	   editorPluginsPath=basePath+'static/common/kindeditor/plugins/';//编辑器的插件文件夹URL绝对路径,最后要有/
	   //全局配置结束
});

//在这里面输入任何合法的js语句
function doShow(){
	layer.open({
		type: 2,
		  content: 'fwb/fwbtest1',
		  area: ['700px', '600px'],
		  maxmin: true
		}); 
};

layui.use('table', function(){
	  var table = layui.table;
	  //监听表格复选框选择
	  table.on('checkbox(fwb)', function(obj){
	    console.log(obj)
	  });
	  //监听工具条
	  table.on('tool(fwb)', function(obj){
	    var data = obj.data;
	    if(obj.event === 'detail'){
            $("#check").hide();
            $("#id").val(data.id);
            $("#contentHtml").html(data.content);
            layer.open({
                type:1,
                title:"查看富文本信息",
                area: ['700px', '600px'],
                maxmin: true,
                content: $("#DetailFwb")
            });
        } else if(obj.event === 'del'){
	      layer.confirm('真的删除行么', function(index){
	        obj.del();
	        layer.close(index);
	      });
	    } else if(obj.event === 'edit'){
	    	$("#check").show();
            $("#id").val(data.id);
            $("#content").val(data.content);
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
	      var checkStatus = table.checkStatus('idTest')
	      ,data = checkStatus.data;
	      layer.alert(JSON.stringify(data));
	    }
	    ,getCheckLength: function(){ //获取选中数目
	      var checkStatus = table.checkStatus('idTest')
	      ,data = checkStatus.data;
	      layer.msg('选中了：'+ data.length + ' 个');
	    }
	    ,isAll: function(){ //验证是否全选
	      var checkStatus = table.checkStatus('idTest');
	      layer.msg(checkStatus.isAll ? '全选': '未全选')
	    }
	  };
	  
	  $('.demoTable .layui-btn').on('click', function(){
	    var type = $(this).data('type');
	    active[type] ? active[type].call(this) : '';
	  });
	});
  
