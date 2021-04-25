<template>
  <view style="background-color: #F9F9F9;">
    <indexBannerCmpt></indexBannerCmpt>
    <indexMenusCmpt></indexMenusCmpt>
    <indexMyActivityAIndex v-if="Status" :myActivity="myActivity"></indexMyActivityAIndex>
    <indexMyActivityCmpt v-else :myActivity="myActivity"></indexMyActivityCmpt>
    <companyCmpt></companyCmpt>
    <activityListCmpt></activityListCmpt>
  </view>
</template>

<script>
import indexBannerCmpt from './components/indexBannerCmpt.vue';
import indexMenusCmpt from './components/indexMenusCmpt.vue';
import indexMyActivityCmpt from './components/indexMyActivityCmpt.vue';
import companyCmpt from '../company/companyCmpt';
import activityListCmpt from '../activity/components/activityListCmpt';
import indexMyActivityAIndex from './components/indexMyActivityAIndex';
export default {
  components: {
    indexBannerCmpt,
    indexMenusCmpt,
    indexMyActivityCmpt,
    indexMyActivityAIndex,
    companyCmpt,
    activityListCmpt
  },
  data() {
    return {
      indexBannerCmpt: [],
      companyCmpt: [],
      activityListCmpt: [],
      myActivity: [],
      activityCount: 1,
      Status: false
    };
  },
  onLoad(options) {
    var that = this;
    if (options.scene) {
      var scene = decodeURIComponent(options.scene);
      var arr = [];
      arr = scene.split('-');
      var aid = arr[1];
      uni.navigateTo({
        url: '/pages/activity/components/activityInfoCmpt?id=' + aid
      })
    } else {
      console.log('no scene');
    }
  },
  onShow() {
    this.getMyActivity();
  },
  methods: {
    getMyActivity() {
      var that = this
      if (uni.getStorageSync('userid')) {
        uni.request({
          url: this.server_url+'/activity/signUpTable/myActivity/' + uni.getStorageSync('userid'),
          success: (res) => {
            if (res.data.code >= 400) return;
            let data = res.data.data || [];
            if (data.length) {
              that.myActivity = data.reverse();
              that.Status = true;
            } else {
              that.Status = false;
            }
          }
        })
      }
    }
  }
}
</script>

<style scoped></style>
