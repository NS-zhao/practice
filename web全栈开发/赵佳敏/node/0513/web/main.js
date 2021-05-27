// 给静态web服务器上添加get、post路由
// 先创建服务器
const http=require("http");
const url=require("url");
const fs=require("fs");
const path=require("path");
// 加载自定义模块
const extName=require("extName");
let host="localhost";
let port=8080;
let app=http.createServer((req,res)=>{   
    let method=req.method;                                                                                                                         
    let pathName=url.parse(req.url).pathname;
    if(pathName!="/favicon.ico"){
        if(method==="GET")
        {
            // 检测当前路径是否存在值
            let params=url.parse(req.url,true).query;//get传值解析json
            // 加载首页
            if(pathName=="/")
            {
                pathName="index.html";
            }
            // 路经检测
            fs.exists(req.url,(bool)=>{
                if(bool){
                    console.log("只能是get请求",params);
                }
                
            });
            // 正常加载界面
            // 进行文件读取
            fs.readFile(`${__dirname}/view/${pathName}`,(err,buffer)=>{
                if(err)
                {
                    throw err;
                }
                // 读取到的数据
                // 对每个文件进行文件后缀检测
                let ext=path.extname(pathName);
                extName.check(ext).then((result)=>{
                    res.writeHead(200,{"Content-Type":`${result};charset=utf-8`});
                    res.write(buffer);
                    res.end();
                });
            });
        }
        else{
            // POST
            let info='?';
            res.on("data",(info)=>{
                info+=data;
            });
            res.on("end",()=>{
                console.log(info);
            });
        }
    }
});
// 监听端口
app.listen(port,host,()=>{
    console.log(`http://${host}:${port}`);
});



