<template>
	<view class="background">
		<view class="image"><image :src="image"></image></view>
		<view class="tip">对不起，未检测到您的报名信息！</view>
		<view class="tip">请确认活动信息，或使用报名微信重新扫码。</view>
		<view class="title"></view>
		<view class="button"><button @click="scanNing">重新扫码</button></view>
		<view class="cancel" @click="goIndex"><text>取消</text></view>
	</view>
</template>

<script>
export default {
	data() {
		return {
			image: '/static/error.png'
		};
	},
	methods: {
		scanNing() {},
		goIndex() {
			wx.switchTab({
				url: '/pages/index/index'
			});
		}
	}
};
</script>

<style scoped>
.background {
	position: absolute;
	top: 0;
	bottom: 0;
	left: 0;
	right: 0;
	background-color: #ffffff;
}
.image {
	display: flex;
	align-items: center;
	justify-content: center;
	padding-top: 69upx;
}
.image image {
	width: 170upx;
	height: 170upx;
}
.tip {
	font-size: 24upx;
	font-family: PingFang SC;
	font-weight: 500;
	color: #666666;
	padding-top: 40upx;
	display: flex;
	align-items: center;
	justify-content: center;
}
.title {
	font-size: 24upx;
	font-family: PingFang SC;
	font-weight: 500;
	color: rgba(102, 102, 102, 1);
	padding-top: 19upx;
	display: flex;
	align-items: center;
	justify-content: center;
}
.button {
	padding-top: 59upx;
	display: flex;
	align-items: center;
	justify-content: center;
}
.button button {
	color: rgba(65, 139, 226, 1);
	width: 210upx;
	height: 70upx;
	border: 2upx solid rgba(65, 139, 226, 1);
	border-radius: 35upx;
	display: flex;
	align-items: center;
	justify-content: center;
	font-size: 30upx;
}
.cancel {
	display: flex;
	align-items: center;
	justify-content: center;
	padding-top: 19upx;
	font-size: 24upx;
	font-family: PingFang SC;
	font-weight: 500;
	color: rgba(136, 136, 136, 1);
}
</style>
