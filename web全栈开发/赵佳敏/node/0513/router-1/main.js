const http=require("http");
const ejs=require("ejs");
const url=require("url");
let port=80;
let host="localhost";
let router=require("./router");
let app=http.createServer((req,res)=>{
    res.writeHead(200,{"Content-Type":"text/html;charset=utf-8"});
    let path=url.parse(req.url).pathname;
    if(path!="/favicon.ico")
    {
        if(path=="/")
        {
            path="home";
        }
        else if(path=="/login")
        {
            path="login";
        }
        router[path](req,res);
    }
});
app.listen(port,host,()=>{
    console.log(`http://${host}:${port}`);
});