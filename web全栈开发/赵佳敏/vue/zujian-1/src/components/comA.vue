<template>
<div id="comA">
    {{title}}
    <br>
    <button @click="sendMsg">通过自定义事件给父组件传递参数</button>
    <input type="text" :value="val" @input="$emit('update:val',$event.target.value)" >
</div>
</template>
<script>
export default{
    name:"comA",
    props:{
        title:String,
        val:String
    },
    //接入emits  触发自定义事件  才会开始验证
    emits: {
        myevent(args) {
            console.log(args);
            //对数据可以进行代码验证
        },
    },
    mounted() {
        //this.$attrs 获取当前组件除props以外的非props传值或者自定义事件,是只读的
        console.log(this.$attrs);
        // //触发自定义事件的
        // this.$emit("myevent");
    },
    updated() {
        console.log(this.val);
        this.$emit("myevent",this.val);
    },
    methods: {
        sendMsg(){
            this.$emit("myevent","我给你传值了");
        }
    },
}
</script>
<style>
</style>