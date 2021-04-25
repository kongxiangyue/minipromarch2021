<template>
  <view class="myactivitybg">
    <image class="head" :src="head"></image>
    <text class="title">你的努力，终将美好!</text>
    <button class="button" type="default" @click="goApply">马上报名</button>
  </view>
</template>

<script>
export default {
  props: {
    myActivity: Array
  },
  data() {
    return {
      head: '/static/index-else-icon/myActivity.png'
      //保存状态
    };
  },
  methods: {
    goApply() {
      uni.switchTab({
        url: '/pages/activity/activity',
      });
    }
  }
};
</script>

<style scoped>
.myactivitybg {
  width: 702upx;
  height: 386upx;
  background-color: #ffffff;
  border-radius: 33upx;
  position: relative;
  margin: 0 auto;
  margin-top: 20upx;
  padding: 33upx 20upx;
  box-sizing: border-box;
}
.head {
  width: 142upx;
  height: 43upx;
}
.title {
  width: 336upx;
  height: 36upx;
  font-size: 36upx;
  position: absolute;
  top: 157upx;
  left: 183upx;
}
.button {
  width: 250upx;
  height: 76upx;
  background-color: #418be2;
  color: #ffffff;
  font-size: 30upx;
  border-radius: 38upx;
  font-size: 32upx;
  position: absolute;
  top: 232upx;
  left: 226upx;
}
</style>
