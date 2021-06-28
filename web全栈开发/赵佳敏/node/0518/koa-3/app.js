const koa=require("koa");
const app=new koa();
const bodyparser=require("koa-bodyparser");
app.use(bodyparser());
let port=8080;
let host='localhost';
// 加载路由文件
let router=require("./router/routerMiddle");

// 关联路由
app.use(router());
app.listen(port,host,()=>{
    console.log(`http://${host}:${port}`);
});