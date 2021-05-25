// node异步编程，也就是异步的i/o

// events模块是内置的模块
// 使用的是里面的eventEmitter类模块
// 主要功能是事件的发布和事件的监听功能
const events=require("events");
const emitter=new events.EventEmitter();
// 先监听事件
emitter.on("dosomething",(args)=>{
    console.log(args);
});
// 一次性监听
emitter.once("sendmsg",(args)=>{
    console.log(args);
});
let handle=(args)=>{
    console.log(args);
}
emitter.addListener("listen",handle);
setTimeout(()=>{
    console.log(emitter.listeners());
    // 不带参是移除所有的监听
    emitter.removeAllListeners();
    // 移除指定事件监听
    emitter.removeListener("listen",handle);
    emitter.emit("dosomething","你好");
    emitter.emit("sendmsg","一次性");
    emitter.emit("sendmsg","一次性");
    emitter.emit("listen","add");
},3000);