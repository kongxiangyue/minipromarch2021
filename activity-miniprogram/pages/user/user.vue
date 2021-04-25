<template>
  <view v-cloak>
    <personalCmpt ref="child"></personalCmpt>
    <orderCmpt></orderCmpt>
    <userList></userList>
  </view>
</template>

<script>
import personalCmpt from "./components/personalCmpt.vue"
import orderCmpt from "./components/orderCmpt.vue"
import userList from "./components/userList.vue"

export default {
  components: {
    personalCmpt,
    orderCmpt,
    userList
  },
  data() {
    return {
    }
  },
  onShow() {
	this.$refs.child.showLogin()
  }
}
</script>

<style>
page {
  background-color: #f9f9f9;
}
</style>
