<template>
	<view>
		<view v-html="activityInfo"></view>
	</view>
</template>

<script>
	import { mapState } from 'vuex'
	export default {
		data() {
			return {
				activityInfo:'',
				id:''
			}
		},
		created() {
			this.id = this.bid.bnid
			this.gettuxiang()
		},
		methods:{
			gettuxiang(){
				var that = this
				uni.request({
					url:this.server_url+'/advertising/advertising/list?id=' + this.id,
					success(res){
						that.activityInfo = res.data.rows[0].graphicDetails
					}
				})
			}
		},
		computed:{
			...mapState(['bid'])
		}
	}
</script>

<style scoped>
	.title1{
		font-size: 28upx;
		color: #333333;
		padding-top: 17upx;
		padding-left: 25upx;
		padding-right: 34upx;
	}
	.image1{
		width: 701upx;
		height: 295upx;
		padding-top: 19upx;
		padding-left: 24upx;
		padding-right: 25upx;
	}
	.title2{
		font-size: 28upx;
		color: #333333;
		padding-top: 18upx;
		padding-left: 26upx;
		padding-right: 26upx;
	}
	.image2{
		width: 700upx;
		height: 374upx;
		padding-top: 21upx;
		padding-left: 25upx;
		padding-right: 25upx;
	}
	.title3{
		font-size: 28upx;
		color: #333333;
		padding-top: 18upx;
		padding-left: 25upx;
		padding-right: 27upx;
	}
	.null{
		width: 100%;
		height: 268upx;
	}
</style>
