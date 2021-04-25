<template>
  <view v-cloak style="background-color: #fff;">
    <div class="input-wrap" @click="disableScroll">
      <input disabled placeholder=" ">
    </div>

	<view class="scroll_top" @tap="topScrollTap" v-bind:class="[scrollTop ? 'active' : '', '']" style="bottom: 56px;">
		<img style="width: 100%;height: 100%;background-color: #fff;" src="../../static/top.png" alt="" srcset="" />
	</view>
  </view>
</template>
<script>
import uniLoadMore from "@/components/uni-load-more/uni-load-more.vue"
export default {
  components: {
    uniLoadMore
  },
  data() {
    return {
      isFixed: false,
      tab: [],
      page: 1,
      zhaopin: null,
      tabId: 1,
      noList: false,
      pageSize: 6,
      pageNum: 1,
      total: null,
      show: true,
      scrollTop: false,
      scrollTops: false,
      more: ''
    };
  },
  onLoad() {
	this.getActivityListTab();
  },
  methods: {
    disableScroll(ev) {
      uni.navigateTo({
        url: `/pages/search/search?name=活动`,
      });
    },
	// 获取活动tab
	async getActivityListTab() {

		this.getActivityList();
	},
	tabs(id, nav) {
		this.tabId = id;
		this.getActivityList();
	},
	async getActivityList() {

	},
	goActivityInfo(e) {
		uni.navigateTo({
			url: `/pages/activity/components/activityInfoCmpt?id=${e}`
		});
	},
  },
  onReachBottom() {

  },
  watch: {
    zhaopin(newQ, old) {
      if (newQ[0] == undefined) {
        this.noList = true;
      } else {
        this.noList = false;
      }
    },
  },
  onPageScroll(e) {
    this.scrollTop = e.scrollTop > 200;
    this.scrollTops = e.scrollTop > 720;
  }
};
</script>

<style lang="scss" scoped>
.input-wrap {
	display: flex;
	height: 100upx;
	padding: 18upx;
	background-color: #ffffff;
	box-sizing: border-box;
	position: relative;
	&::before,
	&::after {
		height: 44upx;
		line-height: 1;
		background-image: url(https://static.botue.com/ugo/images/icon_search%402x.png);
		background-size: 32upx;
		background-position: 6upx center;
		background-repeat: no-repeat;
		position: absolute;
		top: 28upx;
		z-index: 9;
	}
	&::before {
		content: '搜索';
		display: block;
		width: 100upx;
		padding: 11upx 0 10upx 44upx;
		box-sizing: border-box;
		color: #999999;
		font-size: 24upx;
		left: 325upx;
	}
	input {
		flex: 1;
		height: 100%;
		padding: 0 20upx 0 64upx;
		background-color: #f8f8f8;
		border-radius: 50upx;
		border: 1upx solid #c0c0c0;
		font-size: $uni-font-size-base;
		color: $uni-text-color;
		border-style: solid;
	}
}
.te2 {
	font-size: 22upx;
	color: #888888;
	margin-left: 20upx;
}
.is_fixed {
	position: fixed;
	left: 0;
	right: 0;
	top: 0;
}
.load-more {
	height: 160upx;
	display: flex;
	align-items: center;
	justify-content: center;
}
.scroll {
	white-space: nowrap;
	background-color: #fff;
	padding: 20upx 0 0upx 24upx;
	box-sizing: border-box;
	display: inline-block;
}
.styleCss {
	display: inline-block;
}
.con-text {
	color: #888888;
	font-size: 30upx;
	text-align: center;
}
.list-cont {
	display: inline-block;
	margin-right: 56upx;
}
.active .con-text {
	color: #333333;
	font-weight: bold;
}
.active .swiper-tab-line {
	border-bottom: 6upx solid #5598e7;
	width: 100%;
	margin: 20upx auto 0;
	border-top: 6upx solid #5598e7;
	border-radius: 20upx;
}
</style>
