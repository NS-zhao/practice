// let buff=Buffer.from("a","ascii");
// console.log(buff);//<Buffer 61>
// console.log(buff.toString());//a


// 创建一个长度为 10、且用 0 填充的 Buffer。
let buf1=Buffer.alloc(10);
console.log(buf1);//<Buffer 00 00 00 00 00 00 00 00 00 00>
// 创建一个长度为 10、且用 0x1 填充的 Buffer。 
let buf2=Buffer.alloc(10,1);
console.log(buf2);//<Buffer 01 01 01 01 01 01 01 01 01 01>


// 创建一个长度为 10、且未初始化的 Buffer。
// 这个方法比调用 Buffer.alloc() 更快，
// 但返回的 Buffer 实例可能包含旧数据，
// 因此需要使用 fill() 或 write() 重写。
let buf3=Buffer.allocUnsafe(10);
console.log(buf3);//<Buffer 02 01 03 00 00 44 60 00 01 10>


// 建立固定长度的编码
let buf4=Buffer.alloc(20);
// 写入值
let len=buf4.write("hello world");
console.log(len);//11
console.log(buf4);//<Buffer 68 65 6c 6c 6f 20 77 6f 72 6c 64 00 00 00 00 00 00 00 00 00>
console.log(buf4.toString());//hello world


let buf5=Buffer.alloc(26);
for(var i=0;i<26;i++){
    buf5[i]=i+97;
}
console.log(buf5.toString('ascii'));//abcdefghijklmnopqrstuvwxyz
console.log(buf5.toString('ascii',0,5));//abcde
console.log(buf5.toString('utf-8',0,5));//abcde
console.log(buf5.toString(undefined,0,5));//abcde


// 建立json数据
let json={"id":1,"name":"张三"};
let buff=Buffer.alloc(1024);
buff.write(JSON.stringify(json));
console.log(buff);//<Buffer 7b 22 69 64 22 3a 31 2c 22 6e 61 6d 65 22 3a 22 e5 bc a0 e4 b8 89 22 7d 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 ... 974 more bytes>
// toJSON不是转成原数据json，而是把json buffer数据转化成json格式。
console.log(buff.toJSON());
console.log(buff.toString());//{"id":1,"name":"张三"}


let buf6=Buffer.from("张三");
let buf7=Buffer.from("hello world");
let buf8=Buffer.concat([buf6,buf7]);
console.log(buf8.toString());//张三hello world