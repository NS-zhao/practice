// 管道流 边读边写

const fs=require("fs");

// 创建读取流
let read=fs.createReadStream('./text/data.txt');
// 创建写入流
let write=fs.createWriteStream('./text/error.txt');
// 管道读写操作
read.pipe(write);