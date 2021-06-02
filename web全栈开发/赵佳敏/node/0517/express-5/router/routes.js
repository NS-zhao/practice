const express=require("express");
const router=express.Router();
const ejs=require("ejs");
router.get("/",(req,res)=>{
    ejs.renderFile("view/index.html",{list:[1,2,3]},(err,html)=>{
        if(err)
            throw err;
        res.send(html);
    });
});
router.get("/sendData",(req,res)=>{
    let query=req.query;
    console.log(query);
    // 写入缓存
    let str=JSON.stringify(query);
    //console.log(str);
    res.cookie('_user',str,{
        maxAge:1000*60*60*24*2,
        path:'/',
        signed:true
    });
    res.send("写入缓存");
});
router.get("/getcookie",(req,res)=>{
    // 未加密使用下面这个读取
    // res.send(req.cookies['_user']);
    // 加密使用下面这个读取
    res.send(req.signedCookies['_user']);
})


// 文件上传
const multer=require("multer");
let storage=multer.diskStorage({
    // 设置文件存储目录
    destination(req,file,callback){
        callback(null,'./upload');
    },
    // 设置上传文件相关信息
    filename(req,file,callback){
        callback(null,file.originalname);
    }
});        
// 创建上传对象
let upload=multer({storage:storage});
// 打开上传界面
router.get("/uploadFile",(req,res)=>{
    ejs.renderFile("view/upload.html",(err,html)=>{
        if(err)
            throw err;
        res.send(html);
    });
});
// 上传的路由
// 单文件上传
// router.post("/profile",upload.single("avatar"),(req,res)=>{
//     console.log(req.file);
//     res.send("上传成功")
// })

// 多文件上传
router.post("/profile",upload.array("avatar",8),(req,res)=>{
    console.log(req.file,req.files);
    res.send("上传成功")
})
module.exports=router;