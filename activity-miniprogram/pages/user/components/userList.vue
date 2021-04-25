<template>
	<view>
		<view class="view">
			<view class="outside" id="list">
				<block v-for="(item, index) in userList" :key="index">
					<view class="inside" @tap="jump(item)">
						<image :src="item.image" mode="aspectFit" class="imglaq" :class="'img-width' + item.id"></image>
						<text class="textlaq">{{ item.title }}</text>
						<image class="imglaq2" :src="item.img" mode="aspectFit"></image>
					</view>
				</block>
			</view>
		</view>
	</view>
</template>

<script>
export default {
	data() {
		return {
			userList: [
				{
					id: 1,
					image: '/static/user/21.png',
					title: '我的关注',
					img: '/static/user/20.png'
				},
				{
					id: 2,
					image: '/static/user/22.png',
					title: '关于我们',
					img: '/static/user/20.png'
				},
				{
					id: 3,
					image: '/static/user/23.png',
					title: '常见问题',
					img: '/static/user/20.png'
				},
				{
					id: 4,
					image: '/static/feedback.png',
					title: '意见反馈',
					img: '/static/user/20.png'
				}
			]
		};
	},
	methods: {
		jump(item) {
			switch (item.id) {
				case 1:
					if (!uni.getStorageSync('userid')) {
						uni.showToast({
							title: '未登录，请先登录',
							icon: 'none'
						});
						return;
					}
					uni.navigateTo({
						url: '/pages/concern/concern'
					});
					break;
				case 2:
					uni.navigateTo({
						url: '/pages/aboutus/aboutus'
					});
					break;
				case 3:
					uni.navigateTo({
						url: '/pages/question/question'
					});
					break;
				case 4:
					uni.navigateTo({
						url: '/pages/feedback/feedback'
					});
					break;
				default:
					break;
			}
		}
	}
};
</script>

<style lang="scss">
page {
	background-color: #f9f9f9;
}
.view {
	width: 702upx;
	height: 100%;
	background: rgba(255, 255, 255, 1);
	border-radius: 33upx;
	margin-left: 24upx;
	margin-top: -61upx;
}
.outside {
	display: flex;
	flex-direction: column;
	margin-left: 33upx;
}
.inside {
	display: flex;
	flex-direction: row;
	margin-top: 20upx;
	margin-bottom: 20upx;
	align-items: center;
}
.imglaq {
	width: 30upx;
	height: 28upx;
}
.textlaq {
	font-size: 24upx;
	font-family: Adobe Heiti Std;
	font-weight: normal;
	color: rgba(51, 51, 51, 1);
	margin-left: 19upx;
}
.imglaq2 {
	width: 15upx;
	height: 23upx;
	position: absolute;
	left: 661upx;
}
.img-width4 {
	width: 30rpx;
	height: 30rpx;
}
</style>
