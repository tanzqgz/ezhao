/**
 * button typ 为submit时,回车时表单自动提交与jquery validation冲突,
 * 即在有字段需要校验时， 也会提交表单，故将submit button 改为普通button,
 * 手动提交表单
 * @param theBtn
 * @param callbackFunction
 */
function submitForm(theBtn,callbackFunction){
	var theForm = $(theBtn).closest("form");
	if(validateCallback(theForm, callbackFunction)){
		theForm.submit();
	}
}

function submitPadForm(element,idValue,nameValue){
	var theform = $(element).closest("form");
	theform.find('[name=id]').val(idValue);
	theform.find('[name=name]').val(nameValue);
	$.pdialog.reload(theform.attr('action'), {data: theform.serializeArray()});
}

(function($){
	$.fn.extend({//selectOne
		selectOne: function(){
			function _getIds(selectedIds, targetType){
				var ids = "";
				//var $box = targetType == "dialog" ? $.pdialog.getCurrent() : navTab.getCurrentPanel();
				var $box =  navTab.getCurrentPanel();
				
				$box.find("input:checked").filter("[name='"+selectedIds+"']").each(function(i){
					var val = $(this).val();
					ids += i==0 ? val : ","+val;
				});
				
				return ids;
			}
			return this.each(function(){
				var $this = $(this);
				var selectedIds = $this.attr("rel") || "ids";
				var postType = $this.attr("postType") || "map";

				$this.click(function(event){
					var targetType = $this.attr("targetType");
					var ids = _getIds(selectedIds, targetType);
					if (!ids) {
						alertMsg.error($this.attr("warn") || DWZ.msg("alertSelectMsg"));
						return false;
					}
					if (ids.indexOf(',')!=-1) {
						    alertMsg.error($this.attr("warn"));
						    return false;
				    }
					
					var title = $this.attr("title") || $this.text();
					var tabid = $this.attr("rel") || "_blank";
					var fresh = eval($this.attr("fresh") || "true");
					var external = eval($this.attr("external") || "false");
					var url = unescape($this.attr("href")).replaceTmById($(event.target).parents(".unitBox:first"));
					url = url + "/"+ids;
					DWZ.debug(url);
					if (!url.isFinishedTm()) {
						alertMsg.error($this.attr("warn") || DWZ.msg("alertSelectMsg"));
						return false;
					}
					if(targetType == 'dialog'){
						   var options = {};
						   var w = $this.attr("width");
						   var h = $this.attr("height");
						   var rel = $this.attr("rel")||"_dialog";
						   if (w) options.width = w;
						   if (h) options.height = h;
						   options.max = eval($this.attr("max") || "false");
						   options.mask = eval($this.attr("mask") || "false");
						   options.maxable = eval($this.attr("maxable") || "true");
						   options.minable = eval($this.attr("minable") || "true");
						   options.fresh = eval($this.attr("fresh") || "true");
						   options.resizable = eval($this.attr("resizable") || "true");
						   options.drawable = eval($this.attr("drawable") || "true");
						   options.close = eval($this.attr("close") || "");
						   options.param = $this.attr("param") || "";
						   $.pdialog.open(url, rel, title, options);
					}else{
						navTab.openTab(tabid, url,{title:title, fresh:fresh, external:external});
					}
					event.preventDefault();
				});
				
			});
		}
	})
})(jQuery);


function navTabAjaxDone(json){
	return true;
}