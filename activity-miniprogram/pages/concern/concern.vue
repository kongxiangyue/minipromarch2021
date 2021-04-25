<template>
	<view>
		<!-- 标题 -->
		<scroll-view scroll-x class="scroll" scroll-with-animation="true">
			<block v-for="(item, index) in tab" :key="index">
				<view class="tab" @click="tabs(item.id, item.title)" :class="{ active: item.id == tabId }">
					<text class="con-text">{{ item.title }}</text>
					<view class="swiper-tab-line"></view>
				</view>
			</block>
		</scroll-view>
		<!-- 活动内容 -->
		<view class="content" v-if="tabId == 1">
			<block v-for="(item, index) in activities" :key="index">
				<!--your code-->
			</block>
			<uni-load-more v-if="activities.length" showIcon :status="more"></uni-load-more>
		</view>
		<!-- 单位内容 -->
		<view class="content" v-if="tabId == 2">
			<block v-if="attention.length">
				 <view class="info" v-for="(item, index) in attention" :key="index" @click="unitDetails(item)">
				 <!--your code-->
				 </view>
			</block>
			<uni-load-more v-if="attention.length" showIcon :status="more"></uni-load-more>
		</view>
		<view v-if="tabId == 3">
			<block v-for="(item, index) in eventHeadlines" :key="index">
				<!--your code-->
			</block>
			<uni-load-more v-if="attention.length" showIcon :status="more"></uni-load-more>
		</view>
		<!-- 未关注的界面展示 -->
		<view
			v-if="(!activities.length && tabId == 1) || (!attention.length && tabId == 2) || (!eventHeadlines.length && tabId == 3)"
			style="display: flex; align-items: center; justify-content: center; height: 200upx;"
		>
			<text style="color: #888888; font-weight:bold; font-size: 40upx;" v-if="tabId == 1">您还没有关注的活动~</text>
			<text style="color: #888888; font-weight:bold; font-size: 40upx;" v-else-if="tabId == 2">您还没有关注的单位~</text>
			<text style="color: #888888; font-weight:bold; font-size: 40upx;" v-else>您还没有关注的活动头条~</text>
		</view>
		<view class="scroll_top" @tap="topScrollTap" v-bind:class="[scrollTop ? 'active' : '', '']" style="bottom: 56px;">
			<img style="width: 100%;height: 100%;background-color: #fff;" src="../../static/top.png" alt="" srcset="" />
		</view>
	</view>
</template>

<script>
import { mapState } from 'vuex';
import getToken from '@/utils/refreshToken';
import uniLoadMore from '@/components/uni-load-more/uni-load-more.vue';
import { timestampToDate } from '../activityHead/common.js';

export default {
	data() {
		return {
			tabId: 1,
			attention: [],
			activities: [],
			eventHeadlines: [],
			tab: [
				{
					id: 1,
					title: '活动'
				},
				{
					id: 2,
					title: '入驻单位'
				},
				{
					id: 3,
					title: '活动头条'
				}
			],
			pageSize: 6,
			pageNum: 1,
			total: null,
			number: [],
			more: '',
			scrollTop: false,
			scrollTops: false
		};
	},
	created() {
		this.$store.commit('tabsId', 1);
	},
	onShow() {
		this.tabs(1);
	},
	methods: {
		unitDetails(item) {},
		topScrollTap() {
			uni.pageScrollTo({
				scrollTop: 0,
				duration: 300
			});
		},
		tabs(id) {

		},
		async getActivity() {

		},
		goHeadDetail(item) {},
		goActivity(id) {},
		loadCouponList() {
			
		},
		onPageScroll(e) {
			this.scrollTop = e.scrollTop > 200;
			this.scrollTops = e.scrollTop > 720;
		},
		// 进入详情页面
		goActivityHeadDetail(id, type) {}
	},
	computed: {
		...mapState(['tbid']),

		// 将tab的id赋值给tabid
		countId() {
			this.tabId = this.tbid.tabId;
			return this.tabId;
		}
	},
	// 上拉加载
	onReachBottom() {
		this.loadCouponList();
	}
};
</script>
<style>
page {
	background-color: #ffffff;
}
</style>
<style lang="less" scoped scoped>
.scroll {
	white-space: nowrap;
	background-color: #fff;
	padding: 20upx;
	box-sizing: border-box;
}
/* .content {
  position: absolute;
  top: 110upx;
} */
.tab {
	height: 92upx;
	display: inline-block;
	margin-left: 120upx;
}
.con-text {
	color: #888888;
	font-size: 30upx;
	text-align: center;
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
.info {
	margin-top: 20upx;
	height: 160upx;
	display: flex;
}
.image {
	width: 254upx;
	height: 150upx;
	box-sizing: border-box;
	align-items: center;
	overflow: hidden;
	border-radius: 12upx;
	margin-left: 44upx;
	margin-right: 20upx;
}
.image image {
	width: 254upx;
	height: 150upx;
}
.title {
	font-size: 28upx;
	color: #333333;
	width: 361upx;
	font-weight: bold;
	height: 110upx;
	overflow-y: auto;
	overflow-x: hidden;
}
.info1 {
	display: flex;
	flex-direction: row;
}
.addr {
	font-size: 22upx;
	color: #888888;
}
.time {
	font-size: 22upx;
	color: #888888;
	padding-left: 70upx;
}
.Cimage {
	width: 96upx;
	height: 96upx;
	box-sizing: border-box;
	align-items: center;
	overflow: hidden;
	border-radius: 12upx;
	margin-left: 51upx;
}
.Cimage image {
	width: 96upx;
	height: 96upx;
}
.Ctitle {
	font-size: 24upx;
	color: #333333;
	padding-left: 24upx;
	width: 361upx;
	font-weight: bold;
}
.Cnum {
	font-size: 20upx;
	color: #888888;
	padding-left: 21upx;
	padding-top: 25upx;
}
.contents {
	width: 100%;
	padding: 20upx 30upx 20upx 30upx;
	box-sizing: border-box;
	overflow: hidden;
	.content-left {
		width: 415upx;
		font-size: 28upx;
		font-family: PingFang SC;
		font-weight: 500;
		color: rgba(51, 51, 51, 1);
		float: left;
		.title {
			line-height: 35upx;
		}
		.time {
			font-size: 22upx;
			font-family: PingFang SC;
			font-weight: 500;
			color: rgba(136, 136, 136, 1);
			position: relative;
			padding: 0;
			bottom: -10upx;
		}
	}
	.content-right {
		width: 254upx;
		height: 150upx;
		border-radius: 12upx;
		float: right;
		img {
			width: 100%;
			height: 100%;
			vertical-align: middle;
		}
	}
}
</style>
