<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>YY小说后台管理</title>
<link rel="stylesheet" type="text/css" href="${basePath}/system/css/login.css" />
<link rel="stylesheet" type="text/css"
	href="${basePath}/system/css/jquery.validate.css" />
<script src="${basePath}/system/js/common/jquery-1.8.3.js"
	type="text/javascript"></script>
<script src="${basePath}/system/js/common/jQuery.md5.js" type="text/javascript"></script>
<script src="${basePath}/system/js/common/validation/jquery.validate.min.js"
	type="text/javascript"></script>
<script src="${basePath}/system/js/common/validation/messages_zh.js"
	type="text/javascript"></script>
<script src="${basePath}/system/js/common/common.js" type="text/javascript"></script>
<script src="${basePath}/system/js/system/login.js" type="text/javascript"></script>
</head>
<body>
	<input type="hidden" id="basePath" value="${basePath}" />
	<input type="hidden" id="message" value="${pageCode.msg}" />
	<div class="main">
		<div class="companyico">
			<%-- <img src="${basePath}/system/images/companyico.jpg"> --%>
			<!-- <span>三人行创业</span> -->
		</div>
		<div class="header hide"></div>
		<div class="content">
			<div class="title">YY小说后台管理系统</div>
			<form id="mainForm" method="post" action="${basePath}/login/validate">
				<fieldset>
					<div class="input">
						<input class="input_all name" name="userName" id="userName" placeholder="用户名"
							type="text" onFocus="this.className='input_all name_now';"
							onBlur="this.className='input_all name'" />
					</div>
					<div class="input">
						<input type="hidden" name="password" id="password_md5" /> <input
							class="input_all password" id="password" type="password" placeholder="密码"
							onFocus="this.className='input_all password_now';"
							onBlur="this.className='input_all password'" />
					</div>
					<div class="checkbox">
						<input type="checkbox" name="remember" id="remember" /><label
							for="remember"><span>记住密码</span></label>
					</div>
					<div class="enter">
						<input class="button hide" type="button" id="submit_login" value="登录" />
					</div>
				</fieldset>
			</form>
		</div>
	</div>
	<div class="main-footer">
		<a>系统使用协议Powered by ThreePerson Copyright © 2017 All Rights Reserved</a>
	</div>
	</div>
</body>
</html>