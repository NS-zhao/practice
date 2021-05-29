// 后端如何接收get、post传值
const http=require("http");
const ejs=require("ejs");
const url=require("url");
let port=80;
let host="localhost";
let app=http.createServer((req,res)=>{
    res.writeHead(200,{"Content-Type":"text/html;charset=utf-8"});
    // 先解析路径
    let pathNmae=url.parse(req.url).pathname;
    if(pathNmae!="favicon.ico"){
        if(req.method==="GET")
        {
            if(pathNmae=="/")
            {
                // 路径传值，类似?id=1&name=2
                let params=url.parse(req.url,true).query;
                ejs.renderFile("./view/index.ejs",{item:params},(err,html)=>{
                    if(err)
                    {
                        throw err;
                    }
                    res.end(html);
                })
            }
            else if(pathNmae=="/login")
            {
                // 加载post传值的页面
                ejs.renderFile("./view/login.ejs",(err,html)=>{
                    if(err)
                    {
                        throw err;
                    }
                    res.end(html);
                })
            }
        }
        else{
            if(pathNmae=="//dologin")
            {
                // 使用事件机制监听数据
                let data="?";
                req.on("data",(info)=>{
                    data+=info;
                })
                req.on("end",()=>{
                    data=url.parse(data,true).query;
                    res.end(JSON.stringify(data));
                })
            }
            else{
                res.end();
            }
        }
    }
});
app.listen(port,host,()=>{
    console.log(`http://${host}:${port}`);
});