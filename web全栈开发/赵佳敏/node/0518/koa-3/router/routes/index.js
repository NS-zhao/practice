// 首页路由
let f_index=async (ctx,next)=>{
    ctx.response.body="首页";
}
let f_regest=async (ctx,next)=>{
    ctx.response.body="表单注册";
}

// 模块导出
module.exports={
    'GET /':f_index,
    'POST /':f_regest
}