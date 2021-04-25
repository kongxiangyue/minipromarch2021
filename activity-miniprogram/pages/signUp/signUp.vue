<template>
  <view>
    
  </view>
</template>

<script>
import HMmessages from "@/components/HM-messages/HM-messages.vue"
// 引入当前时间的js
var util = require('../../common/util.js');
var time = util.formatTime(new Date());
// 定义数据库
export default {
  components: {
    HMmessages
  },
  data() {
    return {}
  },
  onLoad() {},
  created() {},
  methods: {}
}


</script>

<style scoped>

</style>
