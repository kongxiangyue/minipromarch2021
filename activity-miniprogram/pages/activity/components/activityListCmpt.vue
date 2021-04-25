<template>
	<view>
		<view class="hotbackgroud">
			<view class="head">
				<view><image class="headicon" :src="icon1"></image></view>
				<view class="headtitle" @click="localCont">
					<image :src="icon2" style="width: 18upx; height: 18upx;"></image>
					<text style="font-size: 24upx; color: #888888; margin-left: 9upx;">换一换</text>
				</view>
			</view>
			<view class="activityinfo">
				<!--your code-->
				<view class="more" @click="more">
					<text style="font-size: 28upx;">更多活动&nbsp;</text>
					<image :src="icon3" style="width: 13upx; height: 22upx; position: relative;top: 2upx;left: 10upx;"></image>
				</view>
			</view>
		</view>
	</view>
</template>

<script>
export default {
	data() {
		return {
			icon1: '/static/index-else-icon/hotActivity.png',
			icon2: '/static/index-else-icon/huan.png',
			icon3: '/static/index-else-icon/more1.png',
			activityListCmpt: null,
			//活动总条数
			total: null,
			pageSize: 6,
			pageNum: 1,
			pageNums: null
		};
	},
	created() {
		this.getActivityListCmpt();
	},
	methods: {
		getActivityListCmpt() {},
		goActivityInfo(e) {
			uni.navigateTo({
				url: `/pages/activity/components/activityInfoCmpt?id=${e}`
			});
		},
		more() {
			wx.switchTab({
				url: '/pages/activity/activity'
			});
		},
		//换一换
		localCont() {}
	}
};
</script>

<style scoped>
.te2 {
	font-size: 22upx;
	color: #888888;
	margin-left: 20upx;
}
.hotbackgroud {
	background-color: #ffffff;
	width: 702upx;
	border-radius: 33upx;
	position: absolute;
	margin-top: 418upx;
	margin-left: 24upx;
	margin-right: 24upx;
	position: relative;
}
.head {
	display: flex;
	width: 100%;
	height: 69upx;
}
.headicon {
	padding-top: 28upx;
	padding-left: 20upx;
	width: 142upx;
	height: 40upx;
}
.headtitle {
	/* padding-top: 20upx;
  padding-left: 420upx; */
	position: absolute;
	top: 20upx;
	right: 25upx;
}
.activityinfo {
	width: 100%;
	height: 100;
}
.more {
	padding-top: 61upx;
	padding-bottom: 40upx;
	text-align: center;
	box-sizing: border-box;
}
</style>
