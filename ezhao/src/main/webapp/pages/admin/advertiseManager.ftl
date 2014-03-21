<#import "/paging/paging4dwz.ftl" as paging/>
<form id="pagerForm" method="post" action="#rel#">
	<input type="hidden" name="pageNo" value="1" />
	<input type="hidden" name="pageSize" value="" />
</form>
<div class="pageHeader">
<form enctype="multipart/form-data" onsubmit="return iframeCallback(this,navTabAjaxDone);" action="${rc.contextPath}/admin/advertise/save" method="post">
	<div class="searchBar">
		<table class="pageFormContent">
			<tr>
				<td>图片链接：</td>
				<td>
					<input name="advertiseLink" type="text" size="60" class="required"/>
				</td>
				<td>图片链接（英文）：</td>
				<td>
					<input name="advertiseLinkEN" type="text" size="60" class="required"/>
				</td>
			</tr>
			<tr>
				<td>描述：</td>
				<td>
					<input name="description" type="text" size="60" class="required"/>
				</td>
				<td>描述（英文）：</td>
				<td>
					<input name="descriptionEN" type="text" size="60" class="required"/>
				</td>
			</tr>
			<tr>
				<td>上传广告图片：</td>
				<td>
					<input name="file" type="file" class="required"/>
				</td>
			</tr>
			<tr>
				<td>上传广告图片（英文）：</td>
				<td>
					<input name="file1" type="file" class="required"/>
				</td>
			</tr>
			<tr>
				<td>选择广告图片位置：</td>
				<td>
					<select class="required" name="typeId">
						<#list adTypeAll as obj>
							<option value ="${(obj.id)!}">${(obj.adCategoryName)!}</option>
						</#list>
					</select>
				</td>
				<td>
					<div class="buttonActive"><div class="buttonContent"><button type="submit" >保存</button></div></div>
				</td>
			</tr>
		</table>
		<div class="subBar">
		</div>
	</div>
	</form>
</div>
	
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a title="删除" target="selectedTodo" rel="id" href="${rc.contextPath}/admin/advertise/delete" class="delete"><span>删除</span></a></li>
			<li class="line">line</li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="300">
		<thead>
			<tr>
				<th width="2%"></th>
				<th width="10%">图片链接</th>
				<th width="15%">图片链接（英文）</th>
				<th width="10%">描述</th>
				<th width="15%">描述（英文）</th>
			</tr>
		</thead>
		<tbody>
			<#list all as obj>
			<tr target="advertise_list">
				<td><input type="checkbox" name="id" value="${(obj.id)!}"></td>
				<td>${(obj.advertiseLink)!}</td>
				<td>${(obj.advertiseLinkEN)!}</td>
				<td>${(obj.description)!}</td>
				<td>${(obj.descriptionEN)!}</td>
			</tr>
			</#list>
		</tbody>
	</table>
	<@paging.pagination4dwz pageResults=categoryList targetType='navTab'/>
</div>