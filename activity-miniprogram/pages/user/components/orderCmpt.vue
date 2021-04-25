<template>
  <view>
    <view class="grating">
      <view class="row">
        <block v-for="(item,index) in orderCmpt" :key="index">
          <view class="column" @tap="click(item.id)">
            <image :src="item.image" mode="aspectFit" class="img"></image>
            <text class="text">{{item.title}}</text>
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
      orderCmpt: [
        {
          "id": '',
          "image": '/static/user/11.png',
          "title": '全部'
        },
        {
          "id": '1',
          "image": '/static/user/12.png',
          "title": '待审核'
        },
        {
          "id": '3',
          "image": '/static/user/13.png',
          "title": '待检票'
        },
        {
          "id": '4',
          "image": '/static/user/14.png',
          "title": '已检票'
        },
        {
          "id": '5',
          "image": '/static/user/15.png',
          "title": '待退款'
        }
      ]
    };
  },
  methods: {
    click(index) {
      if (!uni.getStorageSync('userid')) {
        uni.showToast({
          title: '未登录，请先登录',
          icon: 'none',
          duration: 2000
        })
      } else {
        uni.navigateTo({
          url: `/pages/activityOrder/activityOrder?id=${index}`
        })
      }

    }
  }
}
</script>

<style lang="scss">
.row {
  display: flex;
  flex-direction: row;
  justify-content: space-around;
}
.column {
  display: flex;
  flex-direction: column;
  align-items: center;
}
.grating {
  width: 702upx;
  height: 147upx;
  background: rgba(255, 255, 255, 1);
  border-radius: 33upx;
  margin-left: 24upx;
  position: relative;
  top: -81upx;
}
page {
  background-color: #f9f9f9;
}
.img {
  width: 47upx;
  height: 51upx;
  margin-top: 30upx;
}
.text {
  font-size: 24upx;
  font-family: PingFang SC;
  font-weight: 500;
  color: rgba(102, 102, 102, 1);
  margin-top: 20upx;
}
</style>
