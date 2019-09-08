//Vue全集设置
Vue.config.productionTip=false;
axios.defaults.baseURL = 'http://'+window.location.host;
axios.defaults.withCredentials = true;
axios.defaults.headers.put['Content-Type']='application/json;charse=UTF-8';
axios.defaults.headers.post['Content-Type']='application/json;charse=UTF-8';
Vue.prototype.$http = axios;

//日期过滤器,年月日
Vue.filter('dateFmtYMD', function (val) {
		if(val==undefined||val=="")return "";
		var date = new Date(val);
	    Y = date.getFullYear() + '-';
	    M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
	    D = date.getDate()>9 ? date.getDate()+' ' : '0'+date.getDate()+' ';
	    return Y+M+D;
})

//过滤器，年月日时分秒
Vue.filter('dateFmtYMDHMS', function (val) {
		if(val==undefined||val=="")return "";
		var date = new Date(val);
	    Y = date.getFullYear() + '-';
	    M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
	    D = date.getDate()>9 ? date.getDate()+' ' : '0'+date.getDate()+' ';
	    h = date.getHours()>9? date.getHours() + ':' : '0'+date.getHours()+":";
	    m = date.getMinutes()>9? date.getMinutes() + ':' : '0' + date.getMinutes()+':';
	    s = date.getSeconds()>9? date.getSeconds() : '0'+date.getSeconds();
	    return Y+M+D+h+m+s;
})

Vue.prototype.dateFormat = function (val){
	if(val==undefined||val=="")return "";
	var date = new Date(val);
    Y = date.getFullYear() + '-';
    M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
    D = date.getDate()>9 ? date.getDate()+' ' : '0'+date.getDate()+' ';
    return Y+M+D;
}

//用户状态过滤器,
Vue.filter('nStatus', function (val) {
		switch (val) {
		case 0:
			val='已禁止'
			break;
		case 1:
			val='异常'
			break;
		case 2:
			val='正常'
			break;
		default:
			val='无'
			break;
		}
	    return val;
})

//将一个list中的数据，根据某一个属性进行分组，type为1时返回分组后的新list，type为2时返回分组后新map
Vue.prototype.objectListMapTrun = function(list,item,type){
	var map=new Map();
	var a;
	var b;
	var arr;
	for (var i in list){
		a=list[i];
		b=a[item];
		if(map.get(b)==undefined){
			arr=new Array();
			arr.push(a);
			map.set(b,arr);
		}else{
			var arr=map.get(b);
			arr.push(a);
			map.set(b,arr);
		}
	}
	var result=new Array();
	for (var [key, value] of map) {
		result.push(map.get(key));
	}
	if(type==1){
		return result;
	}else if(type==2){
		return map;
	}
}
