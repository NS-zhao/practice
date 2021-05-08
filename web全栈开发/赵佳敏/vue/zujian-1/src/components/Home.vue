<template>
<div id="Home">
    Home
    <!-- <A></A>
    <B></B> -->
    <!-- 给子组件添加自定义事件 -->
    <v-A title="A子组件" v-model:val="info" data-index="2" @myevent="myEvent"></v-A>
    {{msg}}
</div>
</template>
<script>
//同步引入
// import common from '../commonJS/common'
import {defineAsyncComponent} from 'vue'
export default{
    name:"Home",
    // components:common.components,
    components:{
        'v-A':defineAsyncComponent(()=>{
            return new Promise((resolve,reject)=>{
                console.log(window.modules);
                resolve(window.modules["A"]);
            });
        }),
    },
    data() {
        return {
            m:"default",
            info:"请输入"
        }
    },
    mounted() {
        //console.log(common);
    },
    methods: {
        myEvent(args){
            console.log("触发自定义事件",args);
            this.msg=args;
            this.info=args;
        }
    },
    computed:{
        msg:{
            get(){
                return this.m;
            },
            set(vm){
                this.m=vm;
            }
        }
    }
}
</script>
<style>
</style>