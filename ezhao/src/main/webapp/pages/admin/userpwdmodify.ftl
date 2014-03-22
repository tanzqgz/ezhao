<div class="pageContent">                                                                                 
	<form method="post" onsubmit="return iframeCallback(this);" action="${rc.contextPath}/admin/user/password/save" class="pageForm required-validate">
		<div class="pageFormContent" layoutH="156">
			<table style="border-spacing:10px;">
				<tr>
				<td><label>旧密码：</label></td>
				<td><input name="oldPassword" type="password" size="30" value="" class="required"/></td>
				</tr>
				<tr>
				<td><label>新密码：</label></td>
				<td><input id="newPassword" name="newPassword" type="password" size="30" value="" class="required"/></td>
				</tr>
				<tr>
				<td><label>新密码确认：</label></td>
				<td><input name="confirmPassword" type="password" size="30" value="" class="required" equalto="#newPassword"/></td>
				</tr>
				<tr>
				<td></td>
				<td>
				<div class="buttonActive"><div class="buttonContent"><button type="submit" >保存</button></div></div>
				</td>
				</tr>
			</table>
		</div>
	</form>
</div>