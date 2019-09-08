//左侧菜单栏初始化vue函数
var leftMenu=new Vue({
    	el:"#leftMenu",
    	data:{
    		menuList:[],
    		userDetail:[]
    	},
    	created: function () {
    		this.$http.get("sysMenu/sysMenu").then(function(res) {
				var data=res.data;
				leftMenu.menuList=data.rows;
				leftMenu.userDetail=data.otherDate;
			}).catch(function(){
			    alert("出错了");
			});
    	},
    	methods : {
    		changeType : function(type){
    			var obj=new Object();
    			obj.nId=leftMenu.userDetail.nId;
    			obj.nType=type;
    			var params=JSON.stringify(obj);
    			this.$http.post('/sysUser/type',params).then(response => {
					var data=response.data;
					if(data.status==200){
						leftMenu.reload();
					}
				}).catch((err) => {
	                alert("网络异常");
				});
    		},
    		reload : function(){
    			this.$http.get("sysMenu/sysMenu").then(function(res) {
    				var data=res.data;
    				leftMenu.menuList=data.rows;
    				leftMenu.userDetail=data.otherDate;
    			}).catch(function(){
    			    alert("出错了");
    			});
    		}
    	},
    	template:`
	    	<div class="left-sidebar">
    		<!-- 用户信息 -->
    	    <div class="tpl-sidebar-user-panel">
    	        <div class="tpl-user-panel-slide-toggleable">
    	            <div class="tpl-user-panel-profile-picture">
    	                <img :src="userDetail.vcPic" alt="">
    	            </div>
    	            <span class="user-panel-logged-in-text">
    	      			<i class="am-icon-circle-o am-text-success tpl-user-panel-status-icon">
    	      			</i>
	    	      		{{userDetail.vcName}}
	  				</span>
    	            <a href="userinfo-detail.html" class="tpl-user-panel-action-link"> 
    	            	<span class="am-icon-pencil">
    	            	</span> 账号设置
    	            </a>
    	        	
	            </div>
	            <span class="user-panel-logged-in-text">
	            	<span>
	            		<input type="radio" name="type" v-model="userDetail.nType" value="0" @click="changeType(0)">用户
	            	</span>
            		<span v-if="userDetail.nRepairFlag>0">
    	            	<input type="radio" name="type" v-model="userDetail.nType" value="1" @click="changeType(1)">维修
    	            </span>
	            	<span v-if="userDetail.nSellerFlag>0">
    	            	<input type="radio" name="type" v-model="userDetail.nType" value="2" @click="changeType(2)">商家
    	            </span>
	            	<span v-if="userDetail.nManagerFlag>0">
    	            	<input type="radio" name="type" v-model="userDetail.nType" value="3" @click="changeType(3)">管理
    	            </span>
	            </span>
    	    </div>

    	    <!-- 菜单 -->
    	    <ul class="sidebar-nav"> 	
    	       	<li class="sidebar-nav-link" v-for="item in menuList">
    	       		<a :href="item.vcUrl" class="active">
    	                <i class="am-icon-table sidebar-nav-link-logo"></i>{{item.vcName}}
    	            </a>
    	       	</li>
    	    </ul>
    	</div>
	`
	})