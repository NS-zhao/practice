const express=require("express");
const app=express();
const url=require("url");
let port=8080;
let host="localhost";
//接入中间件
app.use((req,res,next)=>{
    //设置cros跨域访问
    //*是所有域名访问
    res.header('Access-Control-Allow-Origin','*');
    next();
})
//get请求
app.get("/",(req,res)=>{
    res.send("首页");
});
app.get("/findUser",(req,res)=>{
    let user=[
        {id:1,name:"张三",sex:"男"},
        {id:2,name:"李四",sex:"女"}
    ];
    res.json(user);
});
app.post("/getList",(req,res)=>{
    let list=["首页","课程","活动"];
    res.send(list);
});
app.get("/insertUser",(req,res)=>{
    console.log(req.query);
    let effectRows={effectrows:1};
    res.json(effectRows);
});
app.post("/insert",(req,res)=>{
    let info="?";
    req.on("data",(args)=>{
        info+=args.toString();
    })
    req.on("end",()=>{
        let query=url.parse(info,true).query;
        res.send(query);
    });
});
//jsonp请求的接口
app.get("/jsonpinfo",(req,res)=>{
    let query=req.query;
    let id=query.id;
    let name=query.name;
    let callback=query.cb;
    console.log(id,name,callback);
    res.send(`${callback}('${'成功'}')`);
});
app.listen(port,host,()=>{
    console.log(`http://${host}:${port}`);
});