// 路由提取
let router={
    'home':(req,res)=>{
        res.end("首页");
    },
    'login':(req,res)=>{
        res.end("登录界面");
    }
}
module.exports=router;