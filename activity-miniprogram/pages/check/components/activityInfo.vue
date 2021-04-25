<template>
  <view class="background">

  </view>
</template>

<script>
import { mapState } from 'vuex';
export default {
  props: {
    checkActivity: Array
  },
  data() {
    return {
      more: '/static/index-else-icon/more.png',
      aid: ''
    }
  },
  created() {
    this.aid = this.activityid.aid
  },
  methods: {
    goActivity(e) {
      uni.navigateTo({
        url: `/pages/activity/components/activityInfoCmpt?id=${e}`
      })
    }
  },
  computed: {
    ...mapState(['activityid']),
    countAid() {
      this.aid = this.activityid.aid
    }
  }
}
</script>

<style scoped>
.background {
  width: 702upx;
  height: 212upx;
  background: rgba(255, 255, 255, 1);
  border-radius: 33upx;
  margin: 20upx 20upx 24upx 23upx;
}
.info {
  display: flex;
}
.image-info {
  width: 254upx;
  height: 150upx;
  overflow: hidden;
  margin-top: 29upx;
  margin-left: 32upx;
}
.image-info image {
  width: 254upx;
  height: 150upx;
  border-radius: 12px;
}
.img {
  position: absolute;
  top: 50upx;
  left: 685upx;
  right: 53upx;
}
.img image {
  width: 11upx;
  height: 18upx;
}
.title-info {
  /* border: 3upx solid #333333; */
  width: 416upx;
  height: 150upx;
  margin-top: 29upx;
  margin-left: 21upx;
}
.name {
  font-size: 28upx;
  font-family: PingFang SC;
  font-weight: 500;
  color: rgba(51, 51, 51, 1);
  /* border: 3upx solid #333333; */
}
.date {
  font-size: 22upx;
  font-family: PingFang SC;
  font-weight: 500;
  color: rgba(136, 136, 136, 1);
  /* border: 3upx solid #333333; */
  margin-top: 20upx;
}
.addr {
  font-size: 22upx;
  font-family: PingFang SC;
  font-weight: 500;
  color: rgba(136, 136, 136, 1);
  /* border: 3upx solid #333333; */
  padding-top: 2upx;
}
</style>
