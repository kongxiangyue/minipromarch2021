<template>
  <div class='container'>
    <view v-if="url" @click="previewImg(url)" style="width:100%;height:100%;padding: 20upx;box-sizing: border-box;display: flex;justify-content:center">
      <image mode="aspectFit" :src="url"></image>
    </view>
    <view v-else style="width:100%;height:100%;padding: 20upx;box-sizing: border-box;margin: 100upx auto 0;text-align: center;">
      <text style=" font-size: 40upx;font-family: PingFang SC;font-weight: 500;color: rgba(204, 204, 204, 1);">图片格式有问题~</text>
    </view>
  </div>
</template>

<script>
export default {
  data() {
    return {
      url: '',
    }
  },
  onLoad(option) {
    this.url = option.url;
  },
  methods: {
    previewImg(url) {
      uni.previewImage({
        current: url,
        urls: [url]
      })
    }
  }
}
</script>

<style scoped lang='less'>
</style>