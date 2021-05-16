// nodejs中的文件系统
// 内置模块 
// 引入fs文件系统模块
const fs=require("fs");
// 文件系统当中存在两种方法，同步和异步(常用)
// 1.读取文件方法

const http=require("http");
const url=require("url")
const host="localhost";
const port=80;
let app=http.createServer((req,res)=>{
    let path=req.url;
    if(path!=="/favicon.ico"){
        res.writeHead(200,{"Content-Type":"text/html;charset=utf-8"});
        // 异步读取
        // 三个参数，文件的路径、设置编码(读写方式)、回调函数
        // fs.readFile("./text/笔记.txt",['utf-8','r+'],(err,data)=>{
        //     if(err)
        //     {
        //         throw err;
        //     }
        //     // 直接把buffer转成文本
        //     // 写出文本
        //     res.write(data.toString());
        
        //     res.end();
        // });
        
        
        // // 同步读取
        // let data=fs.readFileSync("./text/笔记.txt",['utf-8','r+']);
        // // 写出文本
        // res.write(data.toString());
        // // 结束响应
        // res.end();
        
        // 打开文件
        // fs.open("./text/笔记.txt",'r+',(err,fd)=>{
        //     if(err)
        //     {
        //         throw err;
        //     }
        //     console.log(fd);
        //     res.end();
        // })

        // // 获取文件的信息
        // fs.stat('./text',(err,stat)=>{
        //     if(err)
        //     {
        //         throw err;
        //     }
        //     console.log(stat);
        //     console.log(stat.isFile());//false
        //     console.log(stat.isDirectory());//true
        // });
        // res.end();


        // 文件写入
        // let query=url.parse(path,true).query;
        // let str=query.txt;
        // fs.writeFile("./text/a.txt",str,['w'],(err)=>{
        //     if(err)
        //     {
        //         console.log("写入失败");
        //         throw err;
        //     }
        //     console.log("写入成功！");
        // });
        // res.end();


        // 读取文件
        // let buff=Buffer.alloc(1024);
        // fs.open("./text/A.txt",(err,fd)=>{
        //     if(err)
        //     {
        //         throw err;
        //     }
        //     // 参数1.读取的文件 2.读取的值放到缓冲池 3.读取的字节长度 4.文件的哪个位置开始读取
        //     fs.read(fd,buff,0,1024,0,(err,bytes,buffer)=>{
        //         if(err)
        //         {
        //             throw err;
        //         }
        //         console.log("读取的字节",bytes);//6
        //         console.log(buffer);
        //         console.log(buff);
        //     });
        //     res.end();
        // })

        // // 关闭文件
        // fs.open("./text/a.txt",'r+',(err,fd)=>{
        //     if(err){
        //         throw err;
        //     }
        //     console.log("文件已经打开");
        //     // 文件关闭
        //     fs.close(fd,()=>{
        //         console.log("关闭成功！");
        //     });
        // });
        // res.end();


        // 创建目录
        // let QQ="1455372";
        // fs.mkdir(`./text/${QQ}`,()=>{
        //     console.log("目录创建成功！");
        // });
        // res.end();

        // // 删除文件
        // // 写入一个文件
        // fs.writeFile("./text/b.txt","文件",(err)=>{
        //     if(err){
        //         throw err;
        //     }
        //     console.log("写入文件成功！");
        // });
        // setTimeout(function(){
        //     fs.unlink("./text/b.txt",()=>{
        //         console.log("删除成功！");
        //     })
        // },3000);
        // res.end();


        // // 读取目录
        // let path="./text";
        // fs.readdir(path,(err,files)=>{
        //     if(err)
        //     {
        //         throw err;
        //     }
        //     console.log(files);
        //     // 检测里面的文件类型
        //     files.forEach((item)=>{
        //         fs.stat(`${path}/${item}`,(err,stat)=>{
        //             if(err){
        //                 throw err;
        //             }
        //             console.log(item+"是文件"+stat.isFile());
        //             console.log(item+"是目录"+stat.isDirectory());
        //         })
        //     })
        // });
        // res.end();


        // 检测一个目录里面的所有文件或者目录---递归
        // let path="./text";
        // check(path);
        // function check(path){
        //     fs.readdir(path,(err,files)=>{
        //         if(err)
        //         {
        //             throw err;
        //         }
        //         // 检测当前文件的类型
        //         files.forEach((item)=>{
        //             let src=`${path}/${item}`;
        //             fs.stat(src,(error,stat)=>{
        //                 if(error)
        //                 {
        //                     throw error;
        //                 }
        //                 let isfile=stat.isFile();//检测是否为文件
        //                 console.log(`${item}是${isfile?'文件':'目录'}`);
        //                 // 是目录继续进入当前目录再次进行检测
        //                 if(stat.isDirectory()){
        //                     path=src;
        //                     check(path);
        //                 }
        //             })
        //         })
        //     })
        // }


        // 删除目录
        // 但是必须保证要删除的目录下不能存在文件或者目录
        // fs.rmdir("./text/1455372",(err)=>{
        //     if(err)
        //     {
        //         throw err;
        //     }
        //     console.log("删除目录成功！");
        // });

        // 重命名
        // fs.rename('./text','./data',(err)=>{
        //     if(err){
        //         throw err;
        //     }
        //     console.log("命名成功！");
        // })


        // 检测文件路径
        // fs.exists("./data/info",(exit)=>{
        //     if(exit){
        //         console.log("文件路径存在");
        //     }
        //     else{
        //         console.log("文件路径不存在");
        //     }    
        // })

        fs.appendFile('./data/a.txt',"\n赵佳敏",(err)=>{
            if(err){
                throw err;
            }
            console.log("写入成功！");
        })
        res.end();
    }
    
});
app.listen(port,host,()=>{
    console.log(`http://${host}:${port}`);
});