<template>
  <view class="companyblock">
    <view class="head">
      <image class="headicon" :src="icon1"></image>
    </view>

  </view>
</template>
<script>
export default {
  data() {
    return {
      company: [],
      icon1: '/static/index-else-icon/company.png',
      icon2: '/static/index-else-icon/more.png',
    };
  },
  created() {
    this.getCompany();
  },
  methods: {
    enterDetails(item) {
      uni.navigateTo({ url: `/pages/settledUnit/components/unitDetails?id=${item.id}&attentionType=${item.attentionType}&attentionNum=${item.concerns?item.concerns:0}`})
    },
    async getCompany() {

    },
    more() {
      uni.navigateTo({ url: '/pages/settledUnit/settledUnit' })
    }
  }
};
</script>

<style>
.companylogo {
  width: 100%;
  white-space: nowrap;
  padding-left: 22upx;
  box-sizing: border-box;
}
.companyblock {
  background-color: #ffffff;
  width: 702upx;
  height: 387upx;
  position: absolute;
  z-index: 1;
  margin-top: 15upx;
  margin-left: 24upx;
  margin-right: 23upx;
  border-radius: 33upx;
}
.head {
  display: flex;
  justify-content: space-between;
  width: 100%;
  height: 112upx;
  line-height: 112upx;
  padding: 33upx 20upx 33upx;
  box-sizing: border-box;
}
.headicon {
  width: 142upx;
  height: 43upx;
}
.headtitle {
  font-size: 24upx;
  font-family: PingFangSC;
  font-weight: 400;
  color: #878787;
}
.name {
  font-size: 24upx;
  display: block;
  color: #333333;
}
.wenben {
  margin-top: 15upx;
  margin-left: 20upx;
  width: 161upx;
}
.logobackground {
  display: inline-block;
  text-align: center;
  background-color: #ffffff;
  width: 210upx;
  height: 236upx;
  border: 1upx solid rgba(51, 51, 51, 0.12);
  border-radius: 12upx;
  padding-top: 50upx;
  box-sizing: border-box;
  margin-right: 15upx;
}
</style>
