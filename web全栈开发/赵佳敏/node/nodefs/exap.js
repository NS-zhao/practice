const fs=require("fs");
let src="./text/笔记.txt";
var newbuff=Buffer.alloc(204800);
var buff=Buffer.alloc(1024);
fs.stat(src,(err,stat)=>{
    if(err)
    {
        throw err;
    }
    if(stat.isFile()){
        let size=stat.size;//文件总字节
        let Num=Math.ceil(size/buff.length);
        fs.open(src,'r+',(err,fd)=>{
            if(err){
                throw err;
            }
            let count=0;
            readfile();
            function readfile(){
                fs.read(fd,buff,0,buff.length,buff.length*count,(err,bytes,buf)=>{
                    if(err){
                        throw err;
                    }
                    count++;
                    newbuff=Buffer.concat([newbuff,buf]);
                    if(count>=Num){
                        console.log(newbuff.toString());
                        return;
                    }
                    readfile();
                });
            }
        });
    }
});