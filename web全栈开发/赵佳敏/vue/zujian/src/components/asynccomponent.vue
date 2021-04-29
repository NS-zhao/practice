<template>
<div id="asyncInfo">
    局部挂载异步组件
    <v-alert></v-alert>
    <v-msg></v-msg>
</div>
</template>
<script>

//局部的异步挂载
// //引入当前的组件
// import alert from './common/Alert'
import { defineAsyncComponent } from 'vue'
import load from './common/loading'
import error from './common/error'
export default{
    name:"asyncInfo",
    components:{
        //vue2.0写法
        //'v-alert':()=>import("./common/Alert")//2.x已经失效
        'v-alert':defineAsyncComponent(()=>import("./common/Alert")),
        //加载异步组件时处理组件的加载状态
        'v-msg':defineAsyncComponent({
            loader:()=>{
                let a=new Promise((resolve)=>{
                    setTimeout(()=>{
                        resolve(import('./common/Alert'));
                    },2000)
                });
                return a;
            },
            //异步加载时使用的组件
            loadingComponent:load,
            //加载失败时使用的组件
            errorComponent:error,
            //展示加载时组件的延时时间。默认值是 200 (毫秒)
            delay:200,
            //如果提供了超时时间且组件加载也超时了，则使用加载失败时使用的组件。默认值是：`Infinity`
            timeout:5000,
            //组件是否挂起
            suspensible:false
        })
    }
}
</script>
<style>
</style>