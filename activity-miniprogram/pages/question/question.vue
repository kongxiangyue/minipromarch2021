<template>
  <view>
  </view>
</template>

<script>
import uniCollapse from './components/uni-collapse/uni-collapse.vue'
import uniCollapseItem from './components/uni-collapse-item/uni-collapse-item.vue'

export default {
  components: {
    uniCollapse,
    uniCollapseItem
  },
  data() {
    return {
      question: ''
    }
  },
  created() {
    this.getQuestion()
  },
  methods: {
    getQuestion() {
		
    }
  }
}
</script>

<style lang="scss">
.content {
  font-size: 22upx;
  font-family: PingFang SC;
  font-weight: 500;
  color: rgba(102, 102, 102, 1);
  padding: 10upx 30upx;
}
</style>
