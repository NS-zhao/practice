const koa=require("koa");
const app=new koa();
// require("koa-router")()返回的是函数，执行之后返回对象
const router=require("koa-router")();
// 引入koa-bodyparser
const bodyparser=require("koa-bodyparser");
// 把koa-bodyparser关联到koa框架
app.use(bodyparser());
let port=8080;
let host='localhost';
app.use(async (ctx,next)=>{
    console.log(ctx.request.url);
    await next();
})
// get路由
router.get('/',async (ctx,next)=>{
    ctx.response.body="首页";
});
router.get('/login',async (ctx,next)=>{
    ctx.response.body="登录";
});
// koa-router的url传值
router.get("/user",async (ctx,next)=>{
    // get传值，值在query上面
    console.log(ctx.request.query);
    ctx.response.body="获取get传值";
})

// post路由
// get路由,先到界面
router.get("/regest",async (ctx,next)=>{
    ctx.response.body=`
        <form action='/regest' method='post'>
            <input type='text' name='id'/>
            <button>注册</button>
        </form>
    `
});
// 表单提交post,传值获取使用koa-bodyparser
// 安装：cnpm install --save-dev koa-bodyparser
router.post('/regest',async (ctx,next)=>{
    console.log(ctx.request.body);
    ctx.response.body="注册成功";
})

// 路由和koa框架关联
app.use(router.routes());

// 监听端口
app.listen(port,host,()=>{
    console.log(`http://${host}:${port}`);
})