<div class="pageContent">                                                                                 
	<form method="post" action="${rc.contextPath}/admin/nav/companyinfo/save" class="pageForm required-validate"">
		<input type="hidden" name="id" value="${(companyInfo.id)!}">
		<div class="pageFormContent" layoutH="456">
			<table style="border-spacing:10px;">
				<tr>
				<td><label>公司名称：</label></td>
				<td><input name="companyName" type="text" size="30" value="${(companyInfo.companyName)!}" class="required"/></td>
				<td><label>公司名称(英文)：</label></td>
				<td><input name="companyNameEN" type="text" size="30" value="${(companyInfo.companyNameEN)!}" class="required"/></td>
				</tr>
				<tr>
				<td><label>公司地址：</label></td>
				<td><input name="address" type="text" size="30" value="${(companyInfo.address)!}" class="required"/></td>
				<td><label>公司地址(英文)：</label></td>
				<td><input name="addressEN" type="text" size="30" value="${(companyInfo.addressEN)!}" class="required"/></td>
				</tr>
				<tr>
				<td><label>联系人：</label></td>
				<td><input name="contactPerson" type="text" size="30" value="${(companyInfo.contactPerson)!}"/></td>
				<td><label>联系人(英文)：</label></td>
				<td><input name="contactPersonEN" type="text" size="30" value="${(companyInfo.contactPersonEN)!}"/></td>
				</tr>
				<tr>
				<td><label>电话号码：</label></td>
				<td><input name="telephone" type="text" size="30" value="${(companyInfo.telephone)!}" /></td>
				<td><label>电话号码(英文)：</label></td>
				<td><input name="telephoneEN" type="text" size="30" value="${(companyInfo.telephoneEN)!}" /></td>
				</tr>
				<tr>
				<td><label>传真号码：</label></td>
				<td><input name="faxphone" type="text" size="30" value="${(companyInfo.faxphone)!}"/></td>
				<td><label>传真号码(英文)：</label></td>
				<td><input name="faxphoneEN" type="text" size="30" value="${(companyInfo.faxphoneEN)!}"/></td>
				</tr>
				<tr>
				<td><label>e-mail：</label></td>
				<td><input name="email" type="text" size="30" value="${(companyInfo.email)!}"/></td>
				<td><label>e-mail(英文)：</label></td>
				<td><input name="emailEN" type="text" size="30" value="${(companyInfo.emailEN)!}"/></td>
				</tr>
				<tr>
				<td><label>本站关键词：</label></td>
				<td><input name="keywords" type="text" size="30" value="${(companyInfo.keywords)!}"/></td>
				<td><label>本站关键词(英文)：</label></td>
				<td><input name="keywordsEN" type="text" size="30" value="${(companyInfo.keywordsEN)!}"/></td>
				</tr>
				<tr>
				<td><label>公司介绍：</label></td>
				<td colspan="3"><textarea name="introduce" cols="130" rows="15">${(companyInfo.introduce)!}
				</textarea></td>
				</tr>
				<tr>
				<td><label>公司介绍(英文)：</label></td>
				<td colspan="3"><textarea name="introduceEN" cols="130" rows="15" >${(companyInfo.introduceEN)!}
				</textarea></td>
				</tr>
			</table>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="button" onclick="submitForm(this,navTabAjaxDone)" >保存</button></div></div></li>
			</ul>
		</div>
	</form>
</div>