<script>

import logicLogic from 'common/loginLogic.js'

export default {
	onLaunch() {
		let userName = uni.getStorageSync("userName");
		let passWord = uni.getStorageSync("passWord");
		logicLogic.login(userName,passWord);
	}
};
</script>

<style>
@import './common/uni.css';
@import './static/css/top';
page {
	background-color: #f9f9f9;
}

::-webkit-scrollbar {
	width: 0;
	height: 0;
	color: transparent;
}
</style>
