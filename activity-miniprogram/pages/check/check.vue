<template>
	<view>
		<activityInfo :checkActivity="checkActivity"></activityInfo>
		<userInfo></userInfo>
	</view>
</template>

<script>
import activityInfo from './components/activityInfo.vue';
import userInfo from './components/userInfo.vue'
import { mapState } from 'vuex';
export default {
	components: {
		activityInfo,
		userInfo
	},
	data() {
		return {
			checkActivity: [],
			aid:'',
		};
	},
	created() {},
	computed:{
		...mapState(['activityid'])
	}
};
</script>

<style></style>
