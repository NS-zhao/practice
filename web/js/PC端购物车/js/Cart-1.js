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

    //ȫѡ����
    ckall.onclick= function(){
        //��ȡȫѡ��ť��check���ԣ�����ֵ����ȫѡ�Ͳ�ѡ
        var ckcheck=this.checked;
        checkStatus(ckcheck)
    }
    //��ѡ
    fanck.onclick=function(){
        checkStatus("fan");
    }
    //cklist������¼�
    addcklistHandle();
}
//��װ����ʵ��ȫѡ�ͷ�ѡ����
function checkStatus(status){
    var isAll=true;

    for(var i=0;i<cklist.length;i++){
        if(status!=undefined){
            //���status����������
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
//��cklist����¼��ķ���
function addcklistHandle(){
    for(var i=0;i<cklist.length;i++){
        cklist[i].onclick=function(){
            checkStatus();
            //�������ѡ�񣬵�ǰ�б�ɫ
            changeColor();
        }
    }
}
//��ǰ�б�ɫ
function changeColor(){
    if(cklist[i].checked){
        item[i].classList.add('ckColor');
    }
    else{
        item[i].classList.remove('ckColor')
    }
}