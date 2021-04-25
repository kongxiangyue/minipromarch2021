<template>
	<view v-cloak>
		<view><!-- your code--></view>
		<block v-if="tabIndexs == 0" v-cloak>
			<view
				v-cloak
				v-if="activityDetail.checkStatus == 4 || activityDetail.checkStatus == 5 || activityDetail.checkStatus == 6"
				style="padding: 27upx 54upx 27upx 58upx;box-sizing: border-box;width:100%;height:110upx;background:rgba(255,255,255,1);box-shadow:0px 3px 7px 0px rgba(102,102,102,0.03);display: flex;position: fixed;bottom: 0;"
			>
				<!-- 输入框 -->
				<view style="width:100%;line-height: 56upx;padding:8upx 36upx 0upx;box-sizing: border-box;background:rgba(242,242,242,1);border-radius:28upx;">
					<input @focus="onFocus" @blur="onBlur" :placeholder-style="placeholders" v-model="liveEvaluations" type="text" :placeholder="placeholder" cursor-spacing="15" />
				</view>
				<!-- 加号 -->
				<view @click="AddGraph" style="width:40upx;height:40upx;position: relative;top: 8upx;margin: 0upx 20upx;">
					<image style="width:40upx;height:40upx;" src="../../../static/Plus.png"></image>
				</view>
				<view>
					<button
						@click="sendComments"
						v-if="liveEvaluations || urlR"
						plain="true"
						style="position: relative;top: 4upx;width:106upx;line-height: 48upx;border:1upx solid rgba(65,139,226,1); background: linear-gradient(90deg,rgba(99, 161, 235, 1),rgba(65, 139, 226, 1));border-radius:30upx;font-size:24upx;font-family:PingFangSC;color:#ffffff;"
					>
						发送
					</button>
					<button
						disabled
						v-else
						plain="true"
						style="position: relative;top: 4upx;width:106upx;line-height: 48upx;border:1upx solid rgba(242,242,242,1);background:rgba(242,242,242,1);border-radius:30upx;font-size:24upx;font-family:PingFangSC;color:rgba(178,178,178,1);padding:  0upx;"
					>
						发送
					</button>
				</view>
			</view>
			<view
				v-else
				v-cloak
				style="width: 100%;border-top: 1upx solid #eeeeee;background-color: #ffffff;padding: 15upx 54upx 0 58upx;box-sizing: border-box;position: fixed;bottom: 0;"
			>
				<view style="float: left;">
					<button style="border: none;float: left;" @click="enterCustomerServie" plain="true">
						<image style=" width: 54upx;height: 54upx;float: left;" :src="kf"></image>
						<view style="font-size: 20upx;color: #888888;position: relative;top: 0rpx;left: 0rpx;">客服</view>
					</button>
				</view>
				<view style="float: left;margin-left: 100upx;position: relative;">
					<button style="padding: 0;border: none;float: left;" open-type="share" plain="true">
						<image style=" width: 54upx;height: 54upx;float: left;" :src="fx"></image>
						<view style="font-size: 20upx;color: #888888;position: relative;top: 0rpx;left: 0rpx;">分享</view>
					</button>
				</view>
				<button v-if="enrollmentStatus" plain="true" @click="changeBm" style="float: right;" :class="['enrollmentBut', enrollmentStatus ? 'submit' : 'disable']">
					立即报名
				</button>
				<button v-else plain="true" style="float: right;" class="enrollmentBut disable">已报名</button>
			</view>
		</block>
		<s-popup position="center" v-model="open">
			<view class="center-popup">
				<text class="wxtitle">主办方客服微信</text>
				<image class="wximage" :src="activityDetail.wxCustomerCode" mode="aspectFit"></image>
				<text class="wxinfo">请使用微信扫码添加客服微信</text>
				<button type="default" class="wxbtn" @click="SavePictures"><text style="font-weight: bold;font-size: 30upx;">保存图片</text></button>
			</view>
		</s-popup>
		<!-- 登录模态框 -->
		<motaln ref="mon"></motaln>
	</view>
