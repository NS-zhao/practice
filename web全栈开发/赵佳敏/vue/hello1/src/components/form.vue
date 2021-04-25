<template>
    <div id="forminfo">
        <input placeholder="请输入..." v-model="message">
        <p>message is:{{message}}</p>
        <span>message is:</span>
        <p style="white-space: pre-line;">{{message}}</p>
        <br/>
        <textarea v-model="message" placeholder="请输入..."></textarea>
        <input type="checkbox" v-model="checked"/>
        <label for="checkbox">{{ checked }}</label>
        <!-- <select v-model="selected" multiple>
            <option disabled value="">请选择</option>
            <option>A</option>
            <option>B</option>
            <option>C</option>
        </select>
        <span>Selected: {{ selected }}</span> -->

        <select v-model="selected">
            <option v-for="option in options" :key="option" :value="option.value">
            {{ option.text}}
            </option>
        </select>
        <span>Selected: {{selected}}</span>
        <form action="" method="get" @submit.prevent="subinfo">
            <ul>
                <li>
                    <label for="username">姓名：</label>
                    <input type="text" id="username" v-model="name">
                </li>
                <li>
                    <label for="usersex">性别：</label>
                    <input type="radio" value="男" name="usersex" v-model="sex" checked>男
                    <input type="radio" value="女" v-model="sex">女
                    <span>性别：{{sex}}</span>
                </li>
                <li>
                    <label for="hobby">爱好：</label>
                    <input type="checkbox" value="篮球" v-model="hobby">篮球
                    <input type="checkbox" value="足球" v-model="hobby">足球
                    <input type="checkbox" value="羽毛球" v-model="hobby">羽毛球
                    <input type="checkbox" value="乒乓球" v-model="hobby">乒乓球
                    <span>爱好：{{hobby}}</span>
                </li>
                <li>
                    省：
                    <select v-model="address.s1">
                        <option selected>-请选择-</option>
                        <option value="山西省">-山西省-</option>
                        <option value="陕西省">-陕西省-</option>
                    </select>
                    市：
                    <select v-model="address.s2">
                        <option selected>-请选择-</option>
                        <option value="咸阳市">-咸阳市-</option>
                        <option value="西安市">-西安市-</option>
                    </select>
                    区：
                    <select v-model="address.s3">
                        <option selected>-请选择-</option>
                        <option value="长安区">-长安区-</option>
                        <option value="雁塔区">-雁塔区-</option>
                    </select>
                </li>
                <li>
                    <input type="radio" v-model="checked" value="true">同意以上条款
                    <input type="radio" :checked="check">同意以上条款
                    <input type="checkbox" v-model="checkbox">
                </li>
                <li>
                    <button type="submit">注册</button>
                </li>
                <input type="checkbox" v-model="toggle" true-value="yes" false-value="no" />
                <select v-model="selected">
                    <option :value="{ number: 123 }">123</option>
                </select>
            </ul>
        </form>
    </div>
</template>
<script>
export default {
    name:"forminfo",
    data() {
        return {
            message:'',
            selected:'',
            options: [
                { text: '1', value: '小赵' },
                { text: '2', value: '小李' },
            ],
            name:"",
            sex:"男",
            hobby:[],
            address:{
                s1:'-请选择-',
                s2:'-请选择-',
                s3:'-请选择-'
            },
            checked:true,
            check:"checked",
            checkbox:true,
            picked: '',
            toggle:"no"
        }
    },
    methods: {
        subinfo(){
            //表单提交事件
            console.log(this.name,this.sex,this.hobby,this.address);
        },
    },
}
</script>
<style>

</style>