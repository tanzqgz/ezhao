<html>
<head>

<link href="${rc.contextPath}/static/styles/dwz/themes/default/style.css" rel="stylesheet" type="text/css" media="screen"/>
		<link href="${rc.contextPath}/static/styles/dwz/themes/css/core.css" rel="stylesheet" type="text/css" media="screen"/>
		<link href="${rc.contextPath}/static/styles/dwz/themes/css/print.css" rel="stylesheet" type="text/css" media="print"/>
		<link href="${rc.contextPath}/static/styles/dwz/themes/css/custom.css" rel="stylesheet" type="text/css" media="screen"/>
		<!--[if IE]>
		<link href="${rc.contextPath}/static/styles/dwz/themes/css/ieHack.css" rel="stylesheet" type="text/css" media="screen"/>
		<![endif]-->
		
		<script src="${rc.contextPath}/static/javascripts/jquery.min.js" type="text/javascript"></script>
		<script src="${rc.contextPath}/static/javascripts/dwz/jquery.cookie.js" type="text/javascript"></script>
		<script src="${rc.contextPath}/static/javascripts/dwz/jquery.validate.min.js" type="text/javascript"></script>
		<script src="${rc.contextPath}/static/javascripts/dwz/jquery.bgiframe.js" type="text/javascript"></script>
		
		<script src="${rc.contextPath}/static/javascripts/dwz/dwz.min.js"></script>		
		<script src="${rc.contextPath}/static/javascripts/dwz/dwz.regional.zh.js"></script>
		<script src="${rc.contextPath}/static/javascripts/dwz/dwz.custom.js"></script>
		
<title>
亿照后台管理系统
</title>
<script type="text/javascript">
$(function(){
	DWZ.init("${rc.contextPath}/static/javascripts/dwz/dwz.frag.xml", {
		//loginUrl:"${rc.contextPath}/admin/index", loginTitle:"登录",	// 弹出登录对话框
		loginUrl:"${rc.contextPath}/login/home",
		statusCode:{ok:200, error:300, timeout:301}, //【可选】
		pageInfo:{pageNum:"pageNo", numPerPage:"pageSize", orderField:"orderField", orderDirection:"orderDirection"}, //【可选】
		debug:false,	// 调试模式 【true|false】
		callback:function(){
			initEnv();
			$("#themeList").theme({themeBase:"${rc.contextPath}//static/styles/dwz/themes"});
//			setTimeout(function() {$("#sidebar .toggleCollapse div").trigger("click");}, 10);
		}
	});
});
</script>
</head>
<body scroll="no">
	<div id="layout">
		<div id="header">
			<div class="headerNav">
				<div  class="logoText">亿照后台管理系统</div>
			</div>
			<!-- navMenu -->
		</div>
		<div id="leftside">
			<div id="sidebar_s">
				<div class="collapse">
					<div class="toggleCollapse"><div></div></div>
				</div>
			</div>
			<div id="sidebar">
				<div class="toggleCollapse">
					<h2>管理</h2>
					<div>管理</div>
				</div>
				<div class="accordion" fillSpace="sidebar">
					<div class="accordionHeader"><!--栏目管理-->
						<h2><span>Folder</span>产品管理</h2>
					</div>
					<div class="accordionContent">
						<ul class="tree">
							<li><a href="${rc.contextPath}/admin/catagory/question/manage?pageSize=10" target="navTab" rel="question_catagory_page">产品分类管理</a></li>
							<li><a href="${rc.contextPath}/admin/catagory/idea/manage?pageSize=10" target="navTab" rel="idea_catagory_page">添加产品</a></li>
						</ul>
					</div>		
					<div class="accordionHeader">
						<h2><span>Folder</span>新闻发布</h2>
					</div>
					<div class="accordionContent">
						<ul class="tree">
							<li><a href="${rc.contextPath}/admin/security/userList" target="navTab" rel="sec_user_page">发布新闻</a></li>
						</ul>
					</div>
					<div class="accordionHeader">
						<h2><span>Folder</span>权限管理</h2>
					</div>
					<div class="accordionContent">
						<ul class="tree">
							<li><a href="${rc.contextPath}/admin/security/userList" target="navTab" rel="sec_user_page">用户</a></li>
							<li><a href="${rc.contextPath}/admin/security/roleList" target="navTab" rel="sec_role_page">角色</a></li>
							<li><a href="${rc.contextPath}/admin/security/permissionList" target="navTab" rel="sec_permission_page">权限</a></li>
						</ul>
					</div>
				
					<div class="accordionHeader">
						<h2><span>Folder</span>公司介绍</h2>
					</div>
					<div class="accordionContent">
						<ul class="tree">
							<li><a href="${rc.contextPath}/admin/nav/companyinfo/home" target="navTab" rel="sec_companyinfo_page">公司基本资料</a></li>
							<li><a href="${rc.contextPath}/admin/nav/certificate" target="navTab" rel="sec_certificate_page">上传证书</a></li>
							<li><a href="${rc.contextPath}/grade/gradeList" target="navTab" rel="sec_grade_page">友情链接</a></li>
						 </ul>
					</div>
				</div>
			</div>
		</div>
		<div id="container">
			<div id="navTab" class="tabsPage">
				<div class="tabsPageHeader">
					<div class="tabsPageHeaderContent"><!-- 显示左右控制时添加 class="tabsPageHeaderMargin" -->
						<ul class="navTab-tab">
							<li tabid="main" class="main">
								<a href="javascript:;">
									<span><span class="home_icon">主页</span></span>
								</a>
							</li>
						</ul>
					</div>
					<div class="tabsLeft">left</div><!-- 禁用只需要添加一个样式 class="tabsLeft tabsLeftDisabled" -->
					<div class="tabsRight">right</div><!-- 禁用只需要添加一个样式 class="tabsRight tabsRightDisabled" -->
					<div class="tabsMore">more</div>
				</div>
				<ul class="tabsMoreList">
					<li><a href="javascript:;">主页</a></li>
				</ul>
				<div class="navTab-panel tabsPageContent layoutBox">
					<div class="page unitBox">
						<div class="pageFormContent" align="center">
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="footer">Copyright &copy; 2014 <a href="demo_page2.html" target="dialog">EZHAO</a></div>
</body>
</html>