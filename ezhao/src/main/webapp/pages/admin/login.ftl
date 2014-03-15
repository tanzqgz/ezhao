<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <link rel="shortcut icon" type="image/ico" href="/images/favicon.ico" />
    <title>亿照后台管理系统</title>
    <link href="${rc.contextPath}/static/styles/lamps/login.css" type="text/css" media="screen" rel="stylesheet" />
    <link href="${rc.contextPath}/static/styles/jqueryUI/jquery-ui.custom.css" rel="stylesheet">
    <script src="${rc.contextPath}/static/javascripts/jquery.min.js"></script>
    <script src="${rc.contextPath}/static/javascripts/jqueryUI/jquery-ui.custom.min.js"></script>
</head>
<body id="login">
    <div id="wrappertop">
    </div>
    <div id="wrapper">
        <div id="content">
            <div id="header">
                <h1>
                    <a href=""></a></h1>
            </div>
            <div id="darkbanner" class="banner320">
                <h2>登录系统</h2>
            </div>
            <div id="darkbannerwrap">
            </div>
            <form id="loginForm" name="form1" method="post" action="${rc.contextPath}/login/submit">
            <fieldset class="form">
                <p>
                    <label class="loginlabel" for="user_name">
                        用户名:</label>
                    <input class="logininput ui-keyboard-input ui-widget-content ui-corner-all" name="loginName"
                        id="loginName" type="text" value="" />
                </p>
                <p>
                    <label class="loginlabel" for="user_password">
                        密码:</label>
                    <span>
                        <input class="logininput"   name="password" id="password" type="password" /></span>
                </p>
                <button id="loginbtn" type="button" class="positive" name="Submit">
                    <img src="${rc.contextPath}/static/images/login/key.png" alt="Announcement" />登录</button>
                    <ul id="forgottenpassword">
                    <li class="boldtext">|</li>
                    <li>
                        <label style="color:red;">${(msg)!""}</label></li>
                </ul>
            </fieldset>
        </div>
    </div>
     <script type="text/javascript">
        $(document).ready(function() {
            $("#loginbtn").click(function() {
				$('#loginForm').submit();
            })
        });
        
    </script>
</body>
