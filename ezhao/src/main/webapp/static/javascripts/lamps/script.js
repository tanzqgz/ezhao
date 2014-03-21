$(function(){
	ezhao.init();
	$("a[style='cursor:default']").attr("target","_self").attr("href","javascript:void(0);");
});
var $data;
var googleCnt;
var baseurl = "light-images/";
var oldURL =[];
var loadingImg =$("#loading-img")
var ezhao = {
	init:function(){
		ezhao.util();
		ezhao.judgeSize();
		ezhao.sideNav();
		ezhao.insertModule();
		ezhao.scrollTop();
		ezhao.loading();
		ezhao.addTopAly();
		if($.browser.version!="6.0"){
			ezhao.topBanner();
			}
		
	},
	util:function(){
		var $body = $('body'),
        controller = $body.data('controller'),
        action = $body.data('action');
        if (controller !== "" && ezhao[controller] && typeof ezhao[controller][action] == "function") {
            ezhao[controller][action]();
        }
	},
	judgeSize:function(){
		var height = $(".side-nav").height();
		var reheight = $(".main-content").height()-$(".search-bar").outerHeight()-10;
		if(height<reheight){
			$(".side-nav").css({"min-height":reheight});
			}
	},
	sideNav:function(){
		//$(".side-nav-list ul").slideUp(0)
		$(".side-nav-list li").has("ul:visible").addClass("hover");
		$(".side-nav-list li").each(function(){
			var $this = $(this);
			if(!$this.find("ul")[0]){
				$this.addClass("hover");
				};
			});
			
			//console.log($(".side-nav-list-2").children("li"))
		$(".side-nav-list-2").each(function(){
				$(this).children("li").last().addClass("no-line");
			});
			
		$(".side-nav-list a").click(function(e){
			e.stopPropagation();
			});
		$(".side-nav-list li").click(function(e){
			e.stopPropagation();
			//e.preventDefault();
			var $this = $(this);
			$this.children("ul").slideToggle(function(){
				$this.toggleClass("hover");
				});
			});
	},
	insertModule:function(){
	 		$("#nav li").hover(function(){
				$(".sub-nav",$(this)).show();
				},function(){
				$(".sub-nav",$(this)).hide();
				});
			$(".language,.suppliers,.online-mall").hover(function(){
				$(".langeuage-list-wrap",$(this)).show();
				},function(){
				$(".langeuage-list-wrap",$(this)).hide();
				});
			$(".has-list").hover(function(){
				$(this).children("a").addClass("hover")
				$(".sub-nav-crumbs",$(this)).show();
				$(this).css({"z-index":"999"})
				},function(){
				$(this).children("a").removeClass("hover")
				$(".sub-nav-crumbs",$(this)).hide();
				$(this).css({"z-index":"1"})
				});
	},
	switchTab:function($ctrl,$cnt,curClass){
		$ctrl.find(".switchTabCtrl").click(function(e){
			e.preventDefault();
			var curClass = curClass||"hover";
			$ctrl.find(".switchTabCtrl").removeClass(curClass);
			$(this).addClass(curClass);
			var ctrl;
			if($(this).parent("li")[0]){
				ctrl = $(this).parent();
			}else{
				ctrl = $(this);
				}
	
			var prevLength = ctrl.prevAll().length;
			
			$cnt.find(".switchTabCnt").hide();
			$cnt.find(".switchTabCnt").eq(prevLength).show();
		});		
	},
	scrollTop:function(){
		$(".backTop,.goto-top").click(function(e){
			e.preventDefault();
			$("html,body").animate({scrollTop:0})
		});
	},
	loading:function(){
		if($("#loading-img")[0]){
			var pos = 0;
			function a(){
				pos-=26;
				$("#loading-img").css({"background-position":"0 "+pos+"px"});
				
			}
			setInterval(function(){a()},50);
		
		};
	},
	topBanner:function(){
		var css = {"position":"fixed",
					"top":"-50px",
					"left":"0"
					};
		var toper  = $("#toper").clone(true).appendTo("body").css(css).addClass("toper-fb").hide();
		$(window).scroll(function(){	
			if($(window).scrollTop()>65){
				toper.fadeIn();
			}else if($(window).scrollTop()<65){
				toper.fadeOut();
			};
		});
		$(".toper-fb").hover(function(){
			$(this).stop().animate({"top":"0"})
			},function(){
			$(this).stop().animate({"top":"-50px"})
			})
	},
	addTopAly:function(){
		$("#toper a").click(function(){
			googleCnt = $(this).text()
			addGoogleAnalysis("topNav","click",googleCnt)
		})
	}
}



