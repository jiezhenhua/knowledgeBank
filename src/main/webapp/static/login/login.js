function doLogin(){
	var username = $("#username").val();
	var password = $("#password").val();
	var params = {username:username,password:password};
	$.ajax({
	      type: "POST",
	      url: "login/dologin",
	      contentType : "application/json",
	      data: JSON.stringify(params),
	      dataType : "json",
	      success: function(res){
	    	  console.log(res);
	    	  if(res.code == -1){
	    		  $("#msgTip").html(res.msg);
	    		  return ;
	    	  }
		        window.location.href = "home/home";
		        /*ajaxHttp({
		            url: "welcome/home",
		            type: 'get', 
		            data:{}, 
		            success: function (res) {
		            },
		          })*/
		      }
	   });
}