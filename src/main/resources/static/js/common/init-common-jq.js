var host='http://'+window.location.host;

function dateFmtYMDHMS(val){
	if(val==undefined||val=="")return "";
	var date = new Date(val);
    Y = date.getFullYear() + '-';
    M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
    D = date.getDate()>9 ? date.getDate()+' ' : '0'+date.getDate()+' ';
    h = date.getHours()>9? date.getHours() + ':' : '0'+date.getHours()+":";
    m = date.getMinutes()>9? date.getMinutes() + ':' : '0' + date.getMinutes()+':';
    s = date.getSeconds()>9? date.getSeconds() : '0'+date.getSeconds();
    return Y+M+D+h+m+s;
}

function dateFmtHMS(val){
	if(val==undefined||val=="")return "";
	var date = new Date(val);
    h = date.getHours()>9? date.getHours() + ':' : '0'+date.getHours()+":";
    m = date.getMinutes()>9? date.getMinutes() + ':' : '0' + date.getMinutes()+':';
    s = date.getSeconds()>9? date.getSeconds() : '0'+date.getSeconds();
    return h+m+s;
}

//深度克隆对象
function clone(obj){
	var buf;
	if(obj instanceof Array){
		buf = [];	//创建一个空数组
		var i = obj.length;
		while(i--){
			buf[i] = clone(obj[i]);
		}
		return buf;
	}
	else if(obj instanceof Object){
		buf = {};
		for(var k in obj){
			buf[k] = clone(obj[k]);
		}
		return buf;
	}else{
		return obj;
	}
}


function objectListMapTrun(list,item,type){
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