ezhao.index = {
	init:function(){
		//KV从暗到明
		//var div = $("<div style='background:#000000;height:430px;width:1120px;margin:42px auto 0;'></div>")
		//$(".index-kv-b-list li:first").append(div)
		//div.animate({"opacity":"0"},2000);
		$(".index-kv-b-list .current").css({"opacity":"0"}).animate({"opacity":"1"},2000)
		
		ezhao.index.homeRotate();
		ezhao.index.homeKV();	
	},
	homeRotate:function(){
		var list = $(".index-kv-s-list");
		var listWrap = $(".index-kv-s-wrap");
		var ctrl = $(".index-kv-s .ctrl");
		var itemLi = $(".index-kv-s-list li");
		var scrollLeft = 0;
		var scrollMax = itemLi.length*328;
		var scrolling = true
		itemLi.each(function(){
			list.append($(this).clone())
			})
		list.width(function(){
				return $("li",$(this)).length*328
		});
		ctrl.click(function(e){
			e.preventDefault();
			if(scrolling){
				scrolling = false
				curItem = $(".index-kv-s-list .current");
				if($(this).hasClass("prev")){
					if($(".index-kv-s-wrap").scrollLeft()==0){
						$(".index-kv-s-wrap").scrollLeft(scrollMax)
						scrollLeft = scrollMax
						}
					scrollLeft-=328;
				}else{
					scrollLeft+=328;
				};
				listWrap.animate({scrollLeft: scrollLeft},function(){
				if($(".index-kv-s-wrap").scrollLeft()==scrollMax){
					$(".index-kv-s-wrap").scrollLeft(0);
					scrollLeft=0;
					}
				//console.log($(".index-kv-s-wrap").scrollLeft())	
				scrolling = true
				});
			};	
		});
		function getItem(){
			 $(".index-kv-s-list li").each(function(i,node){
				 
				 // console.log(i+""+$(this).position().left+$(this).html())
				
				 })
			}
		ezhao.index.startRotate= function(){
			ezhao.index.stopRotate()
			ezhao.index.rotateInterval  = setInterval(function(){
				ctrl.filter(".next").trigger("click")
				},10000)
		};
		ezhao.index.stopRotate= function(){
			clearInterval(ezhao.index.rotateInterval)
		};
			$(".index-kv-s").bind({
			mouseover:ezhao.index.stopRotate,
			mouseout:ezhao.index.startRotate
		});	
		ezhao.index.startRotate()	
			
	},
	homeKV:function(){
		var cur =  $(".index-kv-pager li.current");
		var pager =$(".index-kv-pager li");
		var scrolling = true
		pager.click(function(e){
				e.preventDefault();
				if(scrolling){
				scrolling = false
				pager.removeClass("current");
				$(this).addClass("current");
				 cur = $(".index-kv-pager li.current");
				var index = cur.prevAll().length;
				advance();
			
				}
			function advance(){
					$(".index-kv-b-list li").fadeOut(200);
					$(".index-kv-b-list li").eq(index).fadeIn(200,function(){scrolling = true});
				}
			
			
		});
		ezhao.index.startRotateK= function(){
			//ezhao.index.stopRotateK()
			ezhao.index.rotateIntervalK  = setInterval(function(){
				if(cur.next()[0]){
					if(cur.html()==$(".index-kv-pager li:first").html()){
						
						clearInterval(ezhao.index.rotateIntervalK);
						ezhao.index.timeout = setTimeout(function(){
							cur.next().trigger("click");
							ezhao.index.startRotateK();
						},10000)
					}else{
						cur.next().trigger("click");
					}
					
					}else{
					pager.first().trigger("click");
					};
				},6000)
		};
		
		ezhao.index.stopRotateK= function(){
			clearInterval(ezhao.index.rotateIntervalK);
			clearTimeout(ezhao.index.timeout);
			
		};
			$(".index-kv-b-list").bind({
			mouseover:ezhao.index.stopRotateK,
			mouseout:ezhao.index.startRotateK
		});	
		ezhao.index.startRotateK()	
		
		
		
	}

}