</template>

<script>
import motaln from '../../../element/modal.vue';
import { mapState } from 'vuex';
import getToken from '../../../utils/refreshToken';
import parser from '@/components/jyf-parser/jyf-parser';
import sPopup from '@/components/spopup/spopup';
import uniLoadMore from '@/components/uni-load-more/uni-load-more.vue';
import Sensitivewords from '@/utils/Sensitivewords';
var { log } = console;
export default {
	components: {
		motaln,
		'jyf-parser': parser,
		sPopup
	},
	data() {
		return {
			ActivityNoticeShowPng: true,
			getLiveEvaluationListShow: false,
			ActivityNoticeListShow: false,
			open: false,
			placeholders: 'font-size:24upx;font-family:PingFang SC;font-weight:500;color:rgba(178,178,178,1);',
			activityId: '',
			activityDetail: {
				activityStartTime: '00-00-00 00:00:00',
				activityEndTime: '00-00-00 00:00:00',
				registrationStartTime: '00-00-00 00:00:00',
				registrationEndTime: '00-00-00 00:00:00',
				activityDetail: ''
			},
			// 获取报名人数
			numbers: 0,
			//浏览人数
			browse: 0,
			Sponsor: null,
			tab: [
				{ name: '详情', type: 'Detail', loaded: false },
				{ name: '议程', type: 'Agenda', loaded: false },
				{ name: '通知', type: 'Notice', loaded: false },
				{ name: '文件', type: 'File', loaded: false }
			],
			tabs: [
				{ name: '互动', type: 'Live', loaded: false },
				{ name: '议程', type: 'Agenda', loaded: false },
				{ name: '文件', type: 'File', loaded: false },
				{ name: '更多', type: 'More', loaded: false }
			],
			More: [{ name: '详情' }, { name: '通知' }, { name: '客服' }],
			tabIndex: 0,
			tabIndexs: 0,
			xiangqing: [],
			baoming: [],
			fx: '/static/fx.png',
			kf: '/static/kf.png',
			Collection: false,
			follow: false,
			// 用户头像
			avatarUrl: '',
			// 用户昵称
			nickName: '',
			// 列表数据
			localdata: [],
			//立即报名状态
			enrollmentStatus: true,
			detailsState: true,
			userID: uni.getStorageSync('userid'),
			activityCount: 1,
			registrationFee: true,
			enterCompanyList: null,
			enterCompanyFansNumber: '',
			liveEvaluationList: null,
			//输入框内容
			liveEvaluations: '',
			// 输入框为空时占位符
			placeholder: '期待您的神评论~',
			ActivityFile: null,
			MoreState: true,
			Morestate: '',
			CommentMap: '',
			urlR: null,
			//议程
			ActivityAgendaList: null,
			//详情
			ActivityDetailList: null,
			//通知
			ActivityNoticeList: null,
			pageSize: 6,
			pageNum: 1,
			total: null,
			serverAddress: [],
			s: null,
			more: ''
		};
	},
	onLoad(option) {
		this.activityId = option.id;
		uni.setStorageSync('activityId', option.id);
		this.activityDetails();

	},
	onShow() {
		if (uni.getStorageSync('userid')) {
			this.getactivitySignUp();
			this.getCollection();
		}
	},
	methods: {
		//获取活动详情
		async activityDetails() {

		},
		// 获取报名人数
		async applicantsNum() {

		},
		//获取立即报名状态
		async getactivitySignUp() {

		},
		//议程
		async getActivityAgenda() {

		},
		//详情
		async getActivityDetail() {

		},
		//通知
		async getActivityNotice() {

		},
		// 获取活动文件
		async getActivityFile() {

		},
		//获取评论列表
		async getLiveEvaluationList() {

		},
		// 获取入驻单位
		async getEnterCompany() {

		},
		//查询入驻单位关注情况
		async getSettlementUnit() {

		},
		//浏览人数加一
		async getBrowse() {

		},
		//获取收藏状态
		async getCollection() {

		},
		getEnterCompanyFansNumber() {

		},
		MoreClick(index) {
			
		},
		clickActivityFile(addr) {
			
		},
		AddGraph() {
			
		},
		detailsContents(index) {},
		// 点击关注
		companyFollow() {},
		// tab栏切换
		detailsContent(index) {},
		// 点击收藏
		changeImg() {},
		// 检票完成
		ticketChecking() {},
		// 立即报名完成
		changeBm(e) {},
		// 进入客服页面
		enterCustomerServie() {

		},
		loadCouponList() {},
		//发送评论多图发布
		sendComments() {},
		onBlur() {
			this.placeholder = '期待您的神评论~';
		},
		onFocus() {
			this.placeholder = '';
		},
		EventCustomerService() {
			this.closeState = true;
		},
		previewImg(url) {
			uni.previewImage({
				current: url,
				urls: [url]
			});
		},
		onReachBottom() {
			var pageNum = Math.ceil(this.total / this.pageSize);
			if (this.total == pageNum || pageNum == 1) return;
			this.loadCouponList();
		}
	}
};
</script>

