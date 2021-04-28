<template>
<div id="compon">
    组件
    {{msg}}
    <button @click="changeMsg">修改数据</button>
    <button @click="changeCount">count++</button>
    {{count}}
    <!-- 切换组件的挂载卸载 -->
    <button @click="isshow=!isshow">切换组件的挂载卸载</button>
    <template v-if="isshow">
        <child title="标题" content="我是内容"></child>
    </template>
    <!-- 挂载一个小的子组件 -->
    <!-- 组件传值--静态传值 -->
    <child title="标题" content="我是内容"></child>
    <!-- 组件传值--动态传值 -->
    <child :title="title" :content="content" :num="price"></child>
    <!-- 挂载组件 -->
    <div>
        <Setup name="Hello World"></Setup>
    </div>
</div>
</template>
<script>
//每个组件都存在自己的生命周期
//写的时候常规方法
import child from './components/child'
import Setup from './components/common/setup.vue';
export default{
    name:"compon",
    components:{
        child,
        Setup
    },
    beforeCreate() {
        console.log("初始化之前");
    },
    created() {
        console.log("初始化之后");
    },
    beforeMount() {
        console.log("挂载之前");
    },
    mounted() {
        console.log("挂载完成");
    },

    data() {
        return {
            //数据区域
            msg:"Hello",
            num:0,
            title:"商家信息",
            content:"商家详细信息",
            price:999,
            isshow:true
        }
    },
    beforeUpdate() {
        console.log("修改数据之前");
    },
    updated() {
      console.log("修改数据之后");  
    },
    methods: {
        //方法区域
        changeMsg(){
            this.msg="world";
        },
        changeCount(){
            this.count++;
        }
    },
    computed:{
        //计算属性区域
        //类似变量的声明，是监听变量的，也可以缓存之前的变量值
        // count(){
        //     //默认只能读取readonly
        //     return 0;
        // }
        
        //若是你既要可写又要可读，就得使用get、set访问器
        count:{
            get(){
                return this.num;
            },
            set(vm){
                this.num=vm;
            }
        }
    },
    watch:{
        //监听区域
        count(newValue,oldValue){
            console.log(newValue,oldValue);
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