ezhao.experience = {
	init:function(){
		
		//ezhao.experience.eleHover()
		ezhao.switchTab($(".feature-intro-nav"),$(".feature-content"))
		ezhao.experience.dataInit($.address.parameter("type"));
		hashTest();
		
		function hashTest(){
	
			if(!window.location.hash||window.location.hash=="#"){
				window.location.hash="/pic1/1";
				}
			}
		
	},
	addressInit:function(){

		$.address.init(function(event){
			//console.log("init"+window.location.hash)
		});
		$.address.change(function(event) {
				//console.log("yeschange")
				/*if(oldURL[0]!=event.pathNames[0]){
					var sideNum = event.pathNames[0].substr(3);
					var mianNum = event.pathNames[1];
					$(".album-list li").eq(sideNum).find("a").trigger("click");
					$(".feature-img-list li").eq(mianNum).find("a").trigger("click");
					oldURL = event.pathNames
				}*/
				
				//console.log(sideNum)
				//console.log(mianNum)
				///console.log(oldURL[0])
			///	console.log(event.parameter("type"))
				//console.log($.address.parameter("type"))
				if(oldURL[0]!=event.pathNames[0]){
					//console.log("sideyes")
					$(".album-list li a:[rel='address:/"+event.pathNames[0]+"/1']").trigger("click");
					}
				
				if(event.pathNames[1]){
					ezhao.experience.getpic(event.pathNames);
					};
				
				
				
			});
		var hash = window.location.hash;
			hash =hash.substr(1);
			window.location.hash = "";
			window.location.hash = hash;
		
	},
	dataInit:function(type){
		var dataXml;
		type=="business"?dataXml="light.xml":dataXml = "light2.xml";
		
		$.get("light.xml",function(data,status,jqXHR){
			    $data = $(data);
			var $pic = $data.find("pics");
			var $picLength = $pic.length;
			$pic.each(function(){
				
				var $this = $(this);
				var feature = $this.attr("feature");
				var id = $this.attr("id");
				var intro = $this.attr("intro");
				
				var li = '<li>'
						 +'<a href="#'+id+'" id="'+id+'"  rel="address:/'+id+'/1">'
						 +'<img src="'+baseurl+feature+'">'
						 +'<strong><span>'+intro+'</span></strong>'
						 +'<b class="png_bg"></b>'
						 +'</a>'
					  	 +'</li>';
				$(".album-list").append(li);
				
			});
			if ( $.browser.msie ){
				if( $.browser.version=="6.0" ){
				
				$("b.png_bg").remove();
					};
				};
 				
			
			ezhao.experience.sideEvent();
			ezhao.experience.addressInit();
			
			
		})
	},
	sideEvent:function(){
		var intOverallDelta = 0;
		var albumHeight = 0;
		$(".album-list img").load(function(){
		 albumHeight = $(".album-list li").length*114;	
		$(".album-list").height(albumHeight)
		});
		
		
		var albumWrapHeight = $(".album").height();
		$(".album .section-inner").live('mousewheel', function(event, delta) {
				
				event.stopPropagation();
				event.preventDefault();
				//if(delta>0){
				//	 intOverallDelta-=50;
				//	}else{
				//	intOverallDelta+=50	
				//	};
				//if(intOverallDelta<=0){intOverallDelta = 0};
				//if(intOverallDelta>=albumHeight-albumWrapHeight){intOverallDelta = albumHeight-albumWrapHeight }
				$(this).stop().animate({"scrollTop":"+="+delta*-50},0)
				//$(this).css({scrollTop:intOverallDelta})
				//$(this).scrollTop(intOverallDelta)
			});
		$(".album-list li a").live("click",function(e){
			e.preventDefault();
			//console.log(albumHeight)
			$(".album-list li a").removeClass("hover");
			$(this).addClass("hover");
			//console.log($(this).parent()[0].offsetTop)
			var top = $(this).parent()[0].offsetTop;
			top -= albumWrapHeight/2-$(this).parent().height()/2;
			$(".album .section-inner").animate({scrollTop: top});
			});
		$(".feature-img-list li a").live("click",function(e){
			//e.preventDefault();
			//window.location.hash ="#"+$(this).attr("href")
			//console.log($(this).attr("href"))
			
			$(".feature-img-list li a").removeClass("hover");
			$(this).addClass("hover");
		});
		$(".album .ctrl").click(function(e){
			e.preventDefault();
			var $this = $(this);
			if($this.hasClass("prev")){
				$(".album .section-inner").animate({"scrollTop":"-=110"})
			}else{
				$(".album .section-inner").animate({"scrollTop":"+=110"})
			}	
		});
	
	},
	getpic:function(picId){
		if(!$data){
			 $.get("light.xml",function(data){
				$data = $(data);
				})
			}
		
		if(picId[0]!=oldURL[0]){
			var ele = $data.find("#"+picId[0]);
			var thumb = ele.find("pic");
			var intro = ele.find("intro").text()
			var concept = ele.find("concept").text()
			var title = '<h1>'+ele.attr("intro")+'</h1> <p class="feature-title">项目背景:</p>'
			$(".feature-img-list").html("")	
			thumb.each(function(i){
				var i = i+1
				var $this = $(this);
				var feature = $this.attr("feature");
				var li = '<li>'
						+'<a href="#/'+picId[0]+'/'+i+'" ><img src="'+baseurl+feature+'">'
						+'<b class="png_bg"></b>'                                                
						+'</a>'
						'</li>';
				$(".feature-img-list").append(li)			
			})
			if ( $.browser.msie ){
				if( $.browser.version=="6.0" ){
				
				$("b.png_bg").remove();
					};
				};
			//在这里插入文章
			$(".feature-content-1").html(title+intro)
			$(".feature-content-2").html(title+concept)
			oldURL = picId;
			}
			$(".feature-img-list li").eq(picId[1]-1).find("a").trigger("click")
		var pic = $data.find("#"+picId[0]).find("pic").eq(picId[1]-1);
	
		$(".feature-image").fadeOut(function(){
			$("#loading-img").show();
			$(this).attr({"src":baseurl+pic.text()});
			$(this).load(function(){
				$(this).fadeIn();
				$("#loading-img").hide();
				})
			
			});
		
		
	},
	eleHover:function(){
		$(".album-list li,.feature-img-list li").not(".current").live({
			mouseenter:function(){
				$("b",$(this)).fadeOut()
				
			},mouseleave:function(){
				$("b",$(this)).fadeIn()
			},click:function(){
				$("li",$(this).parents(".feature-img-list")).removeClass("current")
				$(this).parent().parent().addClass("hover")	
			}})
	}
	

}