<style scoped>
[v-cloak] {
	display: none;
}
.blockDiv {
	width: 89%;
	display: flex;
	flex-wrap: wrap;
	padding-left: 59upx;
	box-sizing: border-box;
}
.center-popup {
	width: 500upx;
	height: 600upx;
	display: flex;
	flex-direction: column;
	align-items: center;
}
.wxtitle {
	font-weight: bold;
	font-size: 30upx;
	margin-top: 30upx;
}
.wximage {
	width: 330upx;
	height: 330upx;
	margin-top: 30upx;
}
.wxinfo {
	font-size: 22upx;
	font-family: PingFang SC;
	font-weight: 500;
	color: rgba(136, 136, 136, 1);
	margin-top: 30upx;
}
.wxbtn {
	height: 96upx;
	width: 100%;
	background-color: #ffffff;
}
.liveEvaluation {
	width: 100%;
	height: 100%;
	background-color: #fff;
	padding: 0upx 20upx 110upx 20upx;
	box-sizing: border-box;
}
.over-hidden {
	overflow: hidden;
}
.html-cont {
	transform: translateY(-20px);
}

.actform1 {
	width: 702upx;
	background-color: #ffffff;
	border-radius: 23upx;
	margin: 0 auto;
	position: relative;
	top: -24upx;
	padding: 39upx 33upx;
	box-sizing: border-box;
}
.txt1 {
	width: 100%;
	position: relative;
}
.txt1 text {
	width: calc(100% - 30upx);
	display: inline-block;
	line-height: 40upx;
	font-size: 36upx;
	font-family: PingFangSC;
	font-weight: 550;
	color: rgba(51, 51, 51, 1);
}
.like {
	width: 30upx;
	height: 28upx;
	position: absolute;
	right: 0;
	top: 9upx;
}
.littitle {
	font-size: 22upx;
	font-weight: 100;
	color: #888888;
}
.statisticalData {
	width: 100%;
	height: 22upx;
	margin-bottom: 15upx 0 24upx 0;
}
.statisticalData span {
	width: 119upx;
	height: 21upx;
	font-size: 22upx;
	font-family: PingFangSC;
	font-weight: 400;
	color: rgba(136, 136, 136, 1);
}
.statisticalData span:nth-child(1) {
	margin-right: 32upx;
}
.statisticalData span:nth-child(2) {
	margin-right: 26upx;
}
.money {
	width: 100%;
	display: flex;
	height: 46upx;
	padding: 12upx 0 0;
}
.money_text {
	flex: 1;
	height: 46upx;
	position: relative;
}
.money_text .content {
	width: 100%;
	height: 100%;
	font-size: 38upx;
	font-family: PingFangSC;
	font-weight: 500;
	color: rgba(242, 156, 97, 1);
	position: absolute;
	left: -2upx;
	top: -8upx;
}
.money button {
	width: 125upx;
	height: 46upx;
	line-height: 46upx;
	background: linear-gradient(90deg, rgba(99, 161, 235, 1), rgba(65, 139, 226, 1));
	border-radius: 23upx;
	font-size: 24upx;
	margin: 0 auto;
}
.info {
	padding-top: 28upx;
	box-sizing: border-box;
}
.info1 {
	margin-top: 20upx;
	height: 35upx;
}
.log {
	width: 27upx;
	height: 27upx;
	position: relative;
	top: -13upx;
}
.logtxt {
	width: 399upx;
	height: 27upx;
	font-size: 26upx;
	font-family: PingFangSC;
	font-weight: 400;
	color: #666666;
	position: relative;
	top: -15upx;
	left: 40upx;
}
.logtxt1 {
	width: 582upx;
	font-size: 26upx;
	font-family: PingFangSC;
	font-weight: 400;
	color: #666666;
	position: relative;
	top: -65upx;
	left: 66upx;
}
.midform .logmore {
	width: 96upx;
	height: 96upx;
}
.midform {
	width: 95%;
	height: 160upx;
	margin: 0 auto;
	background-color: #ffffff;
	border-radius: 20upx;
	padding: 30upx 30upx 40upx 32upx;
	box-sizing: border-box;
}
.midimg {
	height: 96upx;
	width: 96upx;
	box-shadow: 0 0 2upx 2upx #eceaea;
	border-radius: 50%;
	float: left;
	margin-right: 32upx;
}
.midtxt {
	float: left;
	position: relative;
	top: 9upx;
}
.midtxt1 {
	width: 260upx;
	height: 40upx;
	font-size: 36upx;
	font-family: PingFang SC;
	font-weight: 500;
	color: rgba(51, 51, 51, 1);
}
.midtxt2 {
	width: 130upx;
	height: 21upx;
	font-size: 22upx;
	font-family: PingFang SC;
	font-weight: 500;
	color: rgba(136, 136, 136, 1);
	position: absolute;
	top: 52upx;
	left: 0upx;
}
.midbtn {
	width: 125upx;
	height: 46upx;
	line-height: 46upx;
	background: rgba(255, 255, 255, 1);
	border-radius: 23upx;
	border: 2upx solid rgba(65, 139, 226, 1);
	font-size: 24upx;
	color: rgba(65, 139, 226, 1);
	float: right;
	position: relative;
	top: 20upx;
	padding: 0;
}
.components {
	width: 100%;
	height: 100%;
	margin-top: 20upx;
	padding: 31upx 56upx 25upx;
	box-sizing: border-box;
	display: flex;
	background-color: #ffffff;
}
.components_topTab {
	width: 25%;
	flex: 1;
	text-align: center;
}
.img {
	background-color: #ffffff;
	width: 100%;
	height: 100%;
	padding-left: 20upx;
	box-sizing: border-box;
}
.img image {
	padding-top: 100upx;
	width: 710upx;
}

.enrollmentBut {
	width: 260upx;
	line-height: 74upx;
	height: 80upx;
	font-size: 40upx;
	color: #ffffff;
	border-radius: 40upx;
}
.enrollmentBut.submit {
	background: linear-gradient(90deg, rgba(99, 161, 235, 1), rgba(65, 139, 226, 1));
	border: 1px solid rgba(99, 161, 235, 1);
}
.enrollmentBut.disable {
	background: #cccccc;
	border: 1px solid #cccccc;
}
.enrollmentBut image {
	width: 100%;
	position: relative;
	top: 9upx;
}
.swiper-tab-line {
	border-bottom: 6upx solid #5598e7;
	width: 58upx;
	margin: 3upx auto 0;
	border-top: 6upx solid #5598e7;
	border-radius: 20upx;
}
</style>
