const express=require("express");
const app=express();
// use使用中间件  
// 功能：1.使用第三方插件   2.还可以作为路由的全局守卫  3.还可以写错误中间件
// 应用中间件：路由的全局守卫
// app.use((req,res,next)=>{
//     // 各种后台检测
//     // 配置后台跨域
//     console.log("应用中间件");
//     next();
// });
// app.get('/',(req,res)=>{
//     res.send("首页");
// });
// // 也可以配置成某个路由的应用中间件
// app.use('/login',(req,res,next)=>{
//     console.log("login中间件");
//     next();
// })
// app.get('/login',(req,res)=>{
//     res.send("登录");
// });


// 路由中间件  路由模块化
//const router=express.Router();
const routes=require("./router/routes");
app.use(routes);

// 当一级路由使用
// router.get('/',(req,res)=>{
//     res.send("首页")
// })
// app.use(router);

// 当二级路由使用
// router.get('/',(req,res)=>{
//     res.send("msg里面的首页");
// });
// router.get('/login',(req,res)=>{
//     res.send("login");
// });
// app.use('/msg',router);

// 错误中间件
// 地址http://localhost/downfile
const fs=require("fs");
app.use((err,req,res,next)=>{
    console.log(err.stack);//输出错误信息
    fs.appendFile('./error/error.txt',err.stack+"\n",(err)=>{
        if(err)
            next(err);
        else
            // 修改服务器状态码响应
            res.status(500).send("服务器响应失败");
    });
});

app.listen(80,'localhost',()=>{
    console.log("http:localhost:80");
});