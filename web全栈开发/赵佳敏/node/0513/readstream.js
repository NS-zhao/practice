// 读取流
// 引入fs文件模块
const fs=require("fs");
// 创建读取流
let readStream=fs.createReadStream("./text/data.txt");
// 设置流的编码格式
readStream.setEncoding("utf-8");
// 总数据
let alldata="";
// 使用事件监听读取流数据
readStream.on('data',(data)=>{
    alldata+=data;
});
readStream.on('end',()=>{
    // 读取数据完成
    console.log(alldata);
});
// 读取报错
readStream.on('error',(err)=>{
    if(err)
    {
        console.log(err.stack);//异常信息
    }
});
// 最终
readStream.on('finish',()=>{
    // 最终处理的代码
    console.log("操作完成");
})