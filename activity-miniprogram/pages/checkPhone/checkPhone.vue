<template>
  <view>
    <view class="phone">
      <input type="text" placeholder="+86  请输入手机号" v-model="phoneNum">
    </view>
    <view class="model-1">
      <view class="check">
        <input type="text" placeholder="请输入验证码" v-model="checkPhone">
      </view>
      <button style="color:#ffffff;" @click="sendCode" :disabled="disabled">{{send}}</button>
    </view>
    <view class="confirm">
      <button style="color:#ffffff;" @click="checkCode">确定</button>
    </view>
  </view>
</template>

<script>
import getToken from "../../utils/refreshToken"
export default {
  data() {
    return {
      disabled: false,
      send: '发送验证码',
      // 手机号
      phoneNum: '',
      // 验证码
      checkPhone: '',
      option: null
    }
  },
  onLoad(option) {
    this.option = option.authorize
  },
  methods: {
    sendCode() {},
    checkCode() {}
  }
}
</script>

<style>
page {
  background-color: #ffffff;
}
</style>
<style scoped>
.phone {
  width: 702upx;
  height: 80upx;
  margin-left: 24upx;
  margin-right: 23upx;
  margin-top: 20upx;
  font-size: 28upx;
  background-color: #f9f9f9;
  border-radius: 39upx;
  display: flex;
  align-items: center;
}
.phone input {
  padding-left: 40upx;
}
.check {
  width: 360upx;
  height: 80upx;
  margin-left: 24upx;
  margin-top: 40upx;
  font-size: 28upx;
  background-color: #f9f9f9;
  border-radius: 39upx;
  display: flex;
  align-items: center;
}
.check input {
  padding-left: 40upx;
}
.model-1 {
  display: flex;
  justify-content: space-around;
}
.model-1 button {
  width: 284upx;
  height: 80upx;
  margin-top: 40upx;
  background-color: #f2f2f2;
  border-radius: 39upx;
  color: #888888;
  font-size: 28upx;
  display: flex;
  align-items: center;
  justify-content: center;
}
.confirm button {
  width: 702upx;
  height: 80upx;
  margin-left: 24upx;
  margin-right: 23upx;
  margin-top: 40upx;
  font-size: 28upx;
  background-color: #f2f2f2;
  color: #888888;
  border-radius: 39upx;
  display: flex;
  align-items: center;
  justify-content: center;
}
button::after {
  border: none;
}
button {
  width: 240upx;
  height: 76upx;
  background: linear-gradient(
    90deg,
    rgba(99, 161, 235, 1),
    rgba(65, 139, 226, 1)
  );
  border-radius: 38upx;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
}
</style>
