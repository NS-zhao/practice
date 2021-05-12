// 第三方请求
//let request=require("request");
const request = require('request')

// request('https://www.baidu.com/', function (err, response, body) {
//     // response 响应信息的集合
//     if (!err && response.statusCode == 200) { 
//         console.log(body)
//     }
// })

// application/x-www-form-urlencoded (普通表单)
request.post({url:url, form:{key:'value'}}, function (error ,response, body) {
})
// application/json (JSON表单)
request({
    url: url,
    method: "POST",
    json: true,
    headers: {
        "content-type": "application/json",
    },
    body: JSON.stringify({key: 'value'})
    }, function(error, response, body) {
})
// multipart/form-data (上传文件)
var url = 'http://192.168.0.102:3000/home';
var fs = require('fs');
var formData = {
    // 普通文本
    field: 'value',
    // 文件
    file: fs.createReadStream('./img.jpg'),
}
request.post({url:url, formData: formData}, function (error, response, body) {  

})
  
request('https://www.jmjc.tech/public/home/img/flower.png').pipe(fs.createWriteStream('./flower.png')) // 下载文件到本地