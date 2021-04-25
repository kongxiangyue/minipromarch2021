<template>
  <view>
    <view class="title">欢迎使用微联校企</view>
    <view style="text-align: center;">
      <view style="font-size:36upx;font-family:PingFangSC;font-weight:600;color:#000;">申请获取以下权限</view>
      <view style="font-size:24upx;font-family:PingFangSC;font-weight:500;color:rgba(102,102,102,1);">获得你的公开信息(昵称,头像等)</view>
    </view>
    <button withCredentials hover-class open-type="getUserInfo" @getuserinfo="openlogin">开始使用</button>
  </view>
</template>

<script>
export default {
  data() {
    return {
      id: '',
      activityId: ''
    }
  },
  onLoad(option) {
    this.id = option.id;
    this.activityId = option.activityId;
  },
  methods: {
    openlogin() {
      
      
    },
  }
}
</script>

<style>
.img {
  width: 230upx;
  height: 230upx;
  margin-bottom: 20upx;
}
.title {
  text-align: center;
  font-size: 60upx;
  color: rgba(65, 139, 226, 1);
  margin: 55upx 0upx;
}
button {
  width: 400upx;
  height: 80upx;
  margin: 300upx auto 0upx;
  font-size: 28upx;
  background-color: #f2f2f2;
  color: #888888;
  border-radius: 39upx;
  display: flex;
  align-items: center;
  justify-content: center;
  text-align: center;
  background: linear-gradient(
    90deg,
    rgba(99, 161, 235, 1),
    rgba(65, 139, 226, 1)
  );
  color: #ffffff;
  border: none;
}
button::after {
  border: none;
}
</style>