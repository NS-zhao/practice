<template>
<div id="setup">
    setup的使用方式
    <button @click="num.count++">按钮</button>
    {{num.count}}
</div>
</template>
<script>
import { onMounted, onUnmounted, onUpdated,shallowRef,ref,reactive,watch } from 'vue';
export default{
    name:"setup",
    props:['name'],
    mounted() {
        console.log(this.$parent);//Proxy {changeMsg: ƒ, changeCount: ƒ, …}
    },
    //创建组件前执行的
    setup(props,setContent) {
        // console.log(this);//undefined
        // console.log(props);//Proxy {}
        // props参数是获取当前组件的props集合的
        console.log(props.name);//Hello World
        //setContent是获取组件上的相关参数，this.$emit是获取当前组件的事件通信对象，this.slots是获取插槽
        console.log(setContent);//{expose: ƒ}
        console.log(setContent.emit);//事件通信
        let num=reactive({
            count:0
        });
        //存在生命周期函数
        onMounted(()=>{
            console.log("挂载完成");
        });
        onUpdated(()=>{
            console.log("修改完成");
        });
        onUnmounted(()=>{
            console.log("卸载完成");
        });
        watch(()=>num.count,(n,o)=>{
            console.log(n,o);
        });
        //setup内部声明变量或者函数，方法需要返回
        return{
            num
        };
    },
}
</script>
<style>
</style>