ezhao.product = {
	init:function(){
		ezhao.switchTab($(".item-switch"),$(".product-detail-list"))
		$(".product-detail-list .related").jScrollPane(
			{
				verticalDragMinHeight: 91,
				verticalDragMaxHeight: 91,
				autoReinitialise: true
			}
		);
		$(".product-detail-list .description").jScrollPane(
			{
				verticalDragMinHeight: 91,
				verticalDragMaxHeight: 91,
				horizontalDragMinWidth: 91,
				horizontalDragMaxWidth: 91
				
				/* autoReinitialise: true */
			}
		);
		$(".search-switch-list").click(function(e){
			var $this = $(this);
			e.preventDefault();
			$(".search-head").slideToggle(function(){
				$this.toggleClass("search-switch-hover")
				if($this.hasClass("search-switch-hover")){
					$this.text("打开筛选")
				}else{
					$this.text("关闭筛选")
				}
				})
			
		});
		
		if($('a#feature')[0]){
			$('a#feature').jqzoom({});
		};
		if($(".product-list-pager")[0]){
			var current_page = $(".product-list-pager .hover").prevAll().length;
			//console.log(current_page+1)
			$(".product-list-pager").pageList(".page",{items_per_page:6,prev_clas:"pro-btn prev",next_clas:"pro-btn next",next_text:"下一页>",prev_text:"<上一页",current_page:current_page+1});
		};
		if($(".jump-btn")[0]){
			$(".jump-btn").click(function(e){
				e.preventDefault();
				var clickPage = $(".page-list-wrap2 .page").eq($("#page-num").val()-1);
				if(clickPage[0]){
					window.location.href = clickPage.attr("href");
					}else{
					$("#page-num").val("页码错");
					};
			});
		
		};
		if($("#page-num")[0]){
			$("#page-num").keydown(function(e){
				if(e.keyCode==13){
					$(".jump-btn").click();	
				}
			})
		};
		if($(".description table")[0]){
				$(".description table tr:first td").css({"background-color":"#4c4c4c","color":"#fff","text-align":"center"})
		};
		if($(".under-list .print")[0]){
			$(".under-list .print").click(function(e){
				e.preventDefault();
				window.print(); 
				})
			
		};
			
			
	
	}

}

