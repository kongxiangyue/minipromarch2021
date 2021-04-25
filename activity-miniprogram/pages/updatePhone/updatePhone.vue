<template>
  <view>

  </view>
</template>

<script>
import getToken from "@/utils/refreshToken"
export default {
  data() {
    return {

    }
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
