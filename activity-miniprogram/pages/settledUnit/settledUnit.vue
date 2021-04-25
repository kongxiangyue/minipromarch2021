<template>
  <view class="settledUnit">
    
  </view>
</template>

<script>
import uniLoadMore from "@/components/uni-load-more/uni-load-more.vue";
export default {
  components: {
    uniLoadMore
  },
  data() {
    return {
      tab: [
        { name: "学校单位", id: 0 },
        { name: "企业机构", id: 1 },
        { name: "政府机关", id: 2 },
        { name: "社会组织", id: 3 }
      ],
      tabId: 0,
      tabName: "学校单位",
      keywords: "",
      list: [],
      pageNum: 1,
      pageSize: 10,
      total: 0,
      more: "",
      scrollTop: false,
      contentText: {
        contentdown: "上拉显示更多",
        contentrefresh: "正在加载...",
        contentnomore: "已加载全部"
      }
    };
  },
  onShow() {
    this.tabbar({name: "学校单位", id: 0})
  },
  methods: {
    searchList() {
      this.pageNum = 1;
      this.total = 0;
      this.list = [];
      this.getUnitList();
    },
    async getUnitList(tabName) {
     
    },
    // 关注
    async attentionActivity(enterCompanyId, attentionType, index) {
      
    },
    // 下拉加载
    onReachBottom() {
      var pageNum = Math.ceil(this.total / this.pageSize);
      if (this.pageNum <= pageNum) {
        this.more = "more";
        this.pageNum++;
        this.getUnitList(this.tabName);
      } else {
        this.pageNum = this.total;
        this.more = "noMore";
      }
    },
    // tab切换
    tabbar(e) {
      this.tabId = e.id;
      this.tabName = e.name;
      this.pageNum = 1;
      this.total = 0;
      this.list = [];
      this.getUnitList();
    },
    unitDetails(item) {
      uni.navigateTo({
        url: `/pages/settledUnit/components/unitDetails?id=${item.id}&attentionType=${item.attentionType?1:0}&attentionNum=${item.attentionNum?item.attentionNum:0}`
      });
    },
    topScrollTap() {
      uni.pageScrollTo({
        scrollTop: 0,
        duration: 300
      });
    }
  },
  onPageScroll(e) {
    this.scrollTop = e.scrollTop > 200;
  }
};
</script>

<style lang="less" scoped>
@import "./settledUnit";
// 搜索框
.input-wrap {
  height: 100upx;
  padding: 18upx 120upx 18upx 18upx;
  box-sizing: border-box;
  position: relative;
  img {
    height: 32upx;
    width: 32upx;
    position: absolute;
    top: 38upx;
    left: 42upx;
  }
  input {
    flex: 1;
    height: 100%;
    padding: 0 20upx 0 64upx;
    background-color: #f8f8f8;
    border-radius: 50upx;
    border: 1upx solid #c0c0c0;
    font-size: 28upx;
    color: #333;
    border-style: solid;
  }
  .cancle {
    position: absolute;
    right: 0upx;
    top: 22upx;
    line-height: 60upx;
    font-size: 27upx;
    color: rgba(65, 139, 226, 1);
    margin: 0 30upx;
  }
}
</style>