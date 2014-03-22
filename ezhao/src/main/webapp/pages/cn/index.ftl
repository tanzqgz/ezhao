<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=100"> <!-- IE8 mode -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta name="keywords" content="${(company.keywords)!}">
<meta name="description" content="<@spring.message "ezhao.name"/>">
<title><@spring.message "ezhao.name"/></title>
<link href="${rc.contextPath}/static/styles/lamps/global.css" rel="stylesheet" type="text/css">
<link href="${rc.contextPath}/static/styles/lamps/layout.css" rel="stylesheet" type="text/css">
<link href="${rc.contextPath}/static/styles/lamps/index.css" rel="stylesheet" type="text/css">
<link href="${rc.contextPath}/static/styles/lamps/jquery.jscrollpane.css" rel="stylesheet" type="text/css">
<script src="${rc.contextPath}/static/javascripts/jquery.min.js" type="text/javascript" async="" ></script>
<script src="${rc.contextPath}/static/javascripts/lamps/ga.js" type="text/javascript" async="" ></script>
<script src="${rc.contextPath}/static/javascripts/lamps/jquery.min.js" type="text/javascript"></script>
<script src="${rc.contextPath}/static/javascripts/lamps/plugin.js" type="text/javascript"></script>
<script src="${rc.contextPath}/static/javascripts/lamps/script.js" type="text/javascript"></script>
</head>

<body id="index" data-controller="index" data-action="init">
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
			<a href="" class="png_bg" title="亿照logo"><img src="${rc.contextPath}/static/images/ezhaoLogo.jpg" style="width:442px;height:55px;display:block;text-indent: -9999px;"/></a>
		</div>
		<ul class="quick-menu">
			<a href="" title="中文">中文</a> <span>|<span> 
			<a href="" title="English">English</a>	
		</ul>
	</div>
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

	<ul class="index-kv-b-list">
		<#list middleAdvertise as obj>
  		<li <#if obj_index==0>class="current"</#if>style="display: list-item;background-image: url(${rc.contextPath}/${(obj.advertiseURL)!}); opacity: 1; background-position: 50% 0%; background-repeat: no-repeat no-repeat;" title="${(obj.description)!}">
           	<div><a class="kv_btn " style="left:0px;top:36px;width:1000px;height:403px;" href="${(obj.advertiseLink)!}" target="_blank"></a></div>
        </li>
        </#list>
    </ul>
    <div id="mainer">
            <div class="main-inner clearfix">
                <div id="content">
                	<div class="content-inner">
                    	<div class="index-kv-s png_bg">
                        	<div class="section-inner">
                            	<div class="index-kv-s-wrap">
	                            	<ul class="index-kv-s-list clearfix" style="width: 3280px;">
	                            	<#list bottomAdvertise as obj>
	                                    <li><a href="${(obj.advertiseLink)!}" target="_blank" title="">
	                                    	<img src="${rc.contextPath}/${(obj.advertiseURL)!}">
	                                    	<strong class="png_bg"><span>查看详情</span></strong>
	                                    </a></li>
	                                </#list>
	                                </ul>
                                </div>
                                <div class="index-kv-pager">
	                             	<ul id="kv_points" class="clearfix">
	                                </ul>
                             	</div>
                            	<a href="#" class="png_bg ctrl prev"></a>
                            	<a href="#" class="png_bg ctrl next"></a>
                             </div>
                        </div>
                    </div>
                </div>
                </div>
    	</div>
    </div>
    <div id="footer">
		<div class="section-inner">
			<p class="copyright" style="clear:both;text-align:center;color:#888">${(company.companyName)!}&nbsp;&nbsp;联系地址：${(company.address)!}&nbsp;&nbsp;备案号 粤ICP0925554号</p>
			<p style="clear:both;text-align:center;color:#888">联系电话：${(company.telephone)!}   传真：${(company.faxphone)!}   邮箱：${(company.email)!}</p>
			<p>本站关键词：</p>
			<p>${(company.keywords)!}</p>
		</div>
	</div>
</div>
<div class="side-btns-2wm" style="">
	<em style="font-color:red;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;亿照微信号</em>
	<img src="${rc.contextPath}/${(weixin.advertiseURL)!}" width="90"/>
</div>

<div id="love2" style="right:2px;POSITION:absolute;TOP:1px;z-index: 999999;">
	<table border="0" width="107" cellspacing="0" cellpadding="0">
		<tbody>
			<tr>
				<td style="width:110px;vertical-align: inherit;" colspan="2">
				<img border="0" style="margin-bottom:-6px;" src="${rc.contextPath}/static/images/ezhao/kefu_up.jpg"></td>
			</tr>
			<tr>
				<td style="vertical-align: middle;display: table-cell;background:url(${rc.contextPath}/static/images/ezhao/kefu_middle.jpg)">
					<table border="0" width="100" align="center" cellspacing="2px" cellpadding="0">
						<tbody>
							<tr><td width="40" height="25" align="center"><img src="${rc.contextPath}/static/images/ezhao/QQonline.jpg" border="0" align="middle"></td><td width="60" height="25" style="word-break:break-all"><a class="h12_qq" target="blank" href="http://wpa.qq.com/msgrd?V=1&Uin=1556315596&Site=www.chinaeozo.com&Menu=no" title="在线即时交谈">亿照客服1</a></td></tr>
						</tbody>
					</table>
				</td>
			</tr>
			<tr>
				<td style="background:url(${rc.contextPath}/static/images/ezhao/kefu_middle.jpg)">
					<table border="0" width="100" align="center" cellspacing="0" cellpadding="0">
						<tbody>
							<tr>
								<td width="40" height="25" align="center">
									<img src="${rc.contextPath}/static/images/ezhao/QQonline.jpg" border="0" align="middle">
								</td>
								<td width="60" height="25" style="word-break:break-all">
									<a class="h12_qq" target="blank" href="http://wpa.qq.com/msgrd?V=1&amp;Uin=1941867264&amp;Site=www.chinaeozo.com&amp;Menu=no" title="在线即时交谈">亿照客服2</a>
								</td>
							</tr>
						</tbody>
					</table>
				</td>
			</tr>
			<tr>
				<td valign="middle" background="${rc.contextPath}/static/images/ezhao/kefu_middle.jpg" colspan="2">
					<p align="center"><font color="#FF0000"></font></p>
				</td>
			</tr>
			<tr>
				<td colspan="2" valign="middle" background="${rc.contextPath}/static/images/ezhao/kefu_middle.jpg">
					<div align="center"><font color="#FF0000"></font></div>
				</td>
			</tr>
			<tr>
				<td colspan="2" valign="middle" background="${rc.contextPath}/static/images/ezhao/kefu_middle.jpg">
					<div align="center"></div>
				</td>
			</tr>
			<tr>
				<td colspan="2" valign="middle" background="${rc.contextPath}/static/images/ezhao/kefu_middle.jpg">
					<img border="0" src="${rc.contextPath}/static/images/ezhao/kefu_down.jpg">
				</td>
			</tr>
			<tr>
			</tr>
		</tbody>
	</table>
</div>
<script type="text/javascript">
$(".index-kv-b-list li").each(function(index, ele){
	if(index==0){
		$("#kv_points").append('<li class="current"><a href="#" class="png_bg"></a></li>');
	}else{
		$("#kv_points").append('<li><a href="#" class="png_bg"></a></li>');
	}
});
</script>
</body>
</html>