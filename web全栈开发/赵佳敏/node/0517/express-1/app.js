// 配置服务器
// 引入express框架
const experss=require("express");
let app=experss();//创建express框架实例
let port=8080;
let host="localhost";
// 写入路由
// 路由守卫:针对某个路由写的安全守卫
app.all('/',(req,res,next)=>{
    console.log("进入当前页面之前");
    console.log(req.url);
    // next继续执行
    // next加参数,可以跳转到某个路由,也可以直接到错误响应
    next();
})


// 注册get路由
app.get('/',(req,res)=>{
    console.log("进入当前页面");
    res.send("首页");
});
// post路由--表单或者ajax请求触发
app.post('/dologin',(req,res)=>{
    res.send('post');
});
// put路由
app.put('/insertData',(req,res)=>{
    res.send("put");
});
// delete路由
app.delete('/delete',(req,res)=>{
    res.send("delete");
});


// 路由的路径可以写成匹配模式
// 写?匹配前面的子表达式0次或一次
// ?匹配的是/fatpig或者/fapig
app.get('/fat?pig',(req,res)=>{
    res.send("?匹配路径");
});
// 写+匹配前面的子表达式1次或多次
// +匹配的是/abcd或者/abbcd等等
app.get('/ab+cd',(req,res)=>{
    res.send("+匹配路径");
});
// 写*匹配的是中间任意字符
// *匹配的是/efgh或者/efghnhhggh等等
app.get('/ef*gh',(req,res)=>{
    res.send("*匹配路径");
});
// ()标记一个子表达式的开始和结束位置。子表达式可以获取供以后使用
// 匹配的是/adbc或者/adabbc
app.get('/ad(ab)?bc',(req,res)=>{
    res.send("()匹配路径");
});
// 使用正则直接写路由路径
// 匹配的是路径里面带sendMsg的
app.get('/sendMsg/i',(req,res)=>{
    res.send("正则匹配路径");
});

// 路由上的参数

// get路由传值，参数在req.query属性上获取，以json数据格式存在
app.get('/sendData',(req,res)=>{
    console.log(req.query);
    res.send('get传参');
});

const ejs=require("ejs");
app.get('/login',(req,res)=>{
    ejs.renderFile('./view/index.ejs',(err,str)=>{
        if(err)
            throw err;
        res.send(str);
    })
})
// app.post('/sendPost',(req,res)=>{
//     // express框架中post传值也可以使用监听获取数据
//     var inf0='?';
//     req.on('data',(msg)=>{
//         info+=msg;
//     });
//     req.on('end',()=>{
//         console.log(info);
//         res.send('post值');
//     })
// });

// 还可以使用第三方中间件(插件：body-Parser)
// 引入body-parser
const bodyParser=require("body-parser");
// 使用中间件
app.use(bodyParser.urlencoded({extended:false}));
app.use(bodyParser.json());//把当前数据全部转化成json格式
app.post('/sendPost',(req,res)=>{
    console.log(req.body);
    res.send('post值');
});


// 在路由路径上直接设置动态变量
// 获取动态传值，req.params
// 路径http://localhost:8080/send/10086/zzz/msg/aaa
app.get("/send/:id/:name/msg/:info",(req,res)=>{
    console.log(req.params);//{ id: '10086', name: 'zzz', info: 'aaa' }
    res.send("路由动态传值");
});

// 动态路由传值使用连接符
// 路径http://localhost:8080/msginfo/10086-zzz
app.get('/msginfo/:id-:msg',(req,res)=>{
    console.log(req.params);//{ id: '10086', msg: 'zzz' }
    res.send("使用-连接符");
});

// 必须使用next()到下一个回调函数
// 把回调函数写在内部
app.get('/adduser',(req,res,next)=>{
    // 在这里可以做相关代码检测
    next();
},(req,res)=>{
    res.send('adduser');
});

// 把回调函数写在外部
let fun1=(req,res,next)=>{
    next();
}
let fun2=(req,res,next)=>{
    next();
}
app.get('/addback',[fun1,fun2],(req,res)=>{
    res.send('addback');
});

// 路由同路径不同操作
app.route('/msginfo').get((req,res)=>{
    res.send("get路由");
}).post((req,res)=>{
    res.send("post路由");
})

// 接口响应json
app.get('/getlist',(req,res)=>{
    let list=[{name:'zzz'},{name:'aaa'}];
    res.json(list);
})

// 文件下载
app.get('/downfile',(req,res)=>{
    let path='./file/abc.txt';
    res.download(path,(err)=>{
        if(err)
            throw err;
        console.log("下载成功！");
    })
})
// 路由重定向
app.get("/logininfo",(req,res)=>{
    let login=true;
    if(login)
    {
        res.redirect('/');
    }
    else{
        res.send('登录');
    }
})

app.listen(port,host,()=>{
    console.log(`http://${host}:${port}`);
});