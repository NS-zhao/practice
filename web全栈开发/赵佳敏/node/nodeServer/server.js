// 使用node创建一个本地服务器
// 需要一个nodejs的一个内置模块(http模块=>做服务端请求或者搭建服务器使用的)
// 第一步：require异步加载模块(nodejs的内置模块或者自定义模块)
const http=require('http');
// 第二步：创建服务(一般的服务有协议、主机名称、端口)
// 通过http这个协议对象去创建服务
// 服务器存在两个参数 request(请求参数) response(响应参数)
let app=http.createServer((req,res)=>{
    // 简单的响应
    // 设置服务端编码,200是服务端的响应状态码
    res.writeHead(200,{"Content-Type":"text/html;charset=utf-8"});
    // 给服务器端界面写值
    res.write("node服务器");
    // end()终止当前服务
    res.end();
});
// 监听端口listen()
app.listen('8080','localhost',()=>{
    // 服务端口监听成功，回调匿名函数
    console.log("http:localhost:8080");
})