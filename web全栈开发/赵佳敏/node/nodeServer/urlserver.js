const http=require('http');
// 引入路径解析模块
const url=require("url");
// get路径传值的服务端针对get传值进行路径解析
// eg:http://127.0.0.1/?id=10086&name=zjm
let app=http.createServer((req,res)=>{
    //req请求头，里面有url(请求路径),method(请求方式)
    console.log(req);
    //true解析成json数据格式
    let path=url.parse(req.url,true).query;
    console.log(path);//{ id: '10086', name: 'zjm' }
    res.writeHead(200,{"Content-Type":"text/html;charset=utf-8"});
    res.write("url路径解析");
    res.end();
});
app.listen('80','127.0.0.1',()=>{
    console.log("http:127.0.0.1:80");
})


// node每次更新都得重启
// 可以安装一个快捷启动