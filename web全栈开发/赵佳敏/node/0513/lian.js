// 链式流
const fs=require("fs");
// 创建压缩的模块
const zlib=require("zlib");
// 创建输出流
let readStream=fs.createReadStream("./text/data.txt");
// 创建写入流
let writeStream=fs.createWriteStream("./text/data.zip");
// 压缩data.txt为data.zip
readStream.pipe(zlib.createGzip()).pipe(writeStream);