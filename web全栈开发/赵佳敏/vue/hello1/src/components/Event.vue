<template>
    <div id="event">
        <!-- 事件的执行参数，类似原生js的时间执行参数 -->
        <button @click="handle(1,$event)">按钮</button>
    </div>
</template>
<script>
export default {
    name:"event",
    methods: {
        handle(index,e){
            //事件执行参数可以使用原生的js
            let event=window.event;
            console.log(event);
            //最常用的就是event.target，触发当前的目标元素
            //event.target、event.srcElement、event.toElement都是触发当前的目标元素
            //当前事件在执行的时候如果没有参数传递，那么默认的第一个参数就是事件执行参数event，有传递参数时，暂时找不到event事件执行参数
            //console.log(e); //event   
            //console.log(index,e);//undefined 1
            //传递参数时，怎么找event?
            //在方法上传递参数$event，指的就是event
            console.log(e);
        }
    },
}
</script>
<style>

</style>