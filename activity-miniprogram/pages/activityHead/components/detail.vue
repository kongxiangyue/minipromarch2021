<template>
  <view class="activity-head-detial">
    
  </view>
</template>

<script>
import { timestampToDate } from "../common.js";
export default {
  data() {
    return {

    };
  },
  onLoad({ id, nameType }) {},
  methods: {}
};
</script>
<style scoped lang="less">
.activity-head-detial {
  min-height: 100%;
  .detail-ct {
    padding: 10upx 25upx;
    background: #fff;
    .title {
      margin-top: 17upx;
      line-height: 1.3;
      color: #333;
      font-size: 28upx;
    }
    .subtitle {
      display: flex;
      padding: 21upx 0 16upx;
      border-bottom: 1px solid #eeeeee;
      color: #999;
      font-size: 20upx;
      .source {
        flex: 1;
      }
      .time {
        width: 200upx;
      }
    }
  }

  .relate-activity {
    margin-top: 20upx;
    margin-bottom: 80upx;
    background: #fff;
    padding: 15upx 21upx;
    .relate-activity-title {
      padding: 10upx 0;
      font-size: 28upx;
      color: #333333;
    }
    .relate-activity-content {
      display: flex;
      padding: 16upx 21upx;
      border-radius: 16upx;
      box-shadow: 0 0 4upx #e5e5e5;
      .left {
        width: 244upx;
        height: 142upx;
        border-radius: 12upx;
      }
      .right {
        flex: 1;
        padding-left: 21upx;
        .title {
          font-size: 24upx;
          line-height: 1.3;
		  height: 60upx;
        }
		.city{
			padding: 12upx 0 4upx;
		}
        .time {
          color: #888;
          font-size: 20upx;
        }
      }
    }
  }
  .footer-handle {
    position: fixed;
    width: 100%;
    bottom: 0;
    display: flex;
    justify-content: center;
    background: #fff;
    border-top: 1px solid #eeeeee;
    .footer-handle-ct {
      display: flex;
      width: 100upx;
      padding: 20upx 20upx;
      font-size: 20upx;
      justify-items: center;
      align-items: center;
      line-height: 40upx;
      color: #666;
    }
    .footer-handle-ct-left {
      margin-right: 52upx;
      img {
        width: 32upx;
        height: 32upx;
        margin-right: 10upx;
      }
    }
    .footer-handle-ct-right {
      margin-left: 52upx;
      img {
        width: 32upx;
        height: 32upx;
        margin-right: 10upx;
      }
    }
  }
}
</style>
<style>
	.news-detail-only-html div, .news-detail-only-html p, .news-detail-only-html img{
		max-width: 100%;
	}
</style>