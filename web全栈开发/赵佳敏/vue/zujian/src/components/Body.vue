<template>
<div id="BodyContent">
    我是内容区域
    <br>
    <v-MessageBox></v-MessageBox>
    <br>
    <h3>使用keep-alive实现动态绑定组件</h3>
    <div class="keep-box">
        <button @click="changeStatus(true)">第一个</button>
        <button @click="changeStatus(false)">第二个</button>
        <keep-alive>
            <component :is="data.componentId"></component>  
        </keep-alive>
    </div>
    <h3 @click="handle()">{{msginfo}}</h3>
    <div>
        <h3>{{list.a}}</h3>
        <h3>{{list.b.c}}</h3>
        <button @click="change">修改数据</button>
    </div>
    <v-logo></v-logo>
</div>
</template>
<script>
//挂载两个小组件
import KeepOne from "./Keep/KeepOne";
import KeepTwo from "./Keep/KeepTwo";
//引入
import {shallowRef,ref,reactive} from 'vue';
export default{
    name:"BodyContent",
    setup() {
      let list=reactive({
          a:1,
          b:{
              c:2
          }
      });
      let change=()=>{
          list.a=3;
          list.b.c=4;
      }
      let msg={
          login:"没有账号，请注册",
          singo:"已有帐号，登录",
      };
      let msginfo=ref(msg.login);
      console.log(msginfo);

      let handle=()=>{
          if(msginfo.value==msg.login)
          {
              msginfo.value=msg.singo;
          }
          else{
              msginfo.value=msg.login;
          }
      }
      let data=shallowRef({
          componentId:KeepOne,
      });  
      let changeStatus=(args)=>{
            data.value={componentId:args?KeepOne:KeepTwo};
            //shallowRef方法监听的是value属性的变化，而不是属性值的变化
            console.log(data);
      };
      return {data, changeStatus,msginfo,handle,list,change};
    },
    //生命周期挂载完成
    mounted() {
        console.log(this);//this指向当前组件
    },
}
</script>
<style>
#BodyContent{
    flex: 5;
}
.keep-box{
    width: 500px;
    height: 400px;
    border: 1px solid #000;
    margin: 0 auto;
}
</style>