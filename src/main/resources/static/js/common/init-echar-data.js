
var optionLineBar = {
    title : {
        text: '',			//来自设备的名称，比如，小米空调数据
        subtext: '实时数据'
    },
    tooltip : {
        trigger: 'axis'
    },
    legend: {
        data:[]		//来自map里的各个name的值
    },
    toolbox: {
        show : false,
        feature : {
            mark : {show: true},
            dataView : {show: true, readOnly: true},
            magicType : {show: true, type: ['line', 'bar']},
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    calculable : true,
    xAxis : [
        {
            type : 'category',
            boundaryGap : false,
            data : []	//来自map任意一个条name对应list里的时间
        }
    ],
    yAxis : [
        {
            type : 'value',
            axisLabel : {
                formatter: '{value} °C'		//可以通过查type查出来
            }
        }
    ],
    series : [
        {
            name:'',				//map里的各name
            type:'line',
            data:[],	//这个name里的list对应的值
            markPoint : {
                data : [
                    {type : 'max', name: '最大值'},
                    {type : 'min', name: '最小值'}
                ]
            },
            markLine : {
                data : [
                    {type : 'average', name: '平均值'}
                ]
            }
        }
    ]
};



/*var optionLineBar = {
    title : {
        text: '',			//来自设备的名称，比如，小米空调数据
        subtext: '实时数据'
    },
    tooltip : {
        trigger: 'axis'
    },
    legend: {
        data:['最高气温','最低气温']		//来自map里的各个name的值
    },
    toolbox: {
        show : true,
        feature : {
            mark : {show: true},
            dataView : {show: true, readOnly: true},
            magicType : {show: true, type: ['line', 'bar']},
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    calculable : true,
    xAxis : [
        {
            type : 'category',
            boundaryGap : false,
            data : ['周一','周二','周三','周四','周五','周六','周日']	//来自map任意一个条name对应list里的时间
        }
    ],
    yAxis : [
        {
            type : 'value',
            axisLabel : {
                formatter: '{value} °C'		//可以通过查type查出来
            }
        }
    ],
    series : [
        {
            name:'最高气温',				//map里的各name
            type:'line',
            data:[11, 11, 15, 13, 12, 13, 10],	//这个name里的list对应的值
            markPoint : {
                data : [
                    {type : 'max', name: '最大值'},
                    {type : 'min', name: '最小值'}
                ]
            },
            markLine : {
                data : [
                    {type : 'average', name: '平均值'}
                ]
            }
        },
        {
            name:'最低气温',						//不做这个效果了
            type:'line',
            data:[1, -2, 2, 5, 3, 2, 0],
            markPoint : {
                data : [
                    {name : '周最低', value : -2, xAxis: 1, yAxis: -1.5}
                ]
            },
            markLine : {
                data : [
                    {type : 'average', name : '平均值'}
                ]
            }
        }
    ]
};*/