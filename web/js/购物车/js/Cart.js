/**
 * Created by zjm on 2021/7/31.
 */
//网页加载完成，先获取购物车的数据，进行动态绑定渲染界面
var ckall=null;
var cklist=null;
var fanck=null;
var item=null;
var btnLeft=null;
var btnRight=null;
var Number=null;
var price=null;
var smallprice=null;
var numCount=null;
var Totle=null;
var removeAll=null;
var cartInfo=null;
var ckRemove=null;
var Remove=null;
var isAllcheck=null;
window.onload=function(){
    //1.全选功能
    ckall=document.querySelector(".ckall");
    cklist=document.getElementsByClassName("cklist");
    fanck=document.querySelector(".fanck");
    item=document.getElementsByClassName("item");
    btnLeft=document.getElementsByClassName("btn-l");
    btnRight=document.getElementsByClassName("btn-r");
    Number=document.getElementsByClassName("number");
    price=document.getElementsByClassName("price");
    smallprice=document.getElementsByClassName("smallprice");
    numCount=document.querySelector(".num-count");
    Totle=document.querySelector(".totle");
    removeAll=document.querySelector(".removeAll");
    cartInfo=document.querySelector(".cart-info");
    ckRemove=document.querySelector(".ckremove");
    Remove=document.getElementsByClassName("remove");
    ckall.onclick=function(){
        //获取全选按钮的check属性值，根据值进行全选和不选
        var ckStatus=this.checked;
        checkSyatus(ckStatus);
        //统计
        getAllNumber();
        isAllcheck=true;
    }
    fanck.onclick=function(){
        checkSyatus('fan');
        getAllNumber();
    }
    //cklist的自身的事件
    addcklistHandle();
    //给计数按钮添加事件
    addButton();
    //点击清理购物车，全部删除
    removeAll.onclick=function(){
        cartInfo.innerHTML="";
    }
    //删除选中商品
    ckRemove.onclick=function(){
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
        getAllNumber();
    }
}
//给cklist添加事件的方法
function addcklistHandle(){
    for(var i=0;i<cklist.length;i++){
        cklist[i].index=i;
        cklist[i].onclick=function(){
            checkSyatus();
            //点击单个选择，当前行变色
            changeColor(this.checked,this.index);
            getAllNumber();
        }

    }
}
//封装方法实现全选和反选功能
function checkSyatus(status){
    //检测status变量的类型
    var isall=true;
    for(var i=0;i<cklist.length;i++){
        if(status!=undefined){
            cklist[i].checked=typeof status=="boolean"?status:!cklist[i].checked;
            changeColor(cklist[i].checked,i);
        }
        if(!cklist[i].checked)
            isall=false;
    }
    if(!isall){
        ckall.checked=false;
    }
    else{
        ckall.checked=true;
        isAllcheck=true;
    }
}
//当前行变色
function changeColor(checked,index){
    if(checked){
        item[index].classList.add("ckColor");
    }
    else{
        item[index].classList.remove("ckColor");
    }
}
//加减按钮添加事件以及给文本框添加事件
function addButton(){
    for(var i=0;i<btnLeft.length;i++){
        btnLeft[i].index=i;
        btnLeft[i].onclick=function(){
            //获取中间文本值进行--
            changeNumber(this.index,'left');
            getAllNumber();
        }
        btnRight[i].index=i;
        btnRight[i].onclick=function(){
            //获取中间文本值进行++
            changeNumber(this.index,'right');
            getAllNumber();
        }
        Number[i].onkeydown=function(e){
            //isNaN是检测是否是非数字的，是非数字返回true，数字返回false
            if(isNaN(e.key) && e.keyCode!=8){
                //如果是非数字，阻止事件默认行为
                e.preventDefault();
            }
        }
        Number[i].index=i;
        Number[i].onkeyup=function(e){
            if(this.value==''){
                alert("值最小为1！");
                this.value=1;
            }
            //计算小计
            changeNumber(this.index,'');
            getAllNumber();
        }
        //点击当前行删除
        Remove[i].index=i;
        Remove[i].onclick=function(){
            item[this.index].remove();
            updateIndex();
            getAllNumber();
            if(item.length==0&&isAllcheck){
                isAllcheck=false;
                ckall.checked=false;
            }
        }
    }
}
//加减中间数字变化的方法
function changeNumber(index,way){
    var value=parseInt(Number[index].value);
    switch (way){
        case 'left':
            value--;
            if(value<1){
                return;
            }
            if(value==1){
                btnLeft[index].classList.add('disColor');
                btnLeft[index].disabled='disabled';
            }
            break;
        case 'right':
            value++;
            if(value>1){
                btnLeft[index].classList.remove('disColor');
                btnLeft[index].disabled='';
            }
            break;
    }
    Number[index].value=value;
    //计算小计
    smallprice[index].innerText=(parseFloat(price[index].innerText)*value).toFixed(2);
}
//统计数量和计算总价--被选中的元素统计
function getAllNumber() {
    var count = 0;
    var totlePrice=0;
    for(var i=0;i<Number.length;i++){
        if(cklist[i].checked){
            count+=parseInt(Number[i].value);
            totlePrice+=parseFloat(smallprice[i].innerText);
        }
    }
    numCount.innerText=count;
    Totle.innerText=totlePrice.toFixed(2);
}
//删除之后对使用index属性绑定索引值的进行重新绑定
function updateIndex(){
    for(var i=0;i<item.length;i++){
        btnLeft[i].index=i;
        btnRight[i].index=i;
        Remove[i].index=i;
        cklist[i].index=i;
        Number[i].index=i;
    }
}