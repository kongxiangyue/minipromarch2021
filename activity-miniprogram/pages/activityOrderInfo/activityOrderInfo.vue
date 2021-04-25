<template>
  <view>

  </view>

</template>

<script>
// import {mapState} from 'vuex';
import sPopup from "./components/s-popup/index.vue"
import getToken from "../../utils/refreshToken.js"
export default {
  components: {
    sPopup
  },
  data() {
    return {
      id: '',
      attention: {
        activity: {
          activityStartTime: '00-00-00 00:00:00',
          activityEndTime: '00-00-00 00:00:00'
        },
        name: '',
        tel: '',
        idNo: '',
        companyName: ''
      },
      open: false,
      uinfo: null,
      signinfo: null,
      signup: null,
    };
  },
  onLoad({ id }) {
    this.id = id;
    this.showInfo();
  },
  methods: {
    showInfo() {},
    
  },

}
</script>

<style>

</style>
