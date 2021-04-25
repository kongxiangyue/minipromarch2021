<template>
	<view class="myactivitybg">
		<image class="head" :src="head"></image>
		<scroll-view scroll-x="true" class="scroll" scroll-with-animation="true"></scroll-view>
	</view>
</template>

<script>
import { mapState } from 'vuex';
export default {
	props: {
		myActivity: Array
	},
	data() {
		return {
			head: '/static/index-else-icon/myActivity.png',
			activityCount: 1
		};
	},
	created() {
		this.activityCount = this.acount.activityCount;
	},
	methods: {},
	computed: {
		...mapState(['acount']),
		countActivity() {
			this.activityCount = this.acount.activityCount;
		}
	}
};
</script>

<style scoped>
.myactivitybg {
	width: 702upx;
	height: 386upx;
	background-color: #ffffff;
	border-radius: 33upx;
	position: relative;
	margin: 0 auto;
	margin-top: 20upx;
	padding: 33upx 20upx;
	box-sizing: border-box;
}
.head {
	width: 142upx;
	height: 43upx;
}
</style>
