// 路由注册模块
const url=require("url");
let obj={
    _get:{},
    _post:{}
};//存储所有的路由以及路由对应的回调函数
let app=function(req,res){
    // 写入send方法
    res.send=function(data){
        res.writeHead(200,{"Content-Type":"text/html;charset=utf-8"});
        res.end(data);
    }
    // 解析路径
    let path=url.parse(req.url,true);
    let pathname=path.pathname;
    let method=req.method.toLowerCase();
    if(pathname=="/favicon.ico") return;
    if(obj['_'+method][pathname]){
        // 区分方式
        if(method=="get"){
            // 执行路由对应的回调函数
            let params=path.query;
            req.query=params;
            obj['_'+method][pathname](req,res);
        }
        else{
            // 数据监听
            let data="?";
            req.on("data",(info)=>{
                data+=info;
            });
            req.on("end",()=>{
                req.body=url.parse(data,true).query;
                obj['_'+method][pathname](req,res);
            })
        }
    }
    else{
        res.end("404");
    }
    
}
// 在整个app上挂载方法
app.get=function(string,callback){
    obj._get[string]=callback;
}
app.post=function(string,callback){
    obj._post[string]=callback;
}
module.exports=app;