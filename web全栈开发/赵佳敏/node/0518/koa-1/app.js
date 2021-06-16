// 引入koa
const koa=require("koa");
// 创建koa对象，必须使用new，否则会报错
const app=new koa();
// 建立基本变量
let port=8080;
let host='localhost';
// 对于所有的http请求都会执行下面这个异步处理函数
// ctx是koa框架封装的一个对象，里面包含request和response两个参数
// app.use(async (ctx,next)=>{
//     console.log("http请求");
//     // 继续向下执行，next是处理下一个异步处理函数
//     await next();
//     // 设置响应的类型和响应的数据
//     // 设置Content-Type
//     ctx.response.type="text/html";
//     // 设置response的内容
//     ctx.response.body="<h3>koa框架</h3>";
//     // 相当于界面响应
//     // ctx.body="首页";
// });

// 处理url
app.use(async (ctx,next)=>{
    if(ctx.request.path=="/"){
        ctx.response.body="首页";
    }
    else{
        // 执行下一个异步处理函数
        await next();
    }
});
app.use(async (ctx,next)=>{
    if(ctx.request.path=="/login"){
        ctx.response.body="登录";
    }
    else{
        // 执行下一个异步处理函数
        await next();
    }
});
app.use(async (ctx,next)=>{
    if(ctx.request.path=="/regest"){
        ctx.response.body="注册";
    }
    else{
        // 执行下一个异步处理函数
        await next();
    }
});

// app.use(async ctx=>{
//     // url和path都是指向的当前路径，但是url指的是全路径  path指的是路径
//     let url=ctx.request.url;
//     console.log(url);
//     if(url=="/"){
//         ctx.response.body="首页";
//     }
//     else if(url=="/login"){
//         ctx.response.body="登录";
//     }
// });
// 监听端口
app.listen(port,host,()=>{
    console.log(`http://${host}:${port}`);
})