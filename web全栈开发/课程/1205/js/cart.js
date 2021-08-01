/**
 * Created by maodou on 2020/12/5.
 */
//代码在元素之前放  先加载代码
//加载完成事件
var User_Ck = null;
var Ck_ALL = null;
var Cart_List = null;
var Btn_Left = null;
var Btn_Right = null;
var Shop_Num = null;
var Price = null;
var SmallPrice = null;
var AllNum = null;
var cart_list = null;
var Remove_Ele = null;
window.onload = function () {
    User_Ck = document.getElementsByClassName("userck");
    Ck_ALL = document.getElementsByClassName("ckAll");
    Cart_List = document.getElementsByClassName("cart_num_list");
    Btn_Left = document.getElementsByClassName("btn_left")
    Btn_Right = document.getElementsByClassName("btn_right")
    Shop_Num = document.getElementsByClassName("shop_number")
    Price = document.getElementsByClassName("price");
    SmallPrice = document.getElementsByClassName("smallPrice");
    AllNum = document.getElementsByClassName("allnum")[0];
    cart_list = document.getElementsByClassName("cart_list")[0];
    Remove_Ele = document.getElementsByClassName("remove_ele");
    //添加全选的事件
    clAllHanndle();
    //添加商品栏位的点击事件
    addUserCkHandle();
    //数量操作的按钮添加事件
    buttonHandle();
    //给文本框添加事件
    addInputHandle();

    //点击删除选中商品

    deleteselect.onclick = function () {
        removeSelectShop();
    }

    //清理购物车
    deleteCart.onclick = function () {
        cart_list.innerHTML = "";
    }
    //点击删除单个列表
    removeOne();
}
//点击删除单个cart
function removeOne() {
    for (var i = 0; i < Remove_Ele.length; i++) {
        Remove_Ele[i].index = i;
        Remove_Ele[i].onclick = function () {
            Cart_List[this.index].remove();
            SortIndex();//重排索引
            //重新计件  总价
            addTotlePrice();
            addCount();
        }
    }
}
//删除选中商品
function removeSelectShop() {
    //这里注意元素删除之后 索引会重排   0123  012
    for (var i = 0; i < User_Ck.length; i++) {
        if (User_Ck[i].checked) {
            Cart_List[i].remove();//删除当前对应的栏位
            SortIndex();
            i--;
        }
    }
    //重新计件  总价
    addTotlePrice();
    addCount();
}
//删除索引之后  对当前这个案例里面对象和索引有关的元素重排  索引
function SortIndex() {
    for (var i = 0; i < User_Ck.length; i++) {
        User_Ck[i].index = i;
        Price[i].index = i;
        Btn_Left[i].index = i;
        Btn_Right[i].index = i;
        Shop_Num[i].index = i;
        SmallPrice[i].index = i;
        Remove_Ele[i].index = i;
    }
}
//给中间的数量文本框添加相应的事件
function addInputHandle() {
    for (var i = 0; i < Shop_Num.length; i++) {
        Shop_Num[i].onkeydown = function (e) {
            //非数字不能显示到文本框上
            //输入的值在e.data
            //isNaN()  检测是否是非数字
            if (e.key != "Backspace" && isNaN(e.key)) {
                //e.preventDefault();//阻止事件的默认行为
                return false;
            }
        }
        //添加失去焦点的事件
        Shop_Num[i].index = i;
        Shop_Num[i].onblur = function () {
            if (this.value == "" || parseInt(this.value) < 1) {
                //提示框
                alert("文本输入的值必须大于0！！！");
                this.value = 1;
            }
            if (parseInt(this.value) > 200) {
                //提示框
                alert("文本输入的最大值为200！！");
                this.value = 200;
            }
            //小计
            addSmallPrice(this.value, this.index);
            //当前的父元素添加类   ckbox默认选择
            User_Ck[this.index].checked = true;
            Cart_List[this.index].classList.add("cart_num_list_on");
            //总价计算
            addTotlePrice();
            //检测按钮是否禁用
            isButtonDisable(this.index, parseInt(this.value));
        }
    }
}


//数量操作添加事件  -   +
function buttonHandle() {
    for (var i = 0; i < Btn_Left.length; i++) {
        Btn_Left[i].index = i;
        Btn_Left[i].onclick = function () {
            btn_Status("left", this.index);
        }
        Btn_Right[i].index = i;
        Btn_Right[i].onclick = function () {
            //点击右边按钮  如果父元素cart_num_list  没有添加类  ckbox没有选中   全部设置
            if (!User_Ck[this.index].checked) {
                User_Ck[this.index].checked = true;
                Cart_List[this.index].classList.add("cart_num_list_on");
            }
            btn_Status("right", this.index);
        }
    }
}

