/**
 * Created by maodou on 2020/12/6.
 */
//获取所有的li_list 元素
var li_ele = document.querySelectorAll(".li_list");
var nav_ele = document.querySelectorAll(".nav_list");
var pro_menu_Right = document.querySelector(".pro_menu_right_menu");
var scroll_info = document.querySelector(".scroll_info");
var btn_Right = document.querySelectorAll(".btn_right");
var btn_Left = document.querySelectorAll(".btn_left");
var s_Num = document.querySelectorAll(".s_num");
var s_Cao = document.querySelectorAll(".s_cao");
var default_ele = li_ele[0];
for (var i = 0; i < li_ele.length; i++) {
    li_ele[i].index = i;
    li_ele[i].onclick = function () {
        default_ele.classList.remove("default_bg");
        this.classList.add("default_bg");
        default_ele = this;
        //获取点击li的索引
        //获取对应ul元素offsetTop
        var offset = nav_ele[this.index].offsetTop;
        pro_menu_Right.scrollTop = offset;
        //scroll_info.style.transform = "translatey(" + (-offset) + "px)";
    }
}
//给右边scroll添加事件
var index = 0;
var isOut = false;
pro_menu_Right.onscroll = function (e) {
    //在那个ul范围之内
    if (Math.ceil(this.scrollTop) < nav_ele[index].offsetTop || Math.ceil(this.scrollTop) > nav_ele[index].offsetHeight + nav_ele[index].offsetTop) {
        isOut = true;
    }
    if (isOut) {
        for (var i = 0; i < nav_ele.length; i++) {
            if (Math.ceil(this.scrollTop) >= nav_ele[i].offsetTop && Math.ceil(this.scrollTop) <= nav_ele[i].offsetHeight + nav_ele[i].offsetTop) {
                index = i;
            }
        }
        default_ele.classList.remove("default_bg");
        li_ele[index].classList.add("default_bg");
        default_ele = li_ele[index];
        isOut = false;
    }
}

//给操作按钮添加事件
for (var i = 0; i < btn_Right.length; i++) {
    btn_Right[i].index = i;
    btn_Right[i].onclick = function () {
        //对应的减号和数字  移除类
        if (btn_Left[this.index].classList.contains("s_display")) {
            btn_Left[this.index].classList.remove("s_display");
            s_Num[this.index].classList.remove("s_display");
        }

        var num = parseInt(s_Num[this.index].innerText);
        num++;
        s_Num[this.index].innerText = num;

        //点击+号  操作动画
        //create_Dom(this.index);
    }
    btn_Left[i].index=i;
    btn_Left[i].onclick = function () {
        var num = parseInt(s_Num[this.index].innerText);
        num--;
        s_Num[this.index].innerText = num;
        if (num <= 0) {
            //对应的减号和数字  添加类
            if (!btn_Left[this.index].classList.contains("s_display")) {
                btn_Left[this.index].classList.add("s_display");
                s_Num[this.index].classList.add("s_display");
            }
        }
    }
}

//创建动画元素方法
//function create_Dom(index){
//    var span=document.createElement("span");
//    var span_child=document.createElement("span");
//    span_child.className="animate_warp_child";
//    span.className="animate_warp";
//    span.appendChild(span_child);
//    s_Cao[index].appendChild(span);
//}