<template>
  <view class="background">
 
  </view>
</template>

<script>
import { mapState } from 'vuex';
export default {
  data() {
    return {
      status: '',
      name: '正在加载数据...',
      idcard: '正在加载数据...',
      phone: '正在加载数据...',
      aid: ''
    }
  },
  created() {
    this.aid = this.activityid.aid
    this.showInfo()
  },
  methods: {
    showInfo() {},
    goIndex() {
      wx.switchTab({
        url: '/pages/index/index'
      });
    },
    // 日期过滤
    dateformat(date, format = 'YYYY-MM-DD HH:mm:ss') {
      if (!date) return '';
      let dateTime = new Date(date);
      let ret;
      let opt = {
        "Y+": dateTime.getFullYear().toString(),        // 年
        "M+": (dateTime.getMonth() + 1).toString(),     // 月
        "D+": dateTime.getDate().toString(),            // 日
        "H+": dateTime.getHours().toString(),           // 时
        "m+": dateTime.getMinutes().toString(),         // 分
        "s+": dateTime.getSeconds().toString()          // 秒
        // 有其他格式化字符需求可以继续添加，必须转化成字符串
      };
      for (let k in opt) {
        ret = new RegExp("(" + k + ")").exec(format);
        if (ret) {
          format = format.replace(ret[1], (ret[1].length == 1) ? (opt[k]) : (opt[k].padStart(ret[1].length, "0")));
        };
      };
      return format;
    },
    
  },
  computed: {
    ...mapState(['activityid'])
  }
}
</script>

<style scoped>

</style>
