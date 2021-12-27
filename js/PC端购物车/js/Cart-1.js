/**
 * Created by zjm on 2021/8/10.
 */
var ckall=null;
var cklist=null;
var fanck=null;
var item=null;
var btn_l=null;
var btn_r=null;
var number=null;
var smallprice=null;
var price=null;
var numCount=null;
var totle=null;
var ckremove=null;
var removeAll=null;
var remove=null;
var cartInfo=null;
var isAllcheck=null;
window.onload=function(){
    ckall=document.querySelector(".ckall");
    cklist=document.getElementsByClassName("cklist");
    fanck=document.querySelector(".fanck");
    item=document.getElementsByClassName("item");
    btn_l=document.getElementsByClassName("btn-l");
    btn_r=document.getElementsByClassName("btn-r");
    number=document.getElementsByClassName("number");
    smallprice=document.getElementsByClassName("smallprice");
    price=document.getElementsByClassName("price");
    numCount=document.querySelector(".num-count");
    totle=document.querySelector(".totle");
    ckremove=document.querySelector(".ckremove");
    removeAll=document.querySelector(".removeAll");
    remove=document.getElementsByClassName("remove");
    cartInfo=document.querySelector(".cart-info");
    //全选功能
    ckall.onclick= function(){
        //获取全选按钮的check属性，根据值进行全选和不选
        var ckcheck=this.checked;
        checkStatus(ckcheck);
        getNumber();
        isAllcheck=true;
    }
    //反选
    fanck.onclick=function(){
        checkStatus("fan");
        getNumber();
    }
    //cklist自身的事件
    addcklistHandle();
    addButton();
    //点击清理购物车，全部删除
    removeAll.onclick=function(){
        cartInfo.innerText='';
    }
    //删除选中商品
    ckremove.onclick=function(){
        for(var i=0;i<cklist.length;i++){
            if(cklist[i].checked){
                item[i].remove();
                updateIndex();
                i--;
            }
        }
        if(isAllcheck){
            ckall.checked=false;
            isAllcheck=false;
        }
        getNumber();
    }
}
//封装方法实现全选和反选功能
function checkStatus(status){
    var isAll=true;

    for(var i=0;i<cklist.length;i++){
        if(status!=undefined){
            //检测status变量的类型
            cklist[i].checked=typeof status=="boolean"?status:!cklist[i].checked;
            changeColor(cklist[i].checked,i);
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
        isAllcheck=true;
    }
}
//给cklist添加事件的方法
function addcklistHandle(){
    for(var i=0;i<cklist.length;i++){
        cklist[i].index=i;
        cklist[i].onclick=function(){
            checkStatus();
            //点击单个选择，当前行变色
            changeColor(this.checked,this.index);
            getNumber();
        }
    }
}
//当前行变色
function changeColor(checked,index){
    if(checked){
        item[index].classList.add('ckColor');
    }
    else{
        item[index].classList.remove('ckColor')
    }
}
//加减按钮添加事件以及给文本框添加事件
function addButton(){
    for(var i=0;i<btn_l.length;i++){
        btn_l[i].index=i;
        btn_l[i].onclick=function(){
            changeNumber(this.index,'left');
            getNumber();

        }
        btn_r[i].index=i;
        btn_r[i].onclick=function(){
            changeNumber(this.index,'right');
            getNumber();
        }
        number[i].index=i;
        number[i].onkeydown=function(e){
            if(isNaN(e.key)&& e.keyCode!=8){
                e.preventDefault();
            }
        }
        number[i].onkeyup=function(e){
            if(this.value==''){
                alert("值最小为1");
                this.value=1;
            }
            changeNumber(this.index,'');
            getNumber();
        }
        //点击当前行删除
        remove[i].index=i;
        remove[i].onclick=function(){
            item[this.index].remove();
            updateIndex();
            getNumber();
            if(item.length==0&&isAllcheck){
                isAllcheck=false;
                ckall.checked=false;
            }

        }
    }
}
//加减中间数字变化的方法
function changeNumber(index,way){
    var value=parseInt(number[index].value);
    switch (way){
        case 'left':
            value--;
            if(value<1){
                return;
            }
            if(value==1){
                btn_l[index].classList.add("disColor");
                btn_l[index].disabled='disabled';
            }
            break;
        case 'right':
            value++;
            if(value>1){
                btn_l[index].classList.remove("disColor");
                btn_l[index].disabled='';
            }
            break;
    }
    number[index].value=value;
    //计算小计
    smallprice[index].innerText=(parseFloat(price[index].innerText)*value).toFixed(2);
}
//统计数量和计算总价--被选中的元素统计
function getNumber(){
    var count=0;
    var totolPrice=0;
    for(var i=0;i<number.length;i++){
        if(cklist[i].checked){
            count+=parseInt(number[i].value);
            totolPrice+=parseFloat(smallprice[i].innerText);
        }
    }
    numCount.innerText=count;
    totle.innerText=totolPrice.toFixed(2);
}
//删除之后对使用index属性绑定索引值的进行重新绑定
function updateIndex(){
    for(var i=0;i<item.length;i++){
        cklist[i].index=i;
        btn_l[i].index=i;
        btn_r[i].index=i;
        number[i].index=i;
        remove[i].index=i;
    }
}