<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<META http-equiv="X-UA-Compatible" content="IE=8" />
	<link rel="stylesheet" type="text/css" href="${base}/static/styles/validationEngine/validationEngine.jquery.css"/>
	<script language="javascript" src="${base}/static/javascripts/jquery.min.js"></script>
	${head}
<title>
	<#if title??>
		${title}
	<#else>
		ezhao
	</#if>
</title>
</head>
	<body>
		<#include "header.ftl">
		${body}
		<#include "footer.ftl">
	</body>
</html>