<template>
  <view>

  </view>
</template>

<script>
let changelook = ["所有人可见", "仅自己可见"];
import uploudImages from "./components/uploud-images/uploud-images.vue";
export default {
  components: {
    uploudImages
  },
  data() {
    return {
      yinsi: "所有人可见",
      text: "",
      imageList: []
    };
  }, 
  methods: {
    // 返回
    back() {
      uni.navigateBack({ delta: 1 });
    },

  }
};
</script>

<style lang="less" scoped>
.uni-textarea {
  border: 1upx solid #eeeeee;
}
.submit-btn {
  border-radius: 50upx;
  margin: 40upx 20upx;
  border: none;
  &::after {
    border: none;
  }
}
</style>
