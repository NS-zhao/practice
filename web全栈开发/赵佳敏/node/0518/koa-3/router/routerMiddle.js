// 整理之后的路由文件
let index = require("./routes/index");
let login=require("./routes/login");
// 整理路由
let addController=(router,route)=>{
    for(let url in route){
        if(url.startsWith("GET ")){
            let path=url.substring(4);
            // 注册get路由
            router.get(path,route[url]);
        }
        else if(url.startsWith("POST ")){
            let path=url.substring(5);
            // 注册post路由
            router.post(path,route[url]);
        }
        else{
            console.log("404");
        }
    }
}
module.exports=()=>{
    let routes=Object.assign({},index,login),
    router=require("koa-router")();
    addController(router,routes);
    return router.routes();
}