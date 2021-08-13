/**
 * Created by zjm on 2021/8/10.
 */
var ckall=null;
var cklist=null;
var fanck=null;
var item=null;
window.onload=function(){
    ckall=document.querySelector(".ckall");
    cklist=document.querySelectorAll(".cklist");
    fanck=document.querySelector(".fanck");
    item=document.querySelectorAll(".item");

    //全选功能
    ckall.onclick= function(){
        //获取全选按钮的check属性，根据值进行全选和不选
        var ckcheck=this.checked;
        checkStatus(ckcheck)
    }
    //反选
    fanck.onclick=function(){
        checkStatus("fan");
    }
    //cklist自身的事件
    addcklistHandle();
}
//封装方法实现全选和反选功能
function checkStatus(status){
    var isAll=true;

    for(var i=0;i<cklist.length;i++){
        if(status!=undefined){
            //检测status变量的类型
            cklist[i].checked=typeof status=="boolean"?status:!cklist[i].checked;
            changeColor();
        }
        if(!cklist[i].checked){
            isAll=false;
        }
    }
    if(!isAll){
        ckall.checked=false;
    }
    else{
        ckall.checked=true;
    }
}
//给cklist添加事件的方法
function addcklistHandle(){
    for(var i=0;i<cklist.length;i++){
        cklist[i].onclick=function(){
            checkStatus();
            //点击单个选择，当前行变色
            changeColor();
        }
    }
}
//当前行变色
function changeColor(){
    if(cklist[i].checked){
        item[i].classList.add('ckColor');
    }
    else{
        item[i].classList.remove('ckColor')
    }
}