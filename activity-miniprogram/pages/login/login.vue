<template>
	<view>
		<view class="title">用户登录</view>
		<view style="padding: 50rpx;">
			<view class="hint">账号</view>
			<input v-model="userName" class="userinput" focus placeholder="请输入账号" />
			<view class="hint">密码</view>
			<input v-model="password" class="userinput" placeholder="请输入密码" />
			<button class="loginbtn" @click="loginUser">立即登录</button>
			<!-- <view class="registertxt" @click="gotoRegister">注册账号</view> -->
		</view>
	</view>
</template>

<script>
	import logicLogic from '../../common/loginLogic.js'
	export default {
		data() {
			return {
				userName:"",
				password:""
			}
		},
		methods: {
			loginUser(){
				
				logicLogic.login(this.userName,this.password,function(status,res){
					if(status){
						uni.showToast({
						    title: '登录成功',
						    duration: 2000
						});
						uni.switchTab({
							url:'../index/index'
						})
					}else{
						uni.showToast({
						    title: '登录失败',
						    duration: 2000
						});
					}
				});
			}
		}
	}
</script>

<style>
.title {
	font-size: 52rpx;
	margin-left: 60rpx;
	margin-top: 0rpx;
}
.hint {
	color: #a6a6a6;
	font-size: 25rpx;
	margin-top: 30rpx;
	margin-left: 20rpx;
}
.userinput {
	border-bottom: 1rpx solid #c7c7c7;
	padding-left: 20rpx;
	padding-bottom: 15rpx;
	padding-top: 15rpx;
	font-size: 28rpx;
}
.loginbtn {
	border-radius: 100rpx;
	margin-top: 80rpx;
	font-size: 32rpx;
	background-color: #418be2;
	color: #ffffff;
}
.registertxt {
	text-align: right;
	font-size: 28rpx;
	margin-top: 30rpx;
	color: #5f5f5f;
}
</style>
