<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String path = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html lang="en">
<head>
<link rel="stylesheet" type="text/css" href="../css/style.css">
<script type="text/javascript" src="../jQuery/jquery.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录 </title>
<script type="text/javascript">

function check(){
	// alert("jin");
	var name = $('.name').val();
	var password = $('.password').val();
/* 	alert(usname);
	alert(password); */
	if(name==null||name==""||password==""||password==null){
		alert("不能为空");
		return false;
	}else{
		return true;
	}
}
</script>
</head>
<body>

	<div class="top">
		<span>school transaction 管理系统</span>
	</div>
	<div class="body">
		<div class="login">

				<form action="/admin/login" onsubmit="return check()">
					<div >
						账户<input  type="text" name="name" class="name">
					</div>
					<div >
						密码<input  type="password" name="password"  class="password">
					</div>

					<div >
						<input id="submit" type="submit"  value="登 录">
						<input id="reset" type="reset"  value="取消">
					</div>				
				</form>
		
		</div>
	</div>

	
</body>
</html>