//遮罩
ezhao.filter = {
	init:function(){
	
	},
	filterBg:function(){
		if(!$(".filter-bg")[0]){
		$("<div>",{"class":"filter-bg"}).css({"opacity":"0.1"}).appendTo("body").animate({"opacity":"0.8"})	
		$(".filter-bg").click(function(){
			ezhao.filter.filterClose()
		})
		}
	},
	
	filterCnt:function(html,callback){
		ezhao.filter.filterBg()
		if(!$(".filter-cnt")[0]){
			$("<div>",{"class":"filter-cnt"}).appendTo("body")
		}
		$(".filter-cnt").load(html,function(){
		
			var $this = $(this)
			if(!$(".popup-loader")[0]){
				$("body").append('<img src="/images/popup-loader.gif" class="popup-loader"  style="position:fixed;top:50%;left:50%;z-index:9999"/>');
				}else{
				$(".popup-loader").show();
				}
			
			callback&&callback()
			if($this.find("img")[0]){
				$this.css("opacity","0")
				$this.find("img").load(function(){
					
					ezhao.filter.judgeSize()
					$this.animate({"opacity":"1"})
					})
				
			}else{
				ezhao.filter.judgeSize()
				
			}
			
			})	
		
	},
	
	judgeSize:function(){
		var filterWidth = $(".filter-cnt").width(),
			filterHeight = $(".filter-cnt").height(),
			wrapWidth = $(window).width(),
			wrapHeight = $(window).height();
		var top = 	(wrapHeight-filterHeight)/2
		if ( $.browser.msie ){
			if( $.browser.version =="6.0"){
				
				top+=$("html").scrollTop()
			}
		}

		$(".filter-cnt").css({"left":(wrapWidth-filterWidth)/2 , "top":top});
		//alert($(".filter-cnt").css("top"))
		//$(".filter-cnt").css({"height":wrapHeight})
		$(".filter-bg").height($(document).height())
		
	},
	
	filterClose:function(){
	
		$(".filter-bg , .filter-cnt").fadeOut(function(){$(this).remove()});
		
	}
	
}
ezhao.jobs = {
	init:function(){
		ezhao.about.mask()
	}
}
ezhao.about = {
	init:function(){
		ezhao.about.mask();
		if($(".jobActList li")[0]){
			ezhao.about.filter();
			}
		if($('img#feature-img')[0]){
			//console.log("img")
			if($.support.leadingWhitespace){
				$(".history_inner").css({"height":"auto"})
				$('img#feature-img').addpowerzoom({
					powerrange:[2,8],
					largeimage:"/images/company/company_bg_2_2_big.jpg",
					magnifiersize:[120,120]
				})
			}else{
				var flash = '<div id="myAlternativeContent" style="width:650px;height:360px">'
							+'<a href="http://www.adobe.com/go/getflashplayer">'
							+'<img src="http://www.adobe.com/images/shared/download_buttons/get_flash_player.gif" alt="Get Adobe Flash player" />'
							+'</a>'
							+'</div>'
							+'<script type="text/javascript">'
							+'swfobject.embedSWF("/swf/histroy_magnifying.swf", "myAlternativeContent", "850", "360", "9.0.0", false, {}, {wmode:"transparent"});'
							+'</script>';
				$("#feature").replaceWith(flash);
				
			}
			
			
		};
		
		},
		mask:function(){
			$(".jobActList li").not($(".jobActList li[nopic]")).click(function(e){
				e.preventDefault();
				var $this = $(this);
				
				ezhao.filter.filterCnt("popup-jobs.html",getInform);
				function getInform(){
					var div = $this.find("div[refsrc]").clone();
					var cnt = "<p>"+div.html()+"</p>";
					googleCnt =  div.text();
					if(div.attr("refsrc").indexOf("mp4")==-1){
						var img = "<img src='"+div.attr("refsrc")+"'/>";
					}else{
						var img = '<video id="player" src="'+div.attr("refsrc")+'"  width="640" height="360"  autoplay="autoplay" >'
								+'<script type="text/javascript">'
								+'var player = new MediaElementPlayer("#player",{ pluginPath: "/swf/",success:function(mediaElement){ mediaElement.addEventListener("play",function(){addGoogleAnalysis("video","play",googleCnt)},false)}});'
								+'</script>'
							+'</video>';	
							$(".popup-loader").hide();
					}


				
					$(".popup-intro").append(cnt);
					$(".popup-feature").append(img);
					$(".popup-jobs img").load(function(){
						var width = $(".popup-feature img").width();
					
						var bleft =  ($(".popup-jobs .section-inner").width()-width)/2;
						$(".popup-jobs .section-inner").css({"width":width});
						$(".popup-jobs .popup-intro").css({"width":width});
						$(".filter-cnt").css({"left": +bleft });
						$(".popup-loader").hide();
						}) 
					
				}
				})
		
		},
		filter:function(){
			var orginEle = $(".jobActList li");
			var filterEle;
			var filter;
			var page;
			var range = 6
			$(".jobAct a").bind("click",function(e){
					e.preventDefault();
					var $this = $(this);
					var filter = $this.attr("filter");
					$(".jobAct a").removeClass("hover");
					$this.addClass("hover");
					getfilter(filter.split(","));
					
			
			})
			$(".pagination a").live("click",function(e){
					e.preventDefault();
					var $this = $(this);
					var num = $(this).prevAll("a").length+1;
					 getPage($(this).prevAll("a").length);
					 $(".numbers").text('Page'+num+'of'+page);
				});
			function init(){
				getfilter(["2"]);
			};
			function getfilter(filter){
				filterEle = $("");
				$.each(filter,function(i,n){
			
				filterEle = filterEle.add(orginEle.filter('[customgroup*="'+n+'"]'));
			
				});
				greatPage();
			};
			function getPage(num){
				$(".pagination a").removeClass("hover");
				$(".pagination a").eq(num).addClass("hover");
				orginEle.hide();
				filterEle.slice(num*range,num*range+range).show();
				
			};
			function greatPage(){
				var num = 1
				page = Math.ceil(filterEle.length/range);
				$(".pagination-cnt").html("");
				
				for(var i=1;i<=page;i++){
					$(".pagination-cnt").append('<a href="#">'+i+'</a>');
					};
				$(".numbers").text('Page'+num+'of'+page);
				$(".pagination a").eq(0).trigger("click");
			};
			init();
		}
}

