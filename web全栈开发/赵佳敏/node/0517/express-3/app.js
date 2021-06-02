// const express=require("express");
// const app=express();
// let router=require("./router/routes");
// let port=8080;
// let host='localhost';
// // 内置中间件
// // 设置静态资源目录
// // app.use(express.static('public'));
// // 设置静态资源目录的虚拟目录
// app.use('/public',express.static('static'));

// app.use((req,res,next)=>{
//     console.log(req);
//     next();
// })
// // 使用路由模块
// app.use(router);
// app.listen(port,host,()=>{
//     console.log(`http://${host}:${port}`);
// })


const express=require("express");
const app=express();
const ejs=require("ejs");
let router=require("./router/routes");
app.use('/public',express.static('static'));
// 注：除了错误级别的中间件，其他的中间件，必须在路由之前进行配置，
// 通过express.json()这个中间件,解析表单中的JSON格式的数据
// express.json()方法等价于body-parser
// post请求数据,解析json
// 前端使用ajax请求,需要设置请求头
/**
 headers:{
     "Content-Type":"application/json"
 }
 ajax上的数据不能写成obj,要写成json的字符串格式
 */
//app.use(express.json());
//下面这个内置中间件  解析表单上的数据的
app.use(express.urlencoded({ extended: false }))
app.get("/form",(req,res)=>{
    ejs.renderFile('views/Form.ejs',(err,html)=>{
        if(err)
            throw err;
        res.send(html);
    });
});
app.post('/sendPost',(req,res)=>{
    // 在服务器，可以使用 req.body 这个属性，来接收客户端发送过来的请求体数据
    // 默认情况下，如果不配置解析表单数据中间件，则 req.body 默认等于 undefined
    console.log(req.body);
    res.send('ok');
})
app.listen(3000,()=>{
    console.log('running...');
})