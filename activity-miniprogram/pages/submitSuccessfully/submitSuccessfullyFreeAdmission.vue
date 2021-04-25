<template>
  <view class="background">
    <view class="image">
      <image :src="image"></image>
    </view>
    <view class="tip">提交成功</view>
    <view class="button" @click="orderDetails"><button>订单详情</button></view>
  </view>
</template>

<script>
export default {
  data() {
    return {
      money: '',
      image: '/static/success.png'
    }
  },
  onLoad({ money }) {
    this.money = money;
  },
  methods: {
    orderDetails() {
      uni.navigateTo({
        url: `/pages/activityOrderInfo/activityOrderInfo?id=${uni.getStorageSync('activityId')}`
      });
    }
  },
  onUnload: function () {
    wx.navigateBack({
      delta: 1
    })
  }
}
</script>

<style scoped lang='less'>
.background {
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  background-color: #ffffff;
}
.image {
  display: flex;
  align-items: center;
  justify-content: center;
  padding-top: 69upx;
}
.image image {
  width: 170upx;
  height: 170upx;
}
.tip {
  font-size: 36upx;
  font-family: PingFang SC;
  font-weight: 500;
  color: rgba(0, 0, 0, 1);
  padding-top: 40upx;
  display: flex;
  align-items: center;
  justify-content: center;
}
.title {
  font-size: 70upx;
  font-family: PingFang SC;
  font-weight: bold;
  color: rgba(242, 156, 97, 1);
  padding-top: 19upx;
  display: flex;
  align-items: center;
  justify-content: center;
}
.button {
  padding-top: 59upx;
  display: flex;
  align-items: center;
  justify-content: center;
}
.button button {
  color: rgba(65, 139, 226, 1);
  width: 210upx;
  height: 70upx;
  border: 2upx solid rgba(65, 139, 226, 1);
  border-radius: 35upx;
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 30upx;
}
</style>