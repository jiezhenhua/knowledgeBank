KindEditor.ready(function(K) {
   //全局配置
   var serverScriptPath=basePath+'static/common/kindeditor/jsp/';//服务端文件文件夹URL绝对路径,最后要有/
   var editorPluginsPath=basePath+'static/common/kindeditor/plugins/';//编辑器的插件文件夹URL绝对路径,最后要有/
   //全局配置结束
   var editor1 = K.create('#content', {//指定textarea
    //不要改动
   uploadJson : serverScriptPath+'upload_json.jsp',
   fileManagerJson : serverScriptPath+'file_manager_json.jsp',
    cssPath :editorPluginsPath+'code/prettify.css',
    emoticonsPath:editorPluginsPath+"/emoticons/images/",
    //不要改动结束
    allowImageUpload:true,//允许上传图片
    allowFileManager:true, //允许对上传图片进行管理
    width: '99%',
    height: '400px',
    afterBlur: function(){  //利用该方法处理当富文本编辑框失焦之后，立即同步数据
        KindEditor.sync("#content") ;
  }
 });
 });

layui.use(['form'], function(){
	var form = layui.form
	 ,layer = layui.layer
//自定义验证规则
form.verify({
   title: function(value){
     if(value.length > 500){
       return '标题最多500个字符啊';
     }
   },
   zsType: function(value){
 	if(value == null || value==''){
 		return '类型不能为空';
 	}
   }
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
	      url: "zsManage/dosave",
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
});

