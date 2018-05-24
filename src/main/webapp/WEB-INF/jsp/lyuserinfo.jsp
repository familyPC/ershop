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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息</title>
</head>
<body>
	<div class="list">
		<div class="list-nav">
			<span>用 户 信 息</span>
		</div>

		<div class="list-body1">
			
				
					<ul >
						<li>ID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;${liuyanById.users.usid}</li>
						<li>NAME   &nbsp;&nbsp;&nbsp;&nbsp; :&nbsp;&nbsp;${liuyanById.users.usname}</li>
						<li>PASSWORD&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;${liuyanById.users.password}</li>
						<li>PHONE   &nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;${liuyanById.users.phone}</li>
						<li>QQ    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  :&nbsp;&nbsp;${liuyanById.users.qq}</li>
						<li>EMAIL &nbsp;&nbsp;&nbsp;&nbsp;  :&nbsp;&nbsp;${liuyanById.users.email}</li>
						<li>ADDRESS &nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;${liuyanById.users.address}</li>						
					</ul>
				
			
		</div>
	</div>
</body>
</html>