//通过按钮操作文本  改变按钮的状态
function btn_Status(way, index) {
    //获取对应文本框的值
    var num = parseInt(Shop_Num[index].value);
    if (way == "left") {
        num--;
    }
    else {
        num++;
    }
    //检测按钮是否禁用
    isButtonDisable(index, num);
    //如果操作数值大于1  左边按钮  移除disabled属性   is_disabled类 移除

    Shop_Num[index].value = num;
    //小计
    addSmallPrice(num, index);
    //调用计件
    addCount();
}

//两边按钮是否禁用以及是否添加类
function isButtonDisable(index, num) {
    //值在1-200之间 解禁用  1 和 200  禁用
    if (num > 1 || num < 200) {
        //两边正常使用
        if (Btn_Left[index].classList.contains("is_disabled")) {
            Btn_Left[index].classList.remove("is_disabled");
            Btn_Left[index].attributes.removeNamedItem("disabled");
        }
        if (Btn_Right[index].classList.contains("is_disabled")) {
            Btn_Right[index].classList.remove("is_disabled");
            Btn_Right[index].attributes.removeNamedItem("disabled");
        }
    }
    if (num <= 1) {
        //左边禁用
        Btn_Left[index].classList.add("is_disabled");
        var disabled = document.createAttribute("disabled");
        Btn_Left[index].attributes.setNamedItem(disabled);
    }
    else if (num >= 200) {
        //右边禁用
        Btn_Right[index].classList.add("is_disabled");
        var disabled = document.createAttribute("disabled");
        Btn_Right[index].attributes.setNamedItem(disabled);
    }
}


//计算小计的方法
function addSmallPrice(number, index) {
    //知道当前的数量
    var s_price = Price[index].innerText;
    var smallprice = s_price * number;
    SmallPrice[index].innerText = smallprice;
    //用户点击小计的时候   检测是否全部选择
    isselectAllCK();
    //计算总价
    addTotlePrice();
}
//计算总价的方法
function addTotlePrice() {
    var totlePrice = 0;//总价
    //直接遍历所有的小计  前提是ckbox要选择
    for (var i = 0; i < SmallPrice.length; i++) {
        if (User_Ck[i].checked) {
            totlePrice += parseFloat(SmallPrice[i].innerText);
        }
    }
    //直接赋值给总价
    s_totleprice.innerText = totlePrice;
}
//总件数统计
function addCount() {
    var count = 0;
    for (var i = 0; i < Shop_Num.length; i++) {
        if (User_Ck[i].checked) {
            count += parseInt(Shop_Num[i].value);
        }
    }
    AllNum.innerText = count;
}

//User_Ck 添加点击事件
function addUserCkHandle() {
    for (var i = 0; i < User_Ck.length; i++) {
        User_Ck[i].index = i;
        User_Ck[i].onclick = function () {
            //调用是否添加父元素背景的方法
            ischeckbox(this.checked, this.index);
            //如果取消选中状态  长度不够全选  全选全部取消  反之  全部选择
            isselectAllCK();
            //计算总价的方法
            addTotlePrice();
            //计件
            addCount();
        }
    }
}
//检测是否全选的一个方法
function isselectAllCK() {
    //所有的栏位  只要有一个是false  就取消  全选  反之  全选
    var isselect = true;
    for (var i = 0; i < User_Ck.length; i++) {
        if (!User_Ck[i].checked) {
            isselect = false;
            break;
        }
    }
    Ck_ALL[0].checked = isselect ? true : false;
    Ck_ALL[1].checked = isselect ? true : false;
}
//方法全选的点击事件
function clAllHanndle() {
    for (var i = 0; i < Ck_ALL.length; i++) {
        Ck_ALL[i].index = i;
        Ck_ALL[i].onclick = function () {
            allSelectShop(this.checked);
            Ck_ALL[this.index ? 0 : 1].checked = this.checked;
            //计算总价的方法
            addTotlePrice();
            //计件
            addCount();
        }
    }
}

//方法封装：1.点击全选   实现  商品全部选中  或者  取消
function allSelectShop(args) {
    //检测当前的商品框是否存在
    if (User_Ck) {
        for (var i = 0; i < User_Ck.length; i++) {
            User_Ck[i].checked = args;
            //那个栏被选中添加类
            ischeckbox(args, i);
        }
    }
}
//方法  给父元素是否添加颜色类   取决于复选框有没有被选中
function ischeckbox(args, index) {
    if (args) {
        Cart_List[index].classList.add("cart_num_list_on");
    }
    else {
        Cart_List[index].classList.remove("cart_num_list_on");
    }
}