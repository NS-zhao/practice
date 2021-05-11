// // http内置模块
// // createServer()创建服务器的方法
// // 引入http模块
// const http=require("http");
// // console.log(http);
// // METHODS是http处理协议的方法列表
// // STATUS_CODES是http里面的响应状态

// // http里面的get方法
// http.get('http://baidu.com?w=1',(res)=>{
//     // res代表服务器响应
//     let {statusCode}=res;
//     // 获取响应头
//     let contentType=res.headers["content-type"];
//     let error;
//     if(statusCode!==200)
//     {
//         // 服务器请求失败
//         error=new Error(`${statusCode}`);
//     }
//     // application\/json等价于application/json
//     else if(/^text\/html$/.test(contentType))
//     {
//         error=new Error(`${contentType}`);
//     }
//     // 设置服务器响应的数据编码
//     res.setEncoding("utf8");
//     // 服务器请求的数据进行监听
//     // .on()  data事件当有数据可读进这个事件，end()--无数据进
//     let data="";
//     res.on("data",(info)=>{
//         data+=info;
//     });
//     res.on("end",()=>{
//         console.log(data);
//     })
// })

const https=require("https");
var req=https.request("https://autumnfish.cn/search?keywords=火",function(res){
    console.log('STATUS:'+res.statusCode);//状态码
    console.log('HEADERS:'+JSON.stringify(res.headers));//响应头
    res.setEncoding('utf8');
    res.on('data',function(chunk){
        console.log("页面数据："+chunk);
    })
})
// 监听失败
req.on('error',function(e){
    console.log('Problem with request:'+e.message);
});
req.end();
