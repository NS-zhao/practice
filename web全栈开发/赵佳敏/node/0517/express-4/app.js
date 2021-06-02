// 使用ejs模板
const express=require("express");
const ejs=require("ejs");
const app=express();
// 设置静态资源目录
app.use('/public',express.static(__dirname+"/static"));
// 设置express框架使用ejs模板引擎
// 修改ejs模板后缀为html
app.engine(".html",ejs.__express);
// 设置views文件为模板引擎的目录
app.set('view engine','html');
// 设置模板引擎的目录
app.set("views",__dirname+"/view");

let port=8080;
let host="localhost";
let router=require('./router/routes');
// 应用级中间件
app.use((req,res,next)=>{
    // 设置响应头
    // res.setHeader();
    next();
})
// 路由使用
app.use(router);
// 错误中间件
app.use((error,req,res,next)=>{
    console.log(err.stack);
    res.status(500).send("报错");
});
app.listen(port,host,()=>{
    console.log(`http://${host}:${port}`);
})