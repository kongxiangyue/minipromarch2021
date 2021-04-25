<template>
<div style="margin-top: 10rpx;">
    <block style="padding: 24upx;box-sizing: border-box;">
		<!--your code-->
    </block>

    <view style="width: 100%;height: 110upx;border-top: 1upx solid #eeeeee;background-color: #ffffff;padding: 15upx 54upx 0 58upx;box-sizing: border-box;position: fixed;bottom: 0;">
      <view style="float: left;">
        <button @click="EventCustomerService" style=" border: none;" plain="true">
          <image style="width: 54upx;height: 54upx;" src="/static/kf.png"></image>
        </button>
        <text style="font-size: 20upx;color: #888888;position: absolute;top: 70upx;left: 90upx;">客服</text>
      </view>
      <button plain="true" v-if="!PaymentVoucherStatus" @click="placeOrder" style="float: right;border: none;color: #ffffff;border-radius:40upx;width: 260upx;line-height: 80upx;background-color: #418BE2;">
        提交订单
      </button>
      <button plain="true" v-else-if="state" @click="PaymentVoucher" style="float: right;border: none;color: #ffffff;border-radius:40upx;width: 260upx;line-height: 80upx;background-color: #418BE2;">
        提交订单
      </button>
      <button plain="true" v-else @click="PaymentVouchers" style="float: right;border: none;color: #ffffff;border-radius:40upx;line-height: 80upx;background-color: #418BE2;">
        上传打款凭证
      </button>
    </view>
  </div>
</template>

<script>
import { mapState } from 'vuex';
import getToken from "../../utils/refreshToken"
import spopup from "@/components/spopup/spopup"

export default {
  components: {
    spopup
  },
  data() {
    return {
      open: false,
      activityId: '',
      name: '',
      tel: '',
      idcard: '',
      company: '',
      identity: '',
      activity: null,
      orderNumber: '',
      PaymentVoucherStatus: false,
      paymentMethod: true,
      state: '',
      ssss: '',
      AuditNotice: ''
    };
  },
  onLoad() {
    this.name = uni.getStorageSync('RealName')
    this.tel = uni.getStorageSync('tel')
    this.AuditNotice = uni.getStorageSync('checkNeed');
  },
  onShow() {
    this.state = uni.getStorageSync('voucherChart')
  },
  created() {
    uni.setStorageSync('orderNumber', new Date().getTime());
    this.orderNumber = uni.getStorageSync('orderNumber');
    this.activityId = uni.getStorageSync('activityId');
    this.PaymentVoucherStatus = uni.getStorageSync('registrationFee') > 0
    this.getActivityList();
    this.$watch('activity', function (newValue, oldValue) {
      if (newValue.paymentMethod != '微信线下收款') {
        this.paymentMethod = false;
      } else {
        this.paymentMethod = true;
      }
    });
    var date = new Date();
    var Y = date.getFullYear() + '-';
    var M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-';
    var D = date.getDate() + ' ';
    var h = date.getHours() + ':';
    var m = date.getMinutes() + ':';
    var s = date.getSeconds();
    this.ssss = Y + M + D + h + m + s;
  },
  methods: {
    EventCustomerService() {
      this.open = true;
    },
    PaymentVoucher() {},
    placeOrder() {},
    PaymentVouchers() {},
    async getActivityList() {
		
    },
    elit() {
      uni.navigateTo({
        url: '/pages/signUp/signUp'
      });
    }
  },
  computed: {
    ...mapState(['userSign']),
    UserInfo() {
      this.name = this.userSign.name;
      this.tel = this.userSign.tel;
      this.idcard = this.userSign.idcard;
      this.company = this.userSign.company;
      this.identity = this.userSign.identity;
    }
  }
};
</script>

<style scoped lang="less">
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
</style>
