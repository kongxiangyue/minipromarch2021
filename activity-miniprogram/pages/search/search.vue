<template>
	<!-- 搜索 -->
	<div class="search">
		<!-- 搜索框 -->
		<div class="input-wrap">
			<input focus @confirm="goList" @focus="focusState" v-model="keywords" type="text" placeholder="请输入您要搜索的内容" />
			<img src="https://static.botue.com/ugo/images/icon_search%402x.png" alt="" srcset="" />
			<span class="cancle" @click="goList">搜索</span>
		</div>
		<!-- 搜索结果 -->
		<!--your code-->
	</div>
</template>

<script>
import uniLoadMore from '@/components/uni-load-more/uni-load-more.vue';
export default {
	components: {
		uniLoadMore
	},
	data() {
		return {
			//用户查新的关键字
			keywords: '',
			searchList: [],
			searchState: false,
			total: null,
			pageSize: 8,
			pageNum: 1,
			more: '',
			state: null
		};
	},
	onLoad(option) {
		this.state = option.name == '活动' ? true : false;
	},
	methods: {
		focusState() {
			this.searchList = [];
			this.searchState = false;
			this.keywords = '';
		},
		goActivityInfo(e) {
			uni.navigateTo({
				url: `/pages/activity/components/activityInfoCmpt?id=${e}`
			});
		},
		//根据用户查询响应的结果
		async goList() {
			
		},
		cancleSearch() {
			this.keywords = '';
			this.searchList = [];
			this.searchState = false;
		},
		loadCouponList() {
			
		},
		stripscript(s) {
			var pattern = new RegExp("[`~!@#$^&*()=|{}':;',\\[\\].<>/?~！@#￥……&*（）&mdash;—|{}【】‘；：”“'。，、？]");
			var rs = '';
			for (var i = 0; i < s.length; i++) {
				rs = rs + s.substr(i, 1).replace(pattern, '');
			}
			return rs;
		}
	},
	onReachBottom() {
		this.loadCouponList();
	}
};
</script>

<style lang="scss" scoped>
.search {
	width: 100%;
	// height: 100%;
	position: absolute;
	background-color: #fff;
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
			font-size: $uni-font-size-base;
			color: $uni-text-color;
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
	// 搜索结果
	.content {
		// flex: 1;
		padding: 27upx;
		box-sizing: border-box;
		// background-color: pink;
		position: relative;

		.title {
			font-size: 27upx;
			line-height: 1;
			color: #333;
		}
	}
}
.noticeNoticeTitle {
	font-size: 27upx;
	line-height: 1;
	color: #333;
	padding: 27upx 0;
	box-sizing: border-box;
	margin: 0 27upx;
	border-bottom: 1upx solid #f2f2f2;
}
.contents {
	padding: 20upx 0upx 20upx 0upx;
	box-sizing: border-box;
	margin: 0 30upx;
	overflow: hidden;
	border-bottom: 1upx solid #f2f2f2;
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
			margin-top: 51upx;
			font-size: 22upx;
			font-family: PingFang SC;
			font-weight: 500;
			color: rgba(136, 136, 136, 1);
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

.moreAnnouncements {
	width: 100%;
	background-color: #fff;
	padding: 10upx 30upx;
	box-sizing: border-box;
	overflow: hidden;
	.moreAnnouncements-l {
		color: #0066ff;
		float: left;
		img {
			height: 32upx;
			width: 32upx;
			position: relative;
			top: 5upx;
			// vertical-align: middle;
			margin-right: 12upx;
		}
	}
	.moreAnnouncements-r {
		float: right;
		img {
			height: 32upx;
			width: 19upx;
			position: relative;
			top: 5upx;
		}
	}
}
</style>
