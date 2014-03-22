<!DOCTYPE html>
<html lang="en" class="no-js">
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">

<title><@spring.message "ezhao.name"/></title>
<link href="${rc.contextPath}/static/styles/lamps/globalA.css" rel="stylesheet" type="text/css">
<link href="${rc.contextPath}/static/styles/lamps/layoutA.css" rel="stylesheet" type="text/css">
<link href="${rc.contextPath}/static/styles/lamps/jquery.jscrollpaneA.css" rel="stylesheet" type="text/css">
<script src="${rc.contextPath}/static/javascripts/lamps/ga.js" type="text/javascript" async="" ></script>
<script src="${rc.contextPath}/static/javascripts/lamps/jquery.min.js" type="text/javascript"></script>
<script src="${rc.contextPath}/static/javascripts/lamps/plugin.js" type="text/javascript"></script>
<script src="${rc.contextPath}/static/javascripts/lamps/script.js" type="text/javascript"></script>
<style type="text/css">
	span.hint{color:#ccc;position:absolute;top:4px;left:5px;-webkit-transition:All 0.5s ease;-moz-transition:All 0.5s ease;-o-transition:All 0.5s ease;}
	span.hint:hover{color:#333}
</style>
</head>

<body id="about" data-controller="about" data-action="init">
	<div id="wraper">
	<!--[if IE 6]>
<script src="/js/DD_belatedPNG.js"></script>
<script>
  /* EXAMPLE */
  DD_belatedPNG.fix('.png_bg');
  
  /* string argument can be any CSS selector */
  /* .png_bg example is unnecessary */
  /* change it to what suits you! */
</script>
<![endif]-->
<div id="toper" class="png_bg">
	<div class="section-inner">
		<div id="logo">
			<a href="" class="png_bg" title="亿照logo"><img src="${rc.contextPath}/static/images/ezhaoLogo.jpg" style="width:442px;height:55px;"/></a>
		</div>
		<ul class="quick-menu">
			<a href="" title="中文">中文</a> <span>|<span> 
			<a href="" title="English">English</a>		
		</ul>
	</div>
	<div class="head-shadow" style="position: relative;width: 100%;height: 3px;background: #B2B2B2;opacity: 0.35;bottom: 2px;left: 0;z-index: 999999;"></div>
</div>
<div id="container">
    	<div id="header">
			<div id="nav">
				<ul class="clearfix">
					<li class="index"><a href="${rc.contextPath}"><@spring.message "ezhao.main.page"/></a></li>
					<li class="about"><a href="${rc.contextPath}/about/company"><@spring.message "ezhao.main.about.us"/></a></li>
					<li class="product"><a href="${rc.contextPath}/product"><@spring.message "ezhao.main.products"/></a></li>
					<li class="news"><a href="${rc.contextPath}/successful/case"><@spring.message "ezhao.main.successful.cas"/></a></li>
					<li class="support"><a href="${rc.contextPath}/marketing"><@spring.message "ezhao.main.marketing"/></a></li>
					<li class="support"><a href="${rc.contextPath}/about/contact/us"><@spring.message "ezhao.main.contact.us"/></a></li>
				</ul>
			</div>
		</div>

		<div id="mainer">
            	<div class="main-inner clearfix">
            		<div id="nav-crumbs">
                        <ul class="nav-crumbs-list clearfix">
                            <li class="index"><a href="${rc.contextPath}" class="icon-all"><@spring.message "ezhao.main.page"/></a></li>
                        </ul>
                    </div>
                	<div id="content">
                        <div class="content-inner">
                            <div class="main-content" style="border-left: 1px dotted #d0d0d0;">
                                <div class="pageTitle" style="font-size: 16px;color: green;font-weight: bold;text-align: center;border-bottom: 1px solid #D0D0D0;">营销网络</div>
                                <div>
                                	<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,29,0" width="550" height="438">
                  						<param name="movie" value="images/ezhao/map.swf">
                  						<param name="quality" value="high">
                  						<embed src="${rc.contextPath}/static/images/ezhao/map.swf" quality="high" pluginspage="http://www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash" width="550" height="438">
              						</object>
                                </div>
                                <div class="backTopBox"><a href="${rc.contextPath}/about/contact/us#top" class="backTop icon-all">back top</a></div>
                            </div>
                        	<div class="side-bar">
                            	<div class="section-inner">
									<div class="search-bar">
	    								<div class="block-inner">
	        								<h2>全站搜索</h2>
	        								<form id="search_form" action="#" method="get" onsubmit="javascript:void(0);">
	        								<p class="clearfix" style="position:relative"><input name="keyWord" type="text" class="txt-search" value=""><input type="submit" class="btn-search icon-all" title="搜索" value="" style="cursor:pointer">
												<span class="hint">请输入搜索关键字</span>
											</p>
	        								</form>
	    								</div>
									</div>
									<div class="side-nav" style="min-height: 688px;">
    									<div class="block-inner">
											<h2>营销网络</h2>
												<ul class="side-nav-list">
													<li class="hover"><a href="${rc.contextPath}/marketing">北京市</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">广东省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">香港特别行政区</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">天津市</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">河北省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">山西省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">内蒙古自治区</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">辽宁省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">吉林省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">黑龙江省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">上海市</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">江苏省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">浙江省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">安徽省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">福建省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">江西省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">山东省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">河南省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">湖北省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">湖南省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">广西壮族自治区</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">海南省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">重庆市</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">四川省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">贵州省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">云南省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">西藏自治区</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">陕西省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">甘肃省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">青海省</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">宁夏回族自治区</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">新疆维吾尔自治区</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">澳门特别行政区</a></li>
													<li class="hover"><a href="${rc.contextPath}/marketing">台湾省</a></li>
												</ul>
										</div>
									</div>
                           		</div>
                        	</div>
                    	</div>
                	</div>
                </div>
            </div>
        </div>
    <div id="footer">
		<div class="section-inner">
			<p class="copyright" style="clear:both;text-align:center;color:#888"><@spring.message "ezhao.main.footer"/></p>
			<p style="clear:both;text-align:center;color:#888">联系电话：${(obj.telephone)!}   传真：${(obj.faxphone)!}   邮箱：${(obj.email)!}</p>
			<p>本站关键词：</p>
			<p>${(obj.keywords)!}</p>
		</div>
	</div>
</div>
</body>
</html>