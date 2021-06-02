const express=require("express");
const router=express.Router();
const ejs=require("ejs");
// 路由配置
router.get('/',(req,res)=>{
    res.send("首页");
});
router.get("/form",(req,res)=>{
    ejs.renderFile('views/Form.ejs',(err,html)=>{
        if(err)
            throw err;
        res.send(html);
    })
})
// post请求
router.post('/getUser',(req,res)=>{
    console.log(req.body);
    res.json({msg:'OK',result:{}})
});
router.post('/sendPost',(req,res)=>{
    console.log(req.body);
    res.send("提交成功！")
})
module.exports=router;