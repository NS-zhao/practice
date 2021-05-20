// 创建一个写入流
const fs=require("fs");
let path="./text/error.txt";
let writeStream=fs.createWriteStream(path,['r+','utf-8']);
// 准备写入的数据
let str="error:data is undefined";
writeStream.write(str,'utf-8',(error)=>{
    if(error){
        throw error;
    }
});
// 关闭当前流
writeStream.end();
writeStream.on('finish',()=>{
    console.log("写入数据完成");
})