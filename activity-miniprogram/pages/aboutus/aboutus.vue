<template>
  <view>

  </view>
</template>
 
<script>
import parser from "../../components/jyf-parser/jyf-parser"
export default {
  components: {
    "jyf-parser": parser,
  },
  data() {
    return {
      logo: '/static/logo.png',
      aboutUs: null,
    };
  },
  created() {

  }
}
</script>

<style lang="scss">
.logoimg {
  text-align: center;
  margin: 20upx 0;
}
.logoimg image {
  width: 130upx;
  height: 130upx;
  border-radius: 10upx;
}
.logotext {
  font-size: 36upx;
  font-family: PingFang SC;
  font-weight: 550;
  color: rgba(51, 51, 51, 1);
  text-align: center;
}
.info {
  font-size: 24upx;
  padding: 19upx 40upx;
  box-sizing: border-box;
  font-family: PingFang SC;
  font-weight: 500;
  color: rgba(102, 102, 102, 1);
}
</style>
