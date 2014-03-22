<div class="pageContent">                                                                                 
	<form method="post" action="${rc.contextPath}/admin/detail/successful/case/save" enctype="multipart/form-data" onsubmit="return iframeCallback(this);">
		<div class="pageFormContent" layoutH="456">
			<table style="border-spacing:10px;">
				<tr>
				<td><label>案例名称：</label></td>
				<td><input name="description" type="text" size="30" value="${(obj.description)!}" class="required"/></td>
				<td><label>案例名称(英文)：</label></td>
				<td><input name="descriptionEN" type="text" size="30" value="${(obj.descriptionEN)!}" class="required"/></td>
				</tr>
				<tr>
				<tr>
					<td>选择图片：</td>
					<td>
						<input name="file" type="file" class="required"/>
					</td>
				</tr>
				<td><label>案例介绍：</label></td>
				<td colspan="3"><textarea name="name" cols="130" rows="15">${(obj.nameEN)!}
				</textarea></td>
				</tr>
				<tr>
				<td><label>案例介绍(英文)：</label></td>
				<td colspan="3"><textarea name="nameEN" cols="130" rows="15" >${(obj.nameEN)!}
				</textarea></td>
				</tr>
			</table>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit" >保存</button></div></div></li>
			</ul>
		</div>
	</form>
</div>