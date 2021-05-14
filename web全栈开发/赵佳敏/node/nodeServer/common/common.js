// node里面的内置模块和自定义模块
// 模块导出两个方案
let str={};
module.exports=str;
exports.A=str;

// 引入模块得使用require("")加载模块
let todo=require("./todo");//可以省略后缀
console.log(todo);


// node里面的require()加载模块的时候可以直接写名称，但是必须放在依赖下加载，并且还要生成配置文件
// 终端进入依赖文件，安装配置文件
// let fetch=require("Fetch");
// console.log(fetch);
// fetch.get("http://www.zjm.com");


let Axios = require("Axios");
let url = "https://autumnfish.cn/search";
let data = { keywords: '西安' };
const http = require("http");
let app = http.createServer((req, res) => {
    res.writeHead(200, { "Content-Type": "text/html;charset=utf-8" });
    Axios.get(url, { params: data }).then((result) => {
        res.write(result);
        res.end();
    });
});
app.listen(8080)