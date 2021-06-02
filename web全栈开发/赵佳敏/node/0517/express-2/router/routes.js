const express=require('express');
const router=express.Router();
// 路由级中间件
router.use((req,res,next)=>{
    next();
});
router.get("/",(req,res)=>{
    res.send("首页");
});

router.get('/downfile',(req,res,next)=>{
    let path="./file/abc.docx";
    res.download(path,(err)=>{
        if(err)
            next(err);
        console.log("下载成功！");
    });
})
module.exports=router;