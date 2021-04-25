<template>
	<view></view>
</template>

<script>
import { mapState } from 'vuex';
import sPopup from '@/components/spopup/spopup';
import getToken from '../../utils/refreshToken.js';
import uniLoadMore from '@/components/uni-load-more/uni-load-more.vue';
export default {
	components: {
		sPopup
	},
	data() {
		return {
			
		};
	},
	onLoad({ id }) {
		this.tabId = id;
		uni.setStorageSync('tabIds', id);
	},
	onShow() {
		this.tabs(this.tabId);
	},
	methods: {
		tabs(id) {}
	},
	computed: {
		...mapState(['tid'])
	},
	// 监听页面滚动
	onPageScroll(e) {
		console.log(e);
	},
	// 上拉加载
	onReachBottom() {
		this.loadCouponList();
	}
};
</script>

<style></style>
