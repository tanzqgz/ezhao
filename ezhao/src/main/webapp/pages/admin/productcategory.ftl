<#import "/paging/paging4dwz.ftl" as paging/>
<form id="pagerForm" method="post" action="#rel#">
	<input type="hidden" name="pageNo" value="1" />
	<input type="hidden" name="pageSize" value="" />
</form>
<div class="pageHeader">
<form onsubmit="return iframeCallback(this);"  action="${rc.contextPath}/admin/product/category/save" method="post" class="pageForm required-validate">
	<div class="searchBar">
		<table class="pageFormContent">
			<tr>
				<td>分类名：</td>
				<td>
					<input name="categoryName" type="text" size="40" class="required"/>
				</td>
			</tr>
			<tr>
				<td>父目录：</td>
				<td>
					<select class="required" name="parentId">
						<option value ="0" selected="selected">根目录</option>
						<#list all as obj>
							<option value ="${(obj.id)!}">${(obj.categoryName)!}</option>
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
			<li><a title="删除" target="selectedTodo" rel="id" href="${rc.contextPath}/admin/product/category/delete" class="delete"><span>删除</span></a></li>
			<li class="line">line</li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="300">
		<thead>
			<tr>
				<th width="2%"></th>
				<th width="10%">分类名</th>
			</tr>
		</thead>
		<tbody>
			<#list all as obj>
			<tr target="question_category">
				<td><input type="checkbox" name="id" value="${(obj.id)!}"></td>
				<td>${(obj.categoryName)!}</td>
			</tr>
			</#list>
		</tbody>
	</table>
	<@paging.pagination4dwz pageResults=categoryList targetType='navTab'/>
</div>