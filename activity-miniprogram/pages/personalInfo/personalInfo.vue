<template>
  <view class="body">

  </view>
</template>

<script>
import {
  mapState
} from 'vuex';
import getToken from "@/utils/refreshToken"
export default {
  data() {
    return {
      headImage: '',
      nickName: '',
      phone: '',
      disabled: true,
      idcard: '',
      id: null
    };
  },
  created() {
    this.id = uni.getStorageSync('userid');
  },
  onShow() {

  },
  methods: {
  }
};
</script>

<style lang="scss">
@import '../../common/iconfont.css';

page {
  background-color: #f9f9f9;
}


</style>
