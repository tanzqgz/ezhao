<#macro pagination4dwz  pageResults targetType>
    <div class="panelBar">
		<div class="pages">
			<span>显示</span>
			<select class="combox" name="pageSize" onchange="navTabPageBreak({numPerPage:this.value})">
				<option value="10" <#if pageResults.size==10>selected</#if>>10</option>
				<option value="15" <#if pageResults.size==15>selected</#if>>15</option>
				<option value="20" <#if pageResults.size==20>selected</#if>>20</option>
				<option value="50" <#if pageResults.size==50>selected</#if>>50</option>
			</select>
			<span>条，共${(pageResults.totalElements)!}条</span>
		</div>
		<div class="pagination" targetType="${targetType!'navTab'}" totalCount="${(pageResults.totalElements)!}" numPerPage="${pageResults.size}" pageNumShown="10" currentPage="${pageResults.number+1}"></div>
	</div>
</#macro>