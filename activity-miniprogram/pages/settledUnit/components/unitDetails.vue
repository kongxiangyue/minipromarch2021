<template>
  <view class="unitDetails">
    
  </view>
</template>
<script>
import parser from "@/components/jyf-parser/jyf-parser";
import uniLoadMore from "@/components/uni-load-more/uni-load-more.vue";
export default {
  components: {
    "jyf-parser": parser,
    uniLoadMore
  },
  data() {
    return {
      id: "",
      tab: [
        { name: "单位详情", id: 0 },
        { name: "单位活动", id: 1 }
      ],
      detailContent: { name: "", img: "",},
      collection: '',
      attentionNum:0,
      tabId: 0,
      unitDetailsList: "",
      activitiesList: [],
      more: "",
      pageNum: 1,
      pageSize: 6,
      total: 0
    };
  },
  onLoad({ id,attentionType,attentionNum }) {
    this.id = id;
    this.collection = attentionType==1?true:false;
    this.attentionNum = attentionNum?parseInt(attentionNum):0;

  },
  methods: {
    // tab切换
    tabbar(e) {
      this.tabId = e.id;
    },
    // 点击收藏
    async collectionState() {
      if (!uni.getStorageSync("userid")) {
        wx.showModal({
          title: "请先登录",
          success(res) {
            if (res.confirm)
              return uni.switchTab({
                url: "/pages/user/user"
              });
          }
        });
        return;
      }
      const res = await this.request({
        url: `/user/myAttention/attentionOrNot`,
        method: "post",
        loading: true,
        header: {
          "content-type": "application/json", // 默认值
          token: uni.getStorageSync("token")
        },
        data: {
          commonUserId: uni.getStorageSync("userid"),
          enterCompanyId: this.id
        }
      });
      if (res.msg == "success") {
        uni.showToast({
          title: this.collection ? "取消关注" : "已关注",
          icon: "none",
          duration: 2000
        });
        this.attentionNum = this.collection ? this.attentionNum - 1 : this.attentionNum + 1;
        this.collection = !this.collection;
      }
    },

    goActivityInfo(e) {
      uni.navigateTo({
        url: `/pages/activity/components/activityInfoCmpt?id=${e}`
      });
    },
    // 下拉加载
    onReachBottom() {
      var pageNum = Math.ceil(this.total / this.pageSize);
      if (this.pageNum <= pageNum) {
        this.more = "more";
        this.pageNum++;
        this.getUnitActivities(this.tabName);
      } else {
        this.pageNum = this.total;
        this.more = "noMore";
      }
    },
    // 时间格式转
    timestampToDate(date) {
      const [yymmdd, hhmmss] = date.split(" ");
      const [yy, mm, dd] = yymmdd.split("-");
      const [h, m, s] = hhmmss.split(":");
      return `${mm}/${dd} ${h}:${s}`;
    }
  }
};
</script>

<style lang="less" scoped>
@import "../settledUnit";
@import "./unitDetails";
</style>