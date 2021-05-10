//组件模块系统
//引入组件
//把引入的所有组件全部暴露出去
//按需引入文件
// import A from '@/components/comA'
// import B from '@/components/comB'

import {defineAsyncComponent} from 'vue'
let A=defineAsyncComponent(()=>import("../components/comA"));
let B=defineAsyncComponent(()=>import("../components/comB"));
//暴露
// export default{
//     components:{
//         A,B
//     }
// }

window.modules={
    'A':A,
    'B':B
}