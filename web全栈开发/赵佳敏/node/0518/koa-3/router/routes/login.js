// 登陆界面的相关路由
let login_index=async (ctx,next)=>{
    ctx.response.body="登录界面";
}
let login_dologin=async (ctx,next)=>{
    ctx.response.body="登录成功";
}

// 模块导出
module.exports={
    'GET /login':login_index,
    'POST /dologin':login_dologin
}