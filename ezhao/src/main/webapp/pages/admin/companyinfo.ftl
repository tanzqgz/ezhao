<div class="pageContent">                                                                                 
	<form method="post" action="${rc.contextPath}/admin/nav/companyinfo/save" class="pageForm required-validate"">
		<input type="hidden" name="id" value="${(companyInfo.id)!}">
		<div class="pageFormContent" layoutH="456">
			<p>
				<label>公司名称：</label>
				<input name="companyName" type="text" size="30" value="${(companyInfo.companyName)!}" class="required"/>
			</p>
			<p>
				<label>公司地址：</label>
				<input name="address" type="text" size="30" value="${(companyInfo.address)!}" class="required"/>
			</p>
			<p>
				<label>电话号码：</label>
				<input name="telephone" type="text" size="30" value="${(companyInfo.telephone)!}" />
			</p>
			<p>
				<label>传真号码：</label>
				<input name="faxphone" type="text" size="30" value="${(companyInfo.faxphone)!}"/>
			</p>
			<p>
				<label>e-mail：</label>
				<input name="email" type="text" size="30" value="${(companyInfo.email)!}"/>
			</p>
			<p>
				<label>本站关键词：</label>
				<input name="keywords" type="text" size="30" value="${(companyInfo.keywords)!}"/>
			</p>
			<p>
				<label>公司介绍：</label>
				<textarea name="introduce" cols="160" rows="15">
					${(companyInfo.introduce)!}
				</textarea>
			</p>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="button" onclick="submitForm(this,navTabAjaxDone)" >保存</button></div></div></li>
			</ul>
		</div>
	</form>
</div>