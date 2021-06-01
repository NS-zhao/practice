// 模拟express框架来建立服务
const http=require("http");
const ejs=require("ejs");
let port=8080;
let host="localhost";
let app=require("./router");
http.createServer(app).listen(port,host);

// 注册路由，路由分为get路由和post路由
app.get("/",(req,res)=>{
    // 路由执行的匿名函数回调
    console.log(req.query);
    res.send("首页")
});
app.get("/login",(req,res)=>{
    // 路由执行的匿名函数回调
    console.log(req.query);
    res.send("登录界面");
});
app.get("/regest",(req,res)=>{
    // 路由执行的匿名函数回调
    console.log(req.query);
    ejs.renderFile("./view/regest.ejs",(err,html)=>{
        if(err)
        {
            throw err;
        }
        res.send(html);
    });
});
app.post("/doregest",(req,res)=>{
    console.log(req.body);
    res.send("注册");
});