ezhao.support={
	init:function(){
		ezhao.support.mask();
	},
	mask:function(){
		
		$(".dowVideoList .feature").click(function(e){
				e.preventDefault();
				var $this = $(this);
				ezhao.filter.filterCnt("popup-jobs.html",getInform);
				function getInform(){
					var div = $this.siblings("div[refsrc]").clone();
					googleCnt = div.text();
					//var img = div.attr("refsrc");
						var img = '<video id="player" src="'+div.attr("refsrc")+'.mp4"  width="640" height="360"  autoplay="autoplay" >'
								+'<source src="'+div.attr("refsrc")+'.mp4" type="video/mp4" />'
								+'<source src="'+div.attr("refsrc")+'.webm" type="video/webm" />'
								+'<script type="text/javascript">'
								+'var player = new MediaElementPlayer("#player",{ pluginPath: "/swf/",success:function(mediaElement){ mediaElement.addEventListener("play",function(){addGoogleAnalysis("video","play",googleCnt)},false)}});'
								+'</script>'
							+'</video>';	
						
					var cnt = "<p>"+div.text()+"</p>";
					$(".popup-feature").append(img);
					$(".popup-intro").append(cnt);
					$(".popup-loader").hide();
					$(".popup-intro p").append($this.siblings("p").find(".dl").clone())
					if( $.browser.version=="6.0" ){
						$(".popup-jobs .section-inner").css({"width":650});
					};
					
				};
		});
		$(".popup-intro .dl").live("click",function(){
			googleCnt=$(this).parent().text().replace("下载视频","")
			//console.log(googleCnt)
			addGoogleAnalysis("filter-download","click",googleCnt)
		});
		$(".dowVideoList .more").click(function(){
			$(".dowVideoList li ").has($(this)).find(".feature").trigger("click");
		});
		$(".dowVideoList .dl").click(function(){
				googleCnt=$(this).parent().siblings("div").text()
				addGoogleAnalysis("download","click",googleCnt)
		});
		
	}

}
ezhao.news={
	init:function(){
		this.pager()
		if($("video")[0]){
			var player = []
			$("video").each(function(i){
				googleCnt = document.title;
				
				player[i] = new MediaElementPlayer($(this),{ pluginPath: "/swf/",success:function(mediaElement){
			
				mediaElement.addEventListener("play",function(){addGoogleAnalysis("video","play",googleCnt)},false)}});
			})
			
			
			
		}
	},
	pager:function(){
		var current_page = $(".pagination-wrap .hover").prevAll().length;
			//console.log(current_page+1)
			$(".pagination-wrap").pageList(".page",{items_per_page:10,prev_show_always:false,prev_show_always:false,current_page:current_page+1});
	}	
}
//收藏
function AddFav(u, t) {
	u="http://"+location.host
  if (document.all) {
  window.external.AddFavorite(u, t)
  } else{
  window.sidebar.addPanel(t, u, "")
  }
  return false
};
//谷歌代码
var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-29216000-1']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

function addGoogleAnalysis (category,operating,value){
	 //var pageTracker=_gat._createTracker("UA-29216000-1");
	  //pageTracker._trackEvent(category, operating,value||'');
	_gaq.push(['_trackEvent', category, operating,value||'']);
 }