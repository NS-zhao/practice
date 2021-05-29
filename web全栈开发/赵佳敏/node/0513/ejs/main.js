// 服务端
// 给服务端安装ejs模板引擎
// 引入ejs模板引擎
const http=require("http");
const ejs=require("ejs");
let port=80;
let host="localhost";
let app=http.createServer((req,res)=>{
    res.writeHead(200,{"Content-Type":"text/html;charset=utf-8"});
    // 使用ejs模板引擎渲染界面
    // let template=`<ul>
    //     <%for(let i=0;i<item.length;i++){%>
    //         <li><%=item[i].name%></li>
    //     <%}%>
    // </ul>`;
    // let data=[
    //     {id:1,name:"小李"},
    //     {id:2,name:"小黑"},
    //     {id:3,name:"小赵"},
    // ]
    // // 同步方法操作
    // let html=ejs.render(template,{item:data});
    // res.end(html);

    // let data=[
    //     {id:1,name:"小李",des:'<h1>123</h1>'},
    //     {id:2,name:"小黑",des:'<h1>123</h1>'},
    //     {id:3,name:"小赵",des:'<h1>123</h1>'},
    // ];
    let header=["首页","联系我们"]
    ejs.renderFile("view/index.ejs",{
        item:data,
        header:header
    },(err,html)=>{
        if(err){
            throw err;
        }
        res.end(html);
    });
});
app.listen(port,host,()=>{
    console.log(`http://${host}:${port}`);
});