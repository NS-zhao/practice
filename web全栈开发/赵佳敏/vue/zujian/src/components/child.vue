<template>
<div id="childinfo">
    <h4>我是子组件</h4>
    <h3>{{title}}</h3>
    <h3>{{content}}</h3>
    <h2>{{num}}</h2>
</div>
</template>
<script>
export default{
    name:"childinfo",
    //props:['title','content'],//简单版的子组件设置传递参数
    //props传值存在类型或者默认值的行为
    // props:{
    //     //数据类型限制
    //     title:String,
    //     content:String
    // }

    //检验类型+默认值+检验
    props:{
        title:String,
        content:String,
        num:{
            type:Number,
            default:0,
            //检验值
            validator(value){
                if(value.toString().indexOf('.')!=-1)
                {
                    return false;
                }
                return true;
            }
        }
    },
    beforeUnmount() {
        console.log("卸载之前");
    },
    unmounted() {
        console.log("卸载之后");
    },
}
</script>
<style>
</style>