<#import "/paging/paging4dwz.ftl" as paging/>
<form id="pagerForm" method="post" action="#rel#">
	<input type="hidden" name="pageNo" value="1" />
	<input type="hidden" name="pageSize" value="" />
</form>
<div class="pageHeader">
</div>
	
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a title="删除" target="selectedTodo" rel="id" href="${rc.contextPath}/admin/detail/successful/case/delete" class="delete"><span>删除</span></a></li>
			<li class="line">line</li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="300">
		<thead>
			<tr>
				<th width="2%"></th>
				<th width="10%">描述</th>
				<th width="15%">图片路径</th>
			</tr>
		</thead>
		<tbody>
			<#list all as obj>
			<tr target="question_category">
				<td><input type="checkbox" name="id" value="${(obj.id)!}"></td>
				<td>${(obj.description)!}</td>
				<td>${(obj.url)!}</td>
			</tr>
			</#list>
		</tbody>
	</table>
	<@paging.pagination4dwz pageResults=categoryList targetType='navTab'/>
</div>