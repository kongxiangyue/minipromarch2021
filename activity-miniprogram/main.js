import Vue from 'vue'
import App from './App'
import request from './utils/request'
import { Base64 } from './base64.min.js';
import store from './store.js' // 引入vuex

Vue.prototype.$base64 = Base64;

Vue.prototype.server_url = "http://127.0.0.1:9527";

//调用  request 函数后  得到一个新的函数
const plugin = request({
    baseURL: Vue.prototype.server_url,
    headers: { 'content-type': 'application/x-www-form-urlencoded' }
});

Vue.use(plugin);//插件
Vue.config.productionTip = false

Vue.prototype.$store = store
App.mpType = 'app'

const app = new Vue({
    ...App,
    store
})
